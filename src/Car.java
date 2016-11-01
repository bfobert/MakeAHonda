import java.util.ArrayList;
import java.util.Iterator;

public class Car extends CarComponent{
	private ArrayList<CarComponent> carComponents;
	private String name;
	private double price;
	

	public Car(String name, double price){
		carComponents = new ArrayList<CarComponent>();
		this.name = name;
		this.price = price;
	}
	public void add(CarComponent carComponent){
		carComponents.add(carComponent);
	}
	public void remove(CarComponent carComponent){
		carComponents.remove(carComponent);
	}
	public CarComponent getChild(int i){
		return carComponents.get(i);
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void print(){
		System.out.print("\n" + getName());
		System.out.print("\n" + getPrice());
		System.out.print("---------------");
		Iterator<CarComponent> iterator = carComponents.iterator();
		while(iterator.hasNext()){
			CarComponent carComponent = iterator.next();
			carComponent.print();
		}
	}
}
