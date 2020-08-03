package Assignment9;


import java.sql.SQLException;
import java.util.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class ProductsDemo3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		String pCode;
		String pName;
		String pPrice;
		String pCat;
		ArrayList<Product> product = new ArrayList<>();

		while (true) {
			System.out.println("Press any key to input values, -1 to exit");

			input = scan.nextLine();

			if (input.equals("-1")) {
				break;
			} else {
				System.out.println("Enter Product Code");
				pCode = scan.next();
				scan.nextLine();
				System.out.println("Enter Product Name");
				pName = scan.next();
				scan.nextLine();
				System.out.println("Enter Product Price");
				pPrice = scan.next();
				scan.nextLine();
				System.out.println("Enter Product Category");
				pCat = scan.next();
				scan.nextLine();
				product.add(new Product(pCode, pName, pPrice, pCat));

			}
		}

		try {
			JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
			rowSet.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			rowSet.setUsername("DXC");
			rowSet.setPassword("123");
			rowSet.setCommand("select PROD_CODE,PROD_NAME,PROD_PRICE,PROD_CATG from PRODUCTS");
			rowSet.execute();
			// Update

			for (int i = 0; i < product.size(); i++) {
				Product data = product.get(i);

				String pCode1 = data.getpCode();
				String pName1 = data.getpName();
				String pPrice1 = data.getpPrice();
				String pCat1 = data.getpCat();
				rowSet.afterLast();
				rowSet.moveToInsertRow();
				rowSet.updateString("PROD_CODE", pCode1);
				rowSet.updateString("PROD_NAME", pName1);
				rowSet.updateString("PROD_PRICE", pPrice1);
				rowSet.updateString("PROD_CATG", pCat1);
				rowSet.insertRow();
			}

			rowSet.beforeFirst();
			while (rowSet.next()) {
				System.out.println(rowSet.getString("PROD_CODE") + ":" + rowSet.getString("PROD_NAME") + ":"
						+ rowSet.getString("PROD_PRICE") + ":" + rowSet.getString("PROD_CATG"));
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		scan.close();
	}
}