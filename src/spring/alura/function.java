package spring.alura;

import javax.swing.JOptionPane;

import spring.alura.monedas.ConvertirMonedas;

public class function {
	
	ConvertirMonedas monedas = new ConvertirMonedas();

	public void ConvertirMonedas(double minput) {
		// TODO Auto-generated method stub
		String opcion = (JOptionPane.showInputDialog(null,
				"Elija la moneda a la que desea convertir","Monedas",
				JOptionPane.PLAIN_MESSAGE,null,new Object[] {
						"De soles a Dolar", "De soles a Euros"
				},"Seleccion")).toString();
		switch (opcion) {
		case "De soles a Dolar": {
			monedas.ConvertirSolesADolares(minput);
			break;
		}
		case "De soles a Euros":{
			monedas.ConvertirSolesAEuros(minput);
			break;
		}
		
		}
	}
	
	

}
