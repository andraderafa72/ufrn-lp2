public class Cylinder {
  private Circle base;
  private double height;

  public Cylinder() {
    this.base = new Circle();
    this.height = 1.0;
  }

  public Cylinder(double radius, double height) {
    this.base = new Circle(radius);
    this.height = height;
  }

  public double getHeight() { return this.height; }
  public double getVolume() { return this.base.getArea() * this.height;}

  @Override
  public String toString() {
    return "Cylinder: composition of " + this.base.toString()
        + " height=" + height;
  }
}