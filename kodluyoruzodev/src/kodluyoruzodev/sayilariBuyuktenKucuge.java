package kodluyoruzodev;

import java.util.Scanner;

public class sayilariBuyuktenKucuge {

	public static void main(String[] args) {
		
		int a, b, c ;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("a sayisini giriniz : " );
		a = inp.nextInt();
		System.out.print("b sayisini giriniz : " );
		b = inp.nextInt();
		System.out.print("c sayisini giriniz : " );
		c = inp.nextInt();
	
		if ((a > b) && (a > c)) { 
		if (b > c ) {
			System.out.println("a > b > c");		}
		else {
			System.out.println(" a > c > b ");		}
		}

		else if ((b > c) && (b > c)) { 
			 if (a > c) {
				 System.out.println("b > a > c");
			 }else {
				 System.out.println(" b > c > a");
			 }
			}
		
		else  if  ((c > a) && (c > b)) {
			if (a > b) {
				System.out.println("c > a > b");
			}else {
				System.out.println("c > b > a");
			}
		}
		 
		if ((a == b) && (b ==c )) { 
					System.out.println( "a = b = c ");
				}
			
		}
}


