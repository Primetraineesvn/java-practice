package staticblocs;

public class StaticBlocks {
    //static block is used to intilise the static variable
    static String eName; // static variable
    static int eID;// static variable

    static {
        System.out.println("Static block");
        eName = "Raju";
        eID = 101;
    }

    public static void main(String[] args) {

        System.out.println("Employee name" + eName);//Raju
        System.out.println("Employee id " + eID);//101

    }

    static {
        System.out.println("I m in static block 2");
    }


}
