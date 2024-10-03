package domain;
public abstract class Figure2D implements IShape {
    protected int idFigure2D;

    public Figure2D(int idFigure2D) {
        this.idFigure2D = idFigure2D;
    }

    public int getIdFigure2D() {
        return idFigure2D;
    }
}