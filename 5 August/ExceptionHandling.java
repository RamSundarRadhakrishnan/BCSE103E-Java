class Student{
	public String name;
	Student(String name){
		this.name = name;
	}
	public String toString(){
		return name;
	}
}
public class ExceptionHandling{
	public static void main(String[] args){
		Student[]myStudents = new Student[]{new Student("Dharma"), new Student("Sanvi"), new 					Student("Rupa"), new Student("Ajay")};
		System.out.println("Trying to access element outside array..");
		System.out.println(myStudents[7]);
	}
}
