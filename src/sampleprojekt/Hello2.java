package sampleprojekt;

import java.util.Scanner;

public class Hello2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");		
		
		int sayi1 = scan.nextInt();
		
		System.out.println("Lutfen ikinci sayiyi giriniz");
		
		int sayi2 = scan.nextInt();
    
		System.out.println("Toplama sonucu : " + (sayi1 + sayi2) );
		
		System.out.println("Bu islemi kim yapti? Lutfen isim giriniz : ");
		
		String name = scan.next();
		
		System.out.println("Lutfen soyisminizi giriniz");
		
		String surname = scan.next();
		
		System.out.println("Girdiginiz isim ve soyisim : " + name +"  " + surname);
scan.close();
	}

}
