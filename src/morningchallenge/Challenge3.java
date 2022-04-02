package morningchallenge;

/**
 * Created by Jay Vaghani
 */

/**
 * Challenge-3
 *
 * Write a java program using the following requirement.
 * 1.Create a Java class with name 'Challenge3'
 * 2.Declare two int type instance variables with name 'eId' and 'deptNo'
 * 3.Declare two String type instance variables with name 'eName' and 'job'
 * 4.Create a parameterized constructor which initialise the value of variable.
 * 5.Create a instance no return type no parameter method with name 'display'
 *   and call all four variables inside the display method inside
 *   the sout statements.
 * 6.Create a main method
 * 7.Create a object with name 'emp1' and assign
 *   the values for each variable and call the display method
 * 8.Create a object with name 'emp2' and assign
 *   the values for each variable and call the display method
 *
 * Output:
 * 101
 * John
 * 10
 * Manual Tester
 * 102
 * Smith
 */
public class Challenge3 {
    int eID;
    int deptNo;
    String eName;
    String job;

    public Challenge3(int eID, int deptNo, String eName, String job) {
        this.eID = eID;
        this.deptNo = deptNo;
        this.eName = eName;
        this.job = job;
    }

    public void display(){
        System.out.println(eID);
        System.out.println(eName);
        System.out.println(deptNo);
        System.out.println(job);
    }

    public static void main(String[] args) {
        Challenge3 emp1 = new Challenge3(100, 10, "John", "Manual Tester");
        emp1.display();
        Challenge3 emp2 = new Challenge3(101, 11, "Smith", "Automation Tester");
        emp2.display();
    }


}
