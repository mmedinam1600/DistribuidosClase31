import java.util.Random;

public class PruebaRectangulo {

  public static void main (String[] args) {
    Rectangulo rect1 = new Rectangulo(2,3,5,1);
    double ancho, alto;
    System.out.println("Calculando el área de un rectángulo dadas sus coordenadas en un plano cartesiano:");
    System.out.println(rect1);
    alto = rect1.superiorIzquierda().ordenada() - rect1.inferiorDerecha().ordenada();
    ancho = rect1.inferiorDerecha().abcisa() - rect1.superiorIzquierda().abcisa();
    System.out.println("El área del rectángulo es = " + ancho*alto);

    int vertices = 8;
    int high = 100;
    int low = -100;
    PoligonoIrreg poli1 = new PoligonoIrreg();
    for (int i = 0; i < vertices; i++) {
      poli1.anadeVertice(new Coordenada(new Random().nextInt(high-low) + low, new Random().nextInt(high-low) + low));
    }
    System.out.println("\n\nConjunto de vértices:");
    System.out.println(poli1);
    poli1.ordenaVertices();
    System.out.println("\nVertices ordenados:");
    System.out.println(poli1);
  }
}