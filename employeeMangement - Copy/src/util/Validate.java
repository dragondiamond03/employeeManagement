package util;

import java.util.Scanner;

/**
 * The `Validate` class contains utility methods to validate input from the user.
 * 
 * @author Bui Tuan Son
 * @version 0.0.1
 */
public class Validate {

    private Validate() {
    }

    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Return the valid integer value scanned from the input:
     * 
     * @param messsageInfo                 The message te be printed instructing the
     *                                     user input
     * @param messageErrorNumberOutOfRange The message will be printed if the String
     *                                     parse value is out of range
     * @param messageErrorInvalidNumber    The message will be printed if the String
     *                                     does not contain a parasable integer
     * @param min                          Minimum limit value
     * @param max                          Maximum limit value
     * @return the valid integer value scanned from the input
     */
    public static int getInt(
            String messageInfo,
            String messageErrorNumberOutOfRange,
            String messageErrorInvalidNumber,
            int min,
            int max) {
        while (true) {
            try {
                System.out.print(messageInfo);
                String str = SCANNER.nextLine();
                int result = Integer.parseInt(str);
                if (result >= min && result <= max) {
                    return result;
                } else {
                    System.out.println(messageErrorNumberOutOfRange);
                }
            } catch (NumberFormatException a) {
                System.out.println(messageErrorInvalidNumber);
            }
        }
    }

    /**
     * Return the valid double value scanned from the input:
     * 
     * @param messsageInfo                 The message te be printed instructing the
     *                                     user input
     * @param messageErrorNumberOutOfRange The message will be printed if the String
     *                                     parse value is out of range
     * @param messageErrorInvalidNumber    The message will be printed if the String
     *                                     does not contain a parasable double
     * @param min                          Minimum limit value
     * @param max                          Maximum limit value
     * @return the valid integer value scanned from the input
     */
    public static int getDouble(
            String messageInfo,
            String messageErrorNumberOutOfRange,
            String messageErrorInvalidNumber,
            double min,
            double max) {
        while (true) {
            try {
                System.out.print(messageInfo);
                String str = SCANNER.nextLine();
                int result = Integer.parseInt(str);
                if (result >= min && result <= max) {
                    return result;
                } else {
                    System.out.println(messageErrorNumberOutOfRange);
                }
            } catch (NumberFormatException a) {
                System.out.println(messageErrorInvalidNumber);
            }
        }
    }

    /**
     * Returns the valid string scanned from the input.
     *
     * @param messageInfo  the message to be printed instructing the user to input
     * @param messageError the message will be printed if the input does not match
     *                     the regular expression
     * @param REGEX        the pattern to test String is valid or not
     * @return the valid string value
     */
    public static String getString(
            String messageInfo,
            String messageError,
            final String REGEX) {
        do {
            System.out.print(messageInfo);
            String str = SCANNER.nextLine().trim();
            if (str.matches(REGEX)) {
                return str;
            }
            System.out.println(messageError);
        } while (true);
    }

    /**
     * Returns the non empty string scanned from the input.
     *
     * @param messageInfo the message to be printed instructing the user to input
     * @return the valid string value
     */
    public static String getString(
            String messageInfo) {
        do {
            System.out.print(messageInfo);
            String str = SCANNER.nextLine().trim();
            if (str.isEmpty()) {
                System.out.println("String can't be empty!");
            } else
                return str;
        } while (true);
    }
}