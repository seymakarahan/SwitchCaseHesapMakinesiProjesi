package Main.Projeler;

import java.util.Scanner;

public class SwitchCaseHesapMakinesiProjesi {
    public static void main(String[] args) {
        int n1, n2, select;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("İlk Sayıyı Giriniz : ");
            n1 = input.nextInt();
            System.out.print("İkinci Sayıyı Giriniz : ");
            n2 = input.nextInt();
            System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nSeçiminiz :");
            select = input.nextInt();
        }
        switch (select) {
            case 1:
            System.out.print("Toplam : " + (n1 + n2));
                break;
            case 2:
            System.out.print("Çıkarma : " + (n1 - n2));
            break;
            case 3:
            System.out.print("Çarpma : " + (n1*n2));
                break;
            case 4:
            switch(n2){
                case 0:
                System.out.print("Bir sayı 0'a bölünemez ! ");
                break;
                default:
                System.out.print("Bölme : " + (n1/n2));
            }
            
            break;
            default:
            System.out.println("Yanlış seçim yaptınız.");
                break;
        }


        
    }
}
