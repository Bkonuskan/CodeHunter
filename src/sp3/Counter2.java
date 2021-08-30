package sp3;

public class Counter2 { 
	int count;
	static int stCount; 
	public Counter2() { 
		count ++ ; stCount ++ ; } 
	
	public int getCount(){ 
		return count; } 
	
	public static int getStCount(){
		return stCount; 
		} 
	
   public static void main(String[] args) { 
Counter2 csl = new Counter2(); 
Counter2 cs2 = new Counter2(); 
Counter2 cs3 = new Counter2(); 
Counter2 cs4 = new Counter2(); 
Counter2 cs5 = new Counter2(); 
Counter2 cs6 = new Counter2(); 
System.out.println("count is: " + csl.getCount()); 
System.out.println("stCount is: " + csl.getStCount()); 
	}

}
