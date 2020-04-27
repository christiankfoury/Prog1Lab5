// Importing all java classes
import java.util.*;
/**
 * @author Christian
 */
// This program uses the CourseGrade class and its methods. It prompts the user for two course grade and its letter
// and by the end of the program, its compares both of them are equal or not.
public class CourseGradeClient {

   public static void main(String[] args) {
       // Using the scanner clas to get input from the user   
        Scanner kb = new Scanner(System.in);

        // Prompt the user for a course name
        System.out.println("Please input the course name: ");
        String name = kb.nextLine();
        // Prompt the user for a course letter
        System.out.println("Please input the letter grade: ");
        // Getting input from the user
        char grade = kb.nextLine().charAt(0);
        
        // CourseGrade class and passing values
        CourseGrade course = new CourseGrade(name, grade);
        // Output
        System.out.println(course.toString());
        // Having a nice output
        System.out.println("---------------------------");


        // Prompt the user for another course name
        System.out.println("Please enter another course name: ");
        String name2 = kb.nextLine();
        // Prompt the user for another letter grade
        System.out.println("Please input another letter grade: ");
        // Getting input from the user
        char grade2 = kb.nextLine().charAt(0);

        // Constructor with the second course
        CourseGrade course2 = new CourseGrade();
        course2.setName(name2);
        course2.setletterGrade(grade2);
        // Output with the toString() method
        System.out.println(course2.toString());

        // If the first course is equal to the second course output that they are the same
        // Else, they are not the same
        if (course.equals(course2)) {
            System.out.println("The 2 course grades are the same");
        } else{
            System.out.println("The 2 course grades are not same");
        }

    }
}