package practiceHalitHoca;

public class P1_0908 {

	
		/* * Write program as a Book class that will have 2 Constructors. While creating
         * an object make sure: Instance variables are being initialized Both
         * Constructors are being executed
         * programı 2 Yapıcıya sahip olacak bir Kitap sınıfı olarak yazın. 
         * Bir nesne oluştururken şunlardan emin olun: 
         * Örnek değişkenleri başlatılıyor Her iki Yapıcı da yürütülüyor
         */
    String title, author;
    int publish;
    static int pages;
 
    
    
    
	public P1_0908(String title, String author, int publish) {
			super();
			this.title = title;
			this.author = author;
			this.publish = publish;
		}
	
    public static void main(String[] args) {
	
    	P1_0908 kitap1=new P1_0908("Suç ve Ceza","Dostayevski",2000);
    	P1_0908 kitap2=new P1_0908("Çalı Kuşu","Reşat Nuri",1935);
	   
    	kitap1.display();
	    kitap2.display();
}

	private void display() {
		
		System.out.println("Kitabınız : "+title+"yazarı :"+author+"Yayın Yılı"+publish);
		// TODO Auto-generated method stub
		
	}
}
