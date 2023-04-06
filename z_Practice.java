import java.util.*;
public class z_Practice {

	public static boolean isPalindrome(String ss ){
		int i=0;
		int j=ss.length()-1;
		while(i<=j){
			if(ss.charAt(i)==ss.charAt(j)){
				i++;
				j--;
			}else {
				return false;
			}
		} return true;
	}
	public static StringBuilder test1(String str){
		StringBuilder s = new StringBuilder(str);
		int i = s.charAt(1);
			if(s.charAt(i-1)==s.charAt(i)){
				s.deleteCharAt(i);
				System.out.println(s);
			}
		return s;
	}


	public static void main(String[] args) {
		Scanner hemlo = new Scanner(System.in);


//		StringBuilder sb = new StringBuilder("hemloo");
//		System.out.println(sb);
//
//		sb.setCharAt(0,'N');
//		System.out.println(sb);
//
//		sb.setCharAt(1,'i');
//		sb.setCharAt(2,'t');
//		sb.setCharAt(3,'i');
//		sb.setCharAt(4,'n');
//		sb.deleteCharAt(5);
//		System.out.println(sb);
//
//		sb.replace(0, sb.length(),"abcdefijklmnopqrst");
//		System.out.println(sb);
//
//		sb.append('Z');
//		System.out.println(sb);
		String str = hemlo.next();
		System.out.println(test1(str));
		//System.out.println(test2(str));







	}
}