import java.util.*;
public class j_RecursionBacktracking {
	
	
//#1  	         ****** F L O O D   F I L L *****
public static void floodfill(int[][] maze, int sr, int sc, String ans,int[][] visited) {
	int r = maze.length;
	int c = maze[0].length;
	if(sr<0||sc<0||sr==r||sc==c||maze[sr][sc]==1||visited[sr][sc]==1) {
		return;
	}
	if(sr==r-1 && sc==c-1) {
		System.out.println(ans);
	}
	visited[sr][sc] = 1;
	floodfill(maze,sr-1,sc,ans+"t",visited);  //top
	floodfill(maze,sr,sc-1,ans+"l",visited);  //left
	floodfill(maze,sr+1,sc,ans+"d",visited);  //down
	floodfill(maze,sr,sc+1,ans+"r",visited); //right
	visited[sr][sc] = 0;
//https://www.youtube.com/watch?v=R1URUB6_y2k&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=47
}


//#2                 ***** Target Sum Subsets ******
public static void PrintSumSubsets(int[] arr,int idx,String ans, int SumOfSet , int target) {
	if(idx == arr.length) {
		if(SumOfSet==target) {
			System.out.println(ans);
		}
		return;
	}
	PrintSumSubsets(arr,idx+1,ans+ arr[idx] +",",SumOfSet+arr[idx],target);
	PrintSumSubsets(arr,idx+1,ans+"-",SumOfSet,target);
}

//#3                   ******* N Queens *************	
public static void PrintQueens(int[][] chess, String ans, int row) {
	if (row == chess.length) {
		System.out.println(ans);
		return;
	}
	for(int col=0; col<chess.length;col++) {
		if(IsItSafePlaceForQueen(chess,row,col) ==true) {
			chess[row][col]= 1;
            PrintQueens(chess, ans +row + "-" +col + "," ,row+1);
		    chess[row][col]=0;
		}
	}
}
public static boolean IsItSafePlaceForQueen(int[][] chess, int row , int col) {
    // vertical check
	for (int i=row-1,j=col;i>=0;i--) {
		if(chess[i][j]==1) {
			return false;
		}
	}
	// diagonally \
	for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--) {
		if(chess[i][j]==1) {
			return false;
		}
	}
	// diagonally /
	for(int i=row-1,j=col+1;i>=0&&j<=chess.length-1;i--,j++) {
		if(chess[i][j]==1) {
			return false;
		}
	}
	return true;
}
	

	public static void main(String[] args) {
		Scanner hemlo = new Scanner(System.in);
		
		
		
//#1            ****** F L O O D   F I L L ***** 	 	
//	     int n = hemlo.nextInt();
//	     int m = hemlo.nextInt();
//	     int[][] arr = new int[n][m];
//         for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = hemlo.nextInt();
//	        }
//	     }
//         int[][] visited = new int[n][m];
//	        floodfill(arr, 0, 0, "",visited);
//https://www.youtube.com/watch?v=R1URUB6_y2k&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=47	
	    
	        
//#2            ******* Target Sum Subsets ******
//	        int n = hemlo.nextInt();
//	        int[] arr = new int[n];
//	        for(int i=0; i<arr.length; i++) {
//	        	arr[i] = hemlo.nextInt();
//	        }
//	       int target = hemlo.nextInt();
//	       PrintSumSubsets(arr,0,"", 0,target);
		
//#3             ******* N Queens *************	
		int n = hemlo.nextInt();
		int chess[][] = new int[n][n];
		PrintQueens(chess,"",0);

	}

}
