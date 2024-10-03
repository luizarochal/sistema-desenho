package domain;
public class Circle extends Figure2D {
    private Point2D center;
    private double radius;

    public Circle(int idFigure2D, Point2D center, double radius) {
        super(idFigure2D);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando centro do Circulo em (" + center.getX() + ", " + center.getY() + ") e raio " + radius);
    }

    @Override
    public void erase() {
        System.out.println("Apagando centro do Circulo em (" + center.getX() + ", " + center.getY() + ") e raio " + radius);
    }
}