import java.util.Random;

import javax.swing.JOptionPane;

import day3.SpeakAndSpell;

public class MAgic8ball {

		// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int keem = new Random().nextInt(4);
		// 3. Print out this variable
System.out.println(keem);
		// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Enter your question below");
		// 5. If the random number is 0

		// -- tell the user "Yes"
if (keem==0) {
	speak("yes");
}
		// 6. If the random number is 1
if (keem==1) {
	speak("No");
}
		// -- tell the user "No"

		// 7. If the random number is 2
if (keem==2) {
	speak("Maybe you should ask Google?");
}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
if (keem==3) {
speak("die you trigger inducing pig");
}
		// -- write your own answer
if (keem==4) {
	speak("leave this planet");
}


	}
static void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	}

