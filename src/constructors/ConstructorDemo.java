package constructors;

public class ConstructorDemo {

    //Constructor
    public  ConstructorDemo(){
        System.out.println("Zeo arg constructor by user");
    }

    public ConstructorDemo(int a){
        System.out.println("This is parameterised constructor");
    }

    public ConstructorDemo(String name){
        System.out.println("This is one parameterised cons "+name);
    }

    public ConstructorDemo(int a, int b){
        System.out.println("Additon of a and b is " + (a+b));
    }

    public void myMethod(){
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo obj1 = new ConstructorDemo(10);//This is parameterised constructor
        ConstructorDemo obj2 = new ConstructorDemo("Prime");//This is parameterised constructor -string type
        ConstructorDemo obj3 = new ConstructorDemo(2,3);//This is parameterised constructor -2 params constructor
        obj.myMethod();

    }



}
