package kodluyoruzodev;

import java.util.Scanner;

public class KaldiGecti {
	 public static void main(String[] args) {
	        int mat, fizik, turkce, kimya, muzik;
	        double sum = 0;
	        double avarage;

	        Scanner inp = new Scanner(System.in);
	        
	        System.out.println("Ders Notlarinizi (0 - 100 arasinda) hesaplanmasi icin iki basamakli olarak giriniz.");

	        System.out.print("Matematik notunuz :");
	        mat = inp.nextInt();
	        if(mat > 0 && mat <= 100) {
	            sum += mat;
	        } else {
	            System.out.println("Gecersiz not Girdiniz");
	            System.exit(0);
	        } 
	        
	        
	        System.out.print("Fizik notunuz :");
	        fizik = inp.nextInt();
	        if(fizik > 0 && fizik <= 100) {
	            sum += fizik;
	        } else {
	            System.out.println("Gecersiz not Girdiniz");
	            System.exit(0);
	        } 

	        System.out.print("Turkce notunuz :");
	        turkce = inp.nextInt();
	        if(turkce > 0 && turkce <= 100) {
	            sum += turkce;
	        } else {
	            System.out.println("Gecersiz not Girdini");
	            System.exit(0);
	        } 

	        System.out.print("Kimya notunuz :");
	        kimya = inp.nextInt();
	        if(kimya > 0 && kimya <= 100) {
	            sum += kimya;
	        } else {
	            System.out.println("Gecersiz not Girdini");
	            System.exit(0);
	        } 

	        System.out.print("Muzik notunuz :");
	        muzik = inp.nextInt();
	        if(muzik > 0 && muzik <= 100) {
	            sum+= muzik;
	        } else {
	            System.out.println("Gecersiz not Girdini");
	            System.exit(0);
	        } 

	        avarage = sum / 5;
	        if (avarage <= 55) {
	            System.out.println("Sinifta Kaldiniz");
	            System.out.println("Ortalamaniz :" + avarage);
	        } else {
	            System.out.println("Tebrikler Gectiniz");
	            System.out.println("Ortalamaniz :" + avarage);
	        }

	    }
	}

