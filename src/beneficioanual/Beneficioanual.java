package beneficioanual;

import java.util.Scanner;

public class Beneficioanual {

	public static void main(String[] args) {
		double peras;						//Variable double para asignar número kg de peras
		double manzanas;					//Variable double para asignar número kg de manzanas
		final double precioperas;			//Constante double para asignar precio de las peras
		final double preciomanzanas;		//Constante double para asignar precio de las manzanas
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kilos de peras al año: ");	
		peras = sc.nextDouble();
		System.out.println("Kilos de manzanas al año: ");
		manzanas = sc.nextDouble();
		
		precioperas = peras * 1.95;				//Operación necesaria para calcular el precio de lasperas, que luego se asigna a la constante propia
		preciomanzanas = manzanas * 2.35;		//Operación necesaria para calcular el precio de las manzanas, que luego se asigna a la constante propia
		
		System.out.println("El precio de las peras es de: " + precioperas + " €" );
		System.out.println("El precio de las manzanas es de: " + preciomanzanas + " €" );
		
		sc.close();
	}

}
