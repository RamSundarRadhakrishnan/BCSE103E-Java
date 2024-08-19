public class EnumValues{
	enum Level{
		LOW,
		MEDIUM,
		HIGH
	}
	public static void main(String[] args){
		for(Level myvar : Level.values()){
			System.out.println(myvar);
		}
	}
}
