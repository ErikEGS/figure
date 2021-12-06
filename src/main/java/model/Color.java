package model;

public enum Color  {

  RED("\u001B[31m"), BLACK("\u001B[30m"), GREEN("\u001B[32m"),
  YELLOW("\u001B[33m"), PURPLE("\u001B[35m");

  private final String color;

  Color(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }
}
