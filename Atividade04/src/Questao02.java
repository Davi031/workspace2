import javax.swing.*;

public class Questao02 {
	 
	public static void main(String[] args) {
	        int numb1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));

	        int numb2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero: "));

	        if (numb1 > numb2) {
	            JOptionPane.showMessageDialog(null,"O n�mero: " +numb1 + " � maior que " + numb2+".");
	        }else if (numb2 > numb1){
	            JOptionPane.showMessageDialog(null,"O n�mero: " +numb2 + " � maior que " + numb1+".");
	        }else{
	            JOptionPane.showMessageDialog(null,"Os n�meros digitados s�o iguais");
	        
	        }
	    }
	}

