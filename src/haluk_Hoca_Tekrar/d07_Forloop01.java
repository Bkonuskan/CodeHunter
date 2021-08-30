package haluk_Hoca_Tekrar;

public class d07_Forloop01 {

	private static char i;

	public static void main(String[] args) {
		// 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.
		
		for (int i = 0; i <= 255; i++) {
            char harf=(char)i;
            System.out.println(i+"-"+harf);
            
        }
/*System.out.println("  ****** 2.yol *****");
for (char i = 0; i <= 255; i++) {
    char harf=i;
    System.out.println(i+"-"+harf);
    
}//for içindeki int değeri char alınırsa sayı harf eslesmesi olaz. soruda istenen sayı ve harf degeri bulunmaz
    }*/
}
}
	
