package spring.alura;



import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		function monedas = new function();
		
		boolean flag = true;
		while(flag) {

			String resp = JOptionPane.showInputDialog(null, "Seleccione la opcion", "Menu",JOptionPane.QUESTION_MESSAGE,null, new Object[] {
					"Conversor de Monedas","Conversor de Temperatura"
			}, "Seleccione").toString();
		
			switch (resp) {
			case "Conversor de Monedas": {
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que desea Convertir");
				if(ValidarNumero(input)) {
					double Minput = Double.parseDouble(input);
					monedas.ConvertirMonedas(Minput);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "Desea otra operacion?");
					if(JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opcion afirmativa");
					}else {
						flag = false;
						JOptionPane.showMessageDialog(null, "Programa Terminado");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Valor Invalido");
				}
				break;
			}
			}
		}
					
	
				
	}

	public static boolean ValidarNumero(String input) {
		// TODO Auto-generated method stub
		
		try {
			double x = Double.parseDouble(input);
			if(x>=0 || x<0);
			return true;
		} catch (NumberFormatException e) {
			// TODO: handle exception
			return false;
		}
		
		
	}
	
	
}
