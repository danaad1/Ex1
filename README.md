# Ex1: Number Formatting Converter and Calculator

#### this is my attempt at solving assignment 1 of Intro2CS at ArielU.

### Overview

This assignment focuses on the foundation of function programming and testing, it covers Strings, arrays, and numerical computations.

In this assignment, we will design a number formatting converter and calculator.
In general, we will use Strings as numbers over the base of binary till Hexa (2-16), 10-16 are represented by A,B,..G. The general representation of the numbers is as a String with the following format: <'number'><'b'><'base'>

**For example:**
- "135bA" represents the number "135" in base 10.
- "100111b2" represents the number "100111" in base 2.
- "12345b6" represents the number "12345" in base 6.

The following are **not valid** representations:
- "b2" , "0b1" , "123b" ,  "1234b11" , "3b3" ,  "-3b5" ,  "3 b4" , "GbG" , "" , `null`

The program supports bases ranging from 2 to 16, with bases 10-16 represented by A, B, ..., G.

## Main Methods

### `number2Int(String num)`
- **Description**: Converts the given string `num` to a decimal integer. If the number is not in a valid format, it returns `-1`.
- **Returns**: The integer value of the number or `-1` if the number is invalid.

 ### `isNumber(String a)`
- **Description**: Checks if the given string `a` is a valid number in the required format (`<number><b><base>`).
- **Returns**: `true` if the number is valid, `false` otherwise.

### `int2Number(int num, int base)`
- **Description**: Converts a decimal integer `num` to a string representation in the given base `base`. Returns an empty string if the input is invalid.
- **Returns**: A string representing the number in the specified base or an empty string if the input is invalid.

### `equals(String n1, String n2)`
- **Description**: Checks if two numbers `n1` and `n2` are equal in value.
- **Returns**: `true` if the two numbers are equal, `false` otherwise.

### `maxIndex(String[] arr)`
- **Description**: Finds the index of the largest number in an array of numbers. If there are multiple numbers with the same maximum value, returns the index of the first one.
- **Returns**: The index of the largest number in the array.


## Other Methods
- `indexAtValidChars(String b)` -  Returns the index of the given character `b` in the `VALID_CHARS` string. If the character is not valid, it returns `-1`. 
- `baseIsVal(String a)` - Checks if the given string `a` is a valid base (a character between `1`-`9` or `A`-`G`).
- `numIsVal(String m, String b)` - Checks if the given number `m` is valid for the given base `b`.
- `charToInt(char num)` - Converts a character `num` (from the valid character set) to its corresponding integer value.
- `intToChar(int num)` - Converts an integer `num` (in the range [0,16]) to its corresponding character representation.

## Constants

### `VALID_CHARS`
- **Description**: A constant string containing all valid characters for the bases (0-9, A-G).
