package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void accountCanBeCreatedTest() {
        // give i have created an account
        Account yepaAccount = new Account();
        // then i check my balance
        int balance = yepaAccount.getBalance();
        // confirm that my balance is 0
        assertEquals(0, balance);

    }

    @Test
    public void depositMoneyTest() {
        // given i have an account
        Account boyoAccount = new Account();
        // when i deposit money
        boyoAccount.deposit(1500);
        //check that my deposit has changed
        assertEquals(1500, boyoAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit negative should not change balance Test")
    public void depositNegativeAmountTest() {
        Account davidAccount = new Account();
        davidAccount.deposit(-1500);
        assertEquals(0, davidAccount.getBalance());
    }

    @Test
    public void withdrawTest() {
        Account lolaAccount = new Account();
        lolaAccount.deposit(3000);
        lolaAccount.withdraw(3000);
        assertEquals(0, lolaAccount.getBalance());
    }

    @Test
    public void withdrawNegativeTest() {
        Account samAccount = new Account();
        samAccount.deposit(4000);
        samAccount.withdraw(-1000);
        assertEquals(4000, samAccount.getBalance());
    }

    @Test
    public void withdrawHigherAmountTest() {
        Account nifeAccount = new Account();
        nifeAccount.deposit(4000);
        nifeAccount.withdraw(5000);
        assertEquals(4000, nifeAccount.getBalance());

    }
}
