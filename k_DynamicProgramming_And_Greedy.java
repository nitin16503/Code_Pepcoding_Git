import java.util.*;
public class k_DynamicProgramming_And_Greedy {
	
//#1             Fibonacci-dp
public static int fib_dp(int n , int[] Storage) {
	if(n==0||n==1) {
		return n ;	
	}
	if(Storage[n]!=0) {
		return Storage[n];
	}
	int a = fib_dp(n-1,Storage);
	int b = fib_dp(n-2,Storage);
	int result = a+b;
    Storage[n] = result;
	return result;
}

//#2          Climb Stair --->>> **(through MEMOIZATION)**
public static int CountPath(int n, int[] memory ) {
	if(n<0) {
		return 0;
	}else if(n==0) {
		return 1;
	}
	if(memory[n]!=0) {
		return memory[n];
	}
	int a  = CountPath(n-1,memory);
	int b = CountPath(n-2, memory);
	int c = CountPath(n-3,memory);
	int result = a+b+c;
	memory[n] = result;
	return result;
}
//            Climb Stair --->>> **(through TABULATION)**  
public static int CountPath2(int n) {
	int[] dp = new int[n+1];
	dp[0]= 1;
	for(int i=1; i<=n; i++) {
		if(i==1) {
			dp[i] = dp[i-1]; 
		}else if(i==2) {
			dp[i] = dp[i-1] +dp[i-2];
		}else {
			dp[i] = dp[i-1] +dp[i-2] + dp[i-3];
		}
	}
	return dp[n];
}

////#3                     Climbing Stairs with Jumps
public static int Climbing_Stairs_with_Jumps(int given[],int n) {
	int[] dp = new int[n+1];
	dp[n]=1;
	for(int i=n-1; i>=0;i--) {
		for(int j=1;j<=given[i] && j+i<n+1;j++) {
			dp[i] += dp[i+j];
		}
	}
	
	return dp[0];
}

//#4           Climb Stairs with Minimum Moves
public static int Climb_Stairs_with_Minimum_Moves(int n, int given[] ) {
	Integer dp [] = new Integer[n+1];                      // Integer--> it contain "null" by default. 
	dp[n] = 0;                                            // Now it contain an address which contain zero.
	for(int i=n-1; i>=0; i--) {
		
//		if(given[i]==0) {
//		   //nothing will happen
//		}
		
		 if(given[i]>0) {
			int min = Integer.MAX_VALUE;
			for(int j =1; j<=given[i] && i+j<n+1;j++) {
				if(dp[i+j]!= null) {
					min = Math.min(min, dp[i+j]);
				}	
			}
			if(min!=Integer.MAX_VALUE) {
				dp[i]= min+1;
			}
			
//				else {
//				//dp[i] = null;
//			}
			
		}
	}
	return dp[0];
}

////#5               Min Cost In Maze Traversal
public static int Min_cost (int[][] given, int n , int m ) {
	int[][] dp = new int[n][m];
	
	for(int i=n-1;i>=0;i--) {
		for(int j=m-1;j>=0;j--) { 
			if(i==dp.length-1 && j==dp[0].length-1) {     /// last cell
				dp[i][j] =given[i][j];
			}
			else if(i==dp.length-1) {                        /// last row
				dp[i][j]=given[i][j] +dp[i][j+1];
			}
			else if(j==dp[0].length-1) {                    ///last column
				dp[i][j] = given[i][j] +dp[i+1][j];
			}
			else {                                    /// rest of it
				dp[i][j]= given[i][j] +  Math.min(dp[i][j+1] , dp[i+1][j]);
			}
		}
	}
	
	return dp[0][0];
}

////#6                       G O L D M I N E 
public static int goldmine(int n, int m, int[][] given) {
	int[][] dp = new int[n][m];
	
	for(int j=m-1;j>=0;j--) {
		for(int i=0;i<n;i++) {
			if(j==m-1) {
				dp[i][j] = given[i][j];
			}
			else if(i==0) {
				dp[i][j]= given[i][j] + Math.max(dp[i][j+1], dp[i+1][j+1]);
			}
			else if (i==n-1) {
				dp[i][j]= given[i][j] +Math.max(dp[i-1][j+1], dp[i][j+1]);
			}
			else {
				dp[i][j]=given[i][j] + Math.max(dp[i-1][j+1],Math.max(dp[i][j+1],dp[i+1][j+1]));
			}
		}
	}
	int result = dp[0][0];
	for(int i=1;i<n;i++) {
		if(result<dp[i][0]) {
			result=dp[i][0];}
	}
	return result;
}

////#7                   T a r g e t   S u m   S u b s e t s 
public static boolean target_sum(int target, int n , int[] given) {
	boolean[][] dp = new boolean[n+1][target+1];
	 for(int i =0; i<dp.length;i++) {
		 for(int j =0; j<dp[0].length;j++) {
			 if(i==0 && j==0) {
				 dp[i][j]= true;
			 }
			 else if(i==0) {
				 dp[i][j]= false;
			 }
			 else if(j==0) {
				 dp[i][j]=true;
			 }
			 else{
				 if(dp[i-1][j]==true) {
					 dp[i][j]=true;
				 }else {
					 int val = given[i-1];
					 if(val<=j) {
						 if(dp[i-1][j-val]==true) {
							 dp[i][j] =true;
						 }
					 }else {
						 dp[i][j] = false;
					 } 
				 }
			 }
		 }
	 }
	return dp[n][target];
}




	
	public static void main(String[] args) {
		
		Scanner hemlo = new Scanner(System.in);
		
////#1        	Fibonacci-dp
//   int n = hemlo.nextInt();
//   int[] storage = new int[n+1];
//   int fib = fib_dp(n,storage);
//   System.out.println(fib);
    
////#2             Climb Stair    
//     int n= hemlo.nextInt();
//     int[] memory = new int[n+1];
//     System.out.println("**(through MEMOIZATION)**");
//     System.out.println(CountPath(n,memory)); 
//     System.out.println("**(through TABULATION)** ");
//     System.out.println(CountPath2(n));
    
////#3           Climbing Stairs with Jumps
//     int n = hemlo.nextInt();
//     int[] given = new int[n];
//     for(int i =0 ; i<n; i++) {
//    	 given[i] = hemlo.nextInt();
//     }
//     System.out.println(Climbing_Stairs_with_Jumps(given,n)); 

////#4         	Climb Stairs with Minimum Moves
//		int n = hemlo.nextInt();
//		int[] given = new int[n];
//		for(int i =0; i<n; i++) {
//			given[i] = hemlo.nextInt();
//		}
//		System.out.println(Climb_Stairs_with_Minimum_Moves(n , given ));
	
////#5		  Min Cost In Maze Traversal
//		int n = hemlo.nextInt();
//		int m = hemlo.nextInt();   
//		int[][] given = new int[n][m];
//		for(int i=0;i<n;i++) {
//			for(int j=0; j<m;j++) {
//				given[i][j] = hemlo.nextInt();
//			}
//		}
////		6
////		6
////		0 1 4 2 8 2
////		4 3 6 5 0 4
////		1 2 4 1 4 6
////		2 0 7 3 2 2
////		3 1 5 9 2 4
////		2 7 0 8 5 1
//		System.out.println(Min_cost(given,n,m));
		
////#6                          G o l d m i n e 		
//		int n = hemlo.nextInt();
//		int m = hemlo.nextInt();
//		int[][] given = new int[n][m];
//		for(int i=0; i<n; i++) {             
//			for(int j=0;j<m;j++) {
//				given[i][j] = hemlo.nextInt();}
//			}
////		6
////		6
////		0 1 4 2 8 2
////		4 3 6 5 0 4
////		1 2 4 1 4 6
////		2 0 7 3 2 2
//		System.out.println(goldmine(n,m,given));
		
		
////#7                   T a r g e t   S u m   S u b s e t s 
//		int n = hemlo.nextInt();
//		int[] given = new int[n];
//		for(int i =0 ; i<n; i++) {
//			given[i] = hemlo.nextInt();
//		}
//		int target = hemlo.nextInt();
//		System.out.println(target_sum(target,n,given));

		
////#8                   Coin Change Combination Problem
//		System.out.println("enter total no. of coin ");
//		int n = hemlo.nextInt();
//		int[] given = new int[n];
// 		System.out.println("enter amount of coin");
//		for(int i=0;i<given.length; i++) {
//			given[i]=hemlo.nextInt();
//		}
//		
//		System.out.println("enter required amount");
//		int amt = hemlo.nextInt();
//		int[] dp = new int[amt +1];
//		dp[0]=1;
//		
//		for(int i=0;i<given.length;i++) {
//			for(int j=given[i]; j<dp.length;j++) {
//				dp[j] += dp[j-given[i]];
//			}
//		}
//		System.out.println(dp[amt]);
		
////#9                    Coin Change Permutations Problem		
//		System.out.println("enter total no. of coins");
//		int n = hemlo.nextInt();
//		int[] given = new int[n];
//		System.out.println("enter amount of coins");
//		for(int i=0; i<given.length;i++) {
//			given[i] =hemlo.nextInt();
//		}
//		System.out.println("enter target");
//		int tar = hemlo.nextInt();
//		
//		int[] dp = new int[tar+1]; 
//		dp[0]= 1;
//		for(int i=1;i<dp.length;i++) {
//			for(int j=0; j<given.length;j++) {
//				if(i>=given[j]) {
//					dp[i] += dp[i-given[j]];
//				}
//			}
//		}
//		System.out.println(dp[tar]);
		
////#10                         Q-1 Knapsack Problem		
//       System.out.println("enter no. of element ");
//		int n = hemlo.nextInt();
//		System.out.println("array of VALUE");
//		int[] vals = new int[n];
//		for(int i =0; i<n;i++) {
//			vals[i] = hemlo.nextInt();
//		}
//		System.out.println("array of WEIGHT");
//		int[] wts = new int[n];
//		for(int i =0; i<n;i++) {
//			wts[i] = hemlo.nextInt();
//		}
//		System.out.println("enter MAXIMUM WEIGHT");
//		int max_w = hemlo.nextInt();
//		
//		int[][] dp = new int[n+1][max_w+1];
//		for(int i=1;i<n+1;i++) {
//			for(int j=1;j<max_w+1;j++) {
//				
//				if(wts[i-1] <= j) {    //player does the batting
//					if(dp[i-1][ j-wts[i-1] ] + vals[i-1]  >  dp[i-1][j]) {
//						dp[i][j] = vals[i-1] + dp[i-1][ j-wts[i-1] ]; 
//					}else {
//						dp[i][j] = dp[i-1][j];
//					}
//				}else {
//					dp[i][j]= dp[i-1][j]; // player dosen't do batting 
//				}
//			}
//		} System.out.println(dp[n-1][max_w]);
		
////#11                       U n b o u n d e d    K n a p s a c k 				
//        System.out.println("enter no. of element ");
//		int n = hemlo.nextInt();
//		System.out.println("array of VALUE");
//		int[] weight_vals = new int[n];
//		for(int i =0; i<n;i++) {
//			weight_vals[i] = hemlo.nextInt();
//		}
//		System.out.println("array of WEIGHT");
//		int[] no_wts = new int[n];
//		for(int i =0; i<n;i++) {
//			no_wts[i] = hemlo.nextInt();
//		}
//		System.out.println("enter MAXIMUM WEIGHT");
//		int limit = hemlo.nextInt();
//		
//		int[] dp = new int[limit +1];
//		dp[0] =0;
//		for(int i=1;i<=limit;i++) {
//			int max =0;
//			for(int j=0; j<n;j++) {
//				if(i>=no_wts[j]) {
//					int total_val = weight_vals[j] + dp[i-no_wts[j]];
//					if(max<total_val) {
//						max= total_val;
//					}
//				}
//			}dp[i] = max;
//		}System.out.println(dp[limit]);
		
////#12                   C o u n t   B i n a r y  S t r i n g s 
//		System.out.println("enter the size");
//		int n = hemlo.nextInt();
//		
//		int old0 = 1; //1st place
//		int old1= 1;  //2nd place
//		
//		for(int i=2; i<=n;i++) {
//			int new0=old1;
//			int new1=old1 + old0;
//			
//			old0 = new0;
//			old1 = new1;
//		}System.out.println(old0+old1);
		
////#13                Arrange Buildings Dynamic Programming		
		
//		System.out.println("enter the size");
//		int n = hemlo.nextInt();
//		
//		int old_B = 1;   // 1st place
//		int old_S = 1;   //1st place
//		
//		for(int i=0 ; i<=n ; i++) {
//			int new_B = old_B;
//			int new_S = old_S + old_B;
//			
//			old_B = new_B;
//			old_S = new_S;
//		}
//		System.out.println(Math.pow(old_S+old_B,2));
		
////#14                   Decode Ways Dynamic Programming 		
//		System.out.println("enter the string");
//		String str = hemlo.next();
//		int n = str.length();
//		
//		int[] dp = new int[n];
//		
//		dp[0]=1;
//		
//		for(int i=1;i<n;i++) {
//			if(str.charAt(i-1)=='0'&&str.charAt(i)=='0') {
//				dp[i]=0;
//				
//			}else if(str.charAt(i-1)=='0'&&str.charAt(i)!='0') {
//				dp[i]=dp[i-1];
//				
//			}else if(str.charAt(i-1)!='0'&&str.charAt(i)=='0') {
//				
//				if(str.charAt(i-1)==1 || str.charAt(i-1)==2 ) {
//					dp[i]= (i>=2 ?dp[i-2]:1);
//				}else {
//					dp[i]=0;
//				}
//				
//			}else {
//				
//				if (Integer.parseInt(str.substring(i-1,i+1))<=26) {   //##convert string to integer#//
//					dp[i]=dp[i-1] + (i>=2 ?dp[i-2]:1);
//				}else {
//					dp[i]=dp[i-1];
//				}
//			}
//		}
//		System.out.println(dp[n-1]);
		
////#15		                     Count A+ B+ C+ Subsequences Dynamic Programming
//		
//		String str = hemlo.next();
//		int l = str.length();
//		int a =0;
//		int ab =0;
//		int abc =0;
//		
//		for(int i=0;i<l;i++) {
//			char ch = str.charAt(i);
//			if(ch =='a') {
//				a =  a + a +1;
//			}else if(ch =='b') {
//				ab= ab + ab +a;
//			}else if (ch =='c') {
//				abc= abc+ abc +ab;
//			}
//		} System.out.println(abc);
		
////#16               Maximum Sum Non Adjacent Elements Dynamic Programming | Greedy Approach 
//      
//		System.out.println("enter no. of element ");
//		int n = hemlo.nextInt();
//		int[] arr = new int[n];
//		for(int i =0;i<n; i++) {
//			arr[i] = hemlo.nextInt();	
//		}
//		
//		int exc =0;
//		int inc =arr[1];
//		
//		for(int i=1;i<n;i++) {
//			int new_inc = arr[i] + exc;
//			int new_exc = Math.max(inc, exc);
//			
//			inc =new_inc;
//			exc=new_exc;
//		}
//		System.out.println(Math.max(inc, exc));
		
////#17                Paint House (Leetcode) Dynamic Programming
//		
//		System.out.println("enter no of houses");
//		int  n = hemlo.nextInt();
//		int[][] given = new int[n][3];
//		for(int i=0;i<given.length;i++) {
//			for(int j=0;j<given[0].length;j++) {
//				given[i][j] = hemlo.nextInt();
//			}
//		}
//		
//		long[][] dp = new long[n][3];
//		dp[0][0] = given[0][0];
//		dp[0][1] = given[0][1];
//		dp[0][2] = given[0][2];
//		
//		for(int i=1;i<n;i++) {
//			dp[i][0]= given[i][0]+ Math.min(dp[i-1][1],dp[i-1][2]);
//			dp[i][1]= given[i][1]+ Math.min(dp[i-1][0],dp[i-1][2]);
//			dp[i][2]= given[i][2]+ Math.min(dp[i-1][0],dp[i-1][1]);
//		}
//		long result = Math.min(dp[n-1][0], Math.min(dp[n-1][1],dp[n-1][2]) );
//		System.out.println(result);
		
////#18              Paint House - 2 (Many Colors) Dynamic Programming 
//		
//		System.out.println("enter no. of houses");
//		int h = hemlo.nextInt();
//		System.out.println("enter no. of colours");
//		int c = hemlo.nextInt();
//		int [][] given = new int[h][c];
//		for(int i=0;i<h;i++) {
//			for(int j=0;j<c;j++) {
//				given[i][j] = hemlo.nextInt();
//			}
//		}
//		
//		int[][] dp = new int[h][c]; 
//		
//		int least = Integer.MAX_VALUE;
//		int s_least = Integer.MAX_VALUE;
//		for(int i=0;i<h;i++) {
//			int n_least = Integer.MAX_VALUE;
//			int n_s_least = Integer.MAX_VALUE;
//			
//			for(int j=0;j<c;j++) {
//				if(i==0) {                      
//					dp[0][j]=given[0][j];  
//					
//	                if(dp[0][j]<=least) {
//	                	s_least=least;
//	                	least=dp[0][j];
//	                }else if(dp[0][j]<=s_least){
//	                	s_least=dp[0][j];
//	                }
//				}
//				
//				else{
//					if(least==dp[i-1][j]) {
//						dp[i][j]=given[i][j] + s_least;
//					}else {
//						dp[i][j]=given[i][j] + least ;
//					}
//					if(dp[i][j]<=n_least) {
//	                	n_s_least=n_least;
//	                	n_least=dp[i][j];
//	                }else if(dp[i][j]<=n_s_least){
//	                	n_s_least=dp[i][j];
//	                }
//				}
//			}
//			
//			if(i>0) {
//				least = n_least;
//				s_least= n_s_least;
//			}
//		}
//		System.out.println(least);
		
////#19                 Paint Fence (Leetcode) Dynamic Programming              		
//			
//		int n = hemlo.nextInt();
//		int k = hemlo.nextInt();
//		
//		long same = k;         // only 2 colour
//		long dif = k*(k-1);   // only 2 colour
//		long total = dif + same;
//		for(int i=3;i<=n;i++) {
//			same = dif;
//			dif = (total)*(k-1);
//		    total = same + dif;
//		}
//		System.out.println(same+dif);
		
////#20              Tiling(2x1) with Dominoes(1xN) Dynamic Programming 
//		
//		int n = hemlo.nextInt();
//		
//		int[] dp = new int[n+1];
//		dp[1] = 1;
//		dp[2] = 2; 
//		
//		for(int i =3; i<=n ; i++) {
//			dp[i] = dp[i-1] + dp[i-2];
//		}
//		System.out.println(dp[n]);
		
////#21             Tiling with M x 1 Tiles And floor(M x N) Dynamic Programming
//		int n = hemlo.nextInt();
//		int m = hemlo.nextInt();
//		
//		int[] dp = new int[n+1]; 
//		
//		for(int i =1; i<=n; i++) {
//			if(m>i) {
//				dp[i] = 1;
//			}else if (i==m) {
//				dp[i] = 2;
//			}else {
//				dp[i] = dp[i-1] + dp[i-m];
//			}
//		} System.out.println(dp[n])	;
		
////#22           Friends Pairing Problem Dynamic Programming
//		
//		int n = hemlo.nextInt();
//		int[] dp = new int[n+1];
//		
//		dp[1] = 1;
//		dp[2] = 2;
//		 for(int i=3; i<=n; i++) {
//			 dp[i] = dp[i-1] + dp[i-2]* (i-1);
//		 }
//		System.out.println(dp[n]);
		
////#23           Partition into Subsets Dynamic Programming
//		int s = hemlo.nextInt();
//		int t = hemlo.nextInt();
//		if(s==0||t==0||s<t) {
//			System.out.println("0");
//			return;//break;
//		}
//		
//	    long[][] dp = new long[s+1][t+1];
//	    
//	    for(int i=1;i<=s;i++) {
//	    	for(int j =1; j<=t; j++) {
//	    		if(i==j) {
//	    			dp[i][j]=1;
//	    		}else if(i<j) {
//	    			dp[i][j]=0;
//	    		}else {
//	    			dp[i][j] =(dp[i-1][j] * j )+ dp[i-1][j-1];
//	    		}
//	    	}
//	    }
//		System.out.println(dp[s][t]);
		
////#24        Best Time to Buy and Sell Stocks - One Transaction Allowed - Dynamic Programming			
//		int p = hemlo.nextInt();
//		int[] prizes = new int[p];
//		for(int i=0;i<p;i++) {
//			prizes[i] = hemlo.nextInt();
//		}
//		
//		int max_profit =0;
//		int at_time_profit = 0;
//		int least_prize =Integer.MAX_VALUE;
//		
//		for(int i=0;i<p;i++) {
//			if(least_prize>prizes[i]) {
//				least_prize= prizes[i];
//			}else {
//				at_time_profit = prizes[i]-least_prize;
//				if(at_time_profit>max_profit) {
//					max_profit=at_time_profit;
//				}
//			}
//		}
//		System.out.println(max_profit);
		
////#25      Best Time to Buy and Sell Stocks - 2 (Infinite Transactions) Dynamic Programming
//		
//		int  n = hemlo.nextInt();
//		int[] given = new int[n];
//		for(int i=0;i<n;i++) {
//			given[i] = hemlo.nextInt();	
//		}
//		
//		int buy =given[0];
//		int sell=given[0];
//		int profit=0;
//		for(int i=1; i<n; i++) {
//			if(given[i-1]<=given[i]) {
//				sell=given[i];
//			}else if(given[i-1]>given[i]) {
//				profit =+ sell-buy;
//				sell=given[i];
//				buy=given[i];
//			}
//		}
//		profit =+ sell-buy;
//		System.out.println(profit);
		
////#26      Best Time to Buy and Sell Stocks with Transaction Fee and Infinite Transactions 		
//        int n = hemlo.nextInt();
//        int[] given = new int[n];
//        for(int i=0;i<n;i++) {
//        	given[i] = hemlo.nextInt();
//        }
//		int fee = hemlo.nextInt();
//        
//		int old_buy_state_profit = - given[0];
//		int old_sell_state_profit = 0;
//		
//		for(int i=0;i<n;i++){
//			int new_buy_state_profit=0;
//			int new_sell_state_profit =0;
//			
//			if(old_buy_state_profit> old_sell_state_profit-given[i]) {
//				new_buy_state_profit= old_buy_state_profit;
//			}else {
//				new_buy_state_profit=old_sell_state_profit -given[i]; 
//			}
//			
//			if(old_sell_state_profit>given[i] -old_buy_state_profit -fee ) {
//				new_sell_state_profit = old_sell_state_profit;
//			}else {
//				new_sell_state_profit = given[i] -old_buy_state_profit-fee ;
//			}
//			new_buy_state_profit = old_buy_state_profit;
//			new_sell_state_profit = old_sell_state_profit;		
//			
//		}
//		System.out.println(old_sell_state_profit);
		
////#27		Best Time to Buy and Sell Stocks with Cool down - Infinite Transactions		
//	
//		int n = hemlo.nextInt();
//		int[] given = new int[n];
//		for(int i=0; i<n; i++ ) {
//			given[i] = hemlo.nextInt();
//		}
//		
//		int obsp= - given[0];     //old buy state profit
//		int ossp= 0;             //old sell state profit
//		int ocsp= 0;            // old cooled state profit
//		
//		for(int i =1; i<n; i++) {
//			int nbsp=0;
//			int nssp=0;
//			int ncsp=0;
//			//1st
//			if(obsp>ocsp-given[i]) {
//				nbsp=obsp;
//			}else {
//				nbsp=ocsp-given[i];
//			}
//			//2nd
//			if(ossp>given[i]+obsp) {  //obsp = -ve***** line-->720
//				nssp = ossp;
//			}else {
//				nssp=given[i]+obsp;
//			}
//			//3rd
//			if(ossp>ocsp) {
//				ncsp = ossp;
//			}else {
//				ncsp=ocsp;
//			}
//			
//			obsp=nbsp;
//			ossp=nssp;
//			ocsp=ncsp;
//		}
//		System.out.println(ossp);   //// ossp --> maximum
		
////#28	     Best Time to Buy and Sell Stocks - Two Transaction Allowed (Hard) 	
//		int n= hemlo.nextInt();
//		int[] arr = new int[n];
//		for(int i =0;i<n;i++) {
//			arr[i] = hemlo.nextInt();
//		}
//		//1st--> maximum profit if u have to sold today
//		int mpist = 0;
//	    int min_e=arr[0];
//	    int[] mp_1=new int[n];
//		for(int i=1;i<n;i++) {
//			
//			if(min_e>arr[i]) {
//				min_e=arr[i];
//			}
//			
//			mpist = arr[i] - min_e;			
//			if(mpist>mp_1[i]) {
//				mp_1[i] = mpist;
//			}else {
//				mp_1[i] = mp_1[i-1];
//			}
//		}
//		//2nd --> maximum profit if u have to bought today
//		int mpibt =0;
//		int max_e=arr[n-1];
//	    int[] mp_2 = new int[n];
//		for(int j=n-2;j>=0;j--) {
//			
//			if(max_e<arr[j]) {
//				max_e=arr[j];
//			}
//			
//			mpibt= max_e - arr[j];
//			if(mp_2[j+1]<mpibt) {
//				mp_2[j] = mpibt;
//			}else {
//				mp_2[j]=mp_2[j+1];
//			}
//		}
//		//3rd --> total profit
//		int tp= mp_1[0] + mp_2[0];
//		for(int i=1; i<n; i++) {
//			if(tp < mp_1[i] + mp_2[i]) {
//				tp = mp_1[i] + mp_2[i];
//			}
//			
//		}System.out.println(tp);
		
////#29                      Best Time to Buy and Sell Stocks - K Transaction	
//		int n = hemlo.nextInt();
//        int[] given = new int[n];
//        for(int i =0;i<n;i++) {
//        	given[i] = hemlo.nextInt();
//        }
//		int k = hemlo.nextInt();
//		
//		int[][] dp = new int[k+1][n];
//		
//		for(int i=1; i<k+1; i++) {
//			int max = Integer.MIN_VALUE;
//			for(int j=1;j<n;j++) {
//				if(max<dp[i-1][j-1]-given[j-1]) {
//					max=dp[i-1][j-1]-given[j-1];
//				}
//				dp[i][j] = Math.max(given[j]+max,dp[i][j-1]);
//			}
//		}
//		System.out.println(dp[k][n-1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}}
