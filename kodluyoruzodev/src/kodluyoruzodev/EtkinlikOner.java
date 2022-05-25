package kodluyoruzodev;

import java.util.Scanner;

public class EtkinlikOner {
	
	/*    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
    
    */
		public static void main(String[] args) {
		
			Scanner inp = new Scanner(System.in);
			System.out.println("Sicakliga Gore Etklinlik Onerileri Lutfen Secim Yapiniz.");

			

			int heat;
			String h1 = ("Cok Keyifli Bir Kayak Macerasi Seni Bekliyor") ;
			String h2 = ("Bu Havada Sinama Keyfi..") ;
			String h3 = ("Hava mis gibi hadi Piknige..") ;
			String h4 = ("Sicaktan bunaldik, Serin sulara atalim kendimizi") ;
			
			
			System.out.println("Sicaklik 5 Dereceden Kucukse    : 1" + "\nSicaklik 5 ve 15 arasinda ise   : 2" + "\nSicaklik 15 ve 25 arasinda ise  : 3" + "\nSicaklik 25 derece uzerinde ise : 4" + "\nBaska Ne var ?                  : 5");
			
			
			heat = inp.nextInt();
			

			switch (heat) {
			case 1:
				System.out.print("Onerimmmm: " + h1);
				break;
			case 2:
				System.out.print("Onerimmmm: " + h2 + " yada "+ h3);
				break;
			case 3:
				System.out.print("Onerimmmm : " + h2 + " yada "+ h3);
				break;
			case 4:
				System.out.print("Onerimmmm: " + h4 );
				break;
			case 5: 
				System.out.println("Sirf farklilik olsun diye bu kadar olur ;)");
				break;
				}
	
			
			}
		}
		
		
		
	
	