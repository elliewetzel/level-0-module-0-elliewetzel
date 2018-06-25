package extra;

import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "I know you did tennis last summer, " + name);
	}

}
