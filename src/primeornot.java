import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {
	String question = JOptionPane.showInputDialog("Type a number.");
	
	int num = Integer.parseInt(question);
	
	for (int i = 2; i < num; i++) {
		if(num % i == 0) {
			JOptionPane.showMessageDialog(null, "Not prime.");
			System.exit(0);
		}
	}
	JOptionPane.showMessageDialog(null, "It's prime");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
