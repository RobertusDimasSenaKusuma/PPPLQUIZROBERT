import org.example.Wallet;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletUnitTest {
    private Wallet pemilik;
    private Wallet penerima;

    @Before
    public void setUp() {
        pemilik = new Wallet(10000.00, "Rupiah");
        penerima = new Wallet(5000.00, "Rupiah");
    }

    @Test
    public void GetSaldo() {
        assertEquals(10000.00, pemilik.getBalance(), 0.010);
    }

    @Test
    public void testGetCurrency() {
        assertEquals("Rupiah", pemilik.getCurrency());
    }

    @Test
    public void testDepositAmount() {
        pemilik.depositAmount(5000.00);
        assertEquals(15000.00, pemilik.getBalance(), 0.010);
    }

    @Test
    public void testWithdrawAmountSufficientBalance() {
        assertTrue(pemilik.withdrawAmount(5000.00));
        assertEquals(5000.00, penerima.getBalance(), 0.010);
    }

    @Test
    public void testWithdrawAmountInsufficientBalance() {
        assertFalse(pemilik.withdrawAmount(15000.00));
        assertEquals(10000.00, pemilik.getBalance(), 0.010);
    }

    @Test
    public void testTransferFundsSufficientBalance() {
        pemilik.transferFunds(penerima, 3000.00);

        assertEquals(7000.00, pemilik.getBalance(), 0.010);
        assertEquals(8000.00, penerima.getBalance(), 0.010);
    }

}
