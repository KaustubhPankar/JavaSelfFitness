import java.util.*;
public class Nonveg {
	public void nvMeal() 
	{
		System.out.println("Non Veg Meal");
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
			 System.out.println("Bulk Shake");
			 System.out.println("2 banana 50g carb 2g protein 0g fat");
			 System.out.println("1 scoop whey 1g carb 24g protein 1g fat");			
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("240ml milk 10g carb 8g protein 5g fat");
			 System.out.println("150ml water 0 carb 0 protein 0g fat");
			 System.out.println("1.5sp peanut butter 5g carb 5g protein 10g fat");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("1/2 cup oats powder 27g carb 3g protein 1g fat");
			 System.out.println("pinch cinnamon 0g carb 0g protein 0g fat");
			 System.out.println("Total Calories 681");			 
			 			
			 System.out.println("Enter 2 for back");
			 int v1 =sc.nextInt();
		      if(v1==2) {
		    	  nvMeal();
		      } 
			 break;
		
		 case 2:
			 System.out.println("Bread Toast and Omlete");
			 System.out.println("2whole eggs 2g carb 12g protein 10g fat");
			 System.out.println("2 egg whites 0g carb 8g protein 0g fat");			
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("3-4  Multigrain Bread Slices 56g carb 8g protein 10g fat");
			 System.out.println("2sp JAM 20 carb 0 protein 0g fat");
			 System.out.println("1-2 Banana Optional");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Total Calories 550");			
			
			 System.out.println("Enter 2 for back");
			 int v2 =sc.nextInt();
		      if(v2==2) {
		    	  nvMeal();
		      } 
			 break;
			 
		 case 3:
			 System.out.println("Rice Egg Peas");
			 System.out.println("1 Cup Rice 45g carb 3g protein 1g fat");
			 System.out.println("1/2 scoop kdne beans 15g carb 5g protein 1g fat");			
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("4 Egg Whites 0g carb 16g protein 0g fat");
			 System.out.println("1/2 Cup Peas 3g carb 0 protein 0g fat");
			 System.out.println("1sp Ghee OR Cocunut Oil  0g carb 0g protein 13g fat");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Total Calories 471");
			
			 System.out.println("Enter 2 for back");
			 int v3 =sc.nextInt();
		      if(v3==2) {
		    	  nvMeal();
		      } 
			 break;	
			 
		 case 4:
			 System.out.println("Bulk Shake");
			 System.out.println("2 banana 50g carb 2g protein 0g fat");
			 System.out.println("1 scoop whey 1g carb 24g protein 1g fat");			
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("240ml milk 10g carb 8g protein 5g fat");
			 System.out.println("150ml water 0 carb 0 protein 0g fat");
			 System.out.println("1.5sp peanut butter 5g carb 5g protein 10g fat");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("1/2 cup oats powder 27g carb 3g protein 1g fat");
			 System.out.println("pinch cinnamon 0g car");
			
			 System.out.println("Enter 2 for back");
			 int v4 =sc.nextInt();
		      if(v4==2) {
		    	  nvMeal();
		      } 
			 break;	
			 
		 case 5:
			 System.out.println("Potato Cheaken Beans");
			 System.out.println("220g Potato 50g carb 0g protein 0g fat");
			 System.out.println("1/2 cup white Channe 15g carb 6g protein 2g fat");			
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("1 Tomato 5g carb 0g protein 0g fat");
			 System.out.println("80g Grilled Chicken 0 carb 14g protein 0g fat");
			 System.out.println("1sp barbiq sause optional 0g carb 0g protein 13g fat");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Total Calories 378");
			
			 System.out.println("Enter 2 for back");
			 int v5 =sc.nextInt();
		      if(v5==2) {
		    	  nvMeal();
		      } 
			 break;	
			 
		 case 6:
			 System.out.println("Bed Protein");
			 System.out.println("100ml Milk 6g carb 5g protein 1g fat");
			 System.out.println("1/2 scoop whey 0g carb 10g protein 0g fat");			
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("2 Brown Bread 30g carb 0g protein 1g fat");
			 System.out.println("1sp peanut butter 3g carb 3g protein 10g fat");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Total Calories 336");
			
			 System.out.println("Enter 2 for back");
			 int v6=sc.nextInt();
		      if(v6==2) {
		    	  nvMeal();
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
			Nonveg a3 = new Nonveg();
			a3.nvMeal();
			break;			 

		default:
			System.out.println("Please Enter a valid choice");	
			Nonveg s = new Nonveg();
			s.nvMeal();	 

	}
	}
}
