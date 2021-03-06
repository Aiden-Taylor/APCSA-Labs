public class Circle
{
  private double radius;

  public Circle(double r)
  {
    radius = r;
  }

  public double getArea()
  {
    return Math.PI * radius * radius;
  }
  
  public double getCircumference()
  {
    return Math.PI * radius * 2;
  }
}