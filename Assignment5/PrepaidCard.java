package Assignment5;

public abstract class PrepaidCard implements Rewardable {
	int cardNo;
	double availableBalance;
	double swipeLimit;
	abstract boolean swipeCard(int input);
	@Override
	public String toString() {
		return "PrepaidCard [cardNo=" + cardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
	void rechargeCard(int input)
	{
		availableBalance+=input;
	}
	
}

/*3 � Inheritance and Abstraction
Create abstract class PrepaidCard as per the below details
�	Has attributes CardNo(int), availableBalance(double), swipeLimit(double)
�	Abstract method swipeCard which takes amount as input and returns a boolean. 
�	Override toString to get object details in a formatted way
�	Concrete method rechargeCard which takes amount as input and adds it to availableBalance 

Create TravelCard as per below details
�	subclass of PrepaidCard
�	Has attribute rewardPoints. 
�	Travel Card implements the Rewardable interface for calculating reward points. 
�	Interface Rewardable has a method which takes amount as input and returns reward points
The swiped amount should not be more than the swipeLimit or the available balance for Travel Card.
Travel Cards are used in USA(1$ = Rs 60). 
When TravelCard is swiped, the swiped amount in dollars is converted in to INR and deducted from the available balance.  Processing charge of 5% of amount is charged for every swipe and is reduced from the balance.
*/