package model;

public class Rectangle extends Figure {

  private final int row;

  public Rectangle(int y, int x, int size, Color color, int row) {
    super(y, x, size, color);
    this.row = row;
  }

  @Override
  public void draw() {
    System.out.println("  -----------------  ");
    for (int i = 0; i < row + y; i++) {
      for (int j = 0; j < size + x; j++) {
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



