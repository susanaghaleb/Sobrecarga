package Repaso;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Vista {
public String IngresarValor(){
	JFrame frame = new JFrame ("cualquiera");
	String ingresado = JOptionPane.showInputDialog(frame,"Buscar alumno", "");
	return ingresado;
}

}
