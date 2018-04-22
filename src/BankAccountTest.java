import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

public class BankAccountTest {
	//@Ignore คือไม่ทดสอบตัวนั้น (คล้ายคอมเม้น)
	
	@Test
	public void testDeposit() {
		BankAccount acc = new BankAccount();
		acc.deposit(50);
		assertEquals(acc.getBalance(),50);
	}

	@Test(timeout=10)
	public void testWithdraw() {
	
			BankAccount acc = new BankAccount(75);
			acc.withdraw(50);
			assertEquals(acc.getBalance(),25);
		
	}
}
