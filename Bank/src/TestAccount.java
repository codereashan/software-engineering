import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestAccount {

	BankingAccount Bank,Bank2;
	//when all the methods in a class want the same initial condition then we use setUp()
	
	@BeforeEach
	public void setUp() throws Exception {
		Bank = BankingAccount.createBankingAccount(111, 3000);
		Bank2 = BankingAccount.createBankingAccount(100, 4000);
	}
	
	@Test
	void testConstructor() {
		assertNotEquals(Bank,null);
	}
	
	@Test
	void testBalance() {
		assertEquals(Bank.getBalance(),3000);
	}
	
	@Test
	void testAccount() {
		assertEquals(Bank.getBankAccount(),111);
	}
	
	//testaccount2() for checking singleton of program
	@Test
	void testAccount2() {
		assertEquals(Bank.getBankAccount(),100);
	}
	
	@Test
	void testDeposite() {
		Bank.deposite(1000);
		assertEquals(Bank.getBalance(),3500);
	}
	
	@Test
	void testWithdraw() {
		Bank.withdraw(500);
		assertEquals(Bank.getBalance(),2500);
	}
	
//	@Test
//	void testDisplay() {
//		Bank.display();
//		Bank2.display();
//	}
	
	
}
