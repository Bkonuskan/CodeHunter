package replit_cozumleri;

public class For_While_10 {

	public static void main(String[] args) {
		/*1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
		OutPut:
		Sayilarin Toplami : 5050
		 * 
		 */
		int toplam=0;
		
		for (int i = 0; i <=100; i++) {
			
			toplam+=i;
		}
		System.out.println("Sayılar Toplamı : "+toplam);
	}

}
