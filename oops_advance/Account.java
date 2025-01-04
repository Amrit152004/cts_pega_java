package oops_advance;

public class Account extends Saving_Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	private void deposite(double salary) {
		balance+=salary;
		
	}
	private String withdraw(double money) {
		if(balance>minimum_balance) {
			balance-=money;
			return"Sucessfully";
		}
			if(balance < money && money> overdraft_limit ) {
				return"Soory! you havereached your overdraft limit";
			}
			return null;
		
		
	}
	private double getBalance() {
		return balance;
	}
	public static void main(String[] args) {
		Account account=new Account();
		Person person1 = new Person(); person1.setName("Smith"); person1.setAge(22.4f);
		account.setAccHolder(person1);
		Account account1=new Account();
	Person person2 = new Person(); person2.setName("Kathya"); person2.setAge(20f);
		account1.setAccHolder(person2);
		
		account.deposite(2000);
		System.out.println(account1.withdraw(5000));
		System.out.println(account.withdraw(250.5f));
		
		System.out.println(account.getBalance());
		System.out.println(account1.getBalance());
		
		
		
	}
	

}
