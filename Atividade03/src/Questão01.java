import javax.swing.*;

public class Questão01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Númeors Vizinhos", "Localizar", JOptionPane.QUESTION_MESSAGE);
		int number_1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
		int vizinho1 = number_1 + 1;
		int vizinho2 = number_1 - 1; 
		JOptionPane.showMessageDialog(null,"Os números vizinhos são  "+vizinho1+ " e " +vizinho2);
	}
}


