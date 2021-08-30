package haluk_Hoca_Tekrar;

import java.util.Scanner;

public class d07_Forloop07 {

	public static void main(String[] args) {
		/*  Problem Tanımı
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.
        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****
        */
     
        Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir tam sayı giriniz : ");
        int sayi = scan.nextInt();
        for (int baba = 1; baba <=sayi; baba++) {
           for (int bosluk = sayi-baba; bosluk >=0; bosluk--) {
             System.out.print(" ");
            
        } for (int yildiz = 1; yildiz <=baba; yildiz++) {
             
            System.out.print("*");
        }
           
           
           
           System.out.println();
        
    }

	}

}
