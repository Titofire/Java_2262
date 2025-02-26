import java.time.LocalDate;

/**
 * This Class tests the Student class and Quiz Class
 * @author Todd Poole
 * @version 0.1
 * 
 */
public class StudentTester
	{

		
		public static void main(String[] args)
			{
				//Build students
				Student student1 = new Student("Todd Poole");
				Student student2 = new Student("Oscar Poole the Cat");
				
				//Test student methods and toString
				System.out.println("Student1 name is: " + student1.getName());
				System.out.println(student1 +" ID is: " + student1.getId());
				System.out.println("Student2 name is: " + student2.getName());
				System.out.println(student2 + " ID is " + student2.getId());
				System.out.println();	
				
				
				//Build Quizzes to test constructor, (Does not add them to Array) just builds them. 
				Quiz quiz1 = new Quiz(student1, 71);
				Quiz quiz2 = new Quiz(student1, 76, LocalDate.of(2025, 2, 12));
				Quiz quiz3 = new Quiz(student2, 81);
				Quiz quiz4 = new Quiz(student2, 86, LocalDate.of(2025, 2, 6));
				
				
				//Test addQuiz to add all the quizzes up
				student1.addQuiz(quiz1);
				student1.addQuiz(quiz2);
				student2.addQuiz(quiz3);
				student2.addQuiz(quiz4);
				
				System.out.println("Quiz1 Score is: " + quiz1.getScore()); // should be 71
				System.out.println("Quiz1 Date is: " + quiz1.getDate()); // should be 76
				System.out.println("Quiz1 Belongs to Student : " + quiz1.getStudent()); // Todd Poole
				System.out.println();
				
				//Test average and sum student methods
				System.out.println("Student 1 Number of Quizzes: " + student1.getNumQuizzes()); //should be 2
		        System.out.println("Student 1 Total Score: " + student1.getTotalScore());// 71 + 76 = 147
		        System.out.println("Student 1 Average Score: " + student1.getAverageScore()); // 147 / 2 = 73.5

		        System.out.println("Student 2 Number of Quizzes: " + student2.getNumQuizzes());// should be 2
		        System.out.println("Student 2 Total Score: " + student2.getTotalScore()); // 81 + 86 = 167
		        System.out.println("Student 2 Average Score: " + student2.getAverageScore()); // 167/2 = 83.5
		        System.out.println();
		        
				student1.displayStudent(student1);
				System.out.println();
				student2.displayStudent(student2);
				
			}
		 
		  
		 
	} // End of class
