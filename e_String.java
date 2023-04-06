import java.util.*;
public class e_String {
//                    I S    P A L I N D R O N E 
	public static boolean check(String st) {
		int i =0;
		int j = st.length()-1;
		boolean test = true;
		while(i<=j) {
			if(st.charAt(i)==st.charAt(j)) {
				i++;
				j--;
			}else {
				test=false ;
				break;
			}
		}return test;
	}
	public static void is_palindrone(String s) {
		for(int i=0; i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String st =s.substring(i,j);
				if(check(st)==true) {
					System.out.println(s.substring(i,j));
				}
			}
		}
	}
	
//                 S T R I N G      C O M P R E S S I O O N  		
	public static String compression_1(String str) {

		String result = str.charAt(0) + "";
		for(int i=1; i<str.length();i++) {
			char ch1 = str.charAt(i-1);
			char ch2 = str.charAt(i);
			if(ch2!=ch1) {
				result+=ch2;
			}
		}
		
		return result;
	}
    public static String compression_2(String str) {
    	String Result = str.charAt(0) + "";
    	int count =1;
    	for(int i=1;i<str.length();i++) {
    		
 
    		char a = str.charAt(i-1);
    		char b = str.charAt(i);
    		if(a==b) {
    			count++;
    		}else {
    			if(count>1){  
    				Result+= count;
    				count=1;
    			}
    			Result+=b;
    		}
    	}
    	if(count>1) {
			Result+=count	;
		} 
    	return Result;
    }
	
//                 Toggle Case of Characters in a String  
    public static String Toogle_case( String str) {
//    	 p-a =P-A;
    	StringBuilder sb = new StringBuilder(str);
    	for(int i=0; i<str.length();i++) {
    		char ch = sb.charAt(i);
    		if(ch>='a' && ch<='z') {
    			char uch = (char)('A' + ch -'a');
    			sb.setCharAt(i, uch);
    		}else if(ch>='A' && ch<='Z') {
    			char lch =(char)('a' + ch -'A');
    			sb.setCharAt(i, lch);
    		}
    		
     	}return sb.toString();
    }
//        String With Difference Of Every Two Consecutive Character
    public static String solution(String str) {
    StringBuilder result = new StringBuilder();
    	result.append(str.charAt(0));
    	for(int i=1;i<str.length();i++) {
    		char a = str.charAt(i-1);
    		char b = str.charAt(i) ;
    		int dif = b - a ;
    		result.append(dif);
    		result.append(b);
    	
    	
    	}return result.toString();
    }
 
////         Print All Permutations Of A String Iteratively	    
    public static void ans(String str) {
    	int length = str.length();
    	int factorial=1;
    	for(int i=2; i<=length;i++) {
    		factorial *=i;
    	}
    	for(int i=0; i<factorial; i++) {
    		StringBuilder result = new StringBuilder(str);
    		int temp =i;
    		for(int j=length;j>0;j--) {
    			int q = temp/j;
    			int r = temp%j;
    			System.out.print(result.charAt(r));
    			result.deleteCharAt(r);
    			temp=q;
    		}
    		System.out.println();
    	}
    }
    
    
    
	public static void main(String[] args) {
		Scanner hemlo = new Scanner(System.in);
		
////                     declaration of string		
//		String a;
//		
////                     assigning value		
//		String b = "i am good , how are u ?";
//		String b = new String("i am good , how r u");
////                     printing value     		
//		System.out.println(b);
//
////                    taking string input from user            		
//		
//		String n = hemlo.next(); // upto a space 
//		System.out.println(n);
//		String h = hemlo.nextLine(); // take whole sentence 
//		System.out.println(h);
//
////                   length of string                   		
//		System.out.println(b.length());
//		
////	                 character of string	
//		System.out.println(b.charAt(0));
//		
//		for(int i =0; i<b.length();i++) {
//			System.out.println(b.charAt(i));
//		}
//		
////                   S u b -- S t r i n g                		
//		System.out.println(b.substring(0,2));
//		System.out.println(b.substring(3));
//		
//		for(int i=0; i<b.length();i++) {
//			for(int j=i+1; j<=b.length(); j++) {
//				System.out.println(b.substring(i,j));
//				}
//			}
//				
////                     Addition of Strings				
//		String s1 = "he";
//		String s2 = "mlo";
//		String s3 = s1 +":-)" + s2;
//		System.out.println(s3);
//		s3 += " 3"+ "domsto";
//		System.out.println(s3);
//				
////                         S P L I T   				
//		String k = "i am a good boy";
///////// int [] name = new int[];
//		String[] name = k.split(" ");
//		for(int i=0;i<name.length;i++) {
//			System.out.println(name[i]);
//		}
				

//#1                    Print All Palindromic String 		
		System.out.println("enter a string");
		String s = hemlo.nextLine();
		is_palindrone(s);
			
//-------------------------------->>>  String Builder  <------------------------------------------- 
	
//		StringBuilder sb = new StringBuilder("hemlo domsto");
//		System.out.println(sb);
//		
//		char c = sb.charAt(4); //get 
//		System.out.println(c);
//		
//		sb.setCharAt(5,'%');   //update
//		System.out.println(sb);
//		
//		sb.insert(5,'&');     // insert
//		System.out.println(sb);
//		
//		sb.deleteCharAt(6);   // remove
//		System.out.println(sb);
//		
//		sb.append('-');       // add at last
//		System.out.println(sb);

		
//#1                   String Compression 		
		
//	    System.out.println("enter string");	
//	    String str = hemlo.nextLine();
//	    System.out.println(compression_1(str));
//	    System.out.println(compression_2(str));

		
//#2              Toggle Case of Characters in a String
//		System.out.println("enter ur string");
//		String str = hemlo.nextLine();
//		System.out.println(Toogle_case(str));
		
//#3        String With Difference Of Every Two Consecutive Characters	
//		System.out.println("enter ur string");
//		String str = hemlo.nextLine();
//		System.out.println(solution(str));

//#4        Print All Permutations Of A String Iteratively	
//		System.out.println("enter ur string");
//		String str = hemlo.nextLine();
//		ans(str);
		
		
//>>>>>>>>>>>>>>>>>>>>---------------Introduction To Arraylists------------------<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<		
		
//// declaration 		
//		ArrayList<Integer> int_type = new ArrayList<>();
//		ArrayList<String> string_type = new ArrayList<>();
//		ArrayList<Integer> list = new ArrayList<>();
//		//ArrayList does not have a definite size.
//// add
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		System.out.println(list + "-->" + list.size()); // list size
//		list.add(50);
//		list.add(60000);
//		System.out.println(list + "->" + list.size());
//// get		
//		int val = list.get(1);
//		System.out.println(val);
//// update
//		list.set(1,1000);
//		System.out.println(list);
//		list.set(1, 20);
//// remove
//		list.remove(4);
//		list.remove(4);
//		System.out.println(list + "-->" + list.size() );
//
////#
//		string_type.add("hemlo");
//		string_type.add("domsto");
//		string_type.add(" kya haal ha.");
//		System.out.println(string_type);
//		string_type.remove(1);
//		System.out.println(string_type);
//		
//		for(int i =0; i<string_type.size();i++) {
//			String str = string_type.get(i);
//			System.out.println(str);
//		}
//		for(String val1:string_type) {
//			System.out.println(val1);
//		}


		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
