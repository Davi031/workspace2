import javax.swing.JOptionPane;

public class GerarContraCheque {

	public static void main(String[] args) {
		
        float valorHora = 10f;
        
        String matricula = JOptionPane.showInputDialog("Digite a matricula:");
	    String nome = JOptionPane.showInputDialog("Digite o nome:");
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de horas trabalhadas:"));
		float minutos = Float.parseFloat(JOptionPane.showInputDialog("Digite o restante dos minutos:"));
	    float complementoHoras = minutos / 60;
	    
	    float salario = (horas * valorHora)+(( complementoHoras) * valorHora);
	    
        int diasUteis = 19;
        int domingosFeriados = 6;
       
        float dsr = (((horas + complementoHoras) /  diasUteis)*domingosFeriados)* valorHora;
	
        float salarioBruto = salario + dsr;
        
        salarioBruto = 3305.22f;
        
        float valorInss =0;
        
        if(salarioBruto <= 1100) {
           valorInss = salarioBruto * 0.075f;
	    } else if( salarioBruto >= 1100.01 && salario <= 2203.48 ) {
            valorInss = ((salarioBruto - 1100) * 0.09f ) + 82.5f;
	    } else if( salarioBruto >= 2203.48 && salarioBruto <=3305.22) {
            valorInss = ((salarioBruto - 2203.48f)*0.12f) + 181.81f;
	    } else if( salarioBruto >= 3305.23 && salarioBruto <= 6433.57 ) {
	        valorInss = ((salarioBruto - 3305.22f)*0.14f) + 314.01f;
	    } else {
	    	valorInss = 751.99f - 38.89f;
	    
	    }
	    	JOptionPane.showMessageDialog(null, "** Contra Cheque **"
	 			    + "\nMatricua/Nome: "+matricula+"/"+nome
	 			    + "\nSalário Base: "+salario
	 			    + "\nValor DRS: "+dsr);
	                + "\nValor do Inss: "+valorInss);
	                + "\nValor do Ir: "+valorInss);
	                + "\nValor do Bruto: "+valorBruto);
	 	}
	    
	  
	    
	    float valorIr = 0;
	    
	    if( salarioBruto >=1903.99f && salarioBruto <= 2026.65f) {
	    	valorIr = (salarioBruto * 0.075f) - 142.80f; 
	    } else if ( salarioBruto >= 2826.66f && salarioBruto <= 3751.05f) {
	    	valorIr = (salarioBruto * 0.15f) - 354.80f;
	    } else if ( salarioBruto >= 3751.06 && salarioBruto <= 4664.68 ) {
	    	valorIr =( salarioBruto * 0.225f) - 632.13f;
	    } else if ( salarioBruto > 4664.68f ) {
	    	valorIr = ( salarioBruto * 0.275f) - 869.36f;
	  
	    	 float salarioLiquido = salarioBruto - valor Inss - valorIr;
	    }
	    
        JOptionPane.showMessageDialog(null, "** Contra Cheque **"
			    + "\nMatricua/Nome: "+matricula+"/"+nome
			    + "\nSalário Base: "+salario
			    + "\nValor DRS: "+dsr);
                + "\nValor do Inss: "+valorInss);
                + "\nValor do Ir: "+valorInss);
                + "\nValor do Bruto: "+valorBruto);
	}
