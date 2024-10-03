package domain;
import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nomeArquivo;
    private List<IShape> shapes;

    public Projeto(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.shapes = new ArrayList<>();
    }

    public void adicionarShape(IShape shape) {
        shapes.add(shape);
    }

    public void desenharTodasAsFiguras() {
        for (IShape shape : shapes) {
            shape.draw();
        }
    }

    public List<IShape> getShapes() {
        return shapes;
    }
}