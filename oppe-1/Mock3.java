package oppe;

import java.util.*;

// Define interface Appraisable
interface Appraisable {
  default public void appraisal(Teacher teacher) {
    double newSalary = teacher.getSalary() + teacher.getstuPassPer() / 100 * 5000;
    teacher.setSalary(newSalary);
  }
}


// Define interface SpecialAppraisable
interface SpecialAppraisable extends Appraisable {
  default public void spAppraisal(Teacher teacher) {
    double newSalary = teacher.getSalary() + teacher.getstuPassPer() / 100 * 10000;
    teacher.setSalary(newSalary);
  }
}


class Teacher implements SpecialAppraisable {
  private String name;
  private double salary;
  private double stuPassPer;

  public Teacher(String name, double salary, double stuPassPer) {
    this.name = name;
    this.salary = salary;
    this.stuPassPer = stuPassPer;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getstuPassPer() {
    return stuPassPer;
  }

  public String toString() {
    return name + ", " + salary + ", " + stuPassPer;
  }

  public void checkAndUpdateSalary() {
    if (stuPassPer >= 60 && stuPassPer < 75)
      appraisal(this);
    else if (stuPassPer >= 75 && stuPassPer <= 100)
      spAppraisal(this);
  }
}


public class Mock3 {
  // Define method printUpdatedTeachList
  public static void printUpdatedTeachList(Teacher[] tList) {
    for (Teacher teacher : tList) {
      teacher.checkAndUpdateSalary();
      System.out.println(teacher);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Teacher tArr[] = new Teacher[3];
    for (int i = 0; i < tArr.length; i++)
      tArr[i] = new Teacher(sc.next(), sc.nextDouble(), sc.nextDouble());
    Mock3.printUpdatedTeachList(tArr);
  }
}

// interface Appraisable {
// default void appraisal(Teacher teacher) {
// double newSalary = teacher.getSalary() + teacher.getPassPercent() / 100 * 5000;
// teacher.setSalary(newSalary);
// }

// public abstract void checkAndUpdateSalary();
// }


// interface SpecialAppraisable extends Appraisable {
// default void spAppraisal(Teacher teacher) {
// double newSalary = teacher.getSalary() + teacher.getPassPercent() / 100 * 10000;
// teacher.setSalary(newSalary);
// }
// }


// class Teacher implements SpecialAppraisable {
// private String name;
// private double salary;
// private double passPercent;

// public Teacher(String name, double salary, double passPercent) {
// this.name = name;
// this.salary = salary;
// this.passPercent = passPercent;
// }

// public double getSalary() {
// return salary;
// }

// public void setSalary(double salary) {
// this.salary = salary;
// }

// public double getPassPercent() {
// return passPercent;
// }

// public String toString() {
// return name + "," + salary + "," + passPercent;
// }

// public void checkAndUpdateSalary() {
// if (passPercent >= 60 && passPercent < 75) {
// appraisal(this);
// } else if (passPercent >= 75 && passPercent < 100) {
// spAppraisal(this);
// }
// }
// }


// public class Mock3 {

// public static void printUpdatedTeachList(Teacher[] tList) {
// for (Teacher teacher : tList) {
// teacher.checkAndUpdateSalary();
// System.out.println(teacher);
// }
// }

// public static void main(String[] args) {
// Teacher teacher1 = new Teacher("paru", 10000, 50);
// Teacher teacher2 = new Teacher("vishnu", 10000, 70);
// Teacher teacher3 = new Teacher("kavana", 10000, 80);
// Teacher[] tList = {teacher1, teacher2, teacher3};

// printUpdatedTeachList(tList);
// }
// }

