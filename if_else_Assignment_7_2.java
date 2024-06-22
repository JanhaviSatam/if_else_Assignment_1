package Assignment;

import java.util.Scanner;

public class if_else_Assignment_7_2 {

    public static void main(String[] args) {
        String pass1, pass2;
        int count;
        Scanner sc = new Scanner(System.in);

        System.out.println("Set Your Password");
        pass1 = sc.next();

        for (count = 3; count >= 0; count--) {
            System.out.println("Enter Your Password");
            pass2 = sc.next();

            if (!pass1.equals(pass2)) {
                if (count == 0) {
                    System.out.println("Sorry, no more attempts left.");
                } else {
                    System.out.println("Passwords do not match. Try again. " + count + " attempt(s) left.");
                }
            } else {
                System.out.println("Passwords match!");
                System.out.println("Start the game");

                System.out.println("1. Who invented Java Programming?");
                System.out.println("   1. Guido van Rossum");
                System.out.println("   2. James Gosling");
                System.out.println("   3. Dennis Ritchie");
                System.out.println("   4. Bjarne Stroustrup");

                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Play next time");
                        break;
                    case 2:
                        System.out.println("Correct Answer");
                        System.out.println("2. Which component is used to compile, debug and execute the java programs?");
                        System.out.println("   1. JRE");
                        System.out.println("   2. JIT");
                        System.out.println("   3. JDK");
                        System.out.println("   4. JVM");

                        int option2 = sc.nextInt();
                        switch (option2) {
                            case 1:
                                System.out.println("Play next time");
                                break;
                            case 2:
                                System.out.println("Play next time");
                                break;
                            case 3:
                                System.out.println("Correct Answer");
                                break;
                            case 4:
                                System.out.println("Play next time");
                                break;
                            default:
                                System.out.println("Invalid input");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Play next time");
                        break;
                    case 4:
                        System.out.println("Play next time");
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
                break;
            }
        }

        sc.close();
    }
}
