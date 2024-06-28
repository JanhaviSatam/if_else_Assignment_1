package Assignment;


import java.util.Scanner;

public class if_else_Assignment_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "p4n@in";
        int maxAttempts = 3;

        // Password checking loop
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Enter your Password: ");
            String password = scanner.nextLine();
            if (password.equals(correctPassword)) {
                System.out.println("Password correct! Starting MCQ Exam...");
                if (mcqExam(scanner)) {
                    System.out.println("You passed the exam!");
                } else {
                    System.out.println("You failed the exam. Try next year.");
                }
                return;
            } else {
                System.out.printf("Wrong password ... try %d more time%s%n", maxAttempts - attempt, (maxAttempts - attempt == 1) ? "" : "s");
            }
        }

        System.out.println("Too many wrong attempts. Access denied.");
        scanner.close();
    }

    public static boolean mcqExam(Scanner scanner) {
        String question = "Who invented Java Programming?";
        String[] options = {
            "1.) Guido van Rossum",
            "2.) James Gosling",
            "3.) Dennis Ritchie",
            "4.) Bjarne Stroustrup"
        };
        int correctOption = 2;

        System.out.println(question);
        for (String option : options) {
            System.out.println(option);
        }

        System.out.print("Select Answer: ");
        int answer = scanner.nextInt();
        scanner.nextLine();  // consume newline

        if (answer == correctOption) {
            System.out.println("Correct answer!");
            return true;
        } else {
            System.out.println("Wrong answer. Try next year.");
            return false;
        }
    }
}
