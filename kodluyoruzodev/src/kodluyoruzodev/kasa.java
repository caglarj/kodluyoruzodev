package kodluyoruzodev;

import java.util.Scanner;

public class kasa {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		System.out.println("Armut Kac Kilo ? :");
		double armutKg = inp.nextDouble();

		System.out.println("Elma Kac Kilo ? :");
		double elmaKg = inp.nextDouble();

		System.out.println("Domates Kac Kilo ? :");
		double domatesKg = inp.nextDouble();

		System.out.println("Muz Kac Kilo ? :");
		double muzKg = inp.nextDouble();

		System.out.println("Patlican Kac Kilo ? :");
		double patlicanKg = inp.nextDouble();
		
		double pArmut = 2.14, pElma = 3.67, pDomates = 1.11, pMuz = 0.95, pPatlican = 5.00, total;

		total = ((armutKg * pArmut) + (elmaKg * pElma) + (domatesKg * pDomates) + (muzKg * pMuz)
				+ (patlicanKg * pPatlican));
		System.out.println("Toplam Tutar : " + total + " TL'dir. ");
	}

}
