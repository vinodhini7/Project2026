
public class LearningConstructor {
	
	public LearningConstructor()
	
	{
	System.out.println("zero arg constructor");	
	}
	
	public LearningConstructor(String name,int age,String company)
	{
	System.out.println("one arg consructor");	
	}
	
	public static void main(String[] args) {
		LearningConstructor cons1 = new LearningConstructor();
		LearningConstructor cons2 = new LearningConstructor("Vino",32,"Infogain");
	}

}
