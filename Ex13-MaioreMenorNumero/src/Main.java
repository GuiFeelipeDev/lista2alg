import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		
		float a = Float.valueOf(JOptionPane.showInputDialog("Insira o valor A:"));
		float b = Float.valueOf(JOptionPane.showInputDialog("Insira o valor B:"));
		float c = Float.valueOf(JOptionPane.showInputDialog("Insira o valor C:"));
		float d = Float.valueOf(JOptionPane.showInputDialog("Insira o valor D:"));
		
		String maior = null;
		String menor = null;
		if(a > b && a > c && a > d) {
			maior = "A";
		}
		else if(b > a && b > c && b > d) {
			maior = "B";
		}
		else if(c > a && c > b && c > d) {
			maior = "C";
		}
		else if(d > a && d > c && d > b) {
			maior = "D";
		}
		
		if(a < b && a < c && a < d) {
			menor = "A";
		}
		else if(b < a && b < c && b < d) {
			menor = "B";
		}
		else if(c < b && c < a && c < d) {
			menor = "C";
		}
		else if(d < b && d < c && d < a) {
			menor = "D";
		}		
		JOptionPane.showMessageDialog(null, "O maior é "+maior+"\nO menor é "+menor);
	}

}
