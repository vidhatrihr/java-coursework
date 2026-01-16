import java.util.*;

class Rectangle {
  int w; // width
  int h; // height
  // LINE-1: write the function setw(int) to initialize w

  void setw(int width) {
    this.w = width;
  }

  // LINE-2: write the function seth(int) to initialize h
  void seth(int height) {
    this.h = height;
  }

  // LINE-3: write the function area() to return area of rectangle
  int area() {
    return w * h;
  }
}


public class Ppa1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = Integer.parseInt(sc.nextLine());
    int h = Integer.parseInt(sc.nextLine());
    Rectangle r = new Rectangle();
    r.setw(w);
    r.seth(h);
    int area = r.area();
    System.out.print(area);
  }
}
