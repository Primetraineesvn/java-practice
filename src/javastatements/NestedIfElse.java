package javastatements;

public class NestedIfElse {

    public static void main(String[] args) {
        int marks = 55;

        if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks<80 && marks >=70) {
            System.out.println("Grade B");
        }else if (marks < 70 && marks> 50) {
            System.out.println("Grade C");
        }else{
            System.out.println("Pass");
        }

        System.out.println("Hello");

    }


}
