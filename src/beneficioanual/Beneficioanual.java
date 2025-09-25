package beneficioanual;

import java.util.Scanner;

public class Beneficioanual {

	public static void main(String[] args) {
		double peras;
		double manzanas;
		final double precioperas;
		final double preciomanzanas;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kilos de peras al año: ");
		peras = sc.nextDouble();
		System.out.println("Kilos de manzanas al año: ");
		manzanas = sc.nextDouble();
		
		precioperas = peras * 1.95;
		preciomanzanas = manzanas * 2.35;
		
		System.out.println("El precio de las peras es de: " + precioperas + " €" );
		System.out.println("El precio de las manzanas es de: " + preciomanzanas + " €" );
		
		sc.close();
	}

}
