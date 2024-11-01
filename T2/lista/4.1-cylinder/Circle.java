public class Circle {
  private double radius;
  private String color;

  public Circle() {
    radius = 1.0;
    color = "red";
  }

  public Circle(double r) {
    radius = r;
    color = "red";
  }

  public Circle(double r, String color) {
    this.radius = r;
    this.color = color;
  }

  public double getRadius() { return radius; }
  public double getCircumference() { return 2 * Math.PI * this.radius; }
  public double getArea() { return Math.sqrt(this.radius) * Math.PI;  }

  @Override
  public String toString() {
    String s = "Este círculo tem raio = " + this.getRadius() +
        ", cor = " + this.color +
        ", area = " + this.getArea();
    return s;
  }
}
