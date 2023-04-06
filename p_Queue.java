import java.util.*;
public class p_Queue {

	public static void main(String[] args) {

//		Queue<Integer> que = new ArrayDeque<>();
//		System.out.println(que);
//		que.add(10);
//		System.out.println(que);
//		que.add(19);
//		System.out.println(que);
//		que.add(12);
//		System.out.println(que);
//		que.add(15);
//		System.out.println("peek-> " + que.peek());
//		System.out.println(que);
//		System.out.println("peek-> " + que.peek());
//		que.remove();
//		System.out.println(que);
//		System.out.println("peek-> " + que.peek());
//		que.remove();
//		System.out.println(que);
//		System.out.println("peek-> " + que.peek());
//		que.remove();
//		System.out.println(que);
//		System.out.println("peek-> " + que.peek());
//		que.remove();
//		System.out.println(que);
//		System.out.println("peek-> " + que.peek());
		
//!!!!!!que.remove();!!!!!!!         !!!!no such element (error)!!!
	
		
		
//#1                          Build  Normal Queue & Dynamic Queue
		
//		class CustomQueue {
//			int arr[];
//			int front ;
//			int size;
//			
//			void CustomQueue(int cap) {
//				arr = new int[cap];
//				front =0;
//				size =0;
//			}
//			
//			int size() {
//				return size;
//			}
//			
//			void display() {
//				for(int i =0; i<size;i++) {
//					int temp = (front +i)%arr.length;
//					System.out.print(arr[temp]+" ");
//				}System.out.println();
//			}
//			
//			void add(int val) {
////                                  !! NORMAL QUEUE !!				
//				if(size==arr.length) {
//					System.out.println(" Queue overflow");
//				}
//				else {
//					int rear = (front +size)%arr.length;
//					arr[rear] = val;
//					size++;
//				}
// //                                   !! DYNAMIC QUEUE !!	
//				
//				if(size==arr.length) {
//					int ARR[] = new int[size*2];
//					for(int i =0;i<size;i++) {
//						ARR[i] = arr[(front+i)%arr.length];
//					}
//					arr=ARR;
//					front =0;
//					int rear = (front +size)%arr.length;
//					arr[rear] = val;
//					size++;
//				}else {
//					int rear = (front +size)%arr.length;
//					arr[rear] = val;
//					size++;
//				}
//				
//			}
//			
//			int remove() {
//				if(size==0) {
//					System.out.println("Queue underflow");
//					return -1;
//				}else {
//					int val = arr[front];
//					front = (front +1)%arr.length;
//					size--; 
//					return val;
//				}
//			}
//			
//			int peek() {
//				if(size==0) {
//					System.out.println("Queue underflow");
//					return -1;
//				}
//				else {
//					return arr[front];
//				}
//			}
//			
//		}

//#17                                                        Queue to Stack Adapter(pop efficient)   	 
//		    	 class QueueToStackAdapter{
//		    		 Queue<Integer> mainQ;
//		    		 Queue<Integer> helperQ;
//		    		 
//		    		 QueueToStackAdapter(){
//		    			 mainQ = new ArrayDeque<>();
//		    			 helperQ = new ArrayDeque<>();
//		    		 }
//		    		 
//		    		 int size() {
//		    			 return mainQ.size();
//		    		 }
//		    		 
//		    		 void push(int val) {
//		    			 
//		    			 while(mainQ.size()!=0) {
//		    				 helperQ.add(mainQ.remove());
//		    			 }mainQ.add(val);
//		    			 
//		    			 while(helperQ.size() != 0) {
//		    				 mainQ.add(helperQ.remove());
//		    			 }
//		    		 }
//		    		 
//		    		 int pop() {
//		    			 if(size()==0) {
//		    				 System.out.println("Queueu/Stack Underflow");
//		    				 return -1;
//		    			 }else {
//		    				 return mainQ.remove();
//		    			 }
//		    		 }
//		    		 
//		    		 int top() {
//		    			  if(size()==0) {
//		    			    	 System.out.println("Queueu/Stack Underflow");
//		    				     return -1;
//		    			  }else {
//		    				  return mainQ.peek();
//		    			  }
//		    		   }
//		    		 
//		    	 }		
		
//#18                                                        Queue to Stack Adapter(push efficient)   	 
//   	 class QueueToStackAdapter{
//   		 Queue<Integer> mainQ;
//   		 Queue<Integer> helperQ;
//   		 
//   		 QueueToStackAdapter(){
//   			 mainQ = new ArrayDeque<>();
//   			 helperQ = new ArrayDeque<>();
//   		 }
//   		 
//   		 int size() {
//   			 return mainQ.size();
//   		 }
//   		 
//   		 void push(int val) {
//   			 mainQ.add(val);
//   			 
//   		 }
//   		 
//   		 int pop() {
//   			 if(size()==0) {
//   				 System.out.println("underflow");
//   				 return -1;
//   			 }
//   			 else {
//   				 
//   				 while(mainQ.size()!=1) {
//   					 helperQ.add(mainQ.remove());
//   				 }
//   				 
//   				 int temp= mainQ.remove();
//   				 
//   				 while(helperQ.size()!=0) {
//   					 mainQ.add(helperQ.remove());
//   				 }
//   				 return temp;
//   			 }
//   			 
//   		 }
//   		 
//   		 int peek() {
//   			if(size()==0) {
//  				 System.out.println("underflow");
//  				 return -1;
//  			 }
//  			 else {	 
//  				 while(mainQ.size()!=1) {
//  					 helperQ.add(mainQ.remove());
//  				 }
//  				 
//  				 int temp= mainQ.remove();
//  				 helperQ.add(temp);
//  				 
//  				 while(helperQ.size()!=0) {
//  					 mainQ.add(helperQ.remove());
//  				 }
//                 return temp;
//  			 }
//   		   }   		 
//   	 }		    	 
		    	 
    	 
		    	 
			
		}
	}
