//import java.util.Stack;
import java.util.*;
public class o_Stack{
	

public static int priority(char operator) {
	if(operator=='+') {
		return 1;
	}else if(operator =='-') {
		return 1;
	}else if(operator =='/') {
		return 2;
	}else {
		return 2;
	}
}

public static int operation_result (int v1, int v2, char ch) {
	if (ch=='+') {
		return v1+v2;
	}else if(ch=='-') {
		return v1 - v2;
	}else if(ch=='*') {
		return v1*v2;
	}else {
		return v1/v2;
	}
}





    public static void main(String[] args) {

//Declaration of Stack
       // Stack<Integer> st;
    	
//Initialization of stack
       // st = new Stack<>();
//Both in one
    //Stack<Integer> stk = new Stack<>();
    	
//              PUSH
   // stk .push(20);
   // stk.push(90);
   // stk.push(80);
   // stk.push(30);
    //System.out.println(stk);
    	
//             PEEK
    //int p = stk.peek();
    //System.out.println("peek---> " +  p);
    	
//            POP
    //stk.pop();
    //System.out.println(stk);
    //System.out.println("peek---> " + stk.peek());
    	
//           SIZE
    //stk.pop();
    //System.out.println(stk);
    //System.out.println("size ->" +stk.size());
    //System.out.println("peek---> " + stk.peek());

    //stk.pop();
    //System.out.println(stk);
    //System.out.println("size ->" +stk.size());
    //System.out.println("peek---> " + stk.peek());

    //stk.pop();
    //System.out.println(stk);
    //System.out.println("size ->" +stk.size());
// ERROR :- empty stack
    //stk.pop();

   
    	 Scanner hemlo = new Scanner (System.in);
    	
//#1        Duplicate Brackets

//     String str = hemlo.next();
//     Stack<Character> stk = new Stack<>();
//     for(int i =0;i<str.length();i++){
//         if(str.charAt(i)==')'){
//             if(stk.peek()=='('){
//                 System.out.println("duplicate");
//                 return;
//             }else{
//                 while(stk.peek()!='('){
//                     stk.pop();
//                 }stk.pop();
//             }
//         }else{
//             stk.push(str.charAt(i));
//         }
//     }
//     System.out.println("no duplicate");

//#2         Balanced Brackets
     
//       String str = hemlo.nextLine() ;
//       Stack<Character> stk = new Stack<>();
//       for(int i=0;i<str.length();i++) {
//    	   char ch = str.charAt(i);
//    	   //insert 
//    	   if(ch=='('||ch=='['||ch=='{') {
//			   stk.push(ch);  
//		   }
//    	   
//    	   else if (ch==')') {
//    		   if (stk.size()==0) {
//    			   System.out.println("unbalanced");
//    			   return;
//    		   }
//    	       else if(stk.peek()=='(') {
//    			   stk.pop();
//    		   }
//    		   else {
//    			   System.out.println("unbalanced");
//    			   return;
//    		   }
//    	   }
//    	   
//    	   else if (ch==']') {
//    		   if (stk.size()==0) {
//    			   System.out.println("unbalanced");
//    			   return;
//    		   }
//    		   else if(stk.peek()=='[') {
//    			   stk.pop();
//    		   }
//    		   else {
//    			   System.out.println("unbalanced");
//    			   return;
//    		   }
//      		 
//    	   }
//    	   
//    	   else if (ch=='}') {
//    		   if (stk.size()==0) {
//    			   System.out.println("unbalanced ");
//    			   return;
//    		   }
//    		   else if(stk.peek()=='{') {
//      		    	stk.pop();
//      		    }
//      		    else {
//      		    	System.out.println("unbalanced");
//     			   return;
//      		    }
//    	   }
//    	   
//       } 
//       if(stk.size()==0) {
//    	   System.out.println("balanced");    	   
//       }
//       else System.out.println("unbalanced"+stk.pop()+stk.pop());
//       
     
 
//#3            Next Greater element on the right 
    	 
//    	 int n = hemlo.nextInt();
//    	 
//    	 int ar1[] = new int[n];
//    	 for(int i =0; i<n;i ++) {
//        	 ar1[i]= hemlo.nextInt();
//         }
//    	 int ar2 [] = new int [n];
//    	 Stack<Integer> stk = new Stack<>();
//    	 for(int i =n-1; i>=0;i--) {
//    		 //greatest element in right
//    		 while(stk.size()>0 &&stk.peek()<=ar1[i]) {
//    			 stk.pop();
//    		 }
//    		
//    		//if stack size is 0
//    		if(stk.size()==0) {
//    			ar2[i] = -1;
//    		} 
//    		//if stack has greater element than ar1[i]
//    		else {
//    			ar2[i] = stk.peek();
//    		}
//    		
//    		stk.push(ar1[i]); 
//    	 }
//    	 
//    	 for(int i =0; i<n;i ++) {
//    		 System.out.println(ar2[i]);
//    	 }
    		
//#4          Next Greater Element on the Right | Alternative Solution
    	 
//    	 int n= hemlo.nextInt();
//    	 int ar1[] = new int[n];
//    	 for(int i =0;i<n;i++) {
//    		 ar1[i] = hemlo.nextInt();
//    	 }
//    	 int ar2[] = new int[n];
//    	 Stack<Integer> stk = new Stack<>();
//    	 stk.push(0);
//    	 for(int i =1;i<n;i++) {
//    		  
//    		 while(stk.size()>0 && ar1[i]>ar1[stk.peek()]) {
//    			 ar2[stk.peek()] = ar1[i]; 
//    			 stk.pop();
//    		 }stk.push(i);  
//    	  }
//    	 while(stk.size()!=0) {
//    		 ar2[stk.peek()]=-1;
//    		 stk.pop();
//    	 }
//    	 for(int i =0; i<n;i ++) {
//    		 System.out.println(ar2[i]);
//    	 }
    	 
//#           Next Smaller Element On The The Right 
//    	 int  n= hemlo.nextInt();
//    	 int arr1[] = new int[n];
//    	 for(int i =0;i<n;i++) {
//    		 arr1[i] = hemlo.nextInt();
//    	 }
//    	 int arr2[]= new int[n];
//    	 Stack<Integer>  stk = new Stack<>();
//    	 stk.push(arr1[n-1]);	
//    	 arr2[n-1] =-1;
//    	 for(int i =n-2;i>=0;i--) {
//    		 
//            if(stk.peek()>=arr1[i]) {
//             	arr2[i] = -1;
//            	stk.push(arr1[i]);
//            }
//            else {
//            	arr2[i]= stk.peek();
//            }
//            
//    	 }
//    	 for(int i =0; i<n;i ++) {
//    		 System.out.println(arr2[i]);
//    	 }
 
//#           Next Smaller Element On The The Right (Alternative)
//    	 int  n= hemlo.nextInt();
//    	 int arr1[] = new int[n];
//    	 for(int i =0;i<n;i++) {
//    		 arr1[i] = hemlo.nextInt();
//    	 }
//    	 int arr2[]= new int[n];
//    	 Stack<Integer>  stk = new Stack<>();
//    	 stk.push(0);
//    	 for(int i =1;i<=n-1;i++) {
//    
//    		 if(arr1[i] > arr1[stk.peek()]) {
//    			 stk.push(i);
//    		 }
//    		 else{
//    			 while(stk.size()!=0 && arr1[stk.peek()]>arr1[i]) {
//    			 arr2[stk.peek()] = arr1[i];
//    			 stk.pop();
//    		          }stk.push(i);
//    		     }
//    	 }
//    	 while(stk.size()!=0) {
//    		 arr2[stk.peek()] = -1;
//    		 stk.pop();
//    	 }
//    	 for(int i =0; i<n;i ++) {
//		 System.out.println(arr2[i]);
//	 }    	 
    	
    	 
//#5            Stock Span ( Next Greatest element on Left)
    	 
//    	 int n= hemlo.nextInt();
//    	 int ar1[] = new int[n];
//    	 for(int i =0;i<n;i++) {
//    		 ar1[i] = hemlo.nextInt();
//    	 }
//    	 int ar2[] = new int[n];
//    	 Stack<Integer> stk = new Stack<>();
//    	 stk.push(0);
//    	 ar2[0] =1;
//    	 
//    	 for(int i =1;i<n;i++) {
//    		 
//    		 while(stk.size()>0 && ar1[i] >ar2[stk.peek()] ) {
//    			 stk.pop();
//    		 }
//    		 if(stk.size()==0) {
//    			 ar2[i] = i+1;
//    		 }
//    		 else {
//    			 ar2[i] = i - stk.peek();
//    		 }
//    		 stk.push(i);
//    	 }
//    	 for(int i =0; i<n;i ++) {
//		 System.out.println(ar2[i]);
//	 }
 
//#6              Largest Area Histogram 
     
//    	 int n = hemlo.nextInt();
//    	 int arr[] = new int[n];
//    	 for(int i =0;i<n;i++) {
//    		 arr[i] = hemlo.nextInt();
//    	 }
//    	//next smallest element on the right 
//    	 int rb[] = new int[n];
//    	 Stack<Integer> stk = new Stack<>();
//    	 
//         stk.push(arr.length-1);
//         rb[n-1]= n;
//         for(int i=arr.length-2;i>=0;i--) {
//        	 while(stk.size()>0 && arr[stk.peek()]>=arr[i]) {
//        		 stk.pop();
//        	 }
//        	 if(stk.size()==0) {
//        		 rb[i] = n;
//        	 }else {
//        		 rb[i] = stk.peek();
//        	 }
//        	 stk.push(i);
//         }
//    	 
//       //emptying Stack 
//         while(stk.empty()!=true) {
//        	 stk.pop();
//         }
//       //next smallest element on the left
//    	 int lb[] = new int[n];
//    	 stk.push(0);
//         lb[0]= -1;
//         for(int i=1;i<=n-1;i++) {
//        	 while(stk.size()>0 && arr[stk.peek()]>=arr[i]) {
//        		 stk.pop();
//        	 }
//        	 if(stk.size()==0) {
//        		 lb[i] = -1;
//        	 }else {
//        		 lb[i] = stk.peek();
//        	 }
//        	 stk.push(i);
//         }
//    	 
//    	//Max Area	 
//      	 int max_area = 0;
//    	 for(int i =0; i<arr.length;i++) {
//    		 int width = rb[i] - lb[i]-1;
//    		 int area = width*arr[i];
////    		 System.out.println(area);
//    		 if(max_area<area) {
//    			 max_area = area;
//    		 }
//    	 }
//        System.out.println(max_area);
     
//#7             Sliding Window Maximum 
    	 
//    	 int n = hemlo.nextInt(); 
//    	 int arr[] = new int[n];
//    	 for(int i =0;i<n;i++) {
//    		 arr[i] = hemlo.nextInt();
//    	 }
//    	 int k = hemlo.nextInt(); // size
//    	 
//    	 int ans[] = new int[n];
//    	 Stack<Integer> stk = new Stack<>();
//    	 stk.push(arr.length-1);
//    	 ans[arr.length-1]=arr.length;
//    	 //finding next greatest element on right
//    	 for(int i =n-2;i>=0;i--) {
//    		 while( stk.size()>0 && arr[stk.peek()]<=arr[i]  ) {
//    			 stk.pop();
//    		 }
//    		 if(stk.size()==0) {
//    			 ans[i]=arr.length;
//    		 }else {
//    			 ans[i] = stk.peek();
//    		 }
//    		 stk.push(i);
//    	 }
//    	 //finding maximum window slide
//    	 int j=0;
//    	 for(int i =0; i<=arr.length-k;i++) {
//    		 //enter the loop to find of maximum of window starting at i
//    		 if(i>j) {
//    			 j=i;
//    		 }
//    		 while(ans[j]<i+k) { //checking greatest among k no. 
//    			 
//    			 j = ans[j];
//    		 } 
//    		 System.out.println(arr[j]);
//    		 System.out.println();
//    	 }
    	 
 //#7                          Infix Evaluation   	
    	 
//    	 String str = hemlo.nextLine();
//    	 Stack<Integer> operand = new Stack<>();
//    	 Stack<Character> operator = new Stack<>();
//    	 
//    	 for(int i=0; i<str.length();i++) {
//    		 char ch = str.charAt(i);
//    		 
//    		 if(ch=='(') {
//    			operator.push(ch); 
//    		 }
//    		 else if(Character.isDigit(ch)) {
//    			 operand.push(ch - '0'); //char to int 
//    		 }
//    		 
//    		 else if (ch == ')') {
//    			 while(operator.peek()!=')') {
//    				 char sign = operator.pop();
//    				 int v2 = operand.pop();
//    				 int v1 = operand.pop();
//    				 
//    				 int temp = operation_result(v1,v2,sign);
//    				 operand.push(temp);
//    			 }
//    			 operator.pop();
//    		 }
//    		 
//    		 else if(ch=='/' || ch=='*' ||ch=='+' || ch=='-') {
//    			 while(operator.size()>0 && operator.peek()!='(' && priority(ch)<= priority(operator.peek())) {
//    				 char sign = operator.pop();
//    				 int v2 = operand.pop();
//    				 int v1 = operand.pop();
//    				 
//    				 int temp = operation_result(v1, v2, sign);
//    				 operand.push(temp);
//    			 }
//    			 operator.push(ch);
//    		 }
//    	 }
//    	 
//    	 while(operator.size(	)!=0) {
//    		 char sign = operator.pop();
//			 int v2 = operand.pop();
//			 int v1 = operand.pop();
//			 
//			 int temp = operation_result(v1, v2, sign);
//			 operand.push(temp);
//		   }
//    	 System.out.println(operand.peek());
        
      
///#8                                  Infix Conversions

//    	 String input = hemlo.nextLine();
//    	 Stack <String> postfix = new Stack<>();
//    	 Stack <String>  prefix = new Stack<>();
//    	 Stack <Character> operators = new Stack<>();
//    	 
//    	 for(int i =0; i<input.length();i++) {
//    		 char ch = input.charAt(i);
//    		 
//    		 if(ch=='(') {
//    			 operators.push(ch);
//    		 }
//    		 else if ((ch>='0' && ch<='9') || (ch>='a' && ch<='z') || (ch>='A'&& ch<='Z')) {
//    			 postfix.push(ch + "");
//    			 prefix.push(ch + "");
//    		 }
//    		 else if (ch==')') {
//    			 while(operators.peek()!='(') {
//    				 char sign = operators.pop();
//    				
//    				 String v2 = postfix.pop(); 
//    				 String v1 = postfix.pop();
//    				 postfix.push(v1+v2+sign);
//    				 
//    				 String V1 = prefix.pop();
//    				 String V2 = prefix.pop();
//    				 prefix.push(sign+V2+V1);
//    				  
//    			 }
//    			 operators.pop();
//    			 
//    		 }else if (ch=='+' || ch=='-' || ch=='*' || ch=='/'){
//    			 
//    			 while(operators.size()!=0 && operators.peek()!='(' && priority(operators.peek())>=priority(ch)) {
//    				 char sign = operators.pop();
//     				
//    				 String v2 = postfix.pop(); 
//    				 String v1 = postfix.pop();
//    				 postfix.push(v1+v2+sign);
//    				 
//    				 String V1 = prefix.pop();
//    				 String V2 = prefix.pop();
//    				 prefix.push(sign+V2+V1);
//    			 }
//    			 operators.push(ch);
//    			 
//    		 }
//    	 }
//    	 
//    	 while(operators.size()!=0) {
//    		 char sign = operators.pop();
//				
//			 String v2 = postfix.pop(); 
//			 String v1 = postfix.pop();
//			 postfix.push(v1+v2+sign);
//			 
//			 String V1 = prefix.pop();
//			 String V2 = prefix.pop();
//			 prefix.push(sign+V2+V1);
//    	 }
//    	 
//    	 System.out.println("postfix --> " + postfix.peek() );
//    	 System.out.println("prefix --> " + prefix.peek() );

    	 
//#9                                 Celebrity Problem      	 
     
//     int n = hemlo.nextInt();
//     int arr[][] = new int[n][n];
//     for(int i =0; i<=n-1;i++) {
//    	 for(int j =0; j<=n-1;j++) {
//    		 arr[i][j] = hemlo.nextInt();
//    	 }
//     }
//     
//     Stack<Integer>  stk = new Stack<>();
//     for(int i =0; i<n;i++) {
//    	 stk.push(i);
//     }
//     
//     while(stk.size()>=2) {
//    	 int i = stk.pop();
//    	 int j = stk.pop();
//    	 
//    	 if(arr[i][j]==1) {
//    		 stk.push(j);
//    	 }else {
//    		 stk.push(i);
//    	 }
//     }
//     int temp = stk.pop();
//     
//     for(int i =0;i<n;i++) {
//    	 if(i!=temp) {
//    		 if(arr[temp][i]==1 || arr[i][temp] ==0) {
//    			 System.out.println("none");
//    			 return;
//    		 }
//    	 }
//     }System.out.println(temp);
    	 
//#10                         Postfix Evaluation and Conversion
    	
//    	 String str = hemlo.nextLine();
//    	 Stack<String> prefix = new Stack <>();
//         Stack <String> infix = new Stack <>();
//         
//         for(int i =0; i<str.length();i++) {
//        	 char q = str.charAt(i);
//        	 if(q=='/' || q=='*' || q=='-' || q=='+') {
//        		 String b = prefix.pop();
//        		 String a = prefix.pop();
//        		 prefix.push( q + a + b);
//        		 
//        		 String y = infix.pop();
//        		 String x = infix.pop();
//        		 infix.push( "(" + x + q + y +")" );
//        		 
//        	 }
//        	 else {
//        		 prefix.push(q +"");
//        		 infix.push(q +"");
//        	 }
//         }
//         System.out.println(prefix.pop());
//         System.out.println(infix.pop());
     
//#11                            Merging Overlapping           
     
//    	 int n = hemlo.nextInt();
//    	 int arr[][] = new int[n][2];
//    	 for(int i=0;i<n;i++) {
//    		 for(int j =0; j<n;j++) {
//    			 arr[i][j]= hemlo.nextInt();
//    		 } 
//    	 }
    	 
//    	 ?????????????????????????????????????
 
//#12                         Smallest Number Following Pattern
//    	 String str = hemlo.nextLine();
//    	 Stack<Integer> stk = new Stack<>();
//    	 int num=1;
//    	 for(int i =0; i<str.length();i++) {
//    		 char ch = str.charAt(i);
//    		 
//    		 if(ch=='d') {
//    			 stk.push(num);
//    			 num++;
//    		 }
//    		 else {
//    			 stk.push(num);
//    			 num++;
//    			 
//    			 while(stk.size()!=0) {
//    				 System.out.println(stk.pop());
//    			 }
//    		 }
//    	 }
//    	 stk.push(num);
//    	 while(stk.size()!=0) {
//			 System.out.println(stk.pop());
//		 }

//#13                             Build Normal Stack
//      class customStack{
//    	 	int arr[];
//    	 	int tos;
//    	 	
//    	  customStack(int size){
//    	 		this.arr = new int[size];
//    	 		this.tos=-1;
//    	 	}
//    	  
//    	  
//    	  
//    	  int size() {
//       	   return tos +1;
//          }
//    	  
//    	  void display() {
//    		  for(int i =tos;i>=0;i--) {
//    			  System.out.print(arr[i]+" ");
//    		  }
//    		  System.out.println();
//    	  }
//    	  
//    	  int pop() {
//    		  if(tos!=-1) {    			  
//    			  int val = arr[tos]; 
//    			  tos--;
//    			  return val;
//    		  }else {
//    			  System.out.println("UnderFlow");
//    			  return -1;
//    		  }
//    	  }
//    	  
//    	  int top() {
//    		  if(tos==-1) {
//    			  System.out.println("Stack UnderFlow");
//    			  return -1;
//    		  }
//    		  else {
//    			  return arr[tos];
//    		  }
//    	  }
//    	  
//    	  void push (int val) {
//    		  if(tos==arr.length-1) {
//    			  System.out.println("Stack Overflow");
//    		  }
//    		  else {
//    			  tos++;
//    			  arr[tos] = val;
//    		  }
//    	  }	  
//      }	
//      
//      int n = hemlo.nextInt();
//      customStack  Stack = new customStack(n);
//      Stack.push (10); Stack.display(); Stack.push(20); Stack.display(); Stack.push(30); Stack.display();
//      Stack.push (40); Stack.display(); Stack.push(50); Stack.display(); Stack.push(60); Stack.display();
//      Stack.top();     Stack.pop();    Stack.display(); Stack.top();     Stack.pop();    Stack.display();//      Stack.top();     Stack.pop();    Stack.display(); Stack.top();     Stack.pop();    Stack.display();
//      Stack.top();     Stack.pop();    Stack.display(); Stack.top();     Stack.pop();//
//#14                            Build Dynamic Stack 
//    	  class Dynamic_Stack{
//    		 int arr[];
//    		 int tps;
//    		Dynamic_Stack(int size){
//    			 arr = new int[size];
//    			 tps =-1;
//    		 }
//    		
//    		void push(int element){
//    			if(tps!= arr.length-1) {
//    				tps++;
//    				arr[tps] = element;
//    			}else {
//    				int arr2[] = new int[arr.length*2];
//    				for(int i=0;i<arr.length-1;i++) {
//    					arr2[i] = arr[i];
//    				}
//    				arr=arr2;
//    				tps++;
//    				arr2[tps] = element;
//    			}
//    		}
//    		
//    		 
//    	 }
//    	  int p = 2;
//    	  Dynamic_Stack Stack = new Dynamic_Stack(p);
//    	  Stack.push(4);
//    	  Stack.push(2);
//    	  Stack.push(3);
    	  
//#15                                              Minimum Stack - 1 
//    	 class MinStack{
//    		 Stack<Integer> allData;
//    		 Stack<Integer> minData;
//    		 
//    		 MinStack(){
//    			 allData = new Stack<>();
//    			 minData = new Stack<>();
//    			 
//    		 }
//    		 
//    		 int size() {
//    			 return allData.size();
//    		 }
//    		 
//    		 void push(int val ) {
//    			 if(minData.size()==0 || minData.peek() >=val) {
//    				 minData.push(val);
//    				 allData.push(val);
//    			 }else {
//    				 allData.push(val);
//    			 }
//    		 }
//    		 
//    		 void pop() {
//    			 if(size()==0) {
//    				 System.out.println("underflow");
//    			 }
//    		   else if(allData.peek()== minData.peek()) {
//    				 minData.pop();
//    				 allData.pop();
//    			 }else {
//    				 allData.pop();
//    			 }
//    		 }
//    		 
//    		 int min() {
//    			 if(size()==0) {
//    				 System.out.println("underflow");
//    				 return -1;
//    			 }
//    			 return minData.peek();
//    		 }
//    	 }
    	  
//#16                                                        Minimum Stack - 2
//    	 class MinStack{
//    		 Stack<Integer> data;
//    		 int min;
//    		 
//    		 MinStack(){
//    			 data = new Stack<>();	 
//    		 }
//    		 
//    		 int size() {
//    			 return data.size();
//    		 }
//    		 
//    		 void push(int val ) {
//    			 if(data.size()==0) {
//    				 data.push(val);
//    				 min = val;
//    			 }else if(val>=min) {
//    				 data.push(val);
//    			 }else {
//    				 data.push(val+val-min);   // (val < min) --> (val-min = -ve) ---> (val+val-min) < val
//    				 min =val;                // original value store in min
//    			 }
//    		 }
//    		 
//    		 int pop() {
//    			 if(size()==0) {
//    				 System.out.println("underflow");
//    				 return -1;
//    			 }else {
//    				 if(data.peek()>=min) {
//    					  return data.pop();
//    				 }else {
//    					 int temp = min;
//    					 data.pop();
//    					 min = 2*min - data.peek();
//    					 return temp;
//    				 }
//    			 }
//    		 }
//    		 
//    		 int top() {
//    			 if(size()==0) {
//    				 System.out.println("underflow");
//    				 return -1;
//    			 }else {
//    				 if(data.peek()>=min) {
//    					  return data.peek();
//    				 }else {
//    					 return min;
//    				 }
//    			 }
//    		 }
//    		 
//    		 int min() {
//    			 if(size()==0) {
//    				 System.out.println("underflow");
//    				 return -1;
//    			 }else {
//    				 return min;
//    			 }
//    		 }
//    	 }
//#17 #18 --> Queue Section
//#19	    	                                     Stack to Queue Adapter - Remove Efficient
//	   	 class StackToQueueAdapter{
//	   		 Stack<Integer> mainS;
//	   		 Stack<Integer> helperS;
//	   		 
//	   		 StackToQueueAdapter(){
//	   			 mainS   = new Stack<>();
//	   			 helperS = new Stack<>();
//	   		 }
//	   		 
//	   		 int size() {
//	   			 return mainS.size();
//	   		 }
//	   		 
//	   		 void push(int val) {
//	   			 while(mainS.size()!=0) {
//	   				 helperS.push(mainS.pop());
//	   			 }
//	   			 mainS.push(val);
//	   			 while(helperS.size()!=0) {
//	   				 mainS.push(helperS.pop());
//	   			 } 
//	   		 }
//	   		 
//	   		 int remove() {
//	   			 if(size()==0) {
//	   				 System.out.println("UnderFlow");
//	   				 return -1;
//	   			 }else {	   				 
//	   				 return mainS.pop();
//	   			 }
//	   		 }
//	   		 
//	   		 int top() {
//	   			if(size()==0) {
//	   				 System.out.println("UnderFlow");
//	   				 return -1;
//	   			 }else {	   				 
//	   				 return mainS.peek();
//	   			 }
//	   		   } 
//	   	 }		
 
//#19	    	                                     Stack to Queue Adapter - add Efficient
//	   	 class StackToQueueAdapter{
//	   		 Stack<Integer> mainS;
//	   		 Stack<Integer> helperS;
//	   		 
//	   		 StackToQueueAdapter(){
//	   			 mainS   = new Stack<>();
//	   			 helperS = new Stack<>();
//	   		 }
//	   		 
//	   		 int size() {
//	   			 return mainS.size();
//	   		 }
//	   		 
//	   		 void push(int val) {
//	   			  mainS.push(val);
//	   		 }
//	   		 
//	   		 void remove() {
//	   			if(size()==0) {
//	   				 System.out.println("UnderFlow");
//	   			 }else {	   				 	   				 
//	   				while(mainS.size()!=1) {
//		   				 helperS.push(mainS.pop());
//		   			 }
//	   				 mainS.pop(); 
//		   			 while(helperS.size()!=0) {
//		   				 mainS.push(helperS.pop());
//		   			 } 
//	   			 }
//	   		 }
//	   		 
//	   		 int top() {
//	   			if(size()==0) {
//	   				 System.out.println("UnderFlow");
//	   				 return -1;
//	   			 }else {	   				 	   				 
//	   				while(mainS.size()!=1) {
//		   				 helperS.push(mainS.pop());
//		   			 }
//	   				 int temp = mainS.pop(); 
//	   				 helperS.push(temp); 
//		   			 while(helperS.size()!=0) {
//		   				 mainS.push(helperS.pop());
//		   			 } 
//		   			 return temp;
//	   			 }
//	   		 } 
//	   	 }	    	 
    	 
//#20                                          Two stack in an Array   	 
//    	 class TwoStack{
//    		 int arr[];;
//    		 int tos1;
//    		 int tos2;
//    		 
//    		 TwoStack(int cap){
//    			 arr = new int[cap];
//    			 tos1=-1;
//    			 tos2 = arr.length;
//    		 }
//    		 
//    		 int size1() {
//    			 return tos1+1;
//    		 }
//    		 
//    		 int size2() {
//    			 return arr.length - tos2;
//    		 }
//    		 
//    		 void push1(int val) {
//    			 if(tos1+1 == tos2) {
//    				 System.out.println("OverFlow");
//    			 }
//    			 else {
//    				 tos1++;
//    				 arr[tos1]= val;
//    			 }
//    		 }
//    		 
//    		 void push2(int val) {
//    			 if(tos2-1 == tos1) {
//    				 System.out.println("OverFlow");
//    			 }
//    			 else {
//    				 tos2--;
//    				 arr[tos2]= val;
//    			 }
//    		 }
//    		 
//    		 int pop1(){
//    			 if(size1()==0) {
//    				 System.out.println("Stack Underflow");
//    				 return -1;
//    			 }else {
//    				 int val = arr[tos1];
//    				 tos1--;
//    				 return val;
//    			 }
//    		 }
//    		 
//    		 int pop2(){
//    			 if(size2()==0) {
//    				 System.out.println("Stack Underflow");
//    				 return -1;
//    			 }else {
//    				 int val = arr[tos2];
//    				 tos2++;
//    				 return val;
//    			 }
//    		 }
//    		 
//    		 int top1(){
//    			 if(size1()==0) {
//    				 System.out.println("Stack Underflow");
//    				 return -1;
//    			 }else {
//    				 return arr[tos1];
//    			 }
//    		 }
//    		 
//    		 int top2(){
//    			 if(size2()==0) {
//    				 System.out.println("Stack Underflow");
//    				 return -1;
//    			 }else {
//    				 return arr[tos2];
//    			 }
//    		 }
//    	 }
    	 
    	 
    	 
    	 
    	 
    	 
     


    }
}
