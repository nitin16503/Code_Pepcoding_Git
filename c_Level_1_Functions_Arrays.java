//<<------------------------------------------------------------------------------------------------------->>
//		                            ##  ** FUNCTION **  ##
//<<------------------------------------------------------------------------------------------------------->>		
//                            
//1. Function will be created in Public class
//
//2.Why we need -: * code become modular. 
//                 * maintainability.
//                 * To make code DRY(don't repeat yourself). 
//
//3. **Memory Map** -: https://youtu.be/tXbgyBCLteM?list=TLGG2EscvbbDkegxMDAxMjAyMg&t=687
//
//4. Function having no return value "VOID" is used.
//
//
import java .util.*;
public class c_Level_1_Functions_Arrays {
		
//#1	                      Square of x 
	public static int F(int x) {        
		int x_square = x*x;              // function ==> f(x)= x^2;
		return x_square;
	}


//#2
//                      Function for factorial 	
	public static int factorial(int k) {
		
		int q=1;
		for (int i=1; i<=k; i++) {
			q=q*i;
		}
		return q;
	}
//                     Function for output	
	public static void display(int n , int r,int permutation_value) {
		System.out.println(n +" P " + r + " = " + permutation_value);
	}

	
//#3                  Digital frequency	
	public static int digit_frequency(int n, int m) {
		int count=0;
		while(n>0) {
			int check = n%10;
			n=n/10;
			if(check==m) {
			    count++; 
			}
		}return count;
	}
	
	
//#4                 Decimal TO Any Base
	public static int decimal_to_any_base(int n, int b ) {
		int count=0;
		int number =0;
		int original_no = 0;
		while(n>0) {
			number=n%b;
			n=n	/b;
			original_no = (int) ((number* Math.pow(10, count)) + original_no);
			count++;
		}return original_no;
	}

	
//#5                  Any Base To Decimal
	public static int Any_Base_To_Decimal(int n, int b) {
		int original_no=0;
		int p=1;
		while(n>0) {
			int no = n%10;
			n=n/10;
			original_no= original_no + no*p ;
			p= p*b;
		}
			return original_no;
		}
	
	
//#6                  Addition_Of_Any_Two_Base  
	public static int  Addition_Of_Any_Two_Base(int b, int n1,int n2) {
		int value = 0;
		int p=1;
		int carry=0;
		while(n1>0 || n2>0 || carry>0 ) {
			int no1 = n1%10;
			n1=n1/10;
			int no2 = n2%10;
			n2 = n2/10;
			int digit_sum= no1 + no2 + carry;
		    carry = digit_sum/b;
			//if(normal_sum>b-1) {
				int sum = digit_sum%b;
			    value +=  sum*p;
		//	}else value += normal_sum*p;              
			p=p*10;
		}
		return value;
	}
	
	
//#7                  Subtraction_Of_Any_Two_Base  
	public static int Subtraction_Of_Any_Two_Base(int b, int n1, int n2) {
		int value = 0;
		int p=1;
		int carry=0;
		while(n2>0) {
			int no1= n1%10;
			n1= n1/10;
			int no2 =n2%10;
			n2= n2/10;
			no2 = no2 +carry;
			int normal_sub= no2-no1;
			if (normal_sub<0) {
				carry= -1;
				no2+=b;
				normal_sub = no2 -no1;
				value= value + normal_sub*p;
			}else  {
				value =value+ normal_sub*p; 
				carry = 0;
			}
			p=p*10;
		}
		return value;
	}
	
 
//#8                  Any_Base_Multiplication	
	public static int Any_Base_Multiplication(int b, int n1, int n2) {
		int rv=0;
		int p_rv =1;
		while(n2>0) {
			int no2=n2%10;
			n2=n2/10;
			int sprd = getProductWithSingleDigit(b,n1,no2);
			rv = Addition_Of_Any_Two_Base(b,rv,sprd*p_rv);
			p_rv=p_rv*10;
		}
		return rv;
	}
	public static int getProductWithSingleDigit(int b, int n1,int no2 ) {
		int value= 0;
		int carry = 0;
		int p=1;
		while(n1>0 || carry>0) {
			int no1 = n1%10;
			n1=n1/10;
			int normal_value= (no2 * no1)+ carry;
			carry = normal_value/b;
			value= value + (normal_value%b)*p;
			p=p*10;
		}return value;
		
	}
	

//----------------------------------------------------------------------------------------------------------------	
	
//                      Reverse of an Array
public static void reverse(int[] arr,int first , int last) {
	 int i= first;
	 int j = last ;
	 while(i<j) {
		 int temp = arr[i];
		 arr[i] = arr[j];
		 arr[j] = temp;
		 i++;
		 j--;
	 }
}
//                      Rotate an Array
public static void rotate(int[] arr, int times ) {
	
	// simplifying times 
	int m = times;
	m= m%arr.length;
	 if (m<0) {
		 m=m+arr.length;
	 }
	// 1st part
	reverse(arr,0,arr.length -1-m);
	//2nd part 
	reverse(arr,arr.length-m,arr.length-1);
	// full part
	reverse(arr,0,arr.length-1);
}
//                    Display an Array 
public static void display(int[] arr) {
	for(int val : arr) {
		 System.out.println(val);
	 }
}
//                    Inverse of an Array
public static int[] inverse(int[] x) {
	int[] arr = new int[x.length];
	for(int i=0 ; i<x.length; i++) {
		int temp = x[i];
		arr[temp] = i;
	}
	return arr;
}

	
//-------------------------------^^^^ P u b l i c   c l a s s ^^^^^-----------------------------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------M a i n   c l a s s  ----------------------------------------------------------------------------------------------------
 	
	
	public static void main(String[] args) {
		 Scanner hemlo = new Scanner(System.in);
                  
// //1                               Square of x   
//         int x= hemlo.nextInt();        
//         System.out.println( F(x));
//
//        
////2                                 Permutation
//      int n= hemlo.nextInt();
//      int r= hemlo.nextInt();
//      
//      int n_ = factorial(n); 
//      int r_ = factorial(n-r);  
//      
//      int permutation_value = n_/r_;
//      display(n,r,permutation_value);
//         
//         
////3                                Digital frequency         
//         int p = hemlo.nextInt();
//         int q = hemlo.nextInt();
//         System.out.println(digit_frequency(p,q));
//		 
//		 
////4                               Decimal_to_any_base
//		 int n = hemlo.nextInt();
//		 int b = hemlo.nextInt();		 
//		 System.out.println( decimal_to_any_base(n, b)  );
//	
//		 
////5                              Any_Base_To_Decimal
//		 int n = hemlo.nextInt();
//		 int b = hemlo.nextInt();		 
//		 System.out.println(Any_Base_To_Decimal(n, b)  );
//		 
//		 
//6                       Addition_Of_Any_Two_Base                
//		 int b = hemlo.nextInt();
//		 int n1 = hemlo.nextInt();
//		 int n2 = hemlo.nextInt();
//		 System.out.println(Addition_Of_Any_Two_Base(b,n1,n2));
//		 
//		 
////7                       Subtraction_Of_Any_Two_Base 
//		 System.out.println("Enter base");
//		 int b = hemlo.nextInt();
//		 System.out.println("Enter Smaller no.");
//		 int n1 = hemlo.nextInt();
//		 System.out.println("Enter greatest no.");
//		 int n2 = hemlo.nextInt();
//    	 System.out.println(Subtraction_Of_Any_Two_Base(b,n1,n2));
		
		 
////8                     Any_Base_Multiplication
//		 System.out.println("Enter base");
//		 int b = hemlo.nextInt();
//		 System.out.println("Enter no.1");
//		 int n1 = hemlo.nextInt();
//		 System.out.println("Enter  no.2");
//		 int n2 = hemlo.nextInt();
//    	 System.out.println(Any_Base_Multiplication(b,n1,n2));

		 
		 
		 
		 
		 
//<<---------------------------------------------------------------------------------------------------------------------------------------		 
//	                             ##  ** ARRAYS **  ##
//<<----------------------------------------------------------------------------------------------------------------------------------	
		 
////#                                   Declaration of Array	 
//		int[] array_name ;
//		
////#                                  Assigning size of array		
//	    array_name = new int[5];    // by default all values will be zero.
//		 
////#                               Declaration & Assigning size to array
//		int [] arr = new int[5] ;
//		 
////#                               Assigning value to array	
//		arr[0]= 1;
//		arr[1]= 2;
//		arr[2]= 3;
//		arr[3]= 4;
//		arr[4]= 5;		
//		
////#                             Finding length of Array
//		int l = arr.length;
//		System.out.println(l);
//		
////#                       Printing all value of Array
//		for (int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
////# **Memory Management** --> https://youtu.be/QolHb2UaFJc?list=TLGGJRgcQGVP8_MyMjAxMjAyMg
//	
//		
		 
//#1                                  Span Of Array
//		System.out.println("write no. of element");
//		int n = hemlo.nextInt();
//
//		int[] user = new int[n];
//		for(int i=0; i<n; i++) {
//			user[i] = hemlo.nextInt();
//		}
//		
//		int  greatest = user[0];
//		int smallest = user[0];
//		
//		for(int i=0; i<n; i++) {
//			if(greatest<user[i]) {
//		      greatest = user[i];
//		   }
//			if(smallest >user[i]) {
//			    smallest= user[i];
//			    }
//		}
//		int span = greatest - smallest ;
//	   System.out.println("span -> " + span );
		
		
//#2                                Find Element In An Array		
//		System.out.println("write no. of element in array");
//		int n = hemlo.nextInt();
//		int[] arr = new int[n]; 
//		for(int i =0; i<n; i++) {
//			System.out.println("write " + i + "element" );
//			arr[i] = hemlo.nextInt();
//		}
//		
//		System.out.println("write no. to check");
//		int d = hemlo.nextInt();
//		int count =0;
//		for(int i=0; i<n; i++) {
//			if(d==arr[i]) {
//				System.out.println(i);
//              break;
//			}else {
//				count++;
//			}
//		}if(count== n) {
//			System.out.println("-1");
//		}
		
		
//#3	                                 B a r   C h a r t  	
//		System.out.println("write no. of element in array");
//	   	int n = hemlo.nextInt();
//		int[] arr = new int[n]; 
//		for(int i =0; i<n; i++) {
//			arr[i] = hemlo.nextInt();
//		}
//    	int greatest = arr[0];
//		for (int i =0; i<n; i++) {
//			if(greatest <arr[i]) {
//				greatest = arr[i];
//			}
//		}
//		
//		for(int floor=greatest; floor>=1; floor--) {
//			for(int j=0; j<n; j++) {
//				if(floor<=arr[j]) {
//					System.out.print(arr[j] +" ");
//				}else {
//					System.out.print("  ");
//				}
//			}System.out.println();
//		}

		
//#4  		                       Sum Of Two Arrays
     
//		 System.out.println("write no. of element in 1st array");
//		 int n = hemlo.nextInt();
//		 int[] a1 = new int[n];
//		 System.out.println("enter the elements");
//		 for (int i =0; i<n; i++) {
//			 a1[i] = hemlo.nextInt();
//		 }
//		
//		 System.out.println("write no. of element in 2nd array");
//		 int m = hemlo.nextInt();
//		 int[] a2 = new int[m];
//		 System.out.println("enter the elements");
//		 for (int i =0; i<m; i++) {
//			 a2[i] = hemlo.nextInt();
//		 }
//		
//		int[] sum = new int[n>m?n:m];
//		
//		int i = a1.length -1;
//		int j = a2.length -1;
//		int k = sum.length -1;
//		int carry = 0;
//		int total = 0;
//		
//	    while(k>=0) {
//	    	total+= carry;
//	    	
//	    	if(i>=0) {
//	    		total+= a1[i];
//	    	}
//	    	if(j>=0) {
//	    		total+=a2[j];
//	    	}
//	    	carry = total/10;
//	    	total = total%10;
//	    	sum[k] = total; 
//	    	i--;
//	    	j--;
//	    	k--;
//	    }
//	    if(carry!=0) {
//	    	System.out.println(carry);
//	    }
//	    for(int val:sum) {
//	    	System.out.println(val);
//	    }
		

//#5                                Difference Of Two Arrays		 
//		 System.out.println("write no. of element in 1st array");
//		 int n = hemlo.nextInt();
//		 int[] a1 = new int[n];
//		 System.out.println("write element");
//		 for(int i =0; i<n; i++) {
//			 a1[i] = hemlo.nextInt();
//		 }
//		 
//		 System.out.println("write no. of element in 2nd array");
//		 int m = hemlo.nextInt();
//		 int[] a2 = new int[m];
//		 System.out.println("enter the elements");
//		 for (int i =0; i<m; i++) {
//			 a2[i] = hemlo.nextInt();
//		 }
//		 
//		 int[] sub = new int[m];
//		 
//		 int i= n-1;
//		 int j= m-1;
//		 int k= m-1;
//		 int carry =0;
////	 int total = 0;
//		 
//		 while(k>=0) {
//			 a2[j] += carry;
//			 int a1v = i>=0?a1[i]:0;
//			 
//			if(a2[j]<a1v){
//				a2[j]= a2[j]+10;
//				carry= -1;
//				sub[k]= a2[j] - a1v;
//			}else {
//				sub[j]= a2[j] - a1v;
//				carry = 0;
//			} 
//			
//			i--;
//			j--;
//			k--;
//		 }
//		 k=0;
//		 while(k<sub.length) {
//			 if(sub[k]==0) {
//				 k++;
//			 }else break;
//		 }
////      ***here value of k is no more zero, it is changed in upper loop.***	 
//		 while(k<sub.length) {
//			 System.out.println(sub[k]);
//			 k++;
//		 }
		 
		 
//#6                      Reverse An Array
//		 System.out.println("write no. of element in an array");
//		 int n = hemlo.nextInt();
//		 int[] ar;
//		 ar = new int[n];
//		 for (int i=0; i<ar.length; i++) {
//			 ar[i] = hemlo.nextInt();
//		 }
//       int temp =0;
//		 int ith = 0;
//		 int jth = ar.length-1;
//		 while(ith<jth) {
//			 temp = ar[ith];
//			 ar[ith] = ar[jth];
//			 ar[jth] = temp;
//			 ith++;
//			 jth--;
//		 }
//		 for(int val:ar) {
//			 System.out.println(val);
//		 }
	
		 
///------------  ## **Now we put all array in function** ##---------------------------------------------------------		 

		 
////#7                    Rotation of an Array
//		 System.out.println("enter no. of element in an array");
//		 int n = hemlo.nextInt();
//		 int[] arr = new int[n];
//		 for (int i=0; i<arr.length ; i++) {
//			 arr[i] = hemlo.nextInt();
//			 System.out.println();
//		 }
//		 System.out.println("enter no. of times rotation");
//		 int m = hemlo.nextInt();
//		 
//		 rotate(arr,m);
//		 display(arr);
		 
		 
////#8                 Inverse of an  Array		 
//		 System.out.println("enter no. of element in an array");
//		 int n = hemlo.nextInt();
//		 int[] x = new int[n];
//		 for (int i=0; i<x.length ; i++) {
//			 x[i] = hemlo.nextInt();
//			 System.out.println();
//		 }
//		 display(inverse(x));
		 
		 
////#9                SubArray of an Array
//		 System.out.println("enter no. of element in an array");
//		 int n = hemlo.nextInt();
//		 int[] arr = new int[n];
//		 for (int i=0; i<arr.length ; i++) {
//			 arr[i] = hemlo.nextInt();
//			 System.out.println();
//		 }
//		 
//		 for (int i =0; i<arr.length; i++) {
//			 for(int j=i; j<arr.length; j++) {
//				 for(int k=i;k<=j;k++) {
//					 System.out.print(arr[k]+ " ");
//				 }System.out.println();
//			 }
//			
//		 }
		 
		 
////#10       		    Binary Search
//		 int[] arr = {10,20,30,40,50,60,70,80,90,100}; // it should be sorted array
//		 int data = 30;
//		 int l = 0;
//		 int h = arr.length -1;
//		 while(l<=h) {
//			 int m = (l+h)/2;
//			 if(data>arr[m]) {
//				 l= m+1;
//			 }else if(data<arr[m]) {
//				 h= m-1;
//			 }else {
//				 System.out.println(m);
//				 return;
//			 }
//		 }System.out.println("-1");

		 
////#11            		 First Index And Last Index
//		 System.out.println("enter no. of element in an array");
//		 int n = hemlo.nextInt();
//		 int[] arr = new int[n];
//		 for(int i=0; i<arr.length;i++) {
//			 arr[i] = hemlo.nextInt();
//		 }
//		 System.out.println("write the data");
//		 int data = hemlo.nextInt();
//		
//		 int l = 0;
//		 int h = arr.length -1;
//		 int first_index = 0;
//		 
//		 while(l<=h) {
//			 int m = (l+h)/2;
//			 if(data<arr[m]) {
//				 h = m-1;
//			 }else if(data>arr[m]) {
//				 l =m+1;
//			 }else{
//				 first_index=m;
//				 h=m-1;
//			 }
//		 }System.out.println(first_index);
//		 
//		  l = 0;
//		  h = arr.length -1;
//		 int last_index = 0;
//		 
//		 while(l<=h) {
//			 int m = (l+h)/2;
//			 if(data<arr[m]) {
//				 h = m-1;
//			 }else if(data>arr[m]) {
//				 l =m+1;
//			 }else{
//				 last_index=m;
//				 l=m+1;
//			 }
//		 }System.out.println(last_index);
		 

//# 12                      Ceil and Floor   		 
//		 int n = hemlo.nextInt();
//		 int [] arr = new int [n]; // array should be in sorted form
//		 for(int i=0; i<arr.length; i++) {
//			 arr[i]= hemlo.nextInt();
//		 }
//		 int data = hemlo.nextInt();
//		 
//		 int low = 0;
//		 int high = arr.length-1;
//		 int ceil = 0;
//		 int floor  = 0;
//		  while(low<=high) {
//			  int mid = (low+high)/2;
//			  if(data<arr[mid]) {
//				  high = mid - 1;
//				  ceil = arr[mid];
//			  }else if (data>arr[mid]) {
//				  low = mid +1;
//				  floor = arr[mid];
//			  }else {
//				  ceil =arr[mid];
//				  floor =arr[mid];
//				  break;
//			  }	  
//		  }
//		  System.out.println(ceil);
//		  System.out.println(floor);
		 
		 
		 
		 
		 
		
		
		
		
		
		 
		 
		 
	 
		
		}         
	}


