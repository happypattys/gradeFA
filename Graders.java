import java.util.InputMismatchException; 
import java.util.Scanner;

public class Graders {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueGrading = true; 

        
        while (continueGrading) {
            try {
                System.out.print("Enter the student's score (or type 'quit' to exit): ");
                
               
                if (input.hasNextInt()) { 
                    int score = input.nextInt(); 

                    String grade; 

                    if (score >= 90) {
                        grade = "A";
                    } else if (score >= 80) {
                        grade = "B";
                    } else if (score >= 70) {
                        grade = "C";
                    } else if (score >= 60) {
                        grade = "D";
                    } else if (score >= 0) { 
                        grade = "F";
                    } else { 
                        grade = "Invalid Score (Negative)";
                    }

                    System.out.println("The student's grade is: " + grade);
                    
                } else { 
                    String userInput = input.next(); 
                    if (userInput.equalsIgnoreCase("quit")) { 
                        continueGrading = false; 
                        System.out.println("Exiting grading program. Goodbye!");
                    } else {
                        System.out.println("Invalid input. Please enter a whole number for the score or type 'quit'.");
                    }
                }
            } catch (InputMismatchException e) {
                 
                System.out.println("Invalid input. Please enter a whole number for the score or type 'quit'.");
                input.next(); 
            }
            System.out.println(); 
        }

        input.close(); 
    }
}