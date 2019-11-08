package CodeExamples;

public class RaceCondition {

	static class Account {

		double balance;

		Account(double balance) {
			this.balance = balance;
		}
	}

	static class WithdrawlTransaction implements Runnable {

		private Account account;
		private int amount;

		WithdrawlTransaction(Account account, int amount) {
			this.account = account;
			this.amount = amount;
		}

		@Override
		public void run() {
			// synchronized(account) { // request a lock on account
				double balance = account.balance; // read the balance
				try {
					Thread.sleep(1000); // actual withdrawal process
					System.out.println("withdrawal amount: " + amount);
				} catch (InterruptedException e) {
				}
				account.balance = balance - amount; // save the balance
				System.out.println("balance: " + account.balance);
			// } // release a lock on account
		}
	}

	public static void main(String[] args) {
		Account a = new Account(1000);
		new Thread(new WithdrawlTransaction(a, 1000)).start();
		new Thread(new WithdrawlTransaction(a, 1000)).start();
	}
}