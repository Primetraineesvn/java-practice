package variables;

public class LocalVariables {
    // Local variables - variables which are declared inside the method or inside the constructor is called local variable
    //Scope - inside the same mehtod, not outside
    //Memory allocation - when method starts
    //no relation with object
    // memory - stack

    public static void main(String[] args) {
        int a = 2; //local variable
        System.out.println(a);//2

    }

    void test1() {
        int b = 5; //local
        System.out.println(b);
    }

    public static void test2() {

        String name = "Prime";//local variable
        System.out.println(name);
       // System.out.println(b);
    }


}
