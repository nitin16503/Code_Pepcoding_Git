import java.util.Scanner;

public class g_recusion_in_array {
	
//#	       Display Array Elements using Recursion	
	public static void displayArr(int[] arr, int idx) {
		if(idx<0) {
			return;
		}
		displayArr(arr,idx-1);
		System.out.println(arr[idx]);
	}

//#           Display Array in Reverse	
	public static void displayArrReverse(int[] arr, int idx) {
		if(idx<0) {
			return;
		}
		System.out.println(arr[idx]);
		displayArrReverse(arr,idx-1);
	}

//#	        Maximum of an Array
	public static int maxOfArray(int[] arr,int idx) {
		if(idx==arr.length-1){
			return arr[arr.length-1]; 
		}
		int n= maxOfArray(arr,idx+1);
		int result= n>arr[idx]?n:arr[idx];
		return result;
	}
 
//#        First Index of occurrence	
	public static int firstIndex(int[] arr, int idx ,int x) {
		if(idx==arr.length) {
			return -1;
		}
		if(arr[idx]==x) {
			return idx;
		}else {
			int n = firstIndex(arr,idx+1,x);
			return n;
		}
	}
	
//#          Last Index
	public static int LastIndex(int[] arr, int idx ,int x) {
		if(idx==arr.length) {
			return -1;
		}
		int sa = LastIndex(arr,idx+1,x);
		if(sa ==-1) {
			if(arr[idx]==x) {
				return idx;
			}else {
				return -1;
			}
		}else {
			return sa;
		}
		
	}
	
//#                 All Indices in Array	
	public static int[] AllIndex(int[] arr, int x ,int idx, int fsf) {
		if(idx==arr.length) {
			return new int[fsf];
		}
		if(arr[idx] ==x) {
			int[] iarr = AllIndex(arr,x,idx+1,fsf+1);
			iarr[fsf] = idx;
			return iarr;
		}else {
			int[] iarr = AllIndex(arr,x,idx+1,fsf);
			return iarr;
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner hemlo = new Scanner(System.in);
		
		
//# 1            Display Array Elements using Recursion	
//		System.out.println("enter no. of element in an array");
//		int n = hemlo.nextInt();
//		int[] arr = new int[n];
//		System.out.println("enter an array");
//		for(int i=0;  i<arr.length; i++) {
//			arr[i] = hemlo.nextInt();
//		}
//		
//		displayArr(arr,arr.length-1);
		
		
//# 2             Display Array in Reverse
//		System.out.println("enter no. of element");
//		int n = hemlo.nextInt();
//		int[] arr = new int[n];
//		System.out.println("enter an array");
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = hemlo.nextInt();
//		}
//        displayArrReverse(arr,arr.length-1);

		
//#3            Maximum of an Array        
//		System.out.println("enter no. of element");
//		int n = hemlo.nextInt();
//		int[] arr = new int[n];
//		System.out.println("enter an array");
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = hemlo.nextInt();
//		}
//		 System.out.println(maxOfArray(arr,0));
		
		
//#4          First Index of occurrence
//		System.out.println("enter no. of element");
//		int n = hemlo.nextInt();
//		int[] arr = new int[n];
//		System.out.println("enter an array");
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = hemlo.nextInt();
//		}
//		System.out.println("enter the no. u want to find");
//		int x = hemlo.nextInt();
//		System.out.println(firstIndex(arr,0,x));
		
		
//#5          Last Index Of Occurrence
//		System.out.println("enter no. of element");
//		int n = hemlo.nextInt();
//		int[] arr = new int[n];	
//		System.out.println("enter an array");
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = hemlo.nextInt();
//		}
//		System.out.println("enter the no. u want to find");
//		int x = hemlo.nextInt();
//		System.out.println(LastIndex(arr,0,x));
	
		
//#6      		All Indices in Array		
//https://www.youtube.com/watch?v=bQkwHBaNioE&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=24		 
		 
		 
		 
		 
		 
		
		
	}
}
