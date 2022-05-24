package kodluyoruzodev;

import java.util.Scanner;

public class HesapMakinasi {

	public static void main(String[] args) {
		
		int n1, n2, select;

		Scanner inp= new Scanner(System.in);

	
		System.out.print("Ilk Sayiyi Giriniz    : ");
		n1 = inp.nextInt();

		System.out.print("Ikinci Sayiyi Giriniz : ");
		n2 = inp.nextInt();
	
		System.out.println("Seciniz");
		System.out.println("Toplama icin : 1" + "\nCikarma icin : 2 " + "\nCarpma icin  : 3 " + "\nBolme icin   : 4 ");
		select = inp.nextInt();
		

		switch (select) {
		case 1:
			System.out.print("Islem Sonucu: " + (n1 + n2));
			break;
		case 2:
			System.out.print("Islem Sonucu: " + (n1 - n2));
			break;
		case 3:
			System.out.print("Islem Sonucu: " + (n1 * n2));
			break;
		case 4:
			if (n2 != 0) {
				System.out.print("Islem Sonucu: " + (n1 / n2));
			} else {
				System.out.print("Sifira Bolme Gerceklestirilemez.");
			}
			break;
		default:
			System.out.print("Islem Seciniz..!");
		}
	}

}
