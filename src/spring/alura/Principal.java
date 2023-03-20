package spring.alura;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Object resp = JOptionPane.showInputDialog(null, "Seleccione la opcion", "Menu",1,null, new Object[] {
				"Conversor de Monedas","Conversor de Temperatura"
		}, "Seleccione");
	
		
	}
	
	
}
