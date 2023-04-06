import java.util.*;
public class a_Level_1_Getting_Started {

	public static void main(String[] args) {
		Scanner hemlo = new Scanner(System.in);
		
//<!----------------------------------Getting Started-----------------------------------------!>		

//#1                       PRINT OUTPUT
				System.out.println("*****");
				System.out.println("   *");
				System.out.println("  *");
				System.out.println(" *");
				System.out.println("*****");
//				             //#OR
//				System.out.println("*****\n   *\n  *\n *\n*****");

//#2                      MARKS CONDITIONS
//			  //System.out.println("Enter your marks");
//				int marks = hemlo.nextInt();
//			    if(marks>90) {
//			    	System.out.println("excellent");
//			    }else if(marks>80) {
//			    	System.out.println("good");
//			    }else if(marks>70) {
//			    	System.out.println("fair");
//			    }else if(marks>60) {
//			    	System.out.println("meets expectations");
//			    }else{
//			    	System.out.println("below par");
//			    }
			
//#3                     MCQ(Guess the output)
//			    int i = 10;
//			    if(i++ == i)
//			 	 System.out.println(i + " is good");     
//			    else
//			 	 System.out.println(i + " is bad");
//			                                           // ******Nice Question******
//			    int j = 20;
//			    if(++j == j)
//			 	 System.out.println(j + " is good");
//			    else
//			 	 System.out.println(j + " is bad");

//#4	                NEW CONCEPT (when we use int and string datatype consecutively)
//			   int n = Integer.parseInt(hemlo.nextLine());
//			   String name = hemlo.nextLine();                      // ****IMPORTANT QUESTION****** 
//			   System.out.println("dear " + name + " here is your counting");
//			   for (int i = 0; i<=n  ;i++) {
//				   System.out.println(i);
//			   }

//#5                        PRIME OR NOT PRIME
//	            System.out.println("total number");	
//				int t = hemlo.nextInt();
//				for (int i=1; i<=t; i++) {
//					System.out.println("number-"+ i);
//					int n = hemlo.nextInt();
//					int count = 0;
//					for (int p = 2;p*p<=n;p++ ) {         // this is  optimized code (same code done in loop sector)
//						if(n%p==0) {
//						 count++;
//						 break;
//						}
//					}
//					if (count==0) System.out.println("prime");
//					else System.out.println("not prime");
//				}
				
//#6                      PRIME NO. BETWEEN ANY TWO NUMBER
//				int low = hemlo.nextInt();
//				int high = hemlo.nextInt();
//				for (int i=low; i<=high; i++) {
//					int count = 0;
//					for (int p = 2; p*p<=i; p++) {
//						if(i%p==0) {
//							count++;
//							break;
//						}		
//					}if(count==0) {
//						System.out.println(i);
//				}
//			}

//#7                    FIBONACCI NUMBER                
//				int n = hemlo.nextInt();
//				int a = 0;
//				int b = 1;
//				System.out.print(a+","+b);
//				for (int i=1;i<=n-2;i++) {    
//					int c = a+b;
//					System.out.print(","+c);
//				     a=b;
//				     b=c;
//				}

//#8                    NUMBER OF DIGITS IN A NUMBER
//			  int number = hemlo.nextInt();
//			  int count = 0;
//			  while(number >0) {    
//				  number = number/10;           //until quotient become zero
//				 // System.out.println(number);
//				  count++;	        
//			  }System.out.println(count);
			  
//#9                       REVERSE OF NUMBER 
//				int number = hemlo.nextInt();   
//				while (number>0) {
//			    	int	last_digit = number%10;
//				    System.out.print(last_digit);
//				    number=number/10;
//				}

		//#10                     DIGITS OF A NUMBER
//			   int number = hemlo.nextInt();
//			   int count = 0;
//			   int temp = number;
//			   while(temp>0) {
//				   temp= temp/10;
//				   count++;  
//			   } 
//				for (int i=count; i>0;i--) {
//					int quotient = number/(int)Math.pow(10,i-1);
//					System.out.println(quotient);
//					number= number%(int)Math.pow(10,i-1);
//				}
				
		//#11                    INVERSE OF A NUMBER 
//				int number = hemlo.nextInt();
//				int count=0;
//				int inverse =0;
//				while(number>0) {
//					int remainder = number %10;
//					number= number/10;
//					count++;
//				    inverse = inverse + count* (int) Math.pow(10,remainder-1);
//				    System.out.println(inverse);
//				}System.out.println(inverse);
				
		//#12                    ROTATE A NUMBER (my)
//				int n = hemlo.nextInt();
//				int r = hemlo.nextInt();
//				
//				int temp = n;
//				int count =0;
//				while(temp>0) {
//					temp = temp /10 ;
//					count ++;
//					}
//				
//				r = r%count;
//				if (r<0) {
//					r = r +count;	
//					}
//				int remainder = n%(int) Math.pow(10, r);
//				int quotient = n/(int) Math.pow(10, r);
//				System.out.print(remainder);
//				System.out.println(quotient);
				
//		                       ROTATE A NUMBER (sir)
				
//				int n = hemlo.nextInt();
//				int r = hemlo.nextInt();
				
//				int temp = n;
//				int count =0;
//				while(temp>0) {
//					temp = temp /10 ;
//					count ++;
//				}	
//				r = r%count;
//				if (r<0) {
//					r = r +count;		
//				}
//		      int div = 1;
//		      int mt = 1;
//				for (int i=1 ; i <= count; i++) {
//					if (i<= r) {
//						div = div*10; 
//					}else {
//						mt = mt*10;
//					}
//				}
//				int quotient = n/div;
//				int remainder = n%div;
//				int rotated_number = remainder* mt + quotient ;
//				System.out.println(rotated_number);

		//#13	                      Greatest divisor And LCM
//				int num1 = hemlo.nextInt();
//				int num2 = hemlo.nextInt();
//				int a;
//				if(num1>num2) {
//					 a = num1/2;
//				}else {
//					 a = num2/2;
//				}
//				for (int i=a; i>=2; i--) {
//					if(num1%i==0 && num2%i==0) {
//						System.out.println("Greatest divisor of num1 and num 2 is " +i);
//						int LCM = (num1 * num2)/ i;
//						System.out.println("LCM of num1 and num2 is "+LCM);
//						break;
//					}
//				}

		//#14                       PRIME FACTORIZATION		
//			int n = hemlo.nextInt();
//			int i = 2;
//			while(n!=1) {
//				if (n%i==0) {
//					n=n/i;
//					System.out.println(i);
//				}else i++;
//			}
				
		//#15                       PYTHAGOREAN TRIPLET
//				int a = hemlo.nextInt();
//				int b = hemlo.nextInt();
//				int c = hemlo.nextInt();
//				int g;
//				if (a>b) {
//					if(a>c) {
//						 g=a;
//						 boolean value = ((a*a) == (b*b) + (c*c));
//			             System.out.println(value);
//					}else {
//						g=c;
//						boolean value = ((c*c) == (b*b) + (a*a));
//						System.out.println(value);
//					}
//				}else {
//					if (b>c) {
//						g=b;
//						boolean value = ((b*b) == (a*a) + (c*c));
//						System.out.println(value);
//					}else {
//						g=c;
//						boolean value = ((c*c) == (b*b) + (a*a));
//						System.out.println(value);
//					}
//				}
				
		//#16                     The Curious Case Of Benjamin Bulbs        
//				int n = hemlo.nextInt();
//				for (int i =1;i*i<=n;i++) {
//						System.out.println(i*i);
//					}		

	}

}
