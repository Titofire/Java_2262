/**
 * This class builds a quiz object for containing a student, score, and date
 * @author Todd Poole
 * 
 */

import java.time.LocalDate;
public class Quiz
	{
		private Student student;
		private int score;
		private LocalDate date;
		/**
		 * This Constructor builds a quiz with given parameters and adds the local system date.
		 * @param student
		 * @param score
		 */
		public Quiz(Student student, int score)
		{
			this.score = score;
			this.student = student;
			this.date = LocalDate.now();
			
		}
		
		/**
		 * This constructor also builds a quiz and adds a user defined date 
		 * @param student
		 * @param score
		 * @param date
		 */
		public Quiz(Student student, int score, LocalDate date)
		{
			this.student = student;
			this.score = score;
			this.date = date;
		}
		/**
		 * This method returns score of quiz
		 * @return score - an integer
		 */
		public int getScore()
		{
			return score;
		}
		
		/**
		 * This method return the quiz date formated in ISO-8601 format
		 * @return date - a date formated (yyyy - mm -dd)
		 */
		public LocalDate getDate()
		{
			return date;
		}
		
		/**
		 * This method returns the student name
		 * @return student - student as Student type
		 */
		public Student getStudent()
		{
			return student;
		}
		/**
		 * This toString method displays a quiz elements all as a string
		 */
		@Override
		public String toString()
		{
			
			return "score=" + score + " name='" + student + '\'' +
	                ", date='" + date;

		}
		
		
	} //end of Class
