public class Circulo {

  private Coordenada center;
  private double radius;
  private double area;
  private double perimeter;
  private double PI;
  private double circumference;

  public Circulo(Coordenada center, double radius) {
    this.center = center;
    this.radius = radius;
    this.PI = Math.PI;
    this.perimeter = calculatePerimeter();
    this.area = calculateArea();
    this.circumference = calculateCircumference();
  }

  private double calculateArea() {
    return (PI * radius * radius);
  }

  private double calculatePerimeter() {
    return (PI * getDiameter() );
  }

  private double calculateCircumference() {
    return ( (2 * PI) * radius);
  }

  public double getDiameter() {
    return radius + radius;
  }

  public double getArea() {
    return area;
  }

  public double getPerimeter() {
    return perimeter;
  }

  public double getCircumference() {
    return circumference;
  }

  public Coordenada getCenter() {
    return center;
  }

  public double getRadius() {
    return radius;
  }

  public void setCenter(Coordenada center) {
    this.center = center;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "Circulo con centro X:" + center.abcisa() + " Y:" + center.ordenada() + "\n" +
            "Radio: " + radius + "\n" +
            "Diámetro: " + getDiameter() + "\n" +
            "Area: " + area + "\n" +
            "Perímetro: " + perimeter + "\n" +
            "Circunferencia: " + circumference;
  }

}
