package extra;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What do you think is awesome?");
	JOptionPane.showMessageDialog(null, answer + " is awesome.");
}
	
}
