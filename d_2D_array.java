import java.util.*;
public class d_2D_array {
	
	public static void input(int r,int c) {
		Scanner hemlo = new Scanner(System.in);
		int [][] arr = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0; j<c; j++) {
				System.out.println(i + " " + j);
				arr[i][j] =hemlo.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0; j<c; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
		
	}
	public static void display(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
	}
   
//<<<<<<<<<<<<<<<<<<<<<<<<<<---- Rotate Shell ---->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
	public static void rotate_shell(int[][] arr, int s, int r) {
    	int[] one_1d= get_1d_from_2d( arr, s );
    	rotate(one_1d,  r);
    	get_2d_from_1d(one_1d,s,arr);
    }
    public static int[] get_1d_from_2d(int[][] arr,int s) {
    	int minr = s-1;
    	int minc = s-1;
    	int maxr = arr.length-s;
    	int maxc = arr[0].length -s;
    	int e = 2*(maxr-minr+1) + 2*(maxc-minc+1)-4;
    	int[] one_1d = new int[e];
    	
        	int ndx=0;
        	//lw
        	for(int i=minr,j=minc;i<=maxr;i++) {
        		one_1d[ndx]= arr[i][j];
        		ndx++;				
        	}minc++;
        	//bw
        	for(int i=maxr,j=minc; j<=maxc; j++) {
        		one_1d[ndx]= arr[i][j];
        		ndx++;
        	}maxr--;
        	//rw
        	for(int i=maxr,j=maxc;i>=minr;i--) {
        		one_1d[ndx]= arr[i][j];
        		ndx++;
        	}maxc--;
        	//tw
        	for(int i=minr,j=maxc;j>=minc;j--) {
        		one_1d[ndx]= arr[i][j];
        		ndx++;
        	}minr--;
        	
        
    	return one_1d;
    }
    
    public static void rotate(int [] one_1d,int r) {
    	r=r%one_1d.length;
    	if(r<0) {
    		r=r+one_1d.length;
    	}
    	reverse(one_1d,0,one_1d.length-r-1);
    	reverse(one_1d,one_1d.length-r , one_1d.length-1);
    	reverse(one_1d,0,one_1d.length-1);
    }
    public static void	reverse(int[] arr,int sp, int ep) {
    	while(sp<ep) {
    		int temp = arr[sp];
    		arr[sp]= arr[ep];
    		arr[ep] = temp;
    		sp++;
    		ep--;
    	}
    }
    	   
    public static void get_2d_from_1d(int[]one_1d, int s, int[][] arr) {
    	int minr = s-1;
    	int minc = s-1;
    	int maxr = arr.length-s;
    	int maxc = arr.length -s;
    	int ndx=0;
    	//lw
    	for(int i=minr,j=minc;i<=maxr;i++) {
    		 arr[i][j]=one_1d[ndx];
    		ndx++;				
    	}minc++;
    	//bw
    	for(int i=maxr,j=minc; j<=maxc; j++) {
    		arr[i][j]=one_1d[ndx];
    		ndx++;
    	}maxr--;
    	//rw
    	for(int i=maxr,j=maxc;i>=minr;i--) {
    		arr[i][j]=one_1d[ndx];
    		ndx++;
    	}maxc--;
    	//tw
    	for(int i=minr,j=maxc;j>=minc;j--) {
    		arr[i][j]=one_1d[ndx];
    		ndx++;
    	}minr--;
    }
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<---------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	public static void main(String[] args) {
		Scanner hemlo = new Scanner(System.in);
		
		
//<<--------------------------2 - D   A R R A Y-------------------------------------->>--------------------------------->> 		

//#                          Declaration of an Array  
//      int [][] array_name;
//#                         Assigning size to Array
//      array_name = new int[3][5];
//#                      Declaration & Assigning size to array      
//	   int [][] arr = new int[3][5];  // by default values are zero	
//#                      No. of Rows
//		System.out.println(arr.length);
//#                      No. of Column
//		System.out.println(arr[0].length);  //OR
//		System.out.println(arr[1].length);  //OR
//		System.out.println(arr[2].length);  
		
		
////#1	                     2d Arrays Demo
//		System.out.println("enter no. of rows in an array");
//		int r = hemlo.nextInt();
//		System.out.println("enter no. of column in an array");
//		int c = hemlo.nextInt();
//	    int[][] arr = new int[r][c];
//	    //taking input from user
//		for(int i =0; i<r;i++) {
//			for(int j=0;j<c; j++) {
//				arr[i][j]= hemlo.nextInt();
//			}
//		}
//		//printing whole 2D Array
//		for(int i =0; i<r;i++) {
//			for(int j=0;j<c; j++) {
//				System.out.print(arr[i][j] +" , ");
//				
//			}System.out.println();
//		}
		
		
////#2                      Matrix Multiplication	
		//1st array
//		System.out.println("enter no. of rows of 1st array");
//		int r1 = hemlo.nextInt();
//		System.out.println("enter no. of columns of 1st array");
//		int c1 = hemlo.nextInt();
//		int [][] m1 = new int[r1][c1];
//		for(int i=0 ; i<m1.length; i++) {
//			for(int j=0; j<m1[0].length;j++) {
//				m1[i][j] = hemlo.nextInt();
//			}
//		}
//		//2nd array
//		System.out.println("enter no. of rows of 2nd array");
//		int r2 = hemlo.nextInt();
//		System.out.println("enter no. of columns of 2nd array");
//		int c2 = hemlo.nextInt();
//		int [][] m2 = new int[r2][c2];
//		for(int i=0 ; i<m2.length; i++) {
//			for(int j=0; j<m2[0].length;j++) {
//				m2[i][j] = hemlo.nextInt();
//			}
//		}
//		//valid or not
//		if(c1!=r2) {
//			System.out.println("invalid");
//			return;
//		}
//		// required array
//
//		int [][] m = new int[r1][c2];
//		for(int i=0 ; i<m2.length; i++) {
//			for(int j=0; j<m2[0].length;j++) {
//				for(int k=0; k<c1 ; k++) {
//					m[i][j]+= m1[i][c1] *m2[c1][j];
//				}
//			}
//		}
//		//print value of required matrix
//		for(int i=0 ; i<m2.length; i++) {
//			for(int j=0; j<m2[0].length;j++) {
//				System.out.print(m[i][j] + " , ");
//			}
//			System.out.println();
//		}
		
		
////#3             The State Of Wakanda - 1(Wave Traversal)		
//		System.out.println("write no. of rows");
//		int r = hemlo.nextInt();
//		System.out.println("write no. of columns");
//		int c = hemlo.nextInt();
//		int[][] arr = new int[r][c];
//		for(int i=0; i<r;i++) {
//			for(int j=0; j<c; j++) {
//				arr[i][j]= hemlo.nextInt();
//			}
//		}
//
//		for(int i =0; i<arr[0].length; i++) {
//			if(i%2==0) {
//				for(int j=0; j<arr.length;j++) {
//					System.out.println(arr[j][i]);
//				}
//			}else {
//				for(int k=arr.length-1; k>=0;k--) {
//					System.out.println(arr[k][i]);
//				}
//			}
//		}
		
////#4                   Spiral Traversal 
//		System.out.println("write no of rows and colomns");
//		int r = hemlo.nextInt();
//		int c = hemlo.nextInt();
//		int[][] arr = new int[r][c];
//		for (int i=0; i<r; i++) {
//			for(int j =0; j<c; j++) {
//				arr[i][j] = hemlo.nextInt();
//			}
//		}
//		for (int i=0; i<r; i++) {
//			for(int j=0; j<c;j++) {
//				System.out.print(arr[i][j] +" ");
//			}System.out.println();
//		}
//		
//	    int minr = 0;
//	    int minc = 0;
//	    int maxr = arr.length -1;
//	    int maxc = arr[1].length -1;
//	    int tne = r*c;
//	    int count = 0;
//	    
//	    while(tne>count) {
//	    	//left wall
//	    	for(int i =minr,j=minc;i<=maxr&&tne>count;i++) {
//	    		System.out.println(arr[i][j]);
//	    		count++;
//	    	}
//	    	minc++;
//	    	
//	    	//bottom wall
//	    	for(int i =maxr,j=minc;j<=maxc&&tne>count;j++) {
//	    		System.out.println(arr[i][j]);
//	    		count++;
//	    	}
//	    	maxr--;
//	    	
//	    	//right wall
//	    	for(int i =maxr,j=maxc;i>=minr&&tne>count;i--) {
//	    		System.out.println(arr[i][j]);
//	    		count++;
//	    	}maxc--;
//	    	
//	    	//top wall
//	    	for(int i =minr,j=maxc;j>=minc&&tne>count;j--) {
//	    		System.out.println(arr[i][j]);
//	    		count++;
//	    	}minr++;
//	    	
//	    }
   

////#5                   Exit Point of a Matrix   
//		 System.out.println("write no. of rows");
//		 int r = hemlo.nextInt();
//		 System.out.println("write no. of columns");
//		 int c = hemlo.nextInt();
//		 int [][] arr = new int[r][c];
//		 for(int i =0; i<r; i++) {
//			 for(int j=0; j<c; j++) {
//				 arr[i][j] = hemlo.nextInt();
//			 }
//		 }
//		 for(int i =0; i<r; i++) {
//			 for(int j=0; j<c; j++) {
//				 System.out.print(arr[i][j] + " ");
//			 }System.out.println();
//		 }
//		 
//		 
//		 int i =0;
//		 int j =0;
//		 int d = 0; // 0 - east , 1-south , 2- west, 3-north
//		 
//		 while(true) {
//			 d= (d+arr[i][j])%4;
//			 
//			 if(d==0) {
//				 j++;
//			 }else if (d==1) {
//				 i++;
//			 }else if(d==2) {
//				 j--;
//			 }else if(d==3) {
//				 i--;
//			 }
//			 if(j<0) {
//				 j++;
//				 break;
//			 }else if (i<0) {
//				 i++;
//				 break;
//			 }else if (i==arr.length) {
//				 i--;
//				 break;
//			 }else if (j==arr[0].length){
//				 j--;
//				 break;
//			 }
//		 }System.out.println(i);
//		 System.out.println(j); 
		

////#6               Rotate by 90 degree	
//		System.out.println("enter no. of rows");
//		int c = hemlo.nextInt();
//		System.out.println("enter no. of columns");
//		int r = hemlo.nextInt();
//		int [][] arr = new int[r][c];
//		for(int i =0;i<r;i++) {
//			for(int j =0;j<c;j++) {
//				arr[i][j]= hemlo.nextInt();
//			}
//		}
//		for(int i =0;i<r;i++) {
//			for(int j =0;j<c;j++) {
//				System.out.print(arr[i][j]);
//			}System.out.println();
//		}
//		
//		//transpose 
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i; j<c;j++) {
//				int temp= arr[i][j];
//				arr[i][j] =arr[j][i];
//				arr[j][i] = temp;
//			}
//		}// reverse 
//		for(int i=0; i<r; i++) {
//			int ri = arr[0].length-1;
//			int li =0;
//			while(li<ri) {
//				int temp = arr[i][ri];
//				arr[i][ri]=arr[i][li];
//				arr[i][li]=temp;
//				li++;
//				ri--;
//			}
//		}
		
		
//#7                        S h e l l   R o t a t e
//		System.out.println("enter no. of rows");
//		int n = hemlo.nextInt();
//		System.out.println("enter no. of columns");
//		int c = hemlo.nextInt();
//		int[][] arr = new int[n][c];
//		for(int i=0; i<n;i++) {
//			for(int j =0; j<c; j++) {
//				arr[i][j] = hemlo.nextInt();
//			}
//		}
//		System.out.println("enter shell no. which u want to rotate");
//		int s = hemlo.nextInt();
//		System.out.println("enter no. of times u want to rotate");
//		int r = hemlo.nextInt();
//		
//		
//		rotate_shell(arr,s,r);
//		display(arr);

		
//#8                       Diagonal Traversal		
//		System.out.println("enter no. of rows");
//		int r = hemlo.nextInt();
//		System.out.println("enter no. of colunm");
//		int c = hemlo.nextInt();
//		int [][] arr = new int[r][c];
//		for(int i =0;i<arr.length;i++) {
//			for(int j =0; j<arr[0].length;j++) {
//				arr[i][j] = hemlo.nextInt();
//			}
//		}
//		display(arr);
//		
//		
//		for(int p=0;p<arr.length;p++) {
//			for(int i=0,j=p;j<arr.length;j++,i++) {
//				System.out.println(arr[i][j]);
//			}
//		}
		
		
//#9                        Saddle Point		
//		System.out.println("enter no. of rows");
//		int r = hemlo.nextInt();
//		System.out.println("enter no. of columns");
//		int c = hemlo.nextInt();
//		int [][] hehe = new int[r][c];
//		for(int i=0; i<hehe.length;i++) {
//			for(int j=0; j<hehe[0].length; j++) {
//				hehe[i][j]=hemlo.nextInt();
//			}
//		}
//		display(hehe);
//		
//		for(int i=0;i<hehe.length;i++) {
//			int sj =0;
//			for(int j =1;j<hehe[0].length;j++) {
//				if(hehe[i][j]<hehe[i][sj]){
//					 sj=j;
//				}
//			}
//			boolean flag =true;
//			for(int k=0; k<hehe.length;k++) {
//				if(hehe[i][sj]<hehe[k][sj]) {
//					flag =false;
//					break;
//				}
//			}if(flag =true) {
//				System.out.println(hehe[i][sj]);
//				return;
//			}
//		}System.out.println("invalid output");
	
		
		
////#10                 Search in a sorted 2-D Array		
//		System.out.println("entern no. of rows");
//		int r = hemlo.nextInt();
//		System.out.println("enter no. of columns");
//		int c = hemlo.nextInt();
//		int [][] arr = new int[r][c];
//		for(int i =0; i<r; i++) {
//			for(int j=0; j<c; j++) {
//				arr[i][j]= hemlo.nextInt();
//			}
//		}
//		display(arr);
//		System.out.println("enter number ");
//		int n = hemlo.nextInt();
//		 
//		int i =0;
//		int j=arr[0].length-1;
//		while(i<arr.length&& j>=0) {
//			if(n==arr[i][j]) {
//				System.out.println(i+" " + j);
//				return;
//			}else if(n>arr[i][j]){
//				i++;
//				
//			}else{
//				j--;
//			}
//			
//		}System.out.println("not found");
			
		
		


 




		
		
	}

}
