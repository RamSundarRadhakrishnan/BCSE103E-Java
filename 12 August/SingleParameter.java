public class SingleParameter{
	int x;
	public SingleParameter(int y){
		x = y;
	}
	public static void main(String[] args){
		SingleParameter myobj = new SingleParameter(5);
		System.out.println(myobj.x);
	}
}
