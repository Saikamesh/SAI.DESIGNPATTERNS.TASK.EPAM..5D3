package EPAM.Design.Patterns.structural.Facade;
import java.util.Scanner;
public class Facade_main {
	 private static int  choice;  
	 static Scanner s=new Scanner(System.in);
	 public static void main(String args[])
	 {  
	        do{       
	            System.out.println("========= Mobile Shop ============ ");  
	            System.out.println("            1. IPHONE.             ");  
	            System.out.println("            2. SAMSUNG.            ");  
	            System.out.println("            3. OnePlus         ");  
	            System.out.println("            4. Exit.               ");  
	            System.out.println("Enter your choice: ");  
	            choice=s.nextInt();
	            shopkeeper sk=new shopkeeper(); 
	            switch (choice)
	            {  
	            case 1:  
	            sk.iphonesale();    
	                break;  
	            case 2:  
	            sk.samsungsale();        
	                break;    
	            case 3:  
	            sk.oneplussale();       
	                   break;     
	            default:  
	                System.out.println("Exiting Shop...");         
	           return;
	            }  
	      }while(choice!=4);  
	   }  
	}  

