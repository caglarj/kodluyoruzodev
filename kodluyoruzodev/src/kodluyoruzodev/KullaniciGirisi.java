package kodluyoruzodev;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {

		String userName;
		String password;
		String nPass;
		int nPassword2;
		int button;

		Scanner inp = new Scanner(System.in);

		System.out.println("Kullanici Adiniz :");
		userName = inp.nextLine();

		System.out.println("Sifreniz         :");
		password = inp.nextLine();

		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giris Yaptiniz: ");
			
		}else if (password != ("java123")) {
			System.out.println(
					"Sifreniz Hatali..! Sifrenizi Unuttuysaniz Yeni Sifre Belirlemek icin '1', Iptal icin '2' tuslayin");
			}
				
		button = inp.nextInt();
		inp.nextLine(); 
		
		switch (button) {
		case 1: 
			System.out.println(" Lufen Yeni Bir Sifre Belirleyiniz : ");
			nPass = inp.nextLine();
			
			if (nPass.equals(password)) {System.out.println("Yeni sifreniz bir onceki sifreniz ile ayni olamaz.");}
			
			else {
				System.out.println("Sifreniz basari ile degistilidi.");
				System.out.println("Yeni sifreniz :" + nPass );
				}
			break;
		case 2: 
			System.out.println("Sifre degistirilme islemini iptal ettiniz.");
			break ;
			
			}
		}
		
	}
		
		


