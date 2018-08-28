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
public class TrigonometryFunctions {

    public static Scanner kb = new Scanner(System.in);
    public static String YesOrNo;
    public static byte choice;
    public static double x;

    public static void Choice() {
        try {
            do {

                System.out.println("            Press:");
                System.out.println("                    1 for Sine");
                System.out.println("                    2 for Cosine");
                System.out.println("                    3 for Tangent");
                System.out.println("                    4 to go back");
                System.out.println("");
                choice = kb.nextByte();

                switch (choice) {
                    case 1:
                        TrigonometricFunctionSin();
                        break;
                    case 2:
                        TrigonometricFunctionCos();
                        break;
                    case 3:
                        TrigonometricFunctionTan();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Please enter only between 1 - 4");
                        Choice();
                        break;
                }

            } while (choice != 4);
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

    public static void TrigonometricFunctionSin() {
        try {
            do {
                System.out.println("S I N E    F U N C T I O N");
                System.out.println("S I N ( X )");
                System.out.println("Please enter the value of x");
                x = kb.nextDouble();
                System.out.println("");
                System.out.print("Sin of " + x + " is equal to: ");
                System.out.printf(Option.getFormat() + "\n", Math.sin(((x * Math.PI) / 180)));

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {

        }
    }

    public static void TrigonometricFunctionCos() {
        try {
            do {
                System.out.println("C O S I N E    F U N C T I O N");
                System.out.println("C O S ( X )");
                System.out.println("Please enter the value of x");
                x = kb.nextDouble();
                System.out.println("");
                System.out.print("Cos of " + x + " is equal to: ");
                System.out.printf(Option.getFormat() + "\n", Math.cos(((x * Math.PI) / 180)));

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {

        }
    }

    public static void TrigonometricFunctionTan() {
        try {
            do {
                System.out.println("T A N G E N T   F U N C T I O N");
                System.out.println("T A N ( X )");
                System.out.println("Please enter the value of x");
                x = kb.nextDouble();
                System.out.println("");
                System.out.print("Tan of " + x + " is equal to: ");
                System.out.printf(Option.getFormat() + "\n", Math.tan(((x * Math.PI) / 180)));

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {

        }
    }

}
