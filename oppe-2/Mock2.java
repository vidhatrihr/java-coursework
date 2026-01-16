import java.util.Scanner;

class Faculty {
  private String name;
  private double salary;

  public Faculty(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public double bonus(float percent) {
    return (percent / 100.0) * salary;
  }

  // Define method getDetails()
  String getDetails() {
    return String.format("%s, %.1f", name, salary);
  }

  // Override method getDetails(float percent)
  String getDetails(float percent) {
    return String.format("%s, %.1f, bonus = %.1f", name, salary, bonus(percent));
  }

  double getSalary() {
    return salary;
  }

  String getName() {
    return name;
  }
}


class Hod extends Faculty {
  private String personalAssistant;

  public Hod(String name, double salary, String pa) {
    super(name, salary);
    this.personalAssistant = pa;
  }

  // Override method bonus(float percent)
  public double bonus(float percent) {
    return 0.5 * super.bonus(percent);
  }

  // Override method getDetails()
  String getDetails() {
    return String.format("%s, %.1f, %s", getName(), getSalary(), personalAssistant);
  }

  // Override method getDetails(float percent)
  String getDetails(float percent) {
    return String.format("%s, %.1f, %s, %.1f", getName(), getSalary(), personalAssistant,
        bonus(percent));
  }
}


public class Mock2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Faculty obj1 = new Faculty(sc.next(), sc.nextDouble());
    Faculty obj2 = new Hod(sc.next(), sc.nextDouble(), sc.next());
    System.out.println(obj1.getDetails());
    System.out.println(obj1.getDetails(10));
    System.out.println(obj2.getDetails());
    System.out.println(obj2.getDetails(10));
  }
}
