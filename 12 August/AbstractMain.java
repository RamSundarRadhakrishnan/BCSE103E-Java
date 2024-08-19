abstract class AbstractMain{
	public String fname = "John";
	public int age = 24;
	public abstract void study();
}
class Student extends AbstractMain{
	public int graduationyear = 2018;
	public void study(){
		System.out.println("Studying all day long...");
	}
}
