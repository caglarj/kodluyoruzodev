package kodluyoruzodev;

import java.util.Scanner;

public class TrAngel {

	public static void main(String[] args) {

		System.out.println("Uc kenar uzunlugunu girdininiz ucgenin alanini hesaplama. ");
		Scanner inp = new Scanner(System.in);
		
	
		System.out.println("Hesaplanmasi icin uc kenar olcusu giriniz : ");
		
		double a = inp.nextDouble();
		double b = inp.nextDouble();
		double c = inp.nextDouble();
		double u;
		double area;
		
		
		u = (a + b + c) / 2 ;
		
		area = Math.sqrt(u * (u - a) * (u - b) * (u - c));
		System.out.println("Ucgenin Alani : " + area );
		
		
	}

}
