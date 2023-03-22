package spring.alura.temperatura;

import javax.swing.JOptionPane;

public class functionT {
	
	ConvertirTemperatura temp = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double minput) {
		String opcion = (JOptionPane.showInputDialog(null,
				"Elija la opcion","Temperatura",JOptionPane.PLAIN_MESSAGE,null,
				new Object[] {
						"De Centigrados a Fahrenheit", "De Fahrenheit a Centigrados"
				},"Seleccion")).toString();
		
		switch (opcion) {
		case "De Centigrados a Fahrenheit":{
			temp.CentigradosAFahrenheit(minput);
			break;
		}
		case "De Fahrenheit a Centigrados":{
			temp.FahrenheitACentigrados(minput);
			break;
		}
		}
	}

}
