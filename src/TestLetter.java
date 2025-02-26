/**
 * Class TestLetter tests the Letter class
 * 
 * @author Todd Poole
 * @version 0.2
 * 
 */
public class TestLetter
	{

		
		public static void main(String[] args)
			{
				Letter dearJohn = new Letter("Mary", "John"); // build dearJohn object of the Letter Class

				dearJohn.addLine("I'm sorry we must part");

				dearJohn.addLine("I wish you all the best");

				System.out.println(dearJohn.getText());

			}

	} //end of class
