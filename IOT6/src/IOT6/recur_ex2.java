package IOT6;

public class recur_ex2 {
		public static void main(String[] args) {
			int amount = 10000;
			int withdraw = 2000;
			for(int i=0; i<5; i++) {
				amount = amount - withdraw;
				System.out.println("Withdraw done balance is : "+amount);
			}
		}
	}
