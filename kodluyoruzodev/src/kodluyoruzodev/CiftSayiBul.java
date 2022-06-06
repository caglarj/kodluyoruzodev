package kodluyoruzcalisma;

import java.util.Scanner;

public class CiftSayiBul {

	public static void main(String[] args) {
		
		/*
		 *Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e 
		  tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
		 
		 * */
		 
		int userInput, i = 0; 
		int	counter = 0; 
		int	sum = 0; 
		int	average;

		Scanner sc = new Scanner(System.in);
		System.out.println("Bir Sayi Giriniz : ");
		userInput = sc.nextInt();

		while (i <= userInput) {
			if (i % 3 == 0 && i % 4 == 0) {
				sum += i;
				counter++;
			}
			i++;
		}
		average = sum / counter;
		System.out.println("3'e ve 4'e Tam Bolunen Sayilar Toplami : " + sum );
		System.out.println("3'e ve 4'e Tam Bolunen Sayilar Adedi : " + counter );
		System.out.println("3'e ve 4'e Tam Bolunen Sayilarin Ortalamasi: " + average);
		
		
		
		
	}

}
	
	
	
	
	
	
	
	
	
//(int i = 0 ; i <= k; i++)   	if ( &&   )