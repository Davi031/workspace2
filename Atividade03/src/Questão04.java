import javax.swing.JOptionPane;

public class Questão04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("digite o valor da conta"));
		int n1 = num;
		int n2 = n1 /10;
		
		JOptionPane.showMessageDialog(null, " 10% do garçom é "+n2+" e o total é "+n1);

	}

}