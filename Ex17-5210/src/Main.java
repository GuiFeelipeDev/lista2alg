import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		
		int x = Integer.valueOf(JOptionPane.showInputDialog("Insira um n�mero:"));
		
		if(x % 10 == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero � divis�vel por 10, por 5 e por 2.");
		}
		else if(x % 5 == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero � divis�vel por 5.");
		}
		else if(x % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero � divis�vel por 2.");
		}
		else {
			JOptionPane.showMessageDialog(null, "O n�mero n�o � divis�vel por 10,  por 5 ou por 2.");
		}

	}

}
