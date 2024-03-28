import org.example.StringUtils;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringUnitTest {
    private StringUtils utils;

    @Before
    public void siapkanPengujian() {
        // Persiapkan objek StringUtils sebelum setiap pengujian
        utils = new StringUtils();
    }

    @Test
    public void ujiBalikString() {
        // Uji untuk input null
        assertNull(utils.reverseString(null));

        // Uji untuk string kosong
        assertEquals("", utils.reverseString(""));

        // Uji untuk satu karakter
        assertEquals("a", utils.reverseString("a"));

        // Uji untuk beberapa karakter
        assertEquals("cba", utils.reverseString("abc"));
    }

    @Test
    public void ujiPalindrom() {
        // Uji untuk input null
        assertFalse(utils.isPalindrome(null));

        // Uji untuk string kosong
        assertTrue(utils.isPalindrome(""));

        // Uji untuk satu karakter
        assertTrue(utils.isPalindrome("a"));

        // Uji untuk palindrom
        assertTrue(utils.isPalindrome("A man, a plan, a canal, Panama"));

        // Uji untuk bukan palindrom
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    public void ujiHitungVokal() {
        // Uji untuk input null
        assertEquals(0, utils.countVowels(null));

        // Uji untuk string kosong
        assertEquals(0, utils.countVowels(""));

        // Uji untuk string tanpa vokal
        assertEquals(0, utils.countVowels("xyz"));

        // Uji untuk string dengan vokal
        assertEquals(2, utils.countVowels("hello"));

        // Uji untuk string dengan vokal huruf besar dan kecil campur
        assertEquals(2, utils.countVowels("HeLLo"));
    }

    @Test
    public void ujiBalikStringDenganKarakterKhusus() {
        // Uji untuk string dengan karakter khusus
        assertEquals("!dlroW olleH", utils.reverseString("Hello World!"));
    }

    @Test
    public void ujiPalindromDenganKarakterKhusus() {
        // Uji untuk palindrom dengan karakter khusus
        assertTrue(utils.isPalindrome("A man, a plan, a canal, Panama!"));
    }

    @Test
    public void ujiHitungVokalDenganAngka() {
        // Uji untuk string dengan angka
        assertEquals(2, utils.countVowels("hello123"));
    }

    @Test
    public void ujiHitungVokalDenganKarakterKhusus() {
        // Uji untuk string dengan karakter khusus
        assertEquals(2, utils.countVowels("hello!@#"));
    }

}
