import java.util.*;
public class b_Level_1_Pattern {

	public static void main(String[] args) {
		
		Scanner hemlo = new Scanner(System.in);
				
//<<--------------------------------------------------------------------------------------------------------->>
//		                            ##  PATTERNS  ##
//<<--------------------------------------------------------------------------------------------------------->>
		
		
//#17	                 STAR RIGHT ANGLE TRIANGLE 	
//		int n = hemlo.nextInt();
//		for (int i= 1;i<=n; i++) {
//			for (int j= 1; j<= i; j++) {
//				System.out.print("* ");
//			}System.out.println();
//		}                
		                 
//#18                    STAR RIGHT ANGLE TRIANGLE(inverse)  
//		int n = hemlo.nextInt();
//		for (int i= n;i>=1; i--) {
//			for (int j= 1; j<= i; j++) {
//				System.out.print("* ");
//			}System.out.println();
//		}                
		                 
//#19                   STAR Right Angle 		           
//		int n = hemlo.nextInt();                          //         i -*  2*space
//		for (int i=1;i<=n;i++) {                         //     -*   1  1   3 = n-i
//			//space                                      //   -*-*   2  2   2
//			for (int j=1; j<=n-i;j++ ) {                //  -*-*-*   3  3   1
//				System.out.print("  ");                 //-*-*-*-*   4  4   0
//			}
//			//stars
//			for(int k=1; k<i;k++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
	
//#20                        STAR                  //* * * * *
//		int n= hemlo.nextInt();                    //  * * * * 
//		int space=0;                               //    * * *
//		int star =n;                               //      * *
//		for (int i=1; i<=n; i++) {                 //        *
//			for(int j=1; j<=space;j++) {
//				System.out.print("  ");
//			}
//			for(int k= 1; k<=star;k++) {
//				System.out.print("* ");
//			}
//			space++;
//			star--;
//			System.out.println();
//		}
			
//#21                  STAR (DIMAOND SHAPE)                       //    * 
//		int n = hemlo.nextInt();                                  //  * * * 
//		int space= n/2;     //space-> "--"                        //* * * * * 
//		int star=1;         //star-> "*-"                         //  * * *
//		for (int i = 1; i<=n;i++) {                               //    * 
//			for(int j=1;j<=space;j++) {
//				System.out.print("  ");
//			}
//			for(int k=1; k<=star;k++) {
//				System.out.print("* ");
//			}
//			if(i<=n/2) {
//				space--;
//				star= star+2;
//			}else {
//				space++;
//				star=star-2;
//			}
//             System.out.println(); 
//		}
		
//#21                    STAR		                         //* *   * *
//		int n=hemlo.nextInt();                               //*       *
//		int star=n+1;                                        //* *   * *
//		int space=1;
//		for(int i=1; i<=n;i++) {
//			//System.out.print(space+" "+star);
//			for (int j=1;j<=star/2;j++) {
//				
//				System.out.print("* ");
//			}
//			for(int k=1;k<=space;k++) {
//				System.out.print("  ");
//			}
//			for(int l=star/2+1;l<=star;l++) {
//				System.out.print("* ");
//			}
//			if(i<=n/2) {
//				star-=2;
//				space+=2;
//			}else {
//				star+=2;
//				space-=2;
//			}
//			System.out.println();
//		}
		
//#22	               STAR
//		int n=hemlo.nextInt();                      //*
// 		for(int i=1;i<=n;i++) {                     // *
//			for(int j=0;j<i-1;j++) {                //  *
//				System.out.print(" ");              //   *
//			}System.out.print("*");                 //    *
//			System.out.println();
//		}
	
//#23                                        //   *
//		int n= hemlo.nextInt();              //  *
//		int space=n-1;                       // *
//		int star=1;                          //*
//		for(int i =1;i<=n;i++) {
//			for(int j=1;j<=space;j++) {
//				System.out.print(" ");
//			}
//             System.out.print("*");
//			space--;
//			System.out.println();
//		}
		
//#24     
//		*       * 
//		  *   *   
//		    *     
//		  *   *   
//		*       * 
//		int n= hemlo.nextInt();                        //        ****N_O_T_E****
//		for(int i =1; i<=n; i++) {                    //         diagonal = i-j
//			for(int j=1; j<=n; j++) {                //   middle element  = i+
//				if(i-j==0 || i+j==n+1) {            //
//					System.out.print("* ");
//				}else System.out.print("  ");
//			}System.out.println();
//		}

//#25		
//	      * 
//	    *   * 
//	  *       * 
//	    *   * 
//	      * 
//		int n= hemlo.nextInt();
//		int os = n/2;  // outer space
//		int star=2; 
//      int is=-1;       // innner space
//		for (int i=1;i<=n;i++) {
//			for(int j =1;j<=os;j++) {
//				System.out.print("  ");
//			}
//			System.out.print("* ");
//			for(int k=1;k<=is;k++) {
//				System.out.print("  ");
//			}
//			if(i>1&&i<n) {
//				System.out.print("* ");
//			}
//			if(i<=n/2) {
//				os--;
//				is+=2;
//			}else {
//				os++;
//				is-=2;
//			}
//			System.out.println();
//		}
		
//#26
//		1	
//		2	3	
//		4	5	6	
//		7	8	9	10	
//		11	12	13	14	15
//	 int n= hemlo.nextInt();
//	 int num=0;
//	 for(int i=1;i<=n;i++) {
//		 for(int j=1; j<=i;j++) {
//			 num++;
//			 System.out.print(num+" ");
//		 }System.out.println();
//	 }
		
//#27                     Pattern 12    
//		int n=hemlo.nextInt();
//		int a =0;
//		int b=1;
//		for (int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(a+" ");
//				int c=a+b;
//				a=b;
//				b=c;
//			}System.out.println();
//		}

//#28  NEXT CLASS OF PEPCODING  // Pattern 13
//		int n= hemlo.nextInt();
//		for (int i =0;i<n;i++) {                    // *****formula used***** 
//			int icj=1;                             //         iCj x (i-j)
//			for (int j=0;j<=i;j++) {              // iCj1 = -----------------
//				System.out.print(icj+" ");       //            j + 1 
//				int icjp1= (icj)*(i-j)/(j + 1);
//				icj=icjp1;
//			}System.out.println();
//		}
		 
// #28            Pattern 14		
//		    int p = hemlo.nextInt();
//			for (int i=1; i<=p; i++) {
//				int n= i*p;
//				System.out.println( p +" * " + i + " = " + n);
//			}
		
//#29              Pattern 15        	
//		int n = hemlo.nextInt();
//		int space = n/2;
//		int star = 1;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=space;j++) {
//				System.out.print("  ");
//			}int column =i;
//			if (i>(n+1)/2) {
//				column=n-i+1;
//			}
//			for(int k =1; k<=star;k++) {
//				System.out.print(column +" ");
//				if(k<=star/2) {
//					column++;
//				}else {
//					column--;
//				}
//			}
//			if(i<=n/2) {
//				space--;
//				star+=2;
//			}else {
//				space++;
//				star-=2;
//			}System.out.println();
//		}
			
//#30               Pattern 16
//		int n = hemlo.nextInt();
//		int space=2*n-3;
//		int star = 2;
//		
//		for(int i=1;i<n;i++) {
//			int number=1;
//			int number2=0;
//			for(int j=1; j<=star/2;j++) {
//				System.out.print(number +" ");
//				number2=number;
//				number++;
//			}for(int k=1; k<=space;k++) {
//				System.out.print("  ");
//			}for(int j=1; j<=star/2;j++) {
//				System.out.print(number2 +" ");
//				number2--;
//				}
//			System.out.println();
//			space-=2;
//			star+=2;
//		}
//		for(int i=1;i<=n;i++) {
//			System.out.print(i+ " ");
//		}for(int i=n-1;i>0;i--) {
//			System.out.print(i+ " ");
//		}

//#31                  Pattern 17	
//		int n= hemlo.nextInt();
//		int space = n/2;
//		int space2=space;
//		int star = 1;
//		int star2=0;
//		for(int i=1; i<=n; i++) {  
//			
//			for(int j=1; j<=space;j++) {
//				if(i==n/2+1) {
//					System.out.print("* ");
//				}else {
//				System.out.print("  ");
//				}
//			}for(int k=1; k<=star; k++) {
//				System.out.print("* ");
//			}
//			if(i<=n/2) {
//				star++;	
//			}else {
//				star--;
//			}
//			System.out.println();  
//		}
		
//#                     Patter 18
//		int n= hemlo.nextInt();
//		int star = n;
//		int space=0;
//		for (int i=1;i<=n;i++) {
//			for(int j=1; j<=space;j++) {
//				System.out.print("  ");
//			}for (int k=1; k<=star; k++) {
//				if(i>1 && i<=n/2 && k>1 && k<star) {
//					System.out.print("  ");	
//				}
//				else System.out.print("* ");
//			}if(i<=n/2) {
//				space+=1;
//				star-=2;
//			}else {
//				space-=1;
//				star+=2;
//			}
//			System.out.println();
//		}

//#                  PATTERN 19
//       int n = hemlo.nextInt();
//       for(int i=1; i<=n; i++) {
//    	   for(int j=1;j<=n;j++) {
//    		   if((i==n/2+1 || j==n/2+1) || (j==n && i<=n/2) || (j==1 && i>n/2) || (i==1 && j<=n/2) || (i==n && j>n/2 ) ) {
//    			   System.out.print("* "); 
//    		   }else System.out.print("  ");
//    		     } 
//    	   System.out.println();
//       }
//		                              **OR**
		
//	       int n = hemlo.nextInt();
//	       for(int i=1; i<=n; i++) {
//	    	   for(int j=1;j<=n;j++) {
//	    		   if((i==n/2+1 || j==n/2+1)  ) {
//	    			   System.out.print("* "); 
//	    		   } else if ((j==n && i<=n/2)) {
//	    			   System.out.print("* ");
//	    		   }else if ((j==1 && i>n/2)) {
//	    			   System.out.print("* ");
//	    		   }else if ((i==1 && j<=n/2)) {
//	    			   System.out.print("* ");
//	    		   }else if ((i==n && j>n/2 )) {
//	    			   System.out.print("* ");
//	    		   }
//	    		   else System.out.print("  ");
//	    		     } 
//	    	   System.out.println();
//	       }
	
		
//                 Pattern 20
//		 int n = hemlo.nextInt();
//	       for(int i=1; i<=n; i++) {
//	    	   for(int j=1;j<=n;j++) {
//	    		   if(j==1|| j==n) {
//	    			   System.out.print("* ");
//	    		   }
//	    		   else if(i+j==n+1 && i>=n/2+1) {
//    		  		   System.out.print("* ");
//    		  	   }
//	    		   else if (i-j==0 && i>=n/2+1) {
//    		  		   System.out.print("* ");
//    		  	   }
//	    		   else System.out.print("  ");
//	    	   }System.out.println();
//	       }
//		
//#                  Pattern "M"		
//        int n = hemlo.nextInt();
//        for (int i=1; i<=n; i++) {
//        	for (int j=1; j<=n; j++) {
//        		if(j==1 || j==n) {
//        			System.out.print("* ");
//        		}else if ((i+j==n+1 || i==j) && i<=n/2+1 ) {
//        			System.out.print("* ");
//        		}
//        		else System.out.print("  ");
//        	}System.out.println();
//        }
//		
// #                 Pattern Inverted Hour Glass
//	   int n = hemlo.nextInt();
//       for (int i=1; i<=n; i++) {
//       	for (int j=1; j<=n; j++) {
//       		 if (i+j==n+1 || i==j || i==n || i==1 ) {
//       			System.out.print("* ");
//       		}else if  (j-i>0 && j+i<n+1  && i<=n/2) {
//       			System.out.print("* ");
//
//       		}
//       		else System.out.print("  ");
//       	}System.out.println();
//       }
		
		
//<<------------------------------------------------------------------------------------------------------->>
//		                         ##  FUNCTION & ARRAYS  ##
//<<------------------------------------------------------------------------------------------------------->>		

		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
	}

	}
