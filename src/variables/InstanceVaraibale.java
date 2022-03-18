package variables;

public class InstanceVaraibale {
    int a = 100; // instance variable or global
    String name = "Prime Testing"; //Instance variable
    static int b = 200;//static variable

    //Instance variable - variables which are declared in the class but outside the method or outside the constructor is
    //called ----

    //main method is a static method
    public static void main(String[] args) {
        //static are#
        //Instance variable -----> Static method
        InstanceVaraibale obj = new InstanceVaraibale();//object
        System.out.println(obj.a);//100
        obj.test();//100,Prime Testing
        System.out.println(obj.name);//Prime Testing
        test1();//100,Prime Testing

    }
    //instance method
    public void test() {
        //instance are
        System.out.println(a);//100
        System.out.println(name);

    }

    //Static method
    public static void test1(){
        InstanceVaraibale instanceVaraibale = new InstanceVaraibale();
        System.out.println(instanceVaraibale.a);
        System.out.println(instanceVaraibale.name);

    }

}
