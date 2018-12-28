package prob5;

public class Account {
	private String accountNo;
	private int balance;
	
	//입금을 의미하는save
	public void save(int a) {
		System.out.println(accountNo + "계좌에 " +a+"만원이 입금되었습니다.");
		this.balance=balance+a;
	}
	//출금을 의미하는deposit
	public void deposit(int a) {
		System.out.println(accountNo + "계좌에 " +a+"만원이 출금되었습니다.");
		this.balance=balance-a;
	}
	//생성자
	public Account(String accountNO) {
		System.out.println( accountNO + "계좌가  개설되었습니다." );
		this.accountNo=accountNO;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}