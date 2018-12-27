package se.lexicon.teresia.bank_account;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

	private BankAccount testAccount;
	
	@Before
	public void init() {
		// TODO Auto-generated method stub
		testAccount= new BankAccount("12344", 10500, "Teresia Gable", "t@g.se", "282422");
	}
	@Test
	public void test_account_successfully_created() {
		Assert.assertEquals("12344", testAccount.getAccountNumber());
		Assert.assertEquals(10500, testAccount.getBalance(),0);
		Assert.assertEquals("Teresia Gable", testAccount.getCustomerName());
		Assert.assertEquals("t@g.se", testAccount.getEmail());
		Assert.assertEquals("282422", testAccount.getPhoneNumber());

	}
	@Test
	public void test_withdrawal() {
		double funds=500;
		double expectedBalance= 10000;
		double newBalance = testAccount.withdrawFunds(funds);
		Assert.assertEquals(expectedBalance, newBalance, 0);
	}
	@Test
	public void test_invalid_withdrawal() {
		double funds=11000;
		double expectedBalance= 10500;
		double newBalance = testAccount.withdrawFunds(funds);
		Assert.assertEquals(expectedBalance, newBalance, 0);
	}
	
	@Test
	public void test_deposit() {
		double funds=500;
		double expectedBalance= 11000;
		double newBalance = testAccount.depositFunds(funds);
		Assert.assertEquals(expectedBalance, newBalance, 0);
	}
	
	@Test
	public void test_invalid_deposit() {
		double funds=-500;
		double expectedBalance= 10500;
		double newBalance = testAccount.depositFunds(funds);
		Assert.assertEquals(expectedBalance, newBalance, 0);
	}
}


