import java.util.*;
 class shreddedExcercise  
{
	 public void Shredded()
	 {
		 System.out.println("shredded excercise");
		 System.out.println("Press 1 for day 1st");
		 System.out.println("Press 2 for day 2nd");
		 System.out.println("Press 3 for day 3rd");
		 System.out.println("Press 4 for day 4th");
		 System.out.println("Press 5 for day 5th");
		 System.out.println("Press 3 for day 6th");
		 System.out.println("Enter 11 for home");
	  	 System.out.println("Enter 12 for back");
	  	 System.out.println("Enter 13 for Excercise");
		 Scanner sc = new Scanner(System.in);	
		 int s2=sc.nextInt();
		 switch(s2)
		 {
		 case 1:
			 System.out.println("Shoulder & Tricep");
			 System.out.println("Super SET:");
			 System.out.println("DB Shoulder press 15-12-10");
			 System.out.println("Rear Delt Cable fly 15-12-10");
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Giant SET:");
			 System.out.println("DB side Raise 12-10-10");
			 System.out.println("Cable front Raise 12-10-10");
			 System.out.println("Single Hand Cable Fly 12-10-10");
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Giant Set:");
			 System.out.println("DB Front Raise 10-10-10");
			 System.out.println("Cable Side Raise 10-10-10");
			 System.out.println("DB Arm Circles 10-10-10");
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super SET:");
			 System.out.println("Rop Over Head 12-10-10");
			 System.out.println("DB Kick Back 12-10-10");
						 
			 System.out.println("Enter 2 for back");
			 int a =sc.nextInt();
		      if(a==2) {
		    	  Shredded();
		      } 
		      
		       break;
			 
		 case 2:
			 System.out.println("Chest & Upper Back");
			 System.out.println("Giant SET:");
			 System.out.println("DB Inclined Press 12-10-8");
			 System.out.println("DB Flat Bench Press 12-10-8");
			 System.out.println("DB Declined Press 12-10-8");
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super SET:");
			 System.out.println("Cable Fly 12-10-8");
			 System.out.println("Declined Cable Fly 12-10-8");	
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Drop Set:");
			 System.out.println("Inclined Cable Fly 12-10-8");			
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Angle Drop SET:");
			 System.out.println("Rope Upright Row 10-10-10");
			 System.out.println("DB Shrugs 15-12-10");	
			 
			 System.out.println("Enter 2 for back");
			 int a1 =sc.nextInt();
		      if(a1==2) {
		    	  Shredded();
		      } 
		      
			 break;	 
			
		 case 3:
			 System.out.println("Cardio");
			 System.out.println("Warmup 5min Speed:3mph");			 
			 System.out.println("Sprint 6min Speed:6mph");			 			 
			 System.out.println("Increase each Set 2min & Speed 0.5mph");
			 
			 System.out.println("Enter 2 for back");
			 int a2 =sc.nextInt();
		      if(a2==2) {
		    	  Shredded();
		      } 
		      
			 break;		 
			
		 case 4:
			 System.out.println("Lats, Mid-Back & Biceps");
			 System.out.println("Super SET:");
			 System.out.println("Closed Grip Lat Pull Down 15-10-8");
			 System.out.println("Machine Rows 15-10-8");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super SET:");
			 System.out.println("DB Rows 15-10-8");
			 System.out.println("Single Hand Cable Lat Pulldown 15-10-8");	
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super Set:");
			 System.out.println("Straight Bar Pull Down 12-10-8");
			 System.out.println("Rope Rows 12-10-8");
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super Set SET:");
			 System.out.println("DB Hammer Curl 12-10-8");
			 System.out.println("Cable Overhead Biceps Curl 12-10-8");			
			
			 System.out.println("Enter 2 for back");
			 int a3 =sc.nextInt();
		      if(a3==2) {
		    	  Shredded();
		      } 
		      
			 break;	
		
		 case 5:
			 System.out.println("Quards, Hamstring & Calves");
			 System.out.println("Super SET:");
			 System.out.println("DB Squat 15-10-8");
			 System.out.println("DB Step Up 15-10-8");			 
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super SET:");
			 System.out.println("DB Lunges 15-10-8");
			 System.out.println("DB Sumo Squat 15-10-8");	
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Super Set:");
			 System.out.println("Leg Extension 15-10-8");
			 System.out.println("Lying Leg Curl 15-10-8");
			 System.out.println("++++++++++++++++++++++++++++");
			 System.out.println("Giant SET:");
			 System.out.println("Calf Raise 12-10-8");
			 System.out.println("Seated Calf Raise with DB 12-10-8");
			 
			 System.out.println("Enter 2 for back");
			 int a4 =sc.nextInt();
		      if(a4==2) {
		    	  Shredded();
		      } 
		      
			 break;		 
		 case 11:
				selfFitness a5= new selfFitness();
				
				a5.choise();
				break;	
				
		case 12:
				typesExcercise1 a6 = new typesExcercise1();
				a6.Excercise();
				break;	
		
		case 13:
			shreddedExcercise a7 = new shreddedExcercise();
			a7.Shredded();
			break;		
				
		default:
				System.out.println("Please Enter a valid choice");	
				shreddedExcercise s = new shreddedExcercise();
				s.Shredded();	 
		 }
		 
	 }

}
