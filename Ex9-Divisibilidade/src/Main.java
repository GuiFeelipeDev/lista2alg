import javax.swing.JOptionPane;

//VERIFICA SE UM N�MERO � DIVISIVEL POR OUTRO
public class Main {

	public static void main(String[] args) {
		
		int x = Integer.valueOf(JOptionPane.showInputDialog("Insira o dividendo: "));
		int y = Integer.valueOf(JOptionPane.showInputDialog("Insira o divisor: "));

		if(x % y == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero "+x+" � divisivel por "+y);
		}else {
			JOptionPane.showMessageDialog(null, "O n�mero "+x+" n�o � divisivel por "+y);
		}
	}

}
