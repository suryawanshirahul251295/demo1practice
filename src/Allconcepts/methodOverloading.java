package Allconcepts;

public class methodOverloading {
//     public static void main(String[] args) {
//		
//	
//	String name = " Rahul";
//      int rollno = 12;
//      char grade = 'A';
//      double percentage = 78.90;
//      long mobNo = 1234567890l;
//      String emailId = "abc123@gmail.com";
//    String batchname ="25juneEvening"; 
//	
//    String name1 = " Kiran";
//    int rollno1 = 10;
//    char grade1 = 'A';
//    double percentage1 = 80.90;
//    long mobNo1 = 9876543210l;
//    String emailId1= "xyz123@gmail.com";
//  String batchname1 ="25juneEvening"; 
//    System.out.println(name + " "+
//    		            rollno+" "+
//    		             grade+" "+
//    		             percentage+ " "+
//    		             mobNo+" "+
//    		             emailId+" "+
//    		             batchname);
//    System.out.println(name1 + " "+
//            rollno1+" "+
//             grade1+" "+
//             percentage1+ " "+
//             mobNo1+" "+
//             emailId1+" "+
//             batchname1);
    // ex.2 
//	String name;
//  int rollno  ;
//  char grade ;
//  double percentage ;
//  long mobNo ;
//  String emailId ;
//   static String batchname= "25juneEvening";
//
//    public methodOverloading() {
//       name = " Rahul";
//       rollno = 12;
//       grade = 'A';
//       percentage = 78.90;
//       mobNo = 1234567890l;
//       emailId = "abc123@gmail.com";
//       System.out.println(name + " "+
//	            rollno+" "+
//	             grade+" "+
//	             percentage+ " "+
//	             mobNo+" "+
//	             emailId+" "+
//	             batchname);
//       
//    }
//    public methodOverloading(int x) {
//    	name = " kiran";
//        rollno = 10;
//        grade = 'A';
//        percentage = 80.90;
//        mobNo = 9876543210l;
//        emailId = "xyz123@gmail.com";
//        System.out.println(name + " "+
// 	            rollno+" "+
// 	             grade+" "+
// 	             percentage+ " "+
// 	             mobNo+" "+
// 	             emailId+" "+
// 	             batchname);
//        
//    }
//    public static void main(String[] args) {
//    	methodOverloading rahul = new methodOverloading();
//    	methodOverloading kiran = new methodOverloading(1);
    	String name;
    	  int rollno  ;
    	  char grade ;
    	  double percentage ;
    	  long mobNo ;
    	  String emailId ;
    	   static String batchname= "25juneEvening";

    	    public methodOverloading() {
    	       name = " Rahul";
    	       rollno = 12;
    	       grade = 'A';
    	       percentage = 78.90;
    	       mobNo = 1234567890l;
    	       emailId = "abc123@gmail.com";
    	       
    	       
    	    }
    	    public methodOverloading(int x) {
    	    	name = " kiran";
    	        rollno = 10;
    	        grade = 'A';
    	        percentage = 80.90;
    	        mobNo = 9876543210l;
    	        emailId = "xyz123@gmail.com";
    	        
    	        
    	        
    	    }
    	    public methodOverloading(int x, int y) {
    	    	name = " kiran";
    	        rollno = 10;
    	        grade = 'A';
    	        percentage = 80.90;
    	        mobNo = 9876543210l;
    	        emailId = "xyz123@gmail.com";
    	    }  
    	    public void printstudentinfo() {
    	    	System.out.println(name + " "+
    		            rollno+" "+
    		             grade+" "+
    		             percentage+ " "+
    		             mobNo+" "+
    		             emailId+" "+
    		             batchname);
    	       
    	    }
    	    public static void main(String[] args) {
    	    	methodOverloading rahul = new methodOverloading();
    	    	
    	    	rahul.printstudentinfo();
    	    	
    	    	methodOverloading kiran = new methodOverloading(1);
    	    	
    	    	kiran.printstudentinfo();
    	    }
    	    
}