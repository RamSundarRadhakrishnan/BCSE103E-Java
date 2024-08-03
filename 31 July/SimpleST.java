import java.util.StringTokenizer;
public class SimpleST{
	public static void main(String[] args){
			StringTokenizer st = new StringTokenizer("I am a student of Computer Science and Engineering at Vellore Institute of Technology. I am a resident of hostel block A and hail from India."," ");
			System.out.println("Total number of Tokens: "+st.countTokens());
	}
}
