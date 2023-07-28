import java.util.Scanner;

public class selfFitness {
	
	static //static block 
	{
	  System.out.println("###############################");
	  System.out.println("Welcome To self Fitness");
	  System.out.println("###############################");
	  System.out.println("No Pain No Gain");
	  System.out.println("*******************************");
    }
	
	public  void name() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String a=sc.next();
		System.out.println(a);
		System.out.println("Enter Your Mobile No.:");
		long b=sc.nextLong();
		System.out.println(b);
	} 
	 
	public  void choise()
	{
     	System.out.println("Enter 1 for Excercise");
     	System.out.println("Enter 2 for Meal");
     	Scanner sc = new Scanner(System.in);
     	int i = sc.nextInt();

		switch(i)
		{
		case 1:
			typesExcercise1 t = new typesExcercise1();
			t.Excercise();
			break;

		case 2: 
			typesMeal m = new typesMeal();
			m.Meal();
			break;
	  
			default:
			System.out.println("Please Enter a valid choice");	
			choise();
			break;
			
			}
	}
	public static void main(String[] args) 
	{
		selfFitness s= new selfFitness();
		
		s.name();
		s.choise();
		

		
	}

  
}

