import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		int c = 1;
		
		
		while(c == 1) {
			int dia = Integer.valueOf(JOptionPane.showInputDialog("Insira n�mero do dia da semana:"));
			String diaSem;
			
			switch(dia) {
			case 1: diaSem = "Domingo";
			JOptionPane.showMessageDialog(null, "Voc� selecionou "+diaSem+"!");
			c = 0;
			break;
			case 2: diaSem = "Segunda-Feira";
			JOptionPane.showMessageDialog(null, "Voc� selecionou "+diaSem+"!");
			c = 0;
			break;
			case 3: diaSem = "Ter�a-Feira";
			JOptionPane.showMessageDialog(null, "Voc� selecionou "+diaSem+"!");
			c = 0;
			break;
			case 4: diaSem = "Quarta-Feira";
			JOptionPane.showMessageDialog(null, "Voc� selecionou "+diaSem+"!");
			c = 0;
			break;
			case 5: diaSem = "Quinta-Feira";
			JOptionPane.showMessageDialog(null, "Voc� selecionou "+diaSem+"!");
			c = 0;
			break;
			case 6: diaSem = "Sexta-Feira";
			JOptionPane.showMessageDialog(null, "Voc� selecionou "+diaSem+"!");
			c = 0;
			break;
			case 7: diaSem = "S�bado";
			JOptionPane.showMessageDialog(null, "Voc� selecionou "+diaSem+"!");
			c = 0;
			break;
			}
			if(dia < 1 || dia > 7) {
				
				JOptionPane.showMessageDialog(null, "O valor que voc� selecionou � inv�lido!\n"+
						"Insira um n�mero de 1 a 7!");
			}
		}

	}

}
