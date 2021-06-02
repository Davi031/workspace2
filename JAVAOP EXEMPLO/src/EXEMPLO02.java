import javax.swing.JOptionPane;

public class EXEMPLO02 {
     
	String sexo = JOptionPane.showMessageDialog(null, "Digite M ou F para o sexo!");
	
	if (sexo.equals("M")) {
	    JOptionPane.showInternalMessageDialog(null, "Masculino");
	}
	if (sexo.equals("F")) {
		
	}
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		if(idade >=18) {
		    JOptionPane.showMessageDialog(null, "OK você já pode tirar uma CNH. " +idade);
		}else {
		    JOptionPane,showMessageDialog(null, "Desculpe você mão pode tirar uma CNHA.");
		
		}
	}
}
