//This program demonstrates inheritance and the access of protected variable by subclass object.
class Vehicle{
	protected String brand = "Ford";
	public void honk(){
		System.out.println("Tuut, tuut!");
	}
}
class Car extends Vehicle{
	private String modelName = "Mustang";
	public static void main(String[] args){
		Car myFastCar = new Car();
		myFastCar.honk();
		System.out.println(myFastCar.brand+" "+myFastCar.modelName);
	}
}
