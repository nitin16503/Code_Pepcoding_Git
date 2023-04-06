import java .util.*;
public class l_Time_and_space {
	
	public static int partition(int[] arr,int p_value,int lo,int hi) {
		int i=lo;
		int j=lo;
		while(i<=hi) {
			if(arr[i]>p_value) {
				i++;
			}else {
				int temp =arr[j];
				arr[j] =arr[i];
				arr[i] =temp;
				i++;
				j++;
			}
		}
		System.out.println("pivot index --->" + (j-1));
		return(j-1);
	}
    
	public static void Quick_Sort(int [] arr, int lo, int hi ) {
		if(lo>=hi) {
			return;
		}
		int pvt = arr[hi];
		int pivot = partition(arr,pvt,lo,hi);
		Quick_Sort(arr,lo,pivot-1);
		Quick_Sort(arr,pivot+1,hi);
	}
	
	public static int Quick_Select(int[] arr, int lo, int hi, int k) {
		int pvt = arr[hi];
		int pvot = partition(arr,pvt,lo,hi);
		if(pvot>k) {
			Quick_Select(arr,lo, pvot-1, k);
		}else if(pvot<k) {
			Quick_Select(arr,pvot+1, hi, k);
		}else {
			return pvt;
		}
		return arr[k];
	}
	
	public static void  Count_Sort(int[] arr , int min, int max ) {
		int range = max-min+1;
		
		int[] f = new int[range];
		for(int i=0;i<arr.length;i++) {
			int idx = arr[i] - min;
			f[idx]++;
		} 
		
		//range of index of data 
		for(int i=1; i<range;i++) {
			f[i] =f[i] +f[i-1];
		} 
		
		
		int[] ans = new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--) {
			int val = arr[i];
			int idx = f[val-min]-1;
			ans[idx] = val;
			f[val-min]--;
		}
		for( int i =0; i<ans.length;i++) {
			System.out.println(ans[i]);
		}
		
	}
	
	public static void Radix_Sort(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			max = Math.max(max, arr[i]);
		}
		int power =1;
		while(max>=power) {
			Radix_Sort_Count_Sort( arr , power );
			power*=10;
		}
		for( int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	public static void  Radix_Sort_Count_Sort(int[] arr ,int power ) {
		int min =0;
		int[] f = new int[10];
		for(int i=0;i<arr.length;i++) {
			int idx = (arr[i]/power%10) - min;
				f[idx]++;
		} 
		
		//range of index of data 
		for(int i=1; i<10;i++) {
			f[i] =f[i] +f[i-1];
		} 
		
		
		int[] ans = new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--) {
			int val = (arr[i]/power%10);
			int idx = f[val-min]-1;
			ans[idx] = arr[i];//****
			f[val-min]--;
		}
		for( int i =0; i<ans.length;i++) {
			arr[i]=ans[i];
		}
		
	}
	
	public static void Sort_Dates(String[] arr) {
		Sort_Dates_Count_Sort(arr,1000000,100,31+1);//days
		Sort_Dates_Count_Sort(arr,10000,100,12+1);//months
		Sort_Dates_Count_Sort(arr,1,10000,2500+1);//years
		for( int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void  Sort_Dates_Count_Sort(String[] arr ,int quotient,int remainder,int range ) {
		int min =0;
		int[] f = new int[range];
		for(int i=0;i<arr.length;i++) {
			int idx = (Integer.parseInt (arr[i],10)/quotient%remainder) - min;
				f[idx]++;
		} 
		
		//range of index of data 
		for(int i=1; i<f.length;i++) {
			f[i] =f[i] +f[i-1];
		} 
		
		
		String[] ans = new String[arr.length];
		
		for(int i=arr.length-1;i>=0;i--) {
			int val = (Integer.parseInt(arr[i],10)/quotient%remainder);
			int idx = f[val-min]-1;
			ans[idx] = arr[i];//****
			f[val-min]--;
		}
		for( int i =0; i<ans.length;i++) {
			arr[i]=ans[i];
		}
		
	}
	
	public static void main(String[] args) {
		Scanner hemlo = new Scanner(System.in);
		
////#1----------------------->Bubble Sort 		
//		int n = hemlo.nextInt();
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i] = hemlo.nextInt();
//		}
//		
//		for(int i=1;i<=n-1;i++) {
//			for(int j =0;j<n-i;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j+1];
//					arr[j+1] = arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		
//		for(int i=0;i<n;i++) {
//			System.out.println(arr[i]);
//		}
		
////#2------------------------>Selection Sort
//		int n = hemlo.nextInt();
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i] = hemlo.nextInt();
//		}
//		
//		for(int i =0;i<n-1;i++) {
//			for(int j=i+1;j<n;j++) {
//				if(arr[i]>arr[j]) {
//					int temp =arr[j] ;
//					arr[j]=arr[i];
//					arr[i]=temp;
//				}
//			}
//		}
//				
//		for(int i=0;i<n;i++) {
//			System.out.println(arr[i]);
//		}

////#3--------------------------->Insertion Sort		
//		int n= hemlo.nextInt();
//		int[] ar = new int[n];
//		for(int i =0; i<n;i++) {
//			ar[i] = hemlo.nextInt();
//		}
//		
//		for(int i =1;i<n;i++) {
//			for(int j=i-1;j>=0;j--) {
//				if(ar[i]<ar[j]) {
//					int temp =ar[j];
//					ar[j]=ar[i];
//					ar[i]=temp;
//				}
//			}
//		}
//		
//		for(int i=0;i<n;i++) {
//			System.out.println(ar[i]);
//		}
		
////#4--------------------------->Merge Two Sorted Arrays		
//		int n= hemlo.nextInt();
//		int[] ar1 = new int[n];
//		for(int i=0;i<n;i++) {
//			ar1[i] =hemlo.nextInt();
//		}
//		int m= hemlo.nextInt();
//		int[] ar2 =new int[m];
//		for(int i=0;i<m;i++) {
//			ar2[i]=hemlo.nextInt();
//		}
//		int k=m+n;
//		int[] result = new int[k];
//		int i=0;
//		int j=0;
//	    k=0;
//		while(i<n&&j<m) {
//			if(ar1[i]<ar2[j]) {
//				result[k]=ar1[i];
//				i++;
//				k++;
//			}else {
//				result[k]=ar2[j];
//				j++;
//				k++;
//			}
//		}while(i<n||j<m) {
//			if(i<n) {
//				result[k]=ar1[i];
//				i++;
//				k++;
//			}else {
//				result[k]=ar2[j];
//				j++;
//				k++;
//			}
//		}
//		
//		for(int l=0;l<k;l++) {
//			System.out.println(result[l]);
//		}
		
////#5------------------------>Partioning an Array		
//		int  n= hemlo.nextInt();
//		int[] ar =new int[n];
//		for(int i =0;i<n;i++) {
//			ar[i] = hemlo.nextInt();
//		}
//		int p =hemlo.nextInt();
//	    //0 - (j-1) ---> <=p
//	    //j - (i-1) ---> >p 
//	    //i - (n-1) ---> unknown
//		int i=0;
//		int j=0;
//		while(i<n) {
//			if(ar[i]>p) {
//				i++; 
//			}
//			else if (ar[i]<=p) {
//				int temp =ar[j];
//				ar[j]=ar[i];
//				ar[i]=temp;
//				j++;
//				i++;
//			}
//		}
//		for(int o =0;o<n;o++) {
//			System.out.println(ar[o]);
//		}
		
////#6----------------------->Quick Sort 
//	int n = hemlo.nextInt();
//	int[] arr = new int[n];
//	for(int i=0;i<n;i++) {
//		arr[i]=hemlo.nextInt();
//	}
//	Quick_Sort(arr,0, n-1);
//	for(int i=0;i<n;i++) {
//		System.out.println(arr[i]);
//	}

		
////#7----------------------->Quick Select
//	int n = hemlo.nextInt();
//	int[] arr = new int[n];
//	for(int i =0; i<n;i++) {
//		arr[i] = hemlo.nextInt();
//	}
//	int k = hemlo.nextInt();
//	System.out.println(Quick_Select(arr,0,n-1,k-1));
		
////#8---------------------->Count Sort 		
//		int n = hemlo.nextInt();
//		int[] ar =new int[n];
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//		for(int i =0;i<n;i++) {
//			ar[i] = hemlo.nextInt();
//			max= Math.max(max,ar[i]);
//			min = Math.min(min, ar[i]);
//		}
//		Count_Sort(ar,min,max);	
		
////#9----------------------->Radix Sort
//		int n = hemlo.nextInt();
//		int [] arr = new int[n];
//		for(int i=0;i<n;i++) {
//	    	arr[i] = hemlo.nextInt();
//		}
//		Radix_Sort(arr);

////#10---------------------->Sort Dates		
//		int n = hemlo.nextInt();
//		String[] arr = new String[n];
//		for(int i=0;i<n;i++) {
//		    arr[i] = hemlo.next();
//		}
//		Sort_Dates(arr);
		
////#11---------------------->Sorting 01		
//		int n= hemlo.nextInt();
//		int[] arr = new int[n];
//		for(int i =0; i<n;i++) {
//			arr[i]= hemlo.nextInt();
//		}
//		
//		int i =0; int j=0;
//		while(i<n) {
//			if(arr[i]==1) {
//				i++;
//			}else{
//				int temp=arr[j];
//				arr[j]= arr[i];
//				arr[i] =temp;
//				i++;
//				j++;
//			}
//		}
//		
//		for(int p=0;p<n;p++) {
//			System.out.println(arr[p]);
//		}

////#12---------------------> Sort 012
//		int n = hemlo.nextInt();
//		int[] arr = new int[n];
//		for(int i =0;i<n;i++) {
//			arr[i] = hemlo.nextInt();
//		}
//		
//		int i=0; int j=0; int k =n-1;
//		while(i<k) {
//			if(arr[i]==1) {
//				i++;
//			}else if(arr[i]==0) {
//				int temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]= temp;
//				i++;
//				j++;
//			}else{
//				int temp=arr[i];
//				arr[i]=arr[k];
//				arr[k]= temp;
//				k--;
//			}
//		}
//		for(int p=0; p<n ;p++) {
//			System.out.println(arr[p]);
//		}

////#13---------------------->Target Sum Pair
//		int n = hemlo.nextInt();
//		int[] arr = new int[n];
//		for(int i =0;i<n;i++) {
//			arr[i] = hemlo.nextInt();
//		}
//		int target = hemlo.nextInt();
//		Arrays.sort(arr);
//		int  lft=0;
//		int rght =n-1;
//		while(lft<rght) {
//			if(arr[lft]+arr[rght]<target) {
//				lft++;
//			}else if(arr[lft]+arr[rght]>target) {
//				rght--;
//			}else {
//				System.out.println(arr[lft] +" "+ arr[rght]);
//				lft++;
//				rght--;	
//			}
//		}
		
////#14---------------------->Pivot of Sorted Rotated Array 
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
