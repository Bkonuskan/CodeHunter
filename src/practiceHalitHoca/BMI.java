package practiceHalitHoca;

public class BMI {

	private String name;
	private int age;
	private double weight;
	private double height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public BMI(String name, int age, double weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	public double formulBMI() {
		double bmi=weight/(height*height);
		return bmi;
	}
	public String BMIdurumu() {
		double bmi=formulBMI();
	
		if(bmi<18.5) {
			return "Zayıf";
		}if(bmi<25) {
			return "Normal";		
}	     if(bmi<30) {
		 return "Kilolu";
}   	 else
		 return "Obez";
}
}