
public class CartTestDrive {

	public static void main(String[] args) {
		CarComponent car = new Car("Car",0.0);
		CarComponent model = new Car("Model",0.0);
		CarComponent color = new Car("Color",0.0);
		CarComponent accessories = new Car("Accessories",0.0);
		
		car.add(model);
		car.add(color);
		car.add(accessories);
		
		//add stuff now
		model.add(new CarItem("CR-Z LX Manual",20295.0));
		model.add(new CarItem("Jet Black",0));
		model.add(new CarItem("LED Fog Lights",684));
		model.add(new CarItem("Wheel Locks",56));
		
	}

}
