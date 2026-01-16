import java.util.*;

class Shape {
  public int area() {
    return 0;
  }

  public int volume() {
    return 0;
  }
}


class Rectangle extends Shape {
  private int w, h;

  // Constructor to initialize width and height
  Rectangle(int width, int height) {
    w = width;
    h = height;
  }

  // Override area() for rectangle
  public int area() {
    return w * h;
  }
}


class Cube extends Shape {
  private int a;

  // Constructor to initialize side length
  Cube(int side) {
    a = side;
  }

  // Override surface area for cube
  public int area() {
    return ((int) Math.pow(a, 2));
  }

  // Override volume for cube
  public int volume() {
    return ((int) Math.pow(a, 3));
  }

}


public class Gpa6 {
  private static void caller(Shape s) {
    if (s instanceof Rectangle) {
      System.out.println(s.area());
    }
    if (s instanceof Cube) {
      System.out.println(s.volume());
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int a = sc.nextInt();
    caller(new Rectangle(w, h));
    caller(new Cube(a));
  }
}
