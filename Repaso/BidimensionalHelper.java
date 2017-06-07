package Repaso;

import java.util.Random;

public class BidimensionalHelper {
	public int aleatorio (int min , int max){
	Random rand = new Random ();
	int randomNumbrer= rand. nextInt ( (max - min) + 1) + min;
	return randomNumbrer;
	}
}
