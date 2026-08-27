package IOT6;

public class recur_ex3 {
	    public static void main(String[] args) {

	        int amount = 10000;
	        int withdraw = 2000;

	        while (amount > 0) {
	            amount = amount - withdraw;
	            System.out.println("Withdraw done, balance is: " + amount);
	        }
	    }
	}
 