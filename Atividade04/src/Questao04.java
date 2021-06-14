import javax.swing.*;

public class Questao04 {
	 
	public static void main(String[] args) {
	
		for(int i = 1; i <= 5; i++) {
		    String palavra = JOptionPane.showInputDialog("Digite a palvra de acesso");
		    if (palavra.equals("Java")) {
		    	JOptionPane.showMessageDialog(null, "Permissão: aprovada");
		    	break;
		    } else {
		    	JOptionPane.showMessageDialog(null, "Tente novamente "+i+" tentativas");
		    }
		}    
     
	}

}

