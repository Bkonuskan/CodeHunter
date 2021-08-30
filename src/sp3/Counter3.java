package sp3;

public class Counter3{
	int count=0; 
   
   Counter3(){ 
	   count++; 
	   System.out.println(count); 
   }
   
   public static void main(String args[] ){ 
   Counter3 cl=new Counter3(); //1
   Counter3 c2=new Counter3(); //1
   Counter3 c3=new Counter3(); //1
   
} 
}