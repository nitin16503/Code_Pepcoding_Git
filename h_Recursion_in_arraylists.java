import java.util.*;
public class h_Recursion_in_arraylists {
	
//#1	               G e t -- S u b s e q u e n c e 	
	public static ArrayList<String> gss(String str) {
		if(str.length()==0) {
			ArrayList<String> base_result = new ArrayList<>();
			base_result.add("");
			return base_result;
		}
		char ch = str.charAt(0);
	    String ros = str.substring(1);
	    ArrayList<String> temp =  gss(ros);
	    ArrayList<String> result = new ArrayList<>();
	    for(String val:temp) {
	    	result.add(val);
	    }
	    for(String val : temp) {
	    	result.add(ch + val);
	    }
	    return result;
	}

//#2                 Get   Keypad   Combination 	
	static String[] codes = {".;", "abc", "def", "ghi", "jkl ", "mno", "pqrs", "tu","vwx", "yz"};
	public static ArrayList<String> getKPC(String str){
		if(str.length()==0) {
			ArrayList<String> base_case = new ArrayList<>();
			base_case.add("");
			return base_case;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> temp = getKPC(ros);
		ArrayList<String> result = new ArrayList<>();
		
		String pqrs = codes[ch - '0'];
		for(int i =0; i<pqrs.length(); i++) {
			char p_q_r_s = pqrs.charAt(i);
			
			for(String val:temp) {
				result.add(p_q_r_s + val);
			}
		}
		return result;
	}
	
//#3                     Get Stair Paths	
	public static ArrayList<String> getStairPath(int n){
		if(n==0) {
			ArrayList<String> base_case = new ArrayList<>();
			base_case.add("");
			return base_case;
		}else if (n<0) {
			ArrayList<String> base_case = new ArrayList<>();
			return base_case;
		}
		
		ArrayList<String> faith_1 = getStairPath(n-1);
		ArrayList<String> faith_2 = getStairPath(n-2);
		ArrayList<String> faith_3 = getStairPath(n-3);
		ArrayList<String> final_path = new ArrayList<>();
		
		for(String val:faith_1) {
			final_path.add(1+val);
		}
		for(String val:faith_2) {
			final_path.add(2+val);
		}
		for(String val:faith_3) {
			final_path.add(3+val);
		}
		return final_path;
	}
	
//#                      G e t  M a z e   P a t h 	
	//sr---> source row
	//sc--->source column
	//dr--->destination row
	//dc--->destination column	
    public static ArrayList<String>  getMazePath (int sr, int sc, int dr, int dc){
    	if(sr==dr & sc==dc) {
    		ArrayList<String> base_case = new ArrayList<>();
    		base_case.add("");
    		return base_case;
    	}
    	
    	ArrayList<String> H_getMazePath = new ArrayList<>();
    	ArrayList<String> V_getMazePath = new ArrayList<>();
    	
    	if(sc<dc) {
    		H_getMazePath = getMazePath(sr,sc+1,dr,dc);
    	}
    	if(sr<dr) {
    		V_getMazePath = getMazePath(sr+1,sc,dr,dc);
    	}
    	
    	ArrayList<String> result = new ArrayList<>();
    	
    	for(String val:H_getMazePath) {
    		result.add("h" +val);
    	}
    	for(String val:V_getMazePath) {
    		result.add("v"+ val);
    	}
    	return result;
    }
	
//#                     Get Maze Path With Jump
    //sr---> source row
  	//sc--->source column
  	//dr--->destination row
  	//dc--->destination column
    public static ArrayList<String> getMazePathJump(int sr, int sc, int dr,int dc){
    	
    	if(sr==dr&& sc==dc) {
    		ArrayList<String> base_case  = new ArrayList<>();
    		base_case.add("");
    		return base_case;
    		}
    	
    	ArrayList<String> result = new ArrayList<>();
    	
    	//horizontal moves
    	for(int jmp=1;jmp<=dc-sc; jmp++) {
    		ArrayList<String> hpath = getMazePathJump(sr,sc+jmp,dr,dc);
    		for(String val:hpath) {
    			result.add("h"+jmp +val);
    		}
    	}
    	//vertical moves
    	for(int jmp=1;jmp<=dr-sr; jmp++) {
    		ArrayList<String> vpath = getMazePathJump(sr+jmp,sc,dr,dc);
    		for(String val:vpath) {
    			result.add("v"+jmp +val);
    		}
    	}
    	//diagonal moves 
    	for(int jmp=1;jmp<=dc-sc && jmp<=dr-sr; jmp++) {
    		ArrayList<String> dpath = getMazePathJump(sr+jmp,sc+jmp,dr,dc);
    		for(String val:dpath) {
    			result.add("d"+jmp +val);
    		}
    	}
    	
    	return result;
    }
	
	
	public static void main(String[] args) {
		Scanner hemlo = new Scanner(System.in);

		
		
//#1	             G e t -- S u b s e q u e n c e 	
//		String str = hemlo.nextLine();
//		ArrayList<String> result = gss(str);
//		System.out.println(result);
		
		
//#2                Get Keypad Combination 	
//		String str = hemlo.nextLine();
//		System.out.println(getKPC(str));

//#3                Get Stair Paths
//		int n = hemlo.nextInt();
//		System.out.println(getStairPath(n));

//#4               Get Maze Path
//		int r = hemlo.nextInt();
//		int c = hemlo.nextInt();
//		System.out.println(getMazePath(0,0,r-1,c-1));

//#5               Get Maze Path With Jump
//		int r = hemlo.nextInt();
//		int c = hemlo.nextInt();
//		System.out.println(getMazePathJump(1,1,r,c));

		
		
		
	}

}
