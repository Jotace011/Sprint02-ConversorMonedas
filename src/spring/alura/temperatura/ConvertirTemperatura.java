package spring.alura.temperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	public void CentigradosAFahrenheit(double valor) {
		double temp = (valor*9/5)+32;
		temp = (double)Math.round(temp *100d)/100;
		JOptionPane.showMessageDialog(null, "La temperatura es "+ temp+"°F");
	}
	
	public void FahrenheitACentigrados(double valor) {
		double temp = (valor-32)*5/9;
		temp = (double)Math.round(temp *100d)/100;
		JOptionPane.showMessageDialog(null, "La temperatura es "+ temp+"°C");
	}

}
