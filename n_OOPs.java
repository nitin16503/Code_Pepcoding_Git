import java.util.*;
public class n_OOPs {
    public static class person{
        int age;
        String name;
        void saysHi(){
            System.out.println(name +"(" +age +") says HI");
        }
        //if we forget, java provides oue class a default constructor
        person(){
            //constructor
        }
        //parametrized
        person(int A , String B ){
            this.age = A;
            this.name = B;
        }
    }
    
    public static class cars{
    	int price;
    	String name;
    	void sayshello(){
    		System.out.println("I am " + name +" my price is " + price);
    	}
    }

    public static void main(String[] args) {
    	
    	 cars First = new cars();
    	 First.price = 100;
    	 First.name = "abc";
    	 First.sayshello();

//        person p1 = new person();
//        p1.age = 10;
//        p1.name = "pappu";
//        p1.saysHi();
//        person p2 = new person();
//        p2.age = 9;
//        p2.name = "hari";
//        p2.saysHi();

        person p5 = new person(19,"nitin");
        p5.saysHi();


    }
}
