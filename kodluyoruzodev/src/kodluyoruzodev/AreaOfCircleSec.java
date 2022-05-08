package kodluyoruzodev;

import java.util.Scanner;

public class AreaOfCircleSec {
	public static void main(String[] args) {
		
		double radius;
		double alfa ;
		double area;
		double pi = 3.14;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println( "Yaricap giriniz : " );
		radius = input.nextDouble();
		System.out.println( "Merkez aci olcusunu giriniz : " );
		alfa = input.nextDouble();
		
		// Pi sayısı Java Math Kütüphanesinde tanımlıdır. Aşağıdaki gibi kullanılabilir.
		// area = (Math.PI *(radius * radius)* alfa ) / 360 ; 
	
		area = (pi *(radius * radius)* alfa ) / 360 ;
		System.out.println( " Yaricapi " + radius + " merkez acisinin olcusu " + alfa +  " olan, daire diliminin alani : " + area + " dir. ");
	}

}
