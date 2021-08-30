package replit_cozumleri;

public class For_While_3 {

	public static void main(String[] args) {
		
		 String strKontrol = "";
	        String str1 = "Javaisalsoeasy";
	        for (int i = 0; i < str1.length(); i++) {
	            if (!(str1.indexOf(str1.charAt(i)) == str1.lastIndexOf(str1.charAt(i)))) {
	                if (!strKontrol.contains(Character.toString(str1.charAt(i)))) {
	                    strKontrol += str1.charAt(i)+ " ";
	                }
	            }
	        }
	        System.out.println(strKontrol);

	}

}
