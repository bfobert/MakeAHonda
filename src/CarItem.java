
public class CarItem extends CarComponent{
	String name;
	double price;
	
	public CarItem(String name, double price){
		
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	public void print(){
		System.out.print(" "+getName());
		System.out.println(" "+ getPrice());
		
	}
	
}
