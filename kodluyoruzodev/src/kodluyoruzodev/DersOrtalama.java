package kodluyoruzodev;

import java.util.Scanner;

public class DersOrtalama {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int mat, fizik, kimya, turkce, tarih, muzik;
		
			
					
		System.out.println("Matematik ders notunu giriniz : " );
		mat = input.nextInt();
		
		System.out.println("Fizik ders notunu giriniz : " );
		fizik = input.nextInt();
		
		System.out.println("Kimya ders notunu giriniz : " );
		kimya = input.nextInt();
		
		System.out.println("Turkce ders notunu giriniz : " );
		turkce = input.nextInt();
		
		System.out.println("Tarih ders notunu giriniz : " );
		tarih = input.nextInt();
	
		System.out.println("Muzik ders notunu giriniz : " );
		muzik = input.nextInt();
		
		double ortalama = (mat + fizik + kimya + turkce + tarih + muzik ) / 6.0;

		System.out.println("Derslerin sinav puanlarinin ortalamalari : " + ortalama );
	
		
		String str = ortalama >= 60 ? "-> Sinifi Gecti" : "-> Sinifta Kaldi" ;
        System.out.println(str);
        
        
        /*Karşılaştırma Operatörleri
Java'da Karşılaştırma Operatörleri iki nesnenin birbirleriyle olan durumlarını belirler.

Eşitlik : a == b
Eşit Değil : a != b
Büyüktür : a > b
Küçüktür : a < b
Büyük Eşittir : a >= b
Küçük Eşittir : a <= b
Mantıksal Operatörler
Java'da Mantıksal Operatörler , nesnelerin veya ifadelerin mantıksal değerlerini yansıtır.
*/
	}

}
