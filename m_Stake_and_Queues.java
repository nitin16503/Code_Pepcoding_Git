import java.util.Stack;
import java.util.*;
import java.util.*;
public class m_Stake_and_Queues {
	
	
	public static boolean handleClosing(Stack<Character> st, char corresoch) {
		if(st.size()==0) {
			return false ;
		}else if(st.peek()!=corresoch) {
			return false;
		}else {
			st.pop();
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner hemlo = new Scanner(System.in);
		
////#1 Introduction to Stacks and its usage	
		
		//*Declaration -->  Stack<data type> name = new Stack<>();		
//		Stack<Integer> name = new Stack<>();
//		
//		Stack<Character> name_1 = new Stack<>();
//		
//		Stack <Boolean> name_2 = new Stack<>();
//		
//		//* push command*//
//		name.push(10);
//		name.push(20);
//		name.push(30);
//		name.push(40);
//		name.push(50);
//		
//		//* Print 
//		System.out.println(name);
//		
//		//* peek command*//
//		System.out.println(name.peek());
//		
//		//* size command*//
//		System.out.println(name.size());
//		
//		//*pop command*//
//		System.out.println(name);
//        name.pop();
//        System.out.println(name);
//		name.pop();
//		System.out.println(name);
//		name.pop();name.pop();name.pop();
//		System.out.println(name+" , size -->" + name.size());
		
//<<<----------------------------------------------------------------------------------------------------->>>		
		
////#2                          Duplicate Brackets		
//		String str = hemlo.nextLine();
//		Stack<Character> st = new Stack<>();
//		for(int i =0;i<str.length();i++) {
//			char ch = str.charAt(i);
//			if(ch ==')') {
//				if(st.peek()=='(') {
//					System.out.println("true");
//					return;//not bracket bounded
//				}else{
//					while(st.peek()!='(') {
//						st.pop();
//					}st.pop();
//				}
//				
//			}else {
//				st.push(ch);
//			}
//		}
//		System.out.println("false");
//		
////#3                             Balanced Brackets
//		String s = hemlo.nextLine();
//		Stack<Character> stk = new Stack<>();
//		for(int i=0; i<s.length();i++) {
//			char ch = s.charAt(i);
//			
//            if(ch=='('|| ch=='{'||ch=='[') {
//            	stk.push(ch);
//            }
//            
//            else if (ch==')'){
//            	boolean val= handleClosing(stk,'(');
//            	if(val=false) {
//            		System.out.println(val+"-");
//            		return;
//            	}
//            } else if (ch==']'){
//            	boolean val= handleClosing(stk,'[');
//            	if(val=false) {
//            		System.out.println(val+"--");
//            		return;
//            	}
//            } else if (ch=='}'){
//            	boolean val= handleClosing(stk,'{');
//            	if(val=false) {
//            		System.out.println(val+"---");
//            		return;
//            	}
//            }	
//		}
//		if(stk.size()==0) {
//			System.out.println(true);
//		}else {
//			System.out.println(false +"!");
//		}

////#4        Next Greater element on the right
//		int n = hemlo.nextInt();
//		int[] ar =new int[n];
//		for(int i =0; i<n; i++) {
//			ar[i] =hemlo.nextInt();
//		}
//		
//		Stack<Integer> stk = new Stack<>();
//		stk.push(ar[n-1]);
//		ar[n-1] = -1;
//		for(int i=n-2;i>=0;i--) {
//			//removal
//			while(stk.size()>0 && stk.peek()<=ar[i]) {
//				stk.pop();
//			}
//			//update
//			if(stk.size()==0) {
//				stk.push(ar[i]);
//				ar[i] = -1;
//			}
//			else if(stk.peek()>ar[i]) {
//				int temp = ar[i];
//				ar[i]= stk.peek();
//				stk.push(temp);
//			}
//		}
//		for(int i =0; i<n; i++) {
//			System.out.println(ar[i]);
//			}
		
////#5          Next Greater Element on the Right | Alternative Solution		
//		int n = hemlo.nextInt();
//		int[] arr =new int[n];
//		for(int i =0; i<n; i++) {
//			arr[i] =hemlo.nextInt();
//		}
//		
//		int[] result = new int[n]; 
//		Stack<Integer> stk = new Stack<>();
//		stk.push(0);
//		
//		for(int i=1;i<n;i++) {
//			//while( arr[stk.peek()]<arr[i] && stk.size()>0) --> not valid , size will show error
//			while(stk.size()>0 && arr[stk.peek()]<arr[i]) {
//				result[stk.peek()] = arr[i];
//				stk.pop(); 
//			}
//			stk.push(i);
//		}
//		while(stk.size()>0) {
//			result[stk.peek()] = -1;
//			stk.pop();
//		}
//		for(int i =0; i<n; i++) {
//		System.out.println(result[i]);
//		}
		
////#6            Stock Span
		int n = hemlo.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n;i++) {
			arr[i] = hemlo.nextInt();
		}
		Stack<Integer> stk = new Stack<>();
		
		int[] result = new int[n];
		result[0] = 1;
		stk.push(0);
		
		for(int i=1;i<n;i++) {
			while(stk.size()>0 && arr[stk.peek()]<arr[i]) {
				stk.pop();
			}
			if(stk.size()==0) {
				result[i] = i+1;
			}
			else if (arr[stk.peek()]>arr[i]) {
				result[i] = i-stk.peek();
			}
			stk.push(i);
		}
		for(int i =0; i<n; i++) {
		System.out.println(result[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
