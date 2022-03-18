package variables;

public class StaticVariables {
    //variables which are declared inside the class but outside the method with static keyword is called
     // static variables

    //static is related to class
    static int a =10;//static variable
    static String name = "Prime";


    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(name);
        StaticVariables obj = new StaticVariables();

        obj.test();
    }

    //Instance method
    public void test(){
       //via classname
        System.out.println(StaticVariables.a);
        System.out.println(name);

    }

}
