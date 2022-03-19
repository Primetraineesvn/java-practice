package operators;

public class OperatorsExamples {

    public static void main(String[] args) {
        //Arithemetic operators--> +, -,*,/,%
        int a = 10; //a=20,
        int b = 20; //b=10
        System.out.println(a + b);//30
        System.out.println(b - a);//10
        System.out.println(a * b);//200
        System.out.println(b / a);//2
        System.out.println(b % a);//0
        //Relational operators ----> <,>,<=,>=,==
        System.out.println(a < b);//true
        System.out.println(a > b);//false
        System.out.println(a <= b);//true
        System.out.println(a == b);//false
        System.out.println(a != b);//true
       //---------------------------
        int x = 5;
        int y = ++x;//x++
        System.out.println(y);

    }
}
