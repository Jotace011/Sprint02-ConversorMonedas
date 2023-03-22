package spring.alura.monedas;

import javax.swing.JOptionPane;

public class function {


	ConvertirMonedas monedas = new ConvertirMonedas();

	public void ConvertirMonedas(double minput) {
		// TODO Auto-generated method stub
		String opcion = (JOptionPane.showInputDialog(null,
				"Elija la moneda a la que desea convertir","Monedas",
				JOptionPane.PLAIN_MESSAGE,null,new Object[] {
						"De soles a Dolar", "De soles a Euros","De Dolar a Soles","De Euros a Soles"
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
		case "De Dolar a Soles":{
			monedas.ConvertirDolaresASoles(minput);
			break;
		}
		case "De Euros a Soles":{
			monedas.ConvertirEurosASoles(minput);
			break;
		}
		}
	}
	
	
}
