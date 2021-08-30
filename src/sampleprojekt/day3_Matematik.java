package sampleprojekt;

import java.util.Scanner;

public class day3_Matematik {

	public static void main(String[] args) {
		
		//1234 sayisinin rakamlari Toplami yapalim
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen en fazla dört basamaklı bir sayı giriniz");
		int sayi1 = scan.nextInt();
		int sayilarToplami = 0;
		
		int rakam = sayi1%10;	//sayıyı 10 a bölecek kalanı yazdıracak=4
		sayilarToplami+=rakam;  // 0+4 sonuç oldu
				
		sayi1/= 10;  //12 kaldı 
				 		
		rakam = sayi1%10;
		sayilarToplami+=rakam;
		
		sayi1/= 10;  //1 kaldı 
		rakam = sayi1%10;
		sayilarToplami+=rakam;
		
		sayi1/= 10;  //0 kaldı 
		rakam = sayi1%10;
		sayilarToplami+=rakam;
		
		System.out.println("Rakamlar toplamı : " +sayilarToplami);
		
		
		
		
				
		
		
		
		

	}

}
