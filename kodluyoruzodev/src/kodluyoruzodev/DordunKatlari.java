package kodluyoruzcalisma;

import java.util.Scanner;

public class DordunKatlari {

	public static void main(String[] args) {

		/*
		 * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul
		 * eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp
		 * ekrana basan
		 */

		Scanner inp = new Scanner(System.in);

		int userInp;
		int total = 0;

		do {
			System.out.println("Sayi Giriniz : ");
			userInp = inp.nextInt();
			if (userInp % 2 == 0 && userInp % 4 == 0) {
				total += userInp;
			}

		} while ((userInp > 0) && (userInp % 2 == 0) );

		System.out.println("toplam : " + total);
	}

}
