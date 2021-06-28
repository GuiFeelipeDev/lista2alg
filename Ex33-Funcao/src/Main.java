import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		float x = Float.valueOf(JOptionPane.showInputDialog("Insira um número:"));
		
		double x2 = Math.pow(x, 2);
		
		double x3 = Math.pow(x, 3);
		
		if(x <= 1) {
			JOptionPane.showMessageDialog(null, "f("+x+") = 1");
		}
		else if(x > 1 && x <= 2) {
			JOptionPane.showMessageDialog(null, "f("+x+") = 2");
		}
		else if(x > 2 && x <= 3) {
			JOptionPane.showMessageDialog(null, "f("+x+") = "+x+"² = "+x2);
		}
		else {
			JOptionPane.showMessageDialog(null, "f("+x+") = "+x+"³ = "+x3);
		}
	}

}
