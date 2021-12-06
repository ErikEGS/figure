package model;

public class Square extends Figure  {

  public Square(int y, int x, int size, Color color) {
    super(y, x, size, color);
  }

  @Override
  public void draw() {
    System.out.println("  -----------------  ");
    for (int i = 0; i < y + size; i++) {
      for (int j = 0; j < x + size; j++) {
        if (i >= y && j >= x) {
          System.out.print(color.getColor() + "* ");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

}
