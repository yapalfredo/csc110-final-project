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
public class SpecialFunctions {

    public static Scanner kb = new Scanner(System.in);
    public static String YesOrNo;
    public static byte choice;
    public static double x;
    public static int y;
    public static float rate;

    public static void Choice() {
        try {
            do {
                System.out.println("            Press:");
                System.out.println("                    1 to convert Celcius to Fahrenheit");
                System.out.println("                    2 to convert Fahrenheit to Celcius");
                System.out.println("                    3 for Absolute function");
                System.out.println("                    4 for Inverse function");
                System.out.println("                    5 for Present Value");
                System.out.println("                    6 for Future Value");
                System.out.println("                    7 to go back");
                System.out.println("");
                choice = kb.nextByte();

                switch (choice) {
                    case 1:
                        CelciusToFahrenheit();
                        break;
                    case 2:
                        FahrenheitToCelcius();
                        break;
                    case 3:
                        AbsoluteFunction();
                        break;
                    case 4:
                        InverseFunction();
                        break;
                    case 5:
                        PresentValue();
                        break;
                    case 6:
                        FutureValue();
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Please enter only between 1 - 7");
                        Choice();
                        break;
                }

            } while (choice != 7);
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

    public static void CelciusToFahrenheit() {
        try {
            do {
                System.out.println("C E L C I U S    T O    F A H R E N H E I T");
                System.out.println("Please enter temperature in celcius");
                x = kb.nextFloat();
                System.out.println("");
                System.out.print(x + " degrees Celcius is equal to: ");
                System.out.printf(Option.getFormat() + "%s", ((1.8 * x) + 32), " degrees Fahrenheit\n");

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {

        }
    }

    public static void FahrenheitToCelcius() {
        try {
            do {
                System.out.println("F A H R E N H E I T    T O    C E L C I U S");
                System.out.println("Please enter temperature in fahrenheit");
                x = kb.nextFloat();
                System.out.println("");
                System.out.print(x + " degrees Fahrenheit is equal to: ");
                System.out.printf(Option.getFormat() + "%s", ((x - 32) / 1.8), " degrees Celcius\n");

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {

        }
    }

    public static void AbsoluteFunction() {
        try {
            do {
                System.out.println("A B S O L U T E    F U N C T I O N");
                System.out.println("Please enter a value");
                x = kb.nextDouble();
                System.out.println("");
                System.out.print("The absolute value of " + x + " is ");
                System.out.printf(Option.getFormat() + "\n", Math.abs(x));

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {

        }
    }

    public static void InverseFunction() {
        try {
            do {
                System.out.println("I N V E R S E    F U N C T I O N");
                System.out.println("1 / X");
                System.out.println("Please enter the value of x");
                x = kb.nextDouble();
                System.out.println("");
                System.out.print("The inverse function of " + x + " is ");
                System.out.printf(Option.getFormat() + "\n", (1 / x));

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {

        }
    }

    public static void PresentValue() {
        try {
            do {
                System.out.println("P R E S E N T    V A L U E");
                System.out.println("Please enter the future value");
                x = kb.nextDouble();
                System.out.println("Please enter the rate of return");
                rate = kb.nextFloat();
                System.out.println("Please enter the number of periods");
                y = kb.nextInt();
                System.out.print("The present value is: ");
                System.out.printf(Option.getFormat() + "\n", (x * (1 / (Math.pow(1 + rate, y)))));

                System.out.println("");

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {

        }
    }

    public static void FutureValue() {
        try {
            do {
                System.out.println("F U T U R E    V A L U E");
                System.out.println("Please enter the present value");
                x = kb.nextDouble();
                System.out.println("Please enter the rate of return");
                rate = kb.nextFloat();
                System.out.println("Please enter the number of periods");
                y = kb.nextInt();
                System.out.print("The future value is: ");
                System.out.printf(Option.getFormat() + "\n", (x * (Math.pow(1 + rate, y))));

                System.out.println("");

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {

        } 
    }
}
