package model;

public abstract class Figure  {

  protected int y;
  protected int x;
  protected int size;
  protected Color color;

  public Figure(int y, int x, int size, Color color) {
    this.y = y;
    this.x = x;
    this.size = size;
    this.color = color;
  }

  public abstract void draw();

}
