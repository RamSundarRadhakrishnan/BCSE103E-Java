abstract class Animal{
	public abstract void animalSound();
	public void sleep(){
		System.out.println("Zzz");
	}
}
class Pig extends Animal{
	public void animalSound(){
		System.out.println("The pig says wee wee");
	}
}
public class AbstractClasses{
	public static void main(String[] args){
		Pig mypig = new Pig();
		mypig.animalSound();
		mypig.sleep();
	}
}
