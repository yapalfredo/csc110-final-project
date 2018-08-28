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
public class Arithmetic {

    public static Scanner kb = new Scanner(System.in);
    public static byte choice;
    public static String YesOrNo;

    public static void Choice() {
        try {
            do {

                System.out.println("            Press:");
                System.out.println("                    1 for Addition");
                System.out.println("                    2 for Subtraction");
                System.out.println("                    3 for Multiplication");
                System.out.println("                    4 for Division");
                System.out.println("                    5 to go back");
                System.out.println("");
                choice = kb.nextByte();

                switch (choice) {
                    case 1:
                        Addition();
                        break;
                    case 2:
                        Subtraction();
                        break;
                    case 3:
                        Multiplication();
                        break;
                    case 4:
                        Division();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Please enter only between 1 - 5");
                        Choice();
                        break;
                }

            } while (choice != 5);
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

    public static void Addition() {
        try {
            do {
                System.out.println("A D D I T I O N");
                System.out.println("");
                String input = kb.next();

                String[] inputArr = input.split("\\+");
                double[] dblArr = new double[inputArr.length];

                for (int i = 0; i < inputArr.length; i++) {
                    String numberAsString = inputArr[i];
                    dblArr[i] = Double.parseDouble(numberAsString);
                }

                double sum = 0;
                for (double number : dblArr) {
                    sum = sum + number;
                }

                System.out.print("The sum is: ");
                System.out.printf(Option.getFormat() + "\n", sum);

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {
//            System.out.println(ex.toString());

        }

    }

    public static void Subtraction() {
        try {
            do {
                YesOrNo = "y";
                System.out.println("S U B T R A C T I O N");
                System.out.println("");
                String input = kb.next();

                String[] inputArr = input.split("\\-");
                double[] dblArr = new double[inputArr.length];

                for (int i = 0; i < inputArr.length; i++) {
                    String numberAsString = inputArr[i];
                    dblArr[i] = Double.parseDouble(numberAsString);
                }

                double difference = 0;

                if (dblArr.length == 2) {
                    difference = dblArr[0] - dblArr[1];
                } else if (dblArr.length >= 3) {
                    difference = dblArr[0] - dblArr[1];
                    for (int i = 2; i < inputArr.length; i++) {
                        difference -= dblArr[i];
                    }
                } else {
                    System.out.println("You need at least 2 numbers to subtract");

                }

                System.out.print("The difference is: ");
                System.out.printf(Option.getFormat() + "\n", difference);

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {
            // System.out.println(ex.toString());

        }
    }

    public static void Multiplication() {
        try {
            do {
                System.out.println("M U L T I P L I C A T I O N");
                System.out.println("");
                String input = kb.next();

                String[] inputArr = input.split("\\*");
                double[] dbleArr = new double[inputArr.length];

                for (int i = 0; i < inputArr.length; i++) {
                    String numberAsString = inputArr[i];
                    dbleArr[i] = Double.parseDouble(numberAsString);
                }

                double product = 0;
                if (dbleArr.length == 2) {
                    product = dbleArr[0] * dbleArr[1];
                } else if (dbleArr.length >= 3) {
                    product = dbleArr[0] * dbleArr[1];
                    for (int i = 2; i < inputArr.length; i++) {
                        product *= dbleArr[i];
                    }
                } else {
                    System.out.println("You need at least 2 numbers to product");

                }
                System.out.print("The product is: ");
                System.out.printf(Option.getFormat() + "\n", product);

                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {
//            System.out.println(ex.toString());

        }
    }

    public static void Division() {
        try {
            do {
                System.out.println("D I V I S I O N");
                System.out.println("");
                String input = kb.next();

                String[] inputArr = input.split("\\/");
                double[] dblArr = new double[inputArr.length];

                for (int i = 0; i < inputArr.length; i++) {
                    String numberAsString = inputArr[i];
                    dblArr[i] = Double.parseDouble(numberAsString);
                }

                double quotient = 0;
                if (dblArr.length == 2) {
                    quotient = dblArr[0] / dblArr[1];
                } else if (dblArr.length >= 3) {
                    quotient = dblArr[0] / dblArr[1];
                    for (int i = 2; i < inputArr.length; i++) {
                        quotient /= dblArr[i];
                    }
                } else {
                    System.out.println("You need at least 2 numbers to divide");

                }

                System.out.print("The quotient is: ");
                System.out.printf(Option.getFormat() + "\n", quotient);
                System.out.println("");
                System.out.println("Do you want to do it again? Y/N or y/n");
                YesOrNo = kb.next();

            } while (!YesOrNo.equalsIgnoreCase("n"));
        } catch (Exception ex) {
//            System.out.println(ex.toString());

        }
    }

}
