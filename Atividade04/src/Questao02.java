import javax.swing.*;

public class Questao02 {
	 
	public static void main(String[] args) {
	        int numb1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

	        int numb2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));

	        if (numb1 > numb2) {
	            JOptionPane.showMessageDialog(null,"O número: " +numb1 + " É maior que " + numb2+".");
	        }else if (numb2 > numb1){
	            JOptionPane.showMessageDialog(null,"O número: " +numb2 + " É maior que " + numb1+".");
	        }else{
	            JOptionPane.showMessageDialog(null,"Os números digitados são iguais");
	        
	        }
	    }
	}

