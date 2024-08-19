public class MultipleParameters{
	int x;
	String s;
	double f;
	double d;
	public MultipleParameters(int y, String q, double a, double n){
		x = y;
		s = q;
		f = a;
		d = n;
	}
	public static void main(String[] args){
		MultipleParameters myobj = new MultipleParameters(5, "Java", 4.67, 67.907);
		System.out.printf("String is %s\nInteger is %d\nDouble 1 is %f\nDouble 2 is %f\n", myobj.s, myobj.x, myobj.f, myobj.d);
	}
}
