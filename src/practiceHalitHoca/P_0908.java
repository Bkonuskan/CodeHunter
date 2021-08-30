package practiceHalitHoca;

public class P_0908 {	 
		
		/* Programı, örnek değişkenlerin adı ve adresi olan bir Student sınıfı olarak yazın.
		 *  Bu değişkenleri başlatacak bir kurucu oluşturun. 
		 *  DisplayInfo yöntemiyle verilen öğrencinin adını ve adresini yazdırın.
		 */
        String name;
        String adress;
		
        public P_0908(String name, String adress) {
			super();
			this.name = name;
			this.adress = adress;
		}
        
        public static void main(String[] args) {
        P_0908 ogrnc=new P_0908("BasriKonuskan : ", "büyük dut agacının altı");
        ogrnc.DisplayInfo();
	
        }

		private void DisplayInfo() {
			System.out.println(name+" "+ adress);
			
		}
}
