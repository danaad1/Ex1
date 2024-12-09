import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test {
        @Test
        void computeNumberTest() {
            String s2 = "1011b2";
            int v = Ex1.number2Int(s2);
            assertEquals(v,11);
            String s10 = "1011bA";
            v = Ex1.number2Int(s10);
            s2 = Ex1.int2Number(v,2);
            int v2 = Ex1.number2Int(s2);
            assertEquals(v,v2);
            assertTrue(Ex1.equals(s10,s2));
        }

        @Test
        void isBasisNumberTest() {
            String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
            for(int i=0;i<good.length;i=i+1) {
                boolean ok = Ex1.isNumber(good[i]);
                assertTrue(ok);
            }
            String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2" , "32b3b5"};
            for(int i=0;i<not_good.length;i=i+1) {
                boolean not_ok = Ex1.isNumber(not_good[i]);
                assertFalse(not_ok);
            }
        }
        @Test
        void int2NumberTest() {
           // implement this test
        }
        @Test
        void maxIndexTest() {
            // implement this test
        }

        @Test
        void charToIntTest() {
            String a = "ABCDEFG123456789";
            assertEquals(10 , Ex1.charToInt(a.charAt(0)));
            assertEquals(11 ,Ex1.charToInt(a.charAt(1)));
            assertEquals(12 , Ex1.charToInt(a.charAt(2)));
            assertEquals(13 , Ex1.charToInt(a.charAt(3)));
            assertEquals(14 , Ex1.charToInt(a.charAt(4)));
            assertEquals(15 , Ex1.charToInt(a.charAt(5)));
            assertEquals(16, Ex1.charToInt(a.charAt(6)));
            assertEquals(1 , Ex1.charToInt(a.charAt(7)));
            assertEquals(2 , Ex1.charToInt(a.charAt(8)));
            assertEquals(3 , Ex1.charToInt(a.charAt(9)));
            assertEquals(4 , Ex1.charToInt(a.charAt(10)));
            assertEquals(5 , Ex1.charToInt(a.charAt(11)));
            assertEquals(6 , Ex1.charToInt(a.charAt(12)));
            assertEquals(7 , Ex1.charToInt(a.charAt(13)));
            assertEquals(8 , Ex1.charToInt(a.charAt(14)));
            assertEquals(9 , Ex1.charToInt(a.charAt(15)));

                // implement
        }



    // Add additional test functions - test as much as you can.
    }
