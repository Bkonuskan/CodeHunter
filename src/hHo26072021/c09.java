package hHo26072021;

import java.util.Scanner;

public class c09 {

	public static void main(String[] args) {

	      // INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
	        Scanner scan = new Scanner(System.in);
	        System.out.print("PIN kodunuzu giriniz : ");
	        int userPin = scan.nextInt();
	        int pinCode = 1453;
	      
	        while(pinCode!=userPin) {
	        	System.out.println("Başarısız Pin girişi Tekrar deneyiniz !");
	        	userPin=scan.nextInt();
	        	
	        }
	        System.out.println("Gayet başarılı giriş pin onaylandı");
	}

}
