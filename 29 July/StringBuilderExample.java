public class StringBuilderExample{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.capacity());
		sb.append("! Java is my favorite programming language. What is your favorite programming language?");
		System.out.println(sb.capacity());
		sb.ensureCapacity(94);
		System.out.println(sb.capacity());
	}
}
