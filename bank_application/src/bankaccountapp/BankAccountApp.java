package bankaccountapp;

import java.util.Scanner;

public class BankAccountApp  {
 
    public static void main(String[] args) {
	
	    //System.out.println("\u001B[2J");
	    
		Checking chacc=new Checking("meenakshi","9876543210",5000);//
		String[] accountNum = {"12121212121","12345678900"};//accountNumber
	    String[] pin= {"1221"};//pin
		
	    System.out.println("\u001B[2J");
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO ONLINE BANKING");
	    System.out.println("WHAT DO YOU WANT TO DO?\n1.CREATE A SAVINGS ACCOUNT\n2.CREATE A CURRENT ACCOUNT\n3.DEPOSIT\n4.WITHDRAW\n5.TRANSFER\n6.SHOW BALANCE\n7.QUIT\nPLEASE ENTER THE NUMBER ACCORDINGLY");
		int a=sc.nextInt();
		
		switch(a) {
		
		    case 1:{
		    	
		    	System.out.println("ENTER YOUR NAME");
		    	String b=sc.next();
		    	System.out.println("ENTER YOUR 10 DIGIT PAN NUMBER");
		    	String c=sc.next();
		    		if(c.length()<10|c.length()>10) {
		    			System.out.println("INVALID PAN MUMBER");
		    		}
		    		else {
		    			System.out.println("ENTER YOUR INITIAL DEPOSIT(Minimum=Rs.1000)");
		    			int d=sc.nextInt();
		    			
		    			if(d<1000) {
		    				System.out.println("AMOUNT ENTERED NOT SUFFICIENT FOR TRANSACTION");
		    			}
		    			else 
		    				Checking.chacc =new Checking(b,c,d);
		    		}
			  break;
			 }

		case 2:
		    	
		    	System.out.println("ENTER YOUR NAME");
				String e=sc.next();
				System.out.println("ENTER YOUR 10 DIGIT PAN NUMBER");
				String f=sc.next();
				if(f.length()<10|f.length()>10) {
					System.out.println("INVALID PAN MUMBER");
				}
				else 
					System.out.println("ENTER YOUR INITIAL DEPOSIT(Minimum=Rs.1000)");
					int g=sc.nextInt();
					if(g<1000) {
						System.out.println("AMOUNT ENTERED NOT SUFFICIENT FOR TRANSACTION");
					}
					else	
						Savings.savacc =new Savings(e,f,g);
			    break;
		       
		case 3:
			
		    	System.out.println("ENTER YOUR 11 DIGIT ACCOUNT NUMBER");
		    	String h=sc.next();
		        boolean found= false;
		        for (int i = 0; i <accountNum.length; i++) {
		        	if(h.equals(accountNum[i])) {
		        		found = true; 
		        		break;
		        	}
		        }
		        if(found) {
		        	System.out.println("ENTER THE AMOUNT TO DEPOSIT");
		        	info(h);
		        	double j=sc.nextDouble();
		        	Account.deposit(j);
		        	break;
		        }
		        else {
		        	System.out.println("INVALID ACCOUNT NUMBER ENTERED");
		        }
		        System.out.println("INVALID ACCOUNT NUMBER ENTERED");
			   break;
		    
		case 4:
			
		       System.out.println("ENTER YOUR ACCOUNT NUMBER");
			   String z=sc.next();
			   System.out.println("ENTER YOUR 4 DIGIT PIN"); 
			   String k=sc.next();
			   boolean found1 = false;
			   for (int i = 0; i <pin.length; i++) {
				   if(k.equals(pin[i])) {
					   found1 = true; 
				       }
			   }
			   if(found1) {
				   System.out.println("ENTER THE AMOUNT TO WITHDRAW");
				   double l=sc.nextDouble();
				   info(k);
				   Account.withdraw(l);
				   }
			    else {
				   System.out.println("ACCOUNT NUMBER & PIN IS INCORRECT");
				}
				break;
				    	
	    case 5:
	    	
        	    System.out.println("ENTER YOUR ACCOUNT NUMBER\n");
			    String y=sc.next();
			    System.out.println("ENTER YOUR 4 DIGIT PIN"); 
			    String m=sc.next();
			    boolean found2 = false;
			    for (int i = 0; i <pin.length; i++) {
			    	if(m.equals(pin[i])) {
			    		found2 = true;
			    	}
			    }
			    if(found2){
			    	System.out.println("ENTER THE ACCOUNT NUMBER TO TRANSFER");
			        String n=sc.next();
			        boolean found3 = false;
				    for (int i = 0; i <accountNum.length; i++) {
				    	if(n.equals(accountNum[i])) {
				    		found3 = true; 
				    		}
				    }
			        if(found3){
			        System.out.println("ENTER THE AMOUNT TO TRANSFER");
			        double o=sc.nextDouble();
			        info(m);
			        Account.transfer(n,o);
			    }
			    else {
			    	System.out.println("PLEASE ENTER THE CORRECT ACCOUNT NUMBER");
			     }
			    }
			    break;
           
        case 6:
        	 
      	        System.out.println("ENTER YOUR ACCOUNT NUMBER\n");
			    String p=sc.next();
			    boolean found4= false;
			    for (int i = 0; i <accountNum.length; i++) {
			    	if(p.equals(accountNum[i])) {
			    		found4 = true; 
			    	}
			    }
			    if(found4) {
			    	Account.printBalance();
			    }
			    else {
			    	System.out.println("PLEASE ENTER THE CORRECT ACCOUNT NUMBER");
			    }
			    break;
			    	
         case 7:
        	    break;
        	   
		 default:
				System.out.println("INVALID OPTION ENTERED");
				break;
				
         }
	System.out.println("\nTHANK YOU FOR USING ONLINE BANKING SYSTEM");
}
           

            	   
				    
		
		
 

		
	

public static void info(String pin) {

	if((pin == "1221")) {
		Checking chacc=new Checking("nitte","9876543210",5000);
		
		
		
		}
	}
}
	
	




