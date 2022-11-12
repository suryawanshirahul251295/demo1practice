package userInputs;
import java.util.*;
public class TakeFromUser {
    public static void main(String[] args) {
		// acending order
    	Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int x []= new int [n];
		 int temp =0; 
		for (int i=0; i<x.length; i++) {
		       x[i] =sc.nextInt();
		}
		     for (int i=0; i<x.length; i++)
		{
			for (int j=i+1; j<x.length; j++  )
				
	       if (x[i]>x[j])
	       {
	    	   temp = x[i];
	    	   x[i]= x[j];
	    	   x[j]= temp;
	       }
	    	   System.out.println(x[i]);
		}
		    
		     // decending order
//    	Scanner sc = new Scanner(System.in); 
//    	int n = sc.nextInt();
//				
//				int x []= new int [n];
//				 int temp =0; 
//				for (int i=0; i<x.length; i++) {
//				       x[i] =sc.nextInt();
//				}
//				     for (int i=0; i<x.length; i++)
//				{
//					for (int j=i+1; j<x.length; j++  )
//						
//			       if (x[i]>x[j])
//			       {
//			    	   temp = x[i];
//			    	   x[i]= x[j];
//			    	   x[j]= temp;
//			       }
//			    	   System.out.println(x[i]);
//				}
 
			//	  for printing of second largest   
				//	     System.out.println(x[1]);
	     
				     
				     
				     // maximum number
//    	Scanner sc = new Scanner(System.in);
//    	int n = sc.nextInt();
//    	
//    	int a [] = new int [n];
//    	  
//    	int max = 1;
//    	 for (int i=0; i<a.length; i++) 
//    		    a[i] = sc.nextInt();
//    	 
//    	   for (int i= 0; i<a.length; i++)
//    	   {
//    		   if (a[i]>max)
//    		   {
//    			 
//    			   max = a[i];
//    		   }
//    	   }
//    			   System.out.println(max);
    	 // Duplicate no
//    	Scanner sc = new Scanner(System.in);
//    	      
//    	int n = sc.nextInt();
//    	int x [] = new int [n];
//    	       
//    	     
//    	        int temp = 0;
//    	       for (int i=0; i<x.length; i++) {
//    	    	       x[i]=sc.nextInt();
//    	       }   
//    	       for (int i=0; i<x.length; i++)
//    	       {
//    	    	   
//    	    	   for (int j=0; j<i; j++)
//    	    		  
//    	    		  if (x[i]==x[j])
//    	    		  {
//    	    			  temp = x[i];
//    	    		  }
//    	       }
//    	    	  System.out.println(temp);
    	  // even no's     
//    	    Scanner sc = new Scanner(System.in)	; 
//    	   int n = sc.nextInt();
//    	    int x [] = new int [n];
//    	    
//    	    for (int i=0; i<x.length; i++)	{	   
//    	    	x[i]= sc.nextInt();
//    	    }
//    	      for (int i=0; i<x.length; i++ )
//    	    if (x[i]%2==0)
//    	       {
//    	    	   System.out.println(x[i]);
//    	       }
    	   
//    	int x []= {3,7,3,6,5};
//    	int temp = 0;
//    	for (int i=0; i<x.length; i++)
//    	{
//    		for (int j=i+1; j<x.length; j++)
//    			
//    			if (x[i]==x[j])
//    			{
////    				temp = x[i];
////    				x[i]=x[j];
////    				x[j]=temp;
//    				
//    			}
//    		Sys1tem.out.println(x[i]);
//    	}
//    	//System.out.println(x[1]);
    	
//    	int [] x = {2,3,4,5,4};
//    	
//    	for (int i=0; i<x.length;i++)
//    	{
//    		for (int j=i+1; j<x.length; j++)
//    			if (x[i]==x[j])
//    			{
//    				System.out.println(x[i]);
//    			}
//    	}
    	
}
}
