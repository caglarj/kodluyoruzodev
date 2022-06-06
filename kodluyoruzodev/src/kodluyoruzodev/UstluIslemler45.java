package kodluyoruzcalisma;

import java.util.Scanner;

public class UstluIslemler45 {

	public static void main(String[] args) {

//		Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program

		

		Scanner inp = new Scanner(System.in);
		System.out.println("Bir Sayi Giriniz : ");
		int num = inp.nextInt();
		
		
		
		System.out.print( num+ " sayisindan kucuk 4'in kuvvetleri: ");
        for (int i=1; i<=num; i*=4){
            System.out.print(i + " - " );
        }

        System.out.println("&");
        
        System.out.print( num+ " sayisindan kucuk 5'in kuvvetleri: ");
        for (int i=1; i<=num; i*=5){
            System.out.print(i + " - ");		
        }
		
	}
}

