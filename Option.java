/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author al
 */
public class Option {

    public static Scanner kb = new Scanner(System.in);
    public static String YesOrNo;
    public static byte x, choice;

    private static String format = "%f";
    private static String decimalPlaces = "";
    private static String commaSeparator = "";
    private static String printF = "%";

    public static void Choice() {
        try {
            do {
                System.out.println("            Press:");
                System.out.println("                    1 to set decimal places");
                System.out.println("                    2 to set comma separator");
                System.out.println("                    3 to go back");
                System.out.println("");
                choice = kb.nextByte();
                switch (choice) {
                    case 1:
                        DecimalPlaces();
                        break;
                    case 2:
                        CommaSeparator();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Please enter only between 1 - 3");
                        Choice();
                        break;
                }

            } while (choice != 3);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("");
            System.out.println("I N P U T    E R R O R");
            System.out.println(ex.toString());
            System.out.println("T R Y    A G A I N");
            System.out.println("");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public static void DecimalPlaces() {
        try {
            do {
                System.out.println("S E T    D E C I M A L    P L A C E S");
                System.out.println("How many decimal places would you like to set? [0-10]");
                x = kb.nextByte();
                setDecimalPlaces("." + x);
                setFormat(getPrintF() + getCommaSeparator() + getDecimalPlaces() + "f");

                System.out.println("");

                System.out.println("Enter x to go back");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("x"));
        } catch (Exception ex) {

        }
    }

    public static void CommaSeparator() {
        try {
            do {
                System.out.println("S E T    C O M M A    S E P A R A T O R");
                System.out.println("Enter 1 to enable comma separator. Enter 0 to disable.");
                x = kb.nextByte();

                switch (x) {
                    case 0:
                        setCommaSeparator("");
                        break;
                    case 1:
                        setCommaSeparator(",");
                        break;
                    default:
                        System.out.println("Please enter only either 1 or 0");
                        break;

                }
                setFormat(getPrintF() + getCommaSeparator() + getDecimalPlaces() + "f");
                System.out.println("");

                System.out.println("Enter x to go back");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("x"));
        } catch (Exception ex) {

        }
    }

    public Option() {

    }

    public static String getFormat() {
        return format;
    }

    public static String getDecimalPlaces() {
        return decimalPlaces;
    }

    public static String getCommaSeparator() {
        return commaSeparator;
    }

    public static String getPrintF() {
        return printF;
    }

    public static void setFormat(String format) {
        Option.format = format;
    }

    public static void setDecimalPlaces(String decimalPlaces) {
        Option.decimalPlaces = decimalPlaces;
    }

    public static void setCommaSeparator(String commaSeparator) {
        Option.commaSeparator = commaSeparator;
    }

}
