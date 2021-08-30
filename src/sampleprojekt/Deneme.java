package sampleprojekt;

import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		/*/* Basri Hocam
         * 
         * Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından,
         * adın aynı karakterlere sahip olup olmadığını kontrol edin.
         * 
         * Eger aynı karakterlere sahipse
         * "isim ayni karakterlere sahiptir." yazdirin.
         * 
         * Eger ayni kaakterlere sahip degilse
         * "Dizenin benzersiz karakterleri var" yazdirin.
         * 
         * Ternary kullanin.
         * 
         */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 3 Harfli bir isim yazınız");
		String name=scan.next();
		
		char c1 = name.charAt(0);
        char c2 = name.charAt(1);
        char c3 = name.charAt(2);

        String harfKontrol = name.length() == 3 ? ((c1 != c2 && c1 != c3 && c2 != c3) ? "Girdiginiz Dizenin benzersiz karakterleri var "
                : "Girdiginiz isim 3 harfli ve isim ayni karakterlere sahiptir."):"Girdiginiz isim 3 harfli değil";

        System.out.println(harfKontrol);
		
		
		
	}

}
