package transport;

public class Bicycle extends Vehicle {

	public Bicycle(String id) {
		super(id);
		System.out.println("Bicycle() constructor is called");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deliver(String item, String place) {
		// TODO Auto-generated method stub
		System.out.println("Delivery"+ item+ "to" + place +"by bicycle");

	}

}
