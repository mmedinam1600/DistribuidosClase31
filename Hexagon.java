import java.util.*;
public class Hexagon{
    public List<Coordenada> vertices;

    public Hexagon(Coordenada centro){
        vertices = new ArrayList<Coordenada>();
        double radio = Math.random() *299 + 1;
        double angulo = 2 * Math.PI / 6;
        for(int i = 0; i < 6; i++){
            Coordenada c = new Coordenada(centro.abcisa() + radio * Math.cos(angulo * i), centro.ordenada() + radio * Math.sin(angulo * i));
            anadeVertice(c);
        }
    }

    public void anadeVertice(Coordenada c){
		vertices.add(c);
	}

}