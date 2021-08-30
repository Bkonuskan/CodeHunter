package replit_cozumleri;

import java.util.Scanner;

public class For_while_2 {

	public static void main(String[] args) {
		/*Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) 
		 * ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
	     Input :
                30
				40

					Beklenen Cikti: 30 ve 40 icin GCD = 10
					                30 ve 40 icin LCM = 120		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 2 tam sayı giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int ebob=1;
		int ekok;
		
		for (int i = 1; i <=sayi1 && i<= sayi2; i++) {
			if(sayi1%i==0 && sayi2%i==0)
				ebob=i;			
		}
		ekok = (sayi1 * sayi2) / ebob;
        System.out.printf(" %d ve  %d sayılarının EBOB'u %d \n", sayi1, sayi2, ebob);
        System.out.printf(" %d ve  %d sayılarının EKOK'u %d \n", sayi1, sayi2, ekok);

	}

}
