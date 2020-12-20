import java.util.*;    //packages//
class Option
{ 
  static double cheaking_acc_bal=0.00;    //static variable declaration & initialization //
  static double saving_acc_bal=0.00;
  int input()              //method define//
  {
     Scanner s= new Scanner(System.in);   //object creation for scanner class// 
     // do-while loop use for statement repetation//
     do{
    	//display in terminal//
       System.out.println(" \n Select the Account you want to access : \n"); 
       System.out.println(" Type 1 - Checking Account ");	
       System.out.println(" Type 2 - Saving Account ");	
       System.out.println(" Type 3 - Exit ");			
       System.out.print("\n Choice : ");
       int choice=s.nextInt();     //run time choose the choice//
	   
    switch(choice)       //switch-case is use for particular choice//
    {
     case 1:
       {
	//Display on terminal//
	System.out.println("\n Checking Account : \n"); 
        System.out.println(" Type 1 - View Balance ");	
        System.out.println(" Type 2 - Withdraw Funds ");	
        System.out.println(" Type 3 - Deposit Funds ");			
        System.out.println(" Type 4 - Exit ");			
        System.out.print("\n Choice : ");
        int use_choice=s.nextInt();    //run time choose the choice//
		
        switch(use_choice)    //switch-case is use for particular choice//
        {
         case 1:
         {
	      System.out.println("\n Checking Account Balance : "+cheaking_acc_bal);
         }
         continue;	  
         case 2:
         {
	      System.out.println(" \n Checking Account Balance : "+cheaking_acc_bal);
	      System.out.print(" Amount you want to withdraw from Checking Account : ");
	      double withdraw_in_cheaking=s.nextInt();
	       
	       if(cheaking_acc_bal>=withdraw_in_cheaking)         //condition cheak//
	       {
	          cheaking_acc_bal=cheaking_acc_bal - withdraw_in_cheaking;        //decrease withdraw amount//
		  System.out.println("\n New Checking Account Balance : "+cheaking_acc_bal);
	       }
	       else
	       {
		   System.out.println("\n Balance cannot be Negative . ");	
               }
	  }
	  continue;
	  case 3:
	  {
	       System.out.println(" \n Checking Account Balance : "+cheaking_acc_bal);
	       System.out.print(" Amount you want to deposit from Checking Account : ");
	       double deposit_from_cheaking = s.nextInt();
	       cheaking_acc_bal = cheaking_acc_bal + deposit_from_cheaking;          //add deposit amount//
	       System.out.println(" \n New Checking Account Balance : "+cheaking_acc_bal);
	  }
	  continue;
	  case 4:
	  {
		System.out.println(" \n Thank you for using this ATM , Bye \n");
		return 0;
	  }
	   default :
          {
		System.out.println("\n Enter Valid Type Choice ");  
	  }		
	}
     }
      case 2:
      {
	    //Display on terminal//
	    System.out.println("\n Saving Account : \n"); 
            System.out.println(" Type 1 - View Balance ");	
            System.out.println(" Type 2 - Withdraw Funds ");	
            System.out.println(" Type 3 - Deposit Funds ");			
            System.out.println(" Type 4 - Exit ");			
            System.out.print("\n Choice : ");
            int use_choice=s.nextInt();
		 
         switch(use_choice)     //switch-case is use for particular choice//
         {
           case 1:
          {
	       System.out.println("\n Saving Account Balance : "+saving_acc_bal);
   	  }
          continue;	  
	  case 2:
	  {
	       System.out.println("\n Saving Account Balance : "+saving_acc_bal);
	       System.out.print(" Amount you want to withdraw from Saving Account : ");
	       double withdraw_from_saving = s.nextInt();
		  
		if(saving_acc_bal>=withdraw_from_saving)
		{
		   saving_acc_bal = saving_acc_bal - withdraw_from_saving;       //decrease withdraw amount//
		   System.out.println("\n New Saving Account Balance : "+saving_acc_bal);
		}
	        else
	        {
		   System.out.println("\n Balance cannot be Negative . ");	
	        }
	    }
	    continue;
	    case 3:
	    {
		  System.out.println("\n Saving Account Balance : "+saving_acc_bal);
	          System.out.print(" Amount you want to deposit from Saving Account : ");
		  double deposit_from_saving=s.nextInt();
		  saving_acc_bal = saving_acc_bal + deposit_from_saving;         //add deposit amount//
		  System.out.println("\n New Checking Account Balance : "+saving_acc_bal);
	    }
	    continue;
	    case 4:
	    {
		  System.out.println("\n Thank you for using this ATM , Bye ");
		  return 0;
	    }
	    default :
            {
		  System.out.println("\n Enter Valid Type Choice ");  
	    }		
	   }
	 }
	 case 3:
	 {
	      System.out.println("\n Thank you for using this ATM , Bye ");
	      return 0;
	 }
         default :
         {
	      System.out.println("\n Enter Valid Type Choice ");  
	 }			  			
       }	 
      }while(true);
    }
  }
class Atm
{
 public static void main(String arg[])
 {
	// do-while loop use for statement repetation//
    do{
	   Scanner s= new Scanner(System.in);
	   double x,y,customer_number,customer_pin;
	   x=801191032;           // 1 person ,customer number and pin already store //
	   y=123456;
	   System.out.println(" \n Welcome to ATM System! \n"); 
	   System.out.print(" Enter Your Customer Number : "); 
	   customer_number=s.nextDouble();      //Run time value enter//
           System.out.print(" Enter Your Pin Number : "); 
	   customer_pin=s.nextDouble();
	   Option q=new Option();     // object creation for option class//
	   // if statement cheak customer number and pin right or not// 
	    
	     if(x==customer_number && y==customer_pin)      
             {
	           q.input();              //input method calling//
             } 
	     else
             {
                   System.out.println("\n Wrong Customer Number and Pin Number! \n");		   
	     }
         } while(true); 
      }
   }











