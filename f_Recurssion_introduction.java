import java .util.*;
public class f_Recurssion_introduction {

//#              Print Decreasing	
	public static void print_decresing(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		print_decresing(n-1);
	}

//#              Print Increasing	
	public static void print_increasing(int n) {
		if(n==0) {
			return;
		}
		print_increasing(n-1);
		System.out.println(n);
	}

//#              Print Increasing Decreasing
	public static void pdi(int n ) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		pdi(n-1);
		System.out.println(n);
	}
	
//#                   Factorial
	public static int fac(int n ) {
		if(n==1) {
			return 	1;
		}   
		int  m = fac(n-1);
		int result = m *n;
		return result;
	}
	
//#                 Power (x,n)
	public static int power(int x, int n ) {
		if(n==0) {
			return 1;
		}
		int f = power(x,n-1);
		int result = f*x;
		return result;
	}

//#                 Power logarithmic
	public static int pl(int n, int p) {
		if(p==0) {
			return 1;
		}
		int x1 = pl(n,p/2);
		int result = x1*x1;
		if(p%2==1) {
			result= result*n;
		}
		return result;
	}

//#                Tower of Hanoi
	public static void toh(int n , int t1d, int t2d, int t3d) {
		if(n==0) {
			return;
		}
		toh(n-1,t1d,t3d,t2d);
		System.out.println(n + " [" + t1d + "-->" + t2d + "]");
		toh (n-1,t3d,t2d,t1d);
	}
	
	
	public static void main(String[] args) {
		Scanner hemlo = new Scanner(System.in);

//#1                 Print Decreasing		
//		System.out.println("enter a no.");
//		int n = hemlo.nextInt();
//	    print_decresing(n);

	    
//#2                Print Increasing	    
//		System.out.println("enter a no.");
//		int n = hemlo.nextInt();
//	    print_increasing(n);
	    
	    
//#3              Print Decreasing Increasing  
//		System.out.println("enter a no.");
//    	int n = hemlo.nextInt();
//	    pdi(n);
	    
	    
//#4                Factorial
//		System.out.println("enter a no.");
//		int n = hemlo.nextInt();
//		System.out.println(fac(n));
		
	    
//#5                Power (x,n)	    
//		System.out.println("write no.");
//		int x = hemlo.nextInt();
//		System.out.println("enter power of x");
//		int n = hemlo.nextInt();
//		System.out.println(power(x,n));
	    
	    
//#6               Power Logarithmic 
//		System.out.println("enter a no.");
//		int n = hemlo.nextInt();
//		System.out.println("enter it's power ");
//		int p = hemlo.nextInt();
//		System.out.println(pl(n,p));
		
		
//#7                   Print Zig-Zag
   //https://www.youtube.com/watch?v=R7qja_gZrvI&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=10

		
//#6                  Tower of Hanoi
//		int n =hemlo.nextInt();
//		int t1d = hemlo.nextInt();
//	    int t2d = hemlo.nextInt();
//	    int t3d = hemlo.nextInt();
//	    toh(n,t1d,t2d,t3d);
////https://www.youtube.com/watch?v=QDBrZFROuA0&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=12	    
	    

//#7 		
	    
	}

}
