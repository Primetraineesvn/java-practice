package staticblocs;

public class InstaceBlock {

String eName;
    {
        //Instance block
        System.out.println("Instance Block");
        eName = "Prime";
    }

    void display(){
        System.out.println(eName);
    }

    public static void main(String[] args) {

      InstaceBlock obj = new InstaceBlock();
      obj.display();
     // new InstaceBlock().display();

    }
}
