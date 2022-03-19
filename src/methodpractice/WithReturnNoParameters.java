package methodpractice;

public class WithReturnNoParameters {

    public static void main(String[] args) {
        int num = Test();//
        System.out.println(num);
        // System.out.println(Test());
        System.out.println(result());
    }

    //With return type no parameters method
    public static int Test() {
        int a = 10;
        int b = 20;
        String name = "Prime";
        int result = a + b;
        int subtraction = b - a;
        //  return result;
        return result;
    }

    public static boolean result() {
        boolean flag = true;
        boolean x = false;
        return flag;
    }


}
