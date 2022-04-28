public class Coordenada {
  private double x, y;
  private double magnitud;

  public Coordenada(double x, double y) {
    this.x = x;
    this.y = y;
    this.magnitud = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
  }

  public Double getMagnitud() { return magnitud; }

  //Metodo getter de x
  public double abcisa() {
    return x;
  }


  //Metodo getter de y
  public double ordenada() {
    return y;
  }


  //Sobreescritura del método de la superclase objeto para imprimir con System.out.println( )
  @Override
  public String toString() {
    return "[" + x + "," + y + "]";
  }
}