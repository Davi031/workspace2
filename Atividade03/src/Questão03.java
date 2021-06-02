  
import javax.swing.JOptionPane;

public class Questão03 {

	public static void main(String[] args) {
		int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º valor"));
		int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º valor"));
		JOptionPane.showMessageDialog(null, "A média entre os valores digitados é: " +((nota1 + nota2)/2));

	}

}