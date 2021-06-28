import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class Main {

	public static void main(String[] args) {
		
		DecimalFormat limited = new DecimalFormat();
		limited.applyPattern("###,##0.00");
		
		
		String nome = JOptionPane.showInputDialog("Insira seu Nome:");
		float peso = Float.valueOf(JOptionPane.showInputDialog("Insira seu Peso(em Kg): "));
		float altura = Float.valueOf(JOptionPane.showInputDialog("Insira sua altura(em cm): "));
		altura = altura / 100;
		double imc = peso / Math.pow(altura, 2);
		double pesoIdeal = 20 * Math.pow(altura, 2);
		double pesoIdealLimite = 24.9 * Math.pow(altura, 2);
		if(imc < 20) {
			JOptionPane.showMessageDialog(null, "Olá "+nome+", você está abaixo do peso!"+
		"\nSeu peso ideal é entre "+limited.format(pesoIdeal)+"Kg e "+limited.format(pesoIdealLimite)+
		"Kg!");
		}
		else if(imc >= 20 && imc < 25) {
			JOptionPane.showMessageDialog(null, "Olá "+nome+", você está no seu peso Normal!"+
		"\nSeu peso ideal é entre "+limited.format(pesoIdeal)+"Kg e "+limited.format(pesoIdealLimite)+
		"Kg!");
		}
		else if(imc >= 25 && imc < 30) {
			JOptionPane.showMessageDialog(null, "Olá "+nome+", você está com sobre peso!"+
		"\nSeu peso ideal é entre "+limited.format(pesoIdeal)+"Kg e "+limited.format(pesoIdealLimite)+
		"Kg!");
		}
		else if(imc >= 30 && imc < 40) {
			JOptionPane.showMessageDialog(null, "Olá "+nome+", você está com obesidade!"+
		"\nSeu peso ideal é entre "+limited.format(pesoIdeal)+"Kg e "+limited.format(pesoIdealLimite)+
		"Kg!");
		}
		else if(imc > 40) {
			JOptionPane.showMessageDialog(null, "Olá "+nome+", você está com obesidade mórbida!"+
		"\nSeu peso ideal é entre "+limited.format(pesoIdeal)+"Kg e "+limited.format(pesoIdealLimite)+
		"Kg!");
		}
		}

}
