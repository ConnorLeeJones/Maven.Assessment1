package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String firstLetter = str.substring(0, 1).toUpperCase();
        String newString = firstLetter + str.substring(1);

        return newString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return reversed;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        str = BasicStringUtils.reverse(str);
        str = BasicStringUtils.camelCase(str);
        return str;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        str = str.substring(1, str.length() -1);
        return str;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if (Character.isUpperCase(str.charAt(i))){
                builder.append(str.substring(i, i+1).toLowerCase());
            } else {
                builder.append(str.substring(i, i+1).toUpperCase());
            }
        }
        return builder.toString();
    }
}
