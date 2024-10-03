package main;
import domain.Circle;
import domain.Point2D;
import domain.Point3D;
import domain.Projeto;

public class Main {
    public static void main(String[] args) {

        Point2D p1 = new Point2D(1.0, 2.0);
        Point3D p2 = new Point3D(1.0, 2.0, 3.0);
        
        Circle c1 = new Circle(1, p1, 5.0);

        Projeto projeto = new Projeto("Desenho1");
        projeto.adicionarShape(c1);

        projeto.desenharTodasAsFiguras();
    }
}

