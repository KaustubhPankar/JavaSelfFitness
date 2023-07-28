import java.util.*;
public class fatlossExcercise 
{
	public void fatLoss() 
	{
		 System.out.println("shredded excercise");
		 System.out.println("Press 1 for day 1st");
		 System.out.println("Press 2 for day 2nd");
		 System.out.println("Press 3 for day 3rd");
		 System.out.println("Press 4 for day 4th");
//		 System.out.println("Press 5 for day 5th");
//		 System.out.println("Press 6 for day 6th");
		 System.out.println("Enter 11 for home");
	  	 System.out.println("Enter 12 for back");
		 Scanner sc = new Scanner(System.in);	
		 int s2=sc.nextInt();
		 switch(s2)
		 {
		 case 1:
			 System.out.println("Chest & Back");
			 System.out.println("Super Set :");
			 System.out.println("Barbell Incline Press 12-10-8");	
			 System.out.println("Lat Bar Pulldown 12-10-8");	
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super SET:");
			 System.out.println("Machine Chest Press 12-10-8");	
			 System.out.println("Rope Rows 12-10-8");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super Set:");
			 System.out.println("DB Declined Press 12-10-8");	
			 System.out.println("DB Pullover 12-10-8");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super SET:");
			 System.out.println("Cable Fly 12-10-8");	
			 System.out.println("One Side Barbell Rows 12-10-8");	
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Cardio:");
			 System.out.println("Cycling 15 mins");
			 
			 System.out.println("Enter 2 for back");
			 int f1 =sc.nextInt();
		      if(f1==2) {
		    	  fatLoss();
		      } 
			 break;
			 
		 case 2:
			 System.out.println("Shoulder & Arms");
			 System.out.println("Super Set :");
			 System.out.println("Barbell Front Press 12-10-8");	
			 System.out.println("Barbell Upright Rows 12-10-8");	
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Giant SET:");
			 System.out.println("DB Front Raise 12-10-8");	
			 System.out.println("DB Rear Delt Fly 12-10-8");
			 System.out.println("Barbell Side Raise 12-10-8");
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super Set:");
			 System.out.println("DB Hammer Curl 12-10-8");	
			 System.out.println("DB Skull Crusher 12-10-8");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Giant SET:");
			 System.out.println("DB Shoulder Press 12-10-8");	
			 System.out.println("Single Hand Tricep Pressdown 12-10-8");	
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Cardio:");
			 System.out.println("Cycling 15 mins");			
			 System.out.println("Enter 2 for back");
			 int f2 =sc.nextInt();
		      if(f2==2) {
		    	  fatLoss();
		      } 
			 break;	
			 
		 case 3:
			 System.out.println("Legs");
			 System.out.println("Super Set :");
			 System.out.println("Barbell Squat 12-10-8");	
			 System.out.println("Leg Extension 12-10-8");	
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super SET:");
			 System.out.println("Heck Squat 12-10-8");	
			 System.out.println("DB Step Up 12-10-8");			
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super Set:");
			 System.out.println("Machinne Leg Press 12-10-8");	
			 System.out.println("Hamstring Curl 12-10-8");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Giant SET:");
			 System.out.println("DB Walking Lunges 12-10-8");	
			 System.out.println("Calf Raise On Leg Press 12-10-8");	
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Cardio:");
			 System.out.println("Cycling 15 mins");			
			 System.out.println("Enter 2 for back");
			 int f3 =sc.nextInt();
		      if(f3==2) {
		    	  fatLoss();
		      } 
			 break;		 
		
		 case 4:
			 System.out.println("ABS & Cardio");
			 System.out.println("Super Set :");
			 System.out.println("Lat Bar Crunches 12-10-8");				 	
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super SET:");
			 System.out.println("Reverse Crunches 12-10-8");	
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super Set:");
			 System.out.println("Hanging Knee Raise 12-10-8");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super SET:");
			 System.out.println("Cable Wood Choper 12-10-8");					
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super SET:");
			 System.out.println("Plank Side By Side 12-10-8");					
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super SET:");
			 System.out.println("Oblique Crunches 12-10-8");					
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Cardio:");
			 System.out.println("Cycling 15 mins");	
			 System.out.println("Walk 5 mins");	
			 System.out.println("Running 20 mins");	
			 System.out.println("Enter 2 for back");
			 int f4 =sc.nextInt();
		      if(f4==2) {
		    	  fatLoss();
		      } 
			 break;		 	 
		 case 11:
				selfFitness a2= new selfFitness();
				
				a2.choise();
				break;		 
			
		 case 12:
				typesExcercise1 a1 = new typesExcercise1();
				a1.Excercise();
				break;	
		
		case 13:
			fatlossExcercise a3 = new fatlossExcercise();
			a3.fatLoss();
			break;		
				
		default:
				System.out.println("Please Enter a valid choice");	
				fatlossExcercise s = new fatlossExcercise();
				s.fatLoss();		 
		 
		 }
		
	}
}
