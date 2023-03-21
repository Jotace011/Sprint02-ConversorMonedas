package spring.alura.monedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirSolesADolares(double valor) {
		// TODO Auto-generated method stub
		double monedaDolar= valor*0.2655;
		monedaDolar = (double)Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+monedaDolar+" dolares");
	}
	
	public void ConvertirSolesAEuros(double valor) {
		// TODO Auto-generated method stub
		double monedaEuros= valor*0.2464;
		monedaEuros = (double)Math.round(monedaEuros * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes e"+monedaEuros+" euros");
	}
	
}
