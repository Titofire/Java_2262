import java.util.ArrayList;

/**
 * Student Class keeps track of a students name, ID, quiz scores, 
 * and quiz averages
 * @author Todd Poole
 * @version 0.1
 * 
 */
public class Student
	{
		private String stuName; //Instance Variables
		private int Id;
		private ArrayList<Quiz> scoresArray;
		
		private static int nextId = 100; //static variables
		
		/**
		 * builds instance of student object
		 * @param stuName
		 */
		public Student (String stuName) //constructor
		{
			this.stuName = stuName;
			this.Id = nextId++;
			this.scoresArray = new ArrayList<>();
		}
		
		
		/**
		 * This returns the students name
		 * @return students name
		 */
		public String getName()
		{
			return this.stuName;
		}
		
		
		/**
		 * Gets the account number of student
		 * @return idNumber - the account number
		 */
		public int getId()
		{	
			return this.Id;
		}
		
		/**
		 * This method puts a quiz score into array.
		 * @param score - a quiz score integer
		 */
		public void addQuiz(Quiz score)
		{	
			scoresArray.add(score);
				
		}
		
		/**
		 * keeps track of the number of quizzes for return
		 * @return numQuiz
		 */
		
		public int getNumQuizzes()	
		{
			return scoresArray.size();
		}
		
		
		/**
		 * Computes sum of all quiz scores
		 * @return totalScore
		 */
		public int getTotalScore() 
		{	
			int totalScore = 0;
			for (Quiz quiz : scoresArray)
				{
					totalScore += quiz.getScore();
				}
			
			return totalScore;
		}
		
		
		/**
		 * This method calculates the students average score
		 * @return aveScore - the average of all scores in the array
		 */
		public double getAverageScore()
		{
			double aveScore = 0.0;
			aveScore = (double) getTotalScore() / getNumQuizzes();
			return aveScore;
		}
		/**
		 * This toString converts student name Item to string
		 */
		@Override
		public String toString()
		{
			return stuName;
		}
		/**
		 * This method displays the student name, Id, 
		 * and quiz scores with the corresponding date
		 * @param student - students name 
		 */
		public void displayStudent(Student student)
			{
				System.out.println("Student Name: " + getName() + " ID: " + getId());
				for (int i = 0; i < scoresArray.size(); i++)
					{
						System.out.println(scoresArray.get(i));
					}
			}
		
		

	} //end of Class

