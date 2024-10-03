package domain;
public class Point2D implements IPoint {
    private double x, y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    public void draw() {
        System.out.println("Desenhando ponto 2D em (" + x + ", " + y + ")");
    }

    public void erase() {
        System.out.println("Apagando ponto 2D em (" + x + ", " + y + ")");
    }
}