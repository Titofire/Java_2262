import java.time.LocalDate;

public class QuizTester {
    public static void main(String[] args) {

        // Test Student class
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 ID: " + student1.getId());
        System.out.println("Student 2 Name: " + student2.getName());
        System.out.println("Student 2 ID: " + student2.getId());


        // Test Quiz class constructors
        Quiz quiz1 = new Quiz(student1, 85);
        Quiz quiz2 = new Quiz(student1, 92, LocalDate.of(2024, 10, 26)); // Specific date
        Quiz quiz3 = new Quiz(student2, 78);

        // Test Quiz methods
        System.out.println("Quiz 1 Score: " + quiz1.getScore());
        System.out.println("Quiz 1 Date: " + quiz1.getDate());
        System.out.println("Quiz 1 Student: " + quiz1.getStudent().getName()); // Accessing Student data

        System.out.println("Quiz 2 Score: " + quiz2.getScore());
        System.out.println("Quiz 2 Date: " + quiz2.getDate());

        // Test Student methods related to Quizzes
        student1.addQuiz(quiz1);
        student1.addQuiz(quiz2);
        student2.addQuiz(quiz3);

        System.out.println("Student 1 Number of Quizzes: " + student1.getNumQuizzes());
        System.out.println("Student 1 Total Score: " + student1.getTotalScore());
        System.out.println("Student 1 Average Score: " + student1.getAverageScore());

        System.out.println("Student 2 Number of Quizzes: " + student2.getNumQuizzes());
        System.out.println("Student 2 Total Score: " + student2.getTotalScore());
        System.out.println("Student 2 Average Score: " + student2.getAverageScore());

        //Test toString methods
        System.out.println(quiz1);
        System.out.println(student1); //toString is not defined in the Student class, so it will print the default Object toString

        student1.displayStudent("Alice"); //This will call the toString method from the Object class.  It is recommended that you create a toString method for the Student Class.

    }
}