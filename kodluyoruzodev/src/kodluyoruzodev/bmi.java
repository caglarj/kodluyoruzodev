package kodluyoruzodev;

import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		System.out.println(" Lutfen Boyunuzu (metre cinsinden) giriniz : ");

		double boy1 = inp.nextDouble();

		System.out.println(" Lutfen kilonuzu giriniz : ");

		double kilo = inp.nextDouble();
		
		double vki = kilo / boy1 * boy1;
		System.out.println("Vucut Kitle İndeksiniz " + vki);

	}

}
