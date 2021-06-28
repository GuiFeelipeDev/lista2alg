import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		double peso = Double.valueOf(JOptionPane.showInputDialog("Informe o seu peso(em Kg):"));
		int idade = Integer.valueOf(JOptionPane.showInputDialog("Insira a sua idade: "));
		
		if(idade >= 12) {
			if(peso >= 60) {
				JOptionPane.showMessageDialog(null, "Olá "+nome+"!\n"+
						"Você deve tomar 40 gotas do medicamento!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Olá "+nome+"!\n"+
						"Você deve tomar 35 gotas do medicamento!");
			}
		}else {
			if(peso >= 5 && peso <= 9) {
				JOptionPane.showMessageDialog(null, "Olá "+nome+"!\n"+
						"Você deve tomar 5 gotas do medicamento!");
			}
			else if(peso > 9 && peso <= 16) {
				JOptionPane.showMessageDialog(null, "Olá "+nome+"!\n"+
						"Você deve tomar 10 gotas do medicamento!");
			}
			else if(peso > 16 && peso <= 24) {
				JOptionPane.showMessageDialog(null, "Olá "+nome+"!\n"+
						"Você deve tomar 15 gotas do medicamento!");
			}
			else if(peso > 24 && peso <= 30) {
				JOptionPane.showMessageDialog(null, "Olá "+nome+"!\n"+
						"Você deve tomar 20 gotas do medicamento!");
			}
			else if(peso > 30) {
				JOptionPane.showMessageDialog(null, "Olá "+nome+"!\n"+
						"Você deve tomar 30 gotas do medicamento!");
			}
		}

	}

}
