import java.util.*;

public class typesMeal {
	
	public void Meal() 
	{
		 System.out.println("Meal");
		 System.out.println("Press 1 for VEG");
		 System.out.println("Press 2 for NON-VEG");
		 System.out.println("Enter 11 for home");
	  	 System.out.println("Enter 12 for back");
		 
           Scanner sc = new Scanner(System.in);
		
		System.out.println("Select the Meal whiche one you want");
		int i=sc.nextInt();
		 switch(i)
		 {
		 case 1:
			 Vegetarian veg = new Vegetarian();
			 veg.vegMeal();
			 break;
			
		 case 2:
			 Nonveg NV = new Nonveg();
			 NV.nvMeal();
			 break;	 
			 
		 case 11:
				selfFitness a2= new selfFitness();
				
				a2.choise();
				break;	
				
			case 12:typesMeal a1 = new typesMeal();
				a1.Meal();
				break;	
			
				
			default:
				System.out.println("Please Enter a valid choice");	
				typesMeal s = new typesMeal();
				s.Meal();	 
			 
		 }
	
	}
	

}
