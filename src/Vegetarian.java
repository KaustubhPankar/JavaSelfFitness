import java.util.Scanner;
public class Vegetarian {
	
	public void vegMeal() 
	{
		System.out.println("Pure Veg Meal");
		 System.out.println("Press 1 for 1st Meal");
		 System.out.println("Press 2 for 2nd Meal");
		 System.out.println("Press 3 for 3rd Meal");
		 System.out.println("Press 4 for 4th Meal");
		 System.out.println("Press 5 for 5th Meal");
		 System.out.println("Press 6 for 6th Meal");
		 System.out.println("Enter 11 for home");
	  	 System.out.println("Enter 12 for back");
		 Scanner sc = new Scanner(System.in);	
		 int s2=sc.nextInt();
		 switch(s2)
		 {
		 case 1:
			 System.out.println("Muscle Oats");
			 System.out.println("2/3 Cups Oats");
			 System.out.println("1/4 cup Cereals");			
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("2/3sp Whey");
			 System.out.println("1sp Brans");
			 System.out.println("1/8 cups Raisin,Walnuts,Almonds");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("1/2 Banana,Apple");
			 System.out.println("2 pinch Cinnamon");
			 System.out.println("Total Calories 595");			 
			 			
			 System.out.println("Enter 2 for back");
			 int v1 =sc.nextInt();
		      if(v1==2) {
		    	  vegMeal
		    	  ();
		      } 
			 break;
		
		 case 2:
			 System.out.println("Protein Powder Snack");
			 System.out.println("1 Slice Bread + 1sp Peanut Butter");
			 System.out.println("1 Slice Bread + 1/2 Cup Chickpeas");			
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("1 Slice Bread + 1sp Peanut Butter");
			 System.out.println("Total Calories 536");	
			
			 System.out.println("Enter 2 for back");
			 int v2 =sc.nextInt();
		      if(v2==2) {
		    	  vegMeal();
		      } 
			 break;
			 
		 case 3:
			 System.out.println("Potato Bowl");
			 System.out.println("140g Sweet Potato");
			 System.out.println("1/2 cup Kidney Beans");			
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("50g Fresh Paneer");
			 System.out.println("1/2 Green Pepper");
			 System.out.println("1/4 cup Spinach");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("3sp Green Onion");
			 System.out.println("2sp Tomato chopped");
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("1/3 Cup Mango or Pinne Apple");
			 System.out.println("25g Soy Chunks");
			 System.out.println("Total Calories 490");	
			 
			 System.out.println("Enter 2 for back");
			 int v3 =sc.nextInt();
		      if(v3==2) {
		    	  vegMeal();
		      } 
			 break;	
			 
		 case 4:
			 System.out.println("Bulk Up Shake");
			 System.out.println("2 Banana");
			 System.out.println("1sp Whey");			
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("1.5 sp Penut Butter");
			 System.out.println("240 ml Milk");
			 System.out.println("1/2 Cup Oats Powder");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Pinach Cinnamon");
			 System.out.println("150 ml Water");			 
			 System.out.println("Total Calories 681");	
			
			 System.out.println("Enter 2 for back");
			 int v4 =sc.nextInt();
		      if(v4==2) {
		    	  vegMeal();
		      } 
			 break;	
			 
		 case 5:
			 System.out.println("Recovery Meal");
			 System.out.println("200g Tofu");
			 System.out.println("1 Pineapple Ring");			
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("1/2 Cup Crushed Brocoli");
			 System.out.println("1/2 cup crushed Cabbage");
			 System.out.println("1sp Ranch");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("1/4 cup kidney Beans");
			 System.out.println("1/4 cup Chickpeas");
			 System.out.println("2sp chopped carrots,onion,tomato");
			 System.out.println("1/2 Lemon");
			 System.out.println("Cilantro little bit");
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("ketchup");
			 System.out.println("salt");
			 System.out.println("Total Calories 513");
			
			 System.out.println("Enter 2 for back");
			 int v5 =sc.nextInt();
		      if(v5==2) {
		    	  vegMeal();
		      } 
			 break;	
			 
		 case 6:
			 System.out.println("1/2 cup Milk");
			 System.out.println("1/2sp Whey or Casein");			
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("1/2sp Peanut Butter");
			 System.out.println("1/2 Green Pepper");
			 System.out.println("2 Slice Brown Bread");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Total Calories 336");	
			 
			 System.out.println("Enter 2 for back");
			 int v6=sc.nextInt();
		      if(v6==2) {
		    	  vegMeal();
		      } 
			 break;	
			 
		 case 11:
				selfFitness a2= new selfFitness();
				
				a2.choise();
				break;		 
			
		 case 12:
			 typesMeal a1 = new typesMeal();
				a1.Meal();
				break;	
		
		case 13:
			Vegetarian a3 = new Vegetarian();
			a3.vegMeal();
			break;			 

		default:
			System.out.println("Please Enter a valid choice");	
			Vegetarian s = new Vegetarian();
			s.vegMeal();	 
		 }
	}

}
