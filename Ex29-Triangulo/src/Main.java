import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		
		int lado1 = Integer.valueOf(JOptionPane.showInputDialog("Insira o primeiro lado: "));
		int lado2 = Integer.valueOf(JOptionPane.showInputDialog("Insira o segundo lado: "));
		int lado3 = Integer.valueOf(JOptionPane.showInputDialog("Insira o terceiro lado: "));
		
		if(lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado2 + lado1)) {
			JOptionPane.showMessageDialog(null, "Pode formar um triângulo!");
		}else {
			JOptionPane.showMessageDialog(null, "Não pode formar um triângulo!");
		}
	}

}
