package hHo26072021;

	import java.util.Scanner;
	public class c07 {
	    /*
	     * kullanıcıdan alınan bir sayinin basamak degerlerinin toplamini while loop ile 
	     * hesaplayan bbir method yazınız.
	     */
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Lutfen bir sayi giriniz : ");
	        int sayi = scan.nextInt();
	        rakamTopla(sayi);
	
	
	

}

		private static int rakamTopla(int sayi) {
			int toplam=0;
			
			do {
				toplam+=sayi%10;
				sayi/=10;
				
			}while(sayi>0);
			System.out.println("Girdiğiniz sayilar Toplamı : " + toplam);
			return toplam;
			
		}
	}
