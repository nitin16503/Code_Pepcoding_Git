import java.util.Stack;

public class q_LinkedList {	
	public static class node {

		int data;
		node next;
		
		node(){ // by default it is made but here we are using both so we have this made this one also.
			// helping in creating this type of node ->>> node first= new node(); first.data=1;
			// here node next -> null
		}
		
		node (int content ,node next) {
			// help in creating  this type of node ->>> node fourth =  new node(4,fifth); 
			this.data = content;
			this.next = next;
		}
		
	}
	
	
//# 1                          Add Last in Linked List		
				
    public static class LinkedList {
			 node head;
			 node tail;
			 int size;
			 
			 LinkedList(){
				 
			 }
			 LinkedList(node start, node finish, int length){
				 this.head = start;
				 this.tail = finish;
				 this.size = length;
			 }
			 
////                          Add Last in Linked List					
		  void addLast(int val) {
			   node name = new node();
			   name.data = val;
			   name.next =null;

			   if(size==0) {
			      head=tail=name;
			   }else {
				  tail.next = name;
				  tail = name;
			    }
				size++;
			}
		  
////               		   Display and Size of Linked List		
		
		  public int size(){
				return size;
			}
		
	      public void display(){
				node temp = new node();
				temp = head; 
				while(temp!=null) {
					System.out.print(temp.data+" ");
					temp = temp.next;
				}	
			}
	     
////	                   Remove from First  
	     public void removeFirst() {
	    	 if(size==0) {
	    		 System.out.println("list is empty");
	    	 }else{
	    		 
	    		 if(size==1) {
	    			 head=tail=null;
	    			 size=0;
	    		 }else {
	    			 head = head.next;
	    			 size--;
	    		 }
	    		 
	    	 }
	     }
	     
////                         Get Value in Linked List
	     public int getFirst() {
	    	if(size==0) {
	    		System.out.println("list is empty");
	    		return -1;
	    	}else {
	    		return head.data;
	    	}
	     }
	     public int getLast() {
	    	if(size==0) {
	    		System.out.println("list is empty");
	    		return -1;
	    	}else{
	    		return tail.data;
	    	}
	     }
	     public int getAt(int idx) {
	    	 if(size==0) {
		    		System.out.println("list is empty");
		    		return -1;
		    	}
	    	 else if(idx<0 || idx>=size) {
		    		 System.out.println("invalid argument");
		    		 return-1;
		    	 }
	    	 else {
	    		 node temp = head;
	    		 for(int i =0; i<idx; i++) {
	    			temp=temp.next;
	    		}
	    		 return temp.data;
	    	 }
	     }
	     
////                   Add First in Linked List 
	     
	     public void addFirst(int val) {    		 
	    		 node temp =new node ();
	    		 temp.data = val;
	    		 temp.next = head;
	    		 head = temp;
	    		 if(size==0) {
	 	    		tail=head;
	 	    	 }
	    		 size++;	 
	     }
	     
////                 Add at Index in Linked List   
	     public void addAt(int idx, int val) {
	    	 if(size==0) {
	    		 System.out.println("list is empty");
	    	 }
	    	 else if(idx<0 || idx <size) {
	    		 System.out.println("invalid index");
	    	 }
	    	 else if(idx==0) {
	    		 addFirst(val);
	    	 }else if(idx==size) {
	    		 addLast(val);
	    	 }else {
	    		 node add = new node();
	    		 add.data=val;
	    		 node temp = head;
	    		 for(int i = 0; i<idx-1;i++) {
	    			 temp = temp.next;
	    		 }
	    		 add.next = temp.next; // important line -->cann't be interchange if interchange then-
	    		 temp.next=add;       // important line --> -code will be wrong
	    		 size ++;
	    	 }
	     }

////                               Remove Last in Linked List
	     public void removeLast() {
	    	 if(size==0) {
	    		 System.out.println("list is empty");
	    	 }
	    	 else if(size==1) {
	    		 head=tail=null;
	    	 }else{
	    		 node temp = head;
	    		 for(int i =0; i<size-2;i++) {
	    			 temp = temp.next;
	    		 }
	    		 tail = temp;
	    		 temp.next = null;
	    		 size--;	
	    	 }
	     }
	     
////                                 Reverse a Linked List
	     private node getNodeAt(int idx) { // ONLY ACCESS FROM CLASS
	    	 node temp = head;
	    	 for(int i =0; i<idx-1;i++) {
	    		 temp= temp.next;
	    	 }
	    	 return temp;
	     }
	     
	     public void reverseDI() {
	    	 int li =0; 
	    	 int ri = size -1;
	    	 while(li<ri) {
	    		 node left = getNodeAt(li);
	    		 node right = getNodeAt(ri);
	    		 
	    		 int temp = left.data;
	    		 left.data= right.data;
	    		 right.data = temp;
	    		 
	    		 li++;
	    		 ri--;
	    	 }
	     }
	     
//                              Reverse a Linked List - Pointer Iterative                                  
	     public void reversePI() {
	    	node prev = null;
	    	node curr = head;
	    	
	    	while(curr!=null) {
	    		node temp = curr.next;
	    		
	    		curr.next = prev;
	    		
	    		prev = curr;
	    		curr = temp;
	    	}
	    	node temp2 = head;
	    	head = tail;
	    	tail = temp2;
	     }
	     
//                                    Remove at Index in Linked List	
	     public void removeAt(int idx) {
	    	 if(size==0) {
	    		 System.out.println("list is empty");
	    	 }
	    	 else if(idx<0 || idx>=size) {
	    		 System.out.println("Invalid arguments");
	    	 }
	    	 else if(idx==1) {
	    		removeFirst();
	    	 }
	    	 else if(idx==size-1) {
	    		 removeLast();
	    	 }
	    	 else {
	    		 node temp = head;
	    		 for(int i=0;i<idx-1;i++) {
	    			 temp = temp.next;
	    		 }
	    		 node temp2 = temp.next.next;
	    		 temp.next.next = null;
	    		 temp.next = temp2;
	    		 size--;
	    	 }
	     }
	     
//                                   Kth element from the end in Linked List	
	     public int kthFromList(int k ) {
	    	 node s = head;
	    	 node f = head;
	    	 
	    	 for(int i =0;i<k;i++) {
	    		 f=f.next;
	    	 }
	    	 
	    	 while(f!=tail) {
	    		 s=s.next;
	    		 f=f.next;
	    	 }
	    	 return s.data;
	     }
	     
//                                Middle of a Linked List                         	     
	     public int mid(){
	    	node s = head;
	    	node f = head;
	    	while(f.next!=null && f.next.next!=null) {
	    		s=s.next;
	    		f=f.next.next;
	    	}
	    	return s.data;
	     }

//                            Merge two sorted Linked List
	     private static node compareNode(node n1,node n2) {
	    	 if(n1.data>n2.data) {
	    		 return n2;
	    	 }else {
	    		 return n1;
	    	 }
	     }
	     
	     public static LinkedList mergeTwoSortedList(LinkedList l1 , LinkedList l2) {
	    	 LinkedList l3 = new LinkedList();
	    	 node temp = l3.head;
	    	 node i = l1.head;
	    	 node j = l2.head;
	    	 
	    	 while(i!=null || j!=null) {
	    		 if(compareNode(i,j)==i) {
	    			temp.data = i.data;
	    			i=i.next;
	    		 }else {
	    			 temp.data= j.data;
	    			 j=j.next;
	    		 }
	    		 temp=temp.next;
	    	 }
	    	 
	    	 while(i!=null) {
	    		 temp.data = i.data;
	    		 i=i.next;
	    		 temp=temp.next;
	    	 }
	    	 
	    	 while(j!=null) {
	    		 temp.data = j.data;
	    		 j=j.next;
	    		 temp=temp.next;
	    	 }
	    	 
	    	 return l3;
	    		    	 
	     }
	   
//                                    Merge Sort a Linked List
	     public static node midNode(node head, node tail) {
	    	   	 node slow = head;
	    	   	 node fast = head;
	    	   	 while (fast.next!=null && fast.next.next!=null) {
	    	   		 slow= slow.next;
	    	   		 fast= fast.next.next;
	    	   	 }
	    	   	 return slow;
	     }
	     public static LinkedList mergeSort(node head, node tail, int size) {
	    	 if(head==tail) {
	    		 LinkedList br = new LinkedList();
	    		 br.addLast(head.data);
	    		 return br;
	    	 }
	    	 node mid = midNode(head , tail);
	    	 LinkedList left  = mergeSort(head,mid,size/2);
	    	 LinkedList right = mergeSort(mid.next, tail, size/2);
	    	 LinkedList result = LinkedList.mergeTwoSortedList(left, right);
	    	 return result;
	    	 
	     }

//                                   Remove Duplicate List	     
	     public void removeDuplicate() {
	    	 LinkedList result = new LinkedList();
	    	 
	    	 while(this.size()>0) {
	    		 int val = this.getFirst();
	    		 this.removeFirst();
	    		 if(result.size()==0 || result.tail.data != val ) {
	    			 result.addLast(val);
	    		 }	 
	    	 }
	    	 this.head = result.head;
	    	 this.tail = result.tail;
	    	 this.size = result.size;
	     }

//                                 Odd Even List
	     public void oddEven() {
	    	 LinkedList odd = new LinkedList();
	    	 LinkedList even = new LinkedList();
	    	 
	    	 while(this.size>0) {
	    		 int val = this.getFirst();
	    		 this.removeFirst();
	    		 if(val%2==0) {
	    			 even.addLast(val);
	    		 }else {
	    			 odd.addLast(val);
	    		 } 
	    	 }
	    	 if(odd.size!=0 && even.size!=0) {
	    		 odd.tail = even.head;
	    		 this.head = odd.head;
	    		 this.tail = even.tail;
	    		 this.size = even.size + odd.size;
	    	 }
	    	 else if(even.size==0) {
	    		 this.head = odd.head;
	    		 this.tail = odd.tail;
	    		 this.size = odd.size;
	    	 }
	         else {
	        	 this.head = even.head;
	    		 this.tail = even.tail;
	    		 this.size = even.size;
	    	 }
	     }
	   
//                                  K-Reverse
	     public void kReverse(int  k) {
	    	 LinkedList prev = null;
	    	 
	    	 while(this.size!=0) {
	    		 
	    		 LinkedList cur = new LinkedList();
	    		 
	    		 if(this.size>=k) { 
	    			 
	    			 for(int i =0;i<k;i++) { 
	    				 cur.addFirst(this.getFirst());
	    				 this.removeFirst();
	    			 }
	    			 
	    		 }
	    		 
	    		 else {
	    			 
	    			 int temp = this.size;
	    			 for(int i =0;i<temp;i++) {
	    				 cur.addLast(this.getFirst());
	    				 this.removeFirst();
	    			 }
	    			 
	    		 }
	    		 
	    		 if(prev==null) {
	    			 prev = cur;
	    		 }
	    		 
	    		 else {
	    			 prev.tail.next = cur.head;
	    			 prev.tail = cur.tail;
	    		 }
	    		 
	    	 }
	    	 this.head = prev.head;
	    	 this.tail = prev.tail;
	    	 this.size = prev.size;
	    	 
	     }
	     
	    
//                         Display Reverse Linked List - Recursive
	     private void displayReverseHelper(node head) {
	    	 if(head == null) {
	    		return;
	    	 }
	    	 displayReverseHelper(head.next);
	    	 System.out.println(head.data + " ");
	     }
	     public void displayReverse() {
	    	 displayReverseHelper(head);
	    	 System.out.println();
	     }
	     
//                       Reverse Linked List using Pointer
	     private void reversePRHelper(node node) {
	    	 if(node==null) {
	    		 return;
	    	 }
	    	 reversePRHelper(node.next);
	    	 if(node == tail ) {
	    		 //nothing to do
	    	 }else {
	    		 node.next.next = node;
	    	 }
	     }
	     public void reversePR() {
	    	 reversePRHelper(head);
	    	 head.next =null;
	    	 node temp = head;
	    	 head = tail;
	    	 tail = temp;
	     }
	 
//                       Reverse a Linked List - Data Recursive	 
	     node rLeft;
	     private void  reverseDRHelper(node right, int count) {
	    	 if(right == null) {
	    		 return;
	    	 }
	    	 reverseDRHelper(right.next,count +1);
	    	 if(count>size/2) { 
	    		 int temp  = right.data;
	    		 right.data = rLeft.data;
	    		 rLeft.data = temp;
	    		 
	    		 rLeft = rLeft.next;
	    	 }
	    	 
	    	 
	     }
	     public void reverseDR() {
	    	 rLeft = head;
	    	 reverseDRHelper(head,0);
	     }
	     
   }//class LinkedList Bracket
    
    
////                    Linked List to Stack Adapter 
    public static class LLToStackAdapter {
        LinkedList list;

        public LLToStackAdapter() {
          list = new LinkedList();
        }


        void size() {
          System.out.println(list.size());
        }

        void push(int val) {
        	list.addFirst(val);
        }

        void pop() {
            list.removeFirst();
        }

        void top() {
            list.getFirst();
        }
    }
    
    
public static void main(String[] args) {
			
			
//#              CREATING A NODE		
		class node {
			int data;   // data of a node 
			node next;  // a node with name "next"
		}
			
//# Linked List is a collection of nodes. 
			
//#              CREATING A LINKED LIST		
//		class LinkedList{
//			node head;  // a node with name head(first one)
//			node tail;  // a node with name tail(last one)
//			int size;   // size of a Linked List
//		}
			
	
//# 1                              Add Last in Linked List		
//		node first= new node();
//		node second  = new node();
//		node third = new node();
//		node fifth = new node();
//		node fourth =  new node(4,fifth); // node fourth -> data and next are define in initialization of node.
//		first.data=1;
//		first.next = second;
//		second.data = 2;
//		second.next = third;
//		third.data= 3;
//		third.next=fourth;
//		fifth.data = 5;
//		fifth.next=null;
//		LinkedList list = new LinkedList(first,fifth,5);
//		node sixth = new node();
//		list.addlast(6);
//		System.out.println(fifth.next);

//# 2	                          Display and Size of Linked List
//		node node1= new node();
//		node node2  = new node();
//		node node3 = new node();
//		node node4 = new node();
//		node1.next =node2;
//		node2.next =node3;
//		node3.next =node4;
//		
//		node1.data = 1;
//		node2.data = 2;
//		node3.data = 3;
//		node4.data = 4;
//		
//		
//		LinkedList list = new LinkedList();
//		list.head = node1;
//		list.tail=node4;
//		list.size =4;
//		list.display();	
//		list.size();
	
	
		


		
		
		
		
		
		
		
		
		
	} 
}  