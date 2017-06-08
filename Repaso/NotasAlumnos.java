package Repaso;

public class NotasAlumnos {
public static void main(String[] args) {
	int nAlumnos = 4 , nEvaluaciones = 4;
	int [][] notas;
	String [] nombreAlumnos = {"Pedro", "Maria", "Juana", "Carlos"};
	
	BidimensionalHelper helper = new BidimensionalHelper();
	
	notas = helper.llenarArreglos (nAlumnos , nEvaluaciones);
	
	helper.mostrarNotasAlumnos(nombreAlumnos, notas, nAlumnos, nEvaluaciones);
	
}
}
