public class ClassConstructors{
	int x;
	public ClassConstructors(){
		x = 5;
	}
	public static void main(String[] args){
		ClassConstructors myObj = new ClassConstructors();
		System.out.println(myObj.x);
	}
}
