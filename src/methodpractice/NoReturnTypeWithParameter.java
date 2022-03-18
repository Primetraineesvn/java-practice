package methodpractice;

public class NoReturnTypeWithParameter {

    public static void main(String[] args) {
        NoReturnTypeWithParameter obj = new NoReturnTypeWithParameter();
        obj.addition(10,20,30);//60
        obj.addition(1,2,3);//6
        obj.addition(1,1,1);
        addition1(5,5);//10
        myName("Prime");

    }

    //No return type, with parameters
    public void addition(int a,int b, int c){

        System.out.println(a+b+c);

    }

    public static void addition1(int a,int b){
        System.out.println(a+b);
    }
    public static void myName(String name){
        System.out.println(name);
    }
}
