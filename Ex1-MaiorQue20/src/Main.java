import javax.swing.JOptionPane;

//ALGORITMO QUE IMPRIME SE O N�MERO � MAIOR QUE 20
public class Main {

	public static void main(String[] args) {
		
		int x = Integer.valueOf(JOptionPane.showInputDialog("Insira um n�mero: "));
		
		if(x > 20) {
			JOptionPane.showMessageDialog(null, "O N�mero "+x+" � maior que 20!");
		}else if(x == 20) {
			JOptionPane.showMessageDialog(null, "O N�mero "+x+" � igual a 20!");
		}
		else {
			JOptionPane.showMessageDialog(null, "O N�mero "+x+" � menor que 20!");
		}

	}

}
