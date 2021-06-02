import javax.swing.JOptionPane;

public class Questão05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de horas"));
		int n1 = num1;
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("digite o valor da hora"));
		int n2 = num2;
		int n3 = n1 * n2;
		JOptionPane.showMessageDialog(null, "o salário do funcionário é " +n3);
		


	}

}