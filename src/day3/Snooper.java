package day3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String Live = JOptionPane.showInputDialog("Where do you live?");
String Meme = JOptionPane.showInputDialog("What is your spiciest meme");
String Steam = JOptionPane.showInputDialog("What is your steam password");
String Weeb = JOptionPane.showInputDialog("Are you a weeb?");
String Hi = JOptionPane.showInputDialog("Do you play Overwatch?");
JOptionPane.showMessageDialog(null, "I know you live at " +Live); 
JOptionPane.showMessageDialog(null, "I know you could never make a dank meme "+Meme);
JOptionPane.showMessageDialog(null, "I now know you have no CS items "+Steam);
JOptionPane.showMessageDialog(null, "If you awnsered yes to being a weeb it's time to stop "+Weeb);
JOptionPane.showMessageDialog(null, "If you do your cool "+Hi);
}
}
