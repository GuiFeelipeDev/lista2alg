import javax.swing.JOptionPane;

//SOMA 2 NUMEROS E SE FOR MAIOR QUE 20 SOMA 8, SE FOR MENOR OU IGUAL SUBTRAI 5
public class Main {

	public static void main(String[] args) {
		
		int x = Integer.valueOf(JOptionPane.showInputDialog("Insira o primeiro valor: "));
		int y = Integer.valueOf(JOptionPane.showInputDialog("Insira o segundo valor: "));
		int s = x + y;
		int vf;
		
		if(s <= 20) {
			vf = s - 5;
			JOptionPane.showMessageDialog(null, "O valor é menor que 20!\n"+
			"Valor inserido: "+x+" + "+y+" = "+s+"\n"+"Valor final: "+s+" - 5 = "+vf);
		}else {
			vf = s + 8;
			JOptionPane.showMessageDialog(null, "O valor é maior que 20!\n"+
			"Valor inserido: "+x+" + "+y+" = "+s+"\n"+"Valor final: "+s+" + 8 = "+vf);
		}
	
		
		
	}

}
