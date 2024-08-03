public class StringBufferExample{
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); //Should be 16 as default.
		sb.append("Hello");
		System.out.println(sb.capacity()); //Remains 16.
		sb.append(" Java is my favorite language!");
		System.out.println(sb.capacity()); //The capacity is automatically increased to (16*2)+2
		System.out.println(sb);
		sb.ensureCapacity(10);
		System.out.println(sb.capacity()); //No change for now as the current capacity is more than 10
		sb.ensureCapacity(50);
		System.out.println(sb.capacity()); //Should be 70
	}
}
