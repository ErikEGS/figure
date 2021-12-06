package model;

public class Triangle extends Figure {

  public Triangle(int y, int x, int size, Color color) {
    super(y, x, size, color);
  }

  @Override
  public void draw() {
    System.out.println("  -----------------  ");
    int i;
    for (i = 0; i < (y * 2) + size; i++) {
      for (int j = i; j < (x * 2) + size; j++) {
        if (i >= y && j - i >= x) {
          System.out.print(color.getColor() + "* ");
        } else {
          if (i < size + y) {
            System.out.print(" ");
          }
        }
      }
      if ( i < size + y) {
        System.out.println();
      }
    }
  }

}