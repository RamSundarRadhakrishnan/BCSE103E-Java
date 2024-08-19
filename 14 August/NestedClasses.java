class OuterClass{
	int x = 10;
	class InnerClass{
		int y = 5;
	}
}
public class NestedClasses{
	public static void main(String[] args){
		OuterClass myouter = new OuterClass();
		OuterClass.InnerClass myinner = myouter.new InnerClass();
		System.out.println(myinner.y+myouter.x);
	}
}
		
