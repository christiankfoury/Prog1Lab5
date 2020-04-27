/**
 * This program encapsulates the concept of a course
 * @author Christian
 */
public class CourseGrade {
// CourseGrade attributes
    private String courseName;
    private char letterGrade;
    /**
     * This constructs a course grade with a name and a letter grade
     * @param courseName course name of the course grade
     * @param letterGrade course grade of the course grade
     */

    // default constructor
    public CourseGrade(){}

    // Constructor
    public CourseGrade(String name, char grade){
        this.courseName = name;
        this.letterGrade = grade;
    }
    // Get method for Name
    public String getName() {
        return courseName;
    }
    
    // Set method for Name
    public void setName(String name) {
        this.courseName = name;
    }

    // Get method for letterGrade
    public char getletterGrade() {
        return letterGrade;
    }

    // Set method for letterGrade
    public void setletterGrade(char letterGrade) {
        this.letterGrade = letterGrade;
    }

    // Equals method :
    // Returns true if both 
    public boolean equals(CourseGrade course) {
        if(this.courseName.equals(course.courseName) && this.letterGrade == course.letterGrade) 
        {
            return true;
        } else {
        return false;
        }
    }
    // ToString() method
    public String toString(){
        return "Course Name: " + courseName+" Letter Grade: "+ letterGrade;
    }
}