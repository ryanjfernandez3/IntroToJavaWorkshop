package day3;

import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
		String Keem = JOptionPane.showInputDialog("Do you like the rat gnome? ");
		if (Keem.equals("yes")) {
			speak("rethink your life");
		} else {
			speak("correct");
		}
		String weeb = JOptionPane.showInputDialog("Are you a weeb");
		if (weeb.equals("yes")) {

			for (int i = 0; i < 10; i++) {
				speak("Kill Your Self");
			}
		} else {
			speak("correct");
		}
		String beef = JOptionPane.showInputDialog("Leafy or Pyro");
		if (beef.equalsIgnoreCase("Leafy")) {
			speak("you cyberbully");
		}else{
			speak("stop dating an unborn french baby");
			
		}
String joey = JOptionPane.showInputDialog("Do you like Joeys world tour");
if (joey.equals("yes")) {
	speak("your fat you diabetic pig");
}else{
	speak("you are not accepting fat people you racist");
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
