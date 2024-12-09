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
    /**
     * Convert the given number (num) to a decimal representation (as int).
     * It the given number is not in a valid format returns -1.
     *
     * @param num a String representing a number in basis [2,16]
     * @return number as int
     */
    public static int number2Int(String num) {
        int ans = -1;

        if (!num.contains("b")){ // add basis 10 to num so that conversion works
            num += "bA";
        }

        if (isNumber(num)) { // if num is in wanted format (is valid)
            ans = 0; // int representation of num

            String number = num.split("b")[0];// extract the number part of num

            int base = charToInt( num.split("b")[1].charAt(0)); // find the basis part of num and convert to int

            ans = Integer.parseInt(number , base); //java function to convert String to integer in base 10
//
//            String a = "0123456789ABCDEFG"; // all possible characters for num
//
//            int weight = 0; // weight of number to know by how much to multiply
//
//            for (int i = number.length() - 1; i >= 0; i--) {
////                  for (int j = 0; j < a.length(); j++) {
//                int index = a.indexOf(number.charAt(i));
//
//                ans += (int) (index * Math.pow(base, weight));
//                weight += 1;
////                  }
        }

//            String [] arr = num.split("b");
//            int number = Integer.parseInt(arr[0]);
//            int basis = Integer.parseInt(arr[1]);
//
//            int stop = number ; // fix
//            ans = 0 ;

//            while (remainder > 0){
//                ans += remainder % 10 ;
//                remainder = number / 10 ;
//            }
//            ans += remainder % 10;
//
//            // add your code here
//
//            ////////////////////
        return ans;
    }

    /**
     * This static function checks if the given String (g) is in a valid "number" format.
     *
     * @param a a String representing a number
     * @return true iff the given String is in a number format
     */
    public static boolean isNumber(String a) {
        boolean ans = true;

        if (a.equals("b")) {
            ans = false;
        } else { // only if ans is true continue checking validity of num

            if (!a.contains("b")) {
                a += "bA";
            }
            String[] arrNum = a.split("b");
            String validNum = "0123456789ABCDEFG"; //string of all valid characters

            if (arrNum[0].isEmpty()) { // if string is empty return not valid
                ans = false;
            }

            for (int i = 0; i < arrNum[0].length(); i++) { // loop over array index 0
                char t = arrNum[0].charAt(i);
                int n = validNum.indexOf(t + ""); //  break down to num valid bais val
                if (!validNum.contains(t + "") || n >= validNum.indexOf(arrNum[1])) { // if any number is invalid or is bigger than basis return false
                    ans = false;
                    break;
                }
            }
            if (!validNum.contains(arrNum[1]) || arrNum[1].length() > 2) { // if basis in invalid or has multiple numbers
                return false;
            }

        }

        // add your code here

        ////////////////////
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

        if(num >= 0 && base >= 2 && base <= 16 ){
            ans = Integer.toString(num , base).toUpperCase();
        }
        // add your code here

        ////////////////////
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
        // add your code here

        ////////////////////
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
        // add your code here

        ////////////////////
        return ans;
    }

//    /**
//     * this static function converts a number represented as int to an int at a given basis represented as int
//     * @param num
//     * @param base
//     * @
//     */
//      public static int convertToBasis (int num, int base) {
//            int ans = 0;
//
//            //implement here//
//
//            return ans;
//       }


    /**
     * this static function converts number form a char to an integer
     *
     * @param num a char
     * @return char as an int
     */
    public static int charToInt(char num) {
        int intNum = 0;
        String numbers = "0123456789ABCDEFG"; // all possible characters for num
        for (int i = 0; i < numbers.length(); i++) { // loop over string numbers
            if (numbers.charAt(i) == num) { // if chat at i is num // להוסיף בדיקה לארר 1
                intNum = i;  // find the int value of num
            }
        }
        return intNum;
    }


//          int intRepresent = 0; // int representation of num
//          String a = "0123456789ABCDEFG"; // all possible characters for num
//          String number = num.split("b")[0]; // find the number part of num
//          String base = num.split("b")[1]; // find the basis part of num
//           int weight = 0 ; // weight of number to know by how much to multiply
//
//           for (int i = number.length() - 1; i >= 0; i-- ) {
//              for (int j = 0; j < a.length(); j++) {
//                  int index = a.indexOf(i+ "");
//                  intRepresent += (int) (index * Math.pow(base,weight));
//             }
//          }



//          String  [] number  =  num.split("b"); //to ints add val of g
//          int intNum =  ;
//
//
//          for (int i = 0; i < number[0].length(); i++) {
//              for (int j = 0 ; j < a.length() ; j++ ) {
//                  intNum += a.charAt(j) ;
//              }
//          }
//          System.out.println(intNum);





          //implement
//          return intRepresent;
   }

