package domain;
public class Point3D extends Point2D implements IPoint3D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double getZ() {
        return z;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando ponto 3D em (" + getX() + ", " + getY() + ", " + z + ")");
    }

    @Override
    public void erase() {
        System.out.println("Apagando ponto 3D em (" + getX() + ", " + getY() + ", " + z + ")");
    }
}