package cglrjv.freedom;

import java.util.Scanner;

public class burclarIfElse {

    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isErr = false;

        Scanner inp = new Scanner(System.in);

        System.out.println("Dogum Ayiniz : ");
        month = inp.nextInt();

        System.out.println("Dogum gununuz : ");
        day = inp.nextInt();
        boolean isError;
        if (month == 1) {
            if (day <= 21) {
                burc = "Oglak";
            } else if (day <= 31) {
                burc = "Kova";
            } else
                isError = true;

        } else if (month == 2) {
            if (day <= 19) {
                burc = "Kova";
            } else if (day <= 29) {
                burc = "Balik";
            } else
                isError = true;

        } else if (month == 3) {
            if (day <= 20) {
                burc = "Balik";
            } else if (day <= 31) {
                burc = "Koc";
            } else
                isError = true;

        } else if (month == 4) {
            if (day <= 20) {
                burc = "Koc";
            } else if (day <= 30) {
                burc = "Boga";
            } else
                isError = true;

        } else if (month == 5) {
            if (day <= 21) {
                burc = "Boga";
            } else if (day <= 31) {
                burc = "Ikizler";
            } else
                isError = true;

        } else if (month == 6) {
            if (day <= 22) {
                burc = "Ikizler";
            } else if (day <= 30) {
                burc = "Yengec";
            } else
                isError = true;

        } else if (month == 7) {
            if (day <= 22) {
                burc = "Yengec";
            } else if (day <= 31) {
                burc = "Aslan";
            } else
                isError = true;

        } else if (month == 8) {
            if (day <= 22) {
                burc = "Aslan";
            } else if (day <= 31) {
                burc = "Basak";
            } else
                isError = true;

        } else if (month == 9) {
            if (day <= 22) {
                burc = "Basak";
            } else if (day <= 30) {
                burc = "Terazi";
            } else
                isError = true;

        } else if (month == 10) {
            if (day <= 22) {
                burc = "Terazi";
            } else if (day <= 31) {
                burc = "Akrep";
            } else
                isError = true;

        } else if (month == 11) {
            if (day <= 21) {
                burc = "Akrep";
            } else if (day <= 30) {
                burc = "Yay";
            } else
                isError = true;

        } else if (month == 12) {
            if (day <= 21) {
                burc = "Yay";
            } else if (day <= 31) {
                burc = "Oglak";
            } else
                isError = true;
        }if ((month > 12) || (month < 1)){
            System.out.println("Hatali Ay Girisi");
        }else if (isErr) {
            System.out.println("Hatali Gun Girisi");
        } else {
            System.out.println("Burcunuz : " + burc);
        }
    }
}
