package sp2;

import java.util.Scanner;

public class Deneme1 {

	public static void main(String[] args) {
		// Soru 8) Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
		//Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
		//60 – 80.000 arasinda ise “Konusabiliriz”,
		//60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen maaş teklifi giriniz");
		
		double maas=scan.nextDouble();
		
		if (maas<60.000) {
			System.out.println("Maalesef Kabul edemem");
		}else if(maas<80.00){
			System.out.println("Konusabiliriz");
		}else {
			System.out.println("Kabul ediyorum");
		}
		
		
		
	}

}
