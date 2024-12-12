import org.apiguardian.api.API;

/**
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */
public class Ex1 {
    public static final String VALID_CHARS = "0123456789ABCDEFG"; // a constant string  variable of all possible chars

    /**
     * this static function receives a char (b), if b is in VALID_CHARS String return its index. if not, return -1
     *
     * @param b a char
     * @return int index of b in VALID_CHARS String
     */
    public static int indexAtValidChars(String b) {
        return VALID_CHARS.indexOf(b); // returns index of b in VALID_CHARS String.
    }

    /**
     * Convert the given number (num) to a decimal representation (as int).
     * It the given number is not in a valid format returns -1.
     *
     * @param num a String representing a number in basis [2,16]
     * @return number as int
     */
    public static int number2Int(String num) {
        int ans = -1;

        if (!num.contains("b")) { // add basis 10 to num so that conversion works
            num += "bA";
        }

        if (isNumber(num)) { // if num is in wanted format (is valid)

            String number = num.split("b")[0];// extract the number part of num

            int base = charToInt(num.split("b")[1].charAt(0)); // find the basis part of num and convert to int

            ans = Integer.parseInt(number, base); //java function to convert String to integer in base 10

        }

        return ans;
    }

    /**
     * This static function checks if a given String (g) is in a valid "number" format.
     *
     * @param a a String representation of a number
     * @return true if the given String is in a valid "number" format
     */
    public static boolean isNumber(String a) {
        boolean ans = true;

        if (a.equals("b")) {
            ans = false;
        }
        else { // only if 'ans' is true continue checking validity of num

            if (!a.contains("b")) {
                a += "bA";
            }
            String[] arrNum = a.split("b");

            if (arrNum.length < 2 ){ // if the string contains 'b' but a base wasn't specified
                ans = false;
            }
            else {
                if (!numIsVal(arrNum[0],arrNum[1]) || !baseIsVal(arrNum[1])) { // check if number or base aren't valid
                    ans = false;
                }
            }

        }
        return ans;
    }

    /**
     * Calculate the number representation (in basis base)
     * of the given natural number (represented as an integer).
     * If num<0 or base is not in [2,16] the function should return "" (the empty String).
     *
     * @param num  the natural number (include 0).
     * @param base the basis [2,16]
     * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
     */
    public static String int2Number(int num, int base) {
        String ans = "";
        String basis = base + ""; // to string base

        if (num >= 0 && base >= 2 && base <= 16) { // check if num and base fulfill given conditions.
            ans = Integer.toString(num, base).toUpperCase(); // a java function that receives a number in base 10 and a base as integers and converts the number to the received base
            if (!basis.matches("10")) { // if base is 10 - no need to add b10
                ans += "b" + intToChar(base); // לשרשר
            }

        }
        return ans;
    }

    /**
     * Checks if the two numbers have the same value.
     *
     * @param n1 first number
     * @param n2 second number
     * @return true iff the two numbers have the same values.
     */
    public static boolean equals(String n1, String n2) {
        boolean ans = true;
        if (number2Int(n1) != (number2Int(n2))) { // check if int val of n1 != to int val of n2
            ans = false;
        }
        return ans;
    }

    /**
     * This static function search for the array index with the largest number (in value).
     * In case there are more than one maximum - returns the first index.
     * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
     *
     * @param arr an array of numbers
     * @return the index in the array in with the largest number (in value).
     */
    public static int maxIndex(String[] arr) {
        int ans = 0;
        int maxVal = 0; // the current max value

        for (int i = 0; i < arr.length; i++) { // loop over given array
            if (number2Int(arr[i]) > maxVal) { // check if value of String at index i is higher that current maxVal
                maxVal = number2Int(arr[i]); // redefine maxVal
                ans = i; // define maxVal index to num
            }
        }
        return ans;
    }

    /**
     * this static function checks if a given String (a) is in valid base form [1-9 , A-G]
     * @param a the given base (String)
     * @return true iff base is in valid form
     */
    public static boolean baseIsVal (String a){
        boolean ans = true;
        if (a.isEmpty() || indexAtValidChars(a) == -1){ // if there is no base or if base isn't in VALID_CHARS
            ans = false;
        }
           return ans;
    }

    /**
     * this static function checks if a given String (m) is in valid base form
     * @param m the given number
     * @param b the given base
     * @return true iff the given number is in valid "number" format.
     */
    public static boolean numIsVal (String m , String b){
        boolean ans = true;
        if (m.isEmpty()) {
            ans = false;
        }
        for (int i = 0; i < m.length(); i++) {
            int indexOfI = indexAtValidChars(String.valueOf(m.charAt(i)));
           if (indexOfI >= indexAtValidChars(b) || indexOfI == -1 ) { // if i isn't in VALID_CHARS or bigger that base.
               ans = false ;
           }
        }
        return ans;
    }

    /**
     * this static function converts number form a char representation to an integer representation
     *
     * @param num a char
     * @return char (a) as an integer
     */
    public static int charToInt(char num) {
        return indexAtValidChars(num + "");
    }

    /**
     * this static function converts number form an integer representation to a char representation
     * @param num an integer
     * @return int num as (a) char
     */
    public static char intToChar(int num) {
        return VALID_CHARS.charAt(num);

    }

} // end of class

