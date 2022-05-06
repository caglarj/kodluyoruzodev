package kodluyoruzodev;

import java.util.Scanner;

public class KdvHesaplayici {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		double fiyat, kdv, toplam, oran;
		oran = 0.18; // vergi oranı
		
		System.out.print("Fiyat Giriniz : ");
		fiyat = input.nextDouble();

		System.out.println("KDV'siz Fiyat : " + fiyat);

		kdv = fiyat * oran;
		toplam = fiyat + kdv;
		
		System.out.println("KDV'li Fiyat : " + toplam);

		System.out.println("Kdv Tutari : " + kdv);

	}
}
