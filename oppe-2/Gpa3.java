import java.util.*;

class Employee {
  String eid;
  String ename;
  String eprojects[];

  // Define all the required methods here
  Employee(String id, String name, String[] projects) {
    eid = id;
    ename = name;
    eprojects = projects;
  }

  Employee(Employee employee) {
    eid = employee.eid;
    ename = employee.ename;
    eprojects = employee.eprojects.clone();
  }

  void display() {
    System.out.println("id:" + eid);
    System.out.println("name:" + ename);
    System.out.println("projects:");
    for (String proj : eprojects) {
      System.out.print(proj + ':');
    }
  }

  public void mutator() {
    this.ename = "Mr " + this.ename;
    this.eprojects[0] = null;
  }
}


public class Gpa3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String project[] = {"P001", "P002", "P003"};
    // Enter the id of employee
    String id = s.nextLine();
    // Enter the name of employee
    String name = s.nextLine();

    Employee e1 = new Employee(id, name, project);
    Employee e2 = new Employee(e1);
    // The copy constructor must copy all the data members.

    e1.mutator();

    e2.display();
  }
}
