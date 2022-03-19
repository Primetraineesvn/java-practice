package stringmethods;

public class StringMethods {

    public static void main(String[] args) {
        String s1 = "This is a first method";
        String s2 = "This is a second method";

        int l = s1.length();
        System.out.println("Length of the s1 string "+l+ " characters");
        System.out.println(s1.contains("first"));//true
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.isEmpty());//false
        System.out.println(s1.replace("This", "Welcome"));

    }
}
