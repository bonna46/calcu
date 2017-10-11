import java.util.Scanner;
public class Calculator extends subaddmuldiv  
{

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Caiculator: press 1 for add,2 for sub,3 for mul and 4 for div and other for angles: \n");
	      int cal=sc.nextInt();
	      if(cal==1)
	      {
	    	    System.out.println("Addition :\n");  
	      }
	      else if(cal==2)
	      {
	    	  System.out.println("Subtraction :\n");  
	      }
	      else if(cal==3)
	      {
	    	  System.out.println("Multiplicationtion :\n");  
	      }
	      
	      else if(cal==4)
	      {
	    	  System.out.println("Division :\n");  
	      }
	      
	      if(cal>=1 && cal<=4)
	      {
	    	  int cal1=sc.nextInt();
		      int cal2=sc.nextInt();
		      subaddmuldiv s=new subaddmuldiv();
		      s.subaddmuldiv(cal, cal1, cal2);
	      }
	     
	      else
	      {
	    	 
		      angle s=new angle();
		      s.angle(cal);
		    
	      }
	    	  
		// TODO Auto-generated method stub

	}

}

