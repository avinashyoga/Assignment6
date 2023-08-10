package Week3Day5;

public class ExecutionClass extends MultipleLanguage {

	public void java() 
	{
		
		System.out.println("ruby");
	}

	public void selenium() 
	{
		
		System.out.println("Selenium");
	}

	@Override
	public void ruby() 
	{
		
		System.out.println("java");
	}
	public static void main(String[] args) 
	{
		ExecutionClass obj=new ExecutionClass();
		obj.ruby();
		obj.selenium();
		obj.java();
	}

}
