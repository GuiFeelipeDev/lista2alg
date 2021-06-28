import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		
		int x = Integer.valueOf(JOptionPane.showInputDialog("Insira um número:"));
		
		if(x % 10 == 0) {
			JOptionPane.showMessageDialog(null, "O número é divisível por 10, por 5 e por 2.");
		}
		else if(x % 5 == 0) {
			JOptionPane.showMessageDialog(null, "O número é divisível por 5.");
		}
		else if(x % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O número é divisível por 2.");
		}
		else {
			JOptionPane.showMessageDialog(null, "O número não é divisível por 10,  por 5 ou por 2.");
		}

	}

}
