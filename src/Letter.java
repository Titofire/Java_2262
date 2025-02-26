/**
 * This class authors a simple letter
 * @author Todd_Poole
 * @version 0.1
 * 
 */


public class Letter
	{
		//instance variables are private for sender and receiver
		private String from;
		private String to;
		private String lines;
		
		
		/**
		 * constructor Letter will supply sender and receiver names 
		 * @param from -String of letter sender
		 * @param to -String of letter receiver
		 * 
		 */
		public Letter(String from, String to)  //Initiate instance variables in constructor!
		{
			this.from = from;
			this.to = to;
			this.lines = "";
		}
		
		
		/**
		 * method addLine adds lines of text to body
		 * @param line - A String of text to add
		 */
		public void addLine(String line) 
			{
			   this.lines += line;
			  	this.lines += System.lineSeparator();
			  	
			}
		
		
		/**
		 * method getText returns the entire text of the letter
		 * @return full text of the letter
		 */
		public String getText()
		{	
			return "Dear " + to + ":" + "\n\n" + 
					lines + "\n\n" + "Sincerly," +
					"\n\n" + from;
		}		
	} // end of class
