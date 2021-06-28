import javax.swing.JOptionPane;

//ALGORITMO QUE IMPRIME SE O NÚMERO É MAIOR QUE 20
public class Main {

	public static void main(String[] args) {
		
		int x = Integer.valueOf(JOptionPane.showInputDialog("Insira um número: "));
		
		if(x > 20) {
			JOptionPane.showMessageDialog(null, "O Número "+x+" é maior que 20!");
		}else if(x == 20) {
			JOptionPane.showMessageDialog(null, "O Número "+x+" é igual a 20!");
		}
		else {
			JOptionPane.showMessageDialog(null, "O Número "+x+" é menor que 20!");
		}

	}

}
