import java.util.Scanner;

public class i_RecursionOnTheWayUp {
	
//#1                   Print Subsequence 			
	public static void printSS(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch = str.charAt(0);
		String temp = str.substring(1);
		printSS(temp,ans+ch);
		printSS(temp ,ans);
		
	}
	
//#2               Print Keypad Combination	
	static String[] codes = {".;", "abc", "def", "ghi", "jkl ", "mno", "pqrs", "tu","vwx", "yz"}; 
	public static void printkpc(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
	    String code = codes[ch - '0'];
		for(int i =0; i<code.length();i++) {
			char code_ch = code.charAt(i);
			printkpc(ros,ans + code_ch);
		}
	}
	
//#3                  Print Stair Path
	public static void PrintStairPath(int n , String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}else if(n<0) {
			return;
		}
		PrintStairPath(n-1,ans+1);
		PrintStairPath(n-2,ans+2);
		PrintStairPath(n-3,ans+3);  
		}

//#4              Print Maze Path
	public static void PrintMazePath(int sr, int sc, int dr, int dc ,String ans) {
		if(sr==dr&& sc==sr) {
			System.out.println(ans);
			return;
		}
		if(sr<dr) {
			PrintMazePath(sr+1,sc,dr,dc,ans+"v");
		}if(sc<dc) {
			PrintMazePath(sr,sc+1,dc,dr,ans + "h");
		}
	}
	
//#5             Print Path Maze With Jumps
	public static void PrintMazePathWithJumps(int sr,int sc, int dr, int dc, String ans) {
		if(sr==dr&&sc==dc) {
			System.out.println(ans);
			return;
		}
		for(int i=1; i<=dr-sr;i++) { //cannot start i=0; , because it will add nothing to sr, and create infinite loop. 
			PrintMazePathWithJumps(sr+i,sc,dr,dr,ans +"v"+i);
		}for(int i=1; i<=dc-sc;i++) {
			PrintMazePathWithJumps(sr,sc+i,dr,dr,ans +"h"+i);
		}for(int i=1;i<=dc-dr && i<dr-sr;i++) {
			PrintMazePathWithJumps(sr+i,sc+i,dr,dc,ans+"d"+i);
		}
	}
	
//#6            Print Permutations 	
	public static void PrintPermutation(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		int l = str.length();
		for(int i=0;i<l;i++) {
			char ch = str.charAt(i);
			String L_str=str.substring(0,i); // we cannot delete character because then string will change.  
		    String R_str= str.substring(i+1);
		    String ro_str = L_str+R_str;
		    PrintPermutation(ro_str,ans+ch);
		}
	}

//#7           Print Encodings
	public static void printEncoding(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		else if(str.length()==1) { 
			char ch = str.charAt(0);
			int chv = ch -'0';
			if(chv==0) {
				return;
			}else {
				char code = (char)('a'+chv-1);
				System.out.println(ans+code);
			}
			
		}else { //str length>=2
			char ch = str.charAt(0);
			String roq = str.substring(1);
			
		    if(ch=='0') {
		    	return; 
		    }else {
		    	int chv = ch - '0';
		    	char code = (char)('a' +chv -1);
		    	printEncoding(roq,ans+code);
		    }
		    String ch12 = str.substring(0,2);
		    String ros  = str.substring(2);
		    
		    int ch12_val = Integer.parseInt(ch12);
		    if(ch12_val<=26) {
		    	char code = (char)('a' +ch12_val -1);
		    	printEncoding(roq,ans+code);
		    }
		}
	}
	 
	
	public static void main(String[] args) {
		Scanner hemlo = new Scanner(System.in);
		

//#1                Print Subsequence 		
//		String str = hemlo.nextLine();
//		printSS(str,"");

//#2            Print Keypad Combination
//		String str = hemlo.nextLine();
//		printkpc(str, "");
		
//#3          Print Stair Path
//	    int n   = hemlo.nextInt();
//		PrintStairPath(n,"");
		
//#4         Print Maze Path 
//		int r = hemlo.nextInt();
//		int c = hemlo.nextInt();
//		PrintMazePath(1,1,r,c,"");
			
//#5        Print Maze Path With Jumps
//		int r = hemlo.nextInt();
//		int c = hemlo.nextInt();
//		PrintMazePathWithJumps(1,1,r,c,"");
		
//#6          Print Permutations 		
//		String str = hemlo.nextLine();
//		PrintPermutation(str,"");

//#7          Print Encodings		
		String str = hemlo.nextLine();
		printEncoding(str,"");
		
	}
}
