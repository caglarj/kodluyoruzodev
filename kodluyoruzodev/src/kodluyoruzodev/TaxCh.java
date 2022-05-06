package kodluyoruzodev;

import java.util.Scanner;

public class TaxCh {

	public static void main(String[] args) {

		double price, tax, result, rate;

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Urun fiyatini giriniz : ");
			price = input.nextDouble();
			
			if (price >= 0 && price <= 1000) {
				rate = 0.18;
				tax = price * rate;
				result = price + tax;
				System.out.println("KDV orani : " + rate);
				System.out.println("KDV'siz Urun Fiyati : " + price);
				System.out.println("KDV'li Urun Fiyati : " + result);
				System.out.println("KDV Tutari : " + tax);
				} 
		
				
				else if (price > 1000) {
				rate = 0.08;
				tax = price * rate;
				result = price + tax;
				System.out.println("KDV orani : " + rate);
				System.out.println("KDV'siz Urun Fiyati : " + price);
				System.out.println("KDV'li Urun Fiyati : " + result);
				System.out.println("KDV Tutari : " + tax);
			}
		}

	}

}

