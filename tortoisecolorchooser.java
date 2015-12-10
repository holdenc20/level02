package level02;
	// Copyright Wintriss Technical Schools 2013
	import javax.swing.JOptionPane;
	import java.awt.Color;
	import org.teachingextensions.logo.Colors;
	import org.teachingextensions.logo.Tortoise;

	public class tortoisecolorchooser {
		public static void main(String[] args) {
			int p=0;
			//3. ask the user what color they would like the tortoise to draw
			String answer=JOptionPane.showInputDialog("What color would you want?");
			//4. use an if/else statement to set the pen color that the user requested
			
			
	//5. if the user doesn’t enter anything, choose a random color

	//6. put a loop around your code so that you keep asking the user for more colors & drawing them
			
			//2. set the pen width to 10
			Tortoise.setPenWidth(10);
		//1. make the tortoise draw a shape (this will take more than one line of code)
		int x=1; 	
		Tortoise.setSpeed(10);
		while(x==1){ 
		
		Tortoise.move(10);
		Tortoise.turn(1);
		}
		}
	}

