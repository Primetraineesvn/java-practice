package methodpractice;

public class WithReturnWithParams {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        WithReturnWithParams obj = new WithReturnWithParams();
        obj.addition(5,6);
        System.out.println(obj.addition(5,6));

        obj.addition(x,y);
        System.out.println(obj.addition(x,y));//30
     //   System.out.println("The total of a and b "+ obj.addition(10,20));
    }

    //With return type with parameters method
    public int addition(int a, int b){
        int result = a+b;
        return result;
    }

}
