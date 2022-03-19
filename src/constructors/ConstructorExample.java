package constructors;

public class ConstructorExample {
    //  int studentNumber;
     // String studentName;
    //The constructor is used to assign the value to the instance variables
    int empID;//10
    String name;//Prime

    public ConstructorExample(int empID, String name){
        this.empID =empID;
        this.name = name;
    }

    public static void main(String[] args) {
      ConstructorExample obj = new ConstructorExample(10, "Prime");
      obj.myMethod();//10, prime

        System.out.println(obj.empID);//
        ConstructorExample obj1 = new ConstructorExample(20,"Jay");
        obj1.myMethod();//20, Jay
        obj.myMethod();//10, prime
    }

    public void myMethod(){
        System.out.println(empID);
        System.out.println(name);
    }

}
