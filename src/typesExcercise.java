import java.util.*;
 class typesExcercise1 extends selfFitness // inheritance single level
{
  public void Excercise()
	{ 
	  System.out.println("Enter 1 for shreddedExcercise");
   	  System.out.println("Enter 2 for weeklyExcercise");
   	  System.out.println("Enter 3 for sharpExcercise");
   	  System.out.println("Enter 4 for bulkExcercise");
 	  System.out.println("Enter 5 for fatlossExcercise");
 	  System.out.println("Enter 6 for homeExcercise");
 	  System.out.println("Enter 7 for massExcercise");
  	  System.out.println("Enter 8 for gainerExcercise");
  	  System.out.println("Enter 9 for nextlevelExcercise");
  	  System.out.println("Enter 10 for musclemodeExcercise");
  	  System.out.println("Enter 11 for home");
//  	  System.out.println("Enter 12 for back");
  	  

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select the excercise whiche one you want");
		int i=sc.nextInt();
		
		// Switch to select the Exercise mode
		
		switch(i)
		{
		case 1:
			shreddedExcercise shredded=new shreddedExcercise();
			shredded.Shredded();
			break;
			
		case 2:
			weeklyExcercise week=new weeklyExcercise();
			week.Weekly();
			break;
			
		case 3:
			sharpExcercise s3=new sharpExcercise();
			s3.Sharp();
			break;
			
		case 4:
			bulkExcercise bulky=new bulkExcercise();
			bulky.Bulk();
			break;	
			
		case 5:
			fatlossExcercise fat=new fatlossExcercise();
			fat.fatLoss();
			break;
			
		case 6:
			homeExcercise self=new homeExcercise();
			self.Home();
			break;
			
		case 7:
			massExcercise MassXL=new massExcercise();
			MassXL.Mass();
			break;
			
		case 8:
			gainerExcercise gain=new gainerExcercise();
			gain.Gainer();
			break;
			
		case 9:
			nextlevelExcercise next=new nextlevelExcercise();
			next.nextLevel();
			break;
			
		case 10:
			musclemodeExcercise muscle=new musclemodeExcercise();
			muscle.muscleMode();
			break;
			
		case 11:
			selfFitness a2= new selfFitness();
			
			a2.choise();
			break;	
			
//		case 12:
//			typesExcercise1 a1 = new typesExcercise1();
//			a1.Excercise();
//			break;	
//		
			
		default:
			System.out.println("Please Enter a valid choice");	
			typesExcercise1 s = new typesExcercise1();
			s.Excercise();
		}
	}
	

}


