package calculator;

import java.util.Scanner;

public class Calculator {

    public static Scanner kb = new Scanner(System.in);
    public static byte choice;

    public static void main(String[] args) {
        controlPanel();
    }

    public static void controlPanel() {
        try {
            do {
                System.out.println("C A L C U L A T O R");

                System.out.println("Press: ");
                System.out.println("        1 - Arithmetic");
                System.out.println("        2 - Power Functions");
                System.out.println("        3 - Trigonometry Functions");
                System.out.println("        4 - Special Functions");
                System.out.println("        5 - Option");
                System.out.println("        6 - Exit");

                System.out.println("");
                choice = kb.nextByte();

                switch (choice) {
                    case 1:
                        Arithmetic.Choice();
                        break;
                    case 2:
                        PowerFunctions.Choice();
                        break;
                    case 3:
                        TrigonometryFunctions.Choice();
                        break;
                    case 4:
                        SpecialFunctions.Choice();
                        break;
                    case 5:
                        Option.Choice();
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Please enter only between 1 - 6");
                        controlPanel();
                        break;
                }
            } while (choice != 6);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("");
            System.out.println("I N P U T    E R R O R");
            System.out.println(ex.toString());
            System.out.println("P R O G R A M    T E R M I N A T E D");
            System.out.println("");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }
}
