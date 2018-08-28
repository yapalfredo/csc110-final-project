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
public class PowerFunctions {

    public static Scanner kb = new Scanner(System.in);
    public static byte choice;
    public static String YesOrNo;

    public static double x, z;
    public static int y;

    public static void Choice() {
        try {
            do {

                System.out.println("            Press:");
                System.out.println("                    1 for X to the power of Y");
                System.out.println("                    2 for Square Root");
                System.out.println("                    3 for Cube Root");
                System.out.println("                    4 for Nth Root");
                System.out.println("                    5 for Log Base 10");
                System.out.println("                    6 for Natural Log");
                System.out.println("                    7 for Exponent");
                System.out.println("                    8 to go back");
                System.out.println("");
                choice = kb.nextByte();

                switch (choice) {
                    case 1:
                        Power();
                        break;
                    case 2:
                        SquareRoot();
                        break;
                    case 3:
                        CubeRoot();
                        break;
                    case 4:
                        NthRoot();
                        break;
                    case 5:
                        LogBase10();
                        break;
                    case 6:
                        NaturalLog();
                        break;
                    case 7:
                        Exponent();
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Please enter only between 1 - 8");
                        Choice();
                        break;
                }

            } while (choice != 8);
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

    public static void Power() {
        try {
            do {
                System.out.println("E X P O N E N T");
                System.out.println("Please enter the base number");
                x = kb.nextDouble();
                System.out.println("Please enter the power");
                y = kb.nextInt();
                System.out.println("");
                System.out.println("The answer is: ");
                System.out.printf(Option.getFormat() + "\n", Math.pow(x, y));

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {

        }
    }

    public static void SquareRoot() {
        try {
            do {
                System.out.println("S Q U A R E    R O O T");
                System.out.println("Please enter the base number");
                x = kb.nextDouble();
                System.out.println("The answer is: ");
                System.out.printf(Option.getFormat() + "\n", Math.sqrt(x));

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {

        }
    }

    public static void CubeRoot() {
        try {
            do {
                System.out.println("C U B E    R O O T");
                System.out.println("Please enter the base number ");
                x = kb.nextDouble();
                System.out.println("The answer is: ");
                System.out.printf(Option.getFormat() + "\n", Math.cbrt(x));

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {

        }
    }

    public static void NthRoot() {
        try {
            do {
                System.out.println("N T H    R O O T");
                System.out.println("Please enter the base number");
                x = kb.nextDouble();
                System.out.println("Please enter the nth root");
                z = kb.nextDouble();
                System.out.println("The answer is: ");
                System.out.printf(Option.getFormat() + "\n", Math.pow(x, (1 / z)));
                

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {

        }
    }

    public static void LogBase10() {
        try {
            do {
                System.out.println("L O G   B A S E    1 0");
                System.out.println("Please enter the argument number ");
                x = kb.nextDouble();
                System.out.println("The answer is: ");
                System.out.printf(Option.getFormat() + "\n", Math.log10(x));

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {

        }
    }

    public static void NaturalLog() {
        try {
            do {
                System.out.println("N A T U R A L   L O G");
                System.out.println("Please enter the argument number ");
                x = kb.nextDouble();
                System.out.println("The answer is: ");
                System.out.printf(Option.getFormat() + "\n", Math.log(x));

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {

        }
    }

    public static void Exponent() {
        try {
            do {
                System.out.println("E X P O N E N T");
                System.out.println("Please enter the power");
                x = kb.nextDouble();
                System.out.println("");
                System.out.println("The answer is: ");
                System.out.printf(Option.getFormat() + "\n", Math.exp(x));

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {

        }
    }
}
