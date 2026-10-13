package Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BankAccountTest {


    @Test
    public void shouldNotBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        assertFalse(account.isBlocked());
    }

    @Test
    public void shouldReturnZeroAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        assertEquals(Integer.valueOf(0), account.getAmount());
        assertEquals("RUB", account.getCurrency());
    }


    @Test
    public void shouldBeBlockedAfterBlockIsCalled() {

        BankAccount account = new BankAccount("Иван", "Иванов");

        account.block();

        assertTrue(account.isBlocked());
    }


    @Test
    public void shouldReturnFirstNameThenSecondName() {

        BankAccount account = new BankAccount("Иван", "Иванов");
        String[] expectedFullName = {"Иван", "Иванов"};

        String[] actualFullName = account.getFullName();

        assertArrayEquals(expectedFullName, actualFullName);
    }

    @Test
    public void shouldReturnNullAmountWhenNotActive() {

        BankAccount account = new BankAccount("Иван", "Иванов");

        String currency = account.getCurrency();

        assertNull(currency);
    }
}