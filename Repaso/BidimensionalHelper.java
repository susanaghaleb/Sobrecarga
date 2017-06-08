package Repaso;

import java.util.Random;

public class BidimensionalHelper {
	
	public int aleatorio (int min , int max){
	Random rand = new Random ();
	int randomNumbrer= rand. nextInt ( (max - min) + 1) + min;
	
	return randomNumbrer;
	}
	public int [][] llenarArreglos (int numeroFilas, int numeroColumnas){
		int [][] arreglo = new int [numeroFilas] [numeroColumnas];
		for (int i = 0 ; i <numeroFilas; i++ ){
			for (int j = 0 ; j < numeroColumnas ; j++){
				arreglo[i][j]= aleatorio (1,20);
			}
		}
		return arreglo;
	}
	
	public void mostrarNotasAlumnos(String [] nombreAlumnos, int [][] notas, int nAlumnos, int nEvaluaciones ){
		for (int i = 0; i < nAlumnos; i++) {
			for (int j = 0; j < nEvaluaciones; j++) {
				System.out.println(nombreAlumnos [i] + " Evaluacion # [ " + j + " ] : " + notas [i][j] );
			}
		}
	}
	
	public int buscarAlumnoPorNombre (String [] nombreAlumnos, String nombre ){
		int posicion = 0 ;
		for (int i = 0; i < nombreAlumnos.length; i++) {
			if (nombreAlumnos [i].equalsIgnoreCase(nombre)) {
				posicion = i ;
				
			}
		}
		return posicion;
	}
	
}
