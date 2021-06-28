import javax.swing.JOptionPane;

//VERIFICA SE UM NÚMERO É DIVISIVEL POR OUTRO
public class Main {

	public static void main(String[] args) {
		
		int x = Integer.valueOf(JOptionPane.showInputDialog("Insira o dividendo: "));
		int y = Integer.valueOf(JOptionPane.showInputDialog("Insira o divisor: "));

		if(x % y == 0) {
			JOptionPane.showMessageDialog(null, "O número "+x+" é divisivel por "+y);
		}else {
			JOptionPane.showMessageDialog(null, "O número "+x+" não é divisivel por "+y);
		}
	}

}
