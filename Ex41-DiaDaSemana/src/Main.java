import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		int c = 1;
		
		
		while(c == 1) {
			int dia = Integer.valueOf(JOptionPane.showInputDialog("Insira número do dia da semana:"));
			String diaSem;
			
			switch(dia) {
			case 1: diaSem = "Domingo";
			JOptionPane.showMessageDialog(null, "Você selecionou "+diaSem+"!");
			c = 0;
			break;
			case 2: diaSem = "Segunda-Feira";
			JOptionPane.showMessageDialog(null, "Você selecionou "+diaSem+"!");
			c = 0;
			break;
			case 3: diaSem = "Terça-Feira";
			JOptionPane.showMessageDialog(null, "Você selecionou "+diaSem+"!");
			c = 0;
			break;
			case 4: diaSem = "Quarta-Feira";
			JOptionPane.showMessageDialog(null, "Você selecionou "+diaSem+"!");
			c = 0;
			break;
			case 5: diaSem = "Quinta-Feira";
			JOptionPane.showMessageDialog(null, "Você selecionou "+diaSem+"!");
			c = 0;
			break;
			case 6: diaSem = "Sexta-Feira";
			JOptionPane.showMessageDialog(null, "Você selecionou "+diaSem+"!");
			c = 0;
			break;
			case 7: diaSem = "Sábado";
			JOptionPane.showMessageDialog(null, "Você selecionou "+diaSem+"!");
			c = 0;
			break;
			}
			if(dia < 1 || dia > 7) {
				
				JOptionPane.showMessageDialog(null, "O valor que você selecionou é inválido!\n"+
						"Insira um número de 1 a 7!");
			}
		}

	}

}
