package test;

import domain.Circle;
import domain.Point2D;
import domain.Point3D;
import domain.Projeto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class ProjetoTest {

    private Projeto projeto;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        projeto = new Projeto("TesteProjeto");
    }

    @Test
    public void testAdicionarShape() {
        Circle circle = new Circle(1, new Point2D(1.0, 2.0), 5.0);
        projeto.adicionarShape(circle);

        assertEquals("A forma não foi adicionada corretamente ao projeto.", 1, projeto.getShapes().size());
    }

    @Test
    public void testDesenharTodasAsFiguras() {
        Circle circle = new Circle(1, new Point2D(1.0, 2.0), 5.0);
        projeto.adicionarShape(circle);

        projeto.desenharTodasAsFiguras();
        
        assertTrue(outContent.toString().contains("Desenhando centro do Circulo em (1.0, 2.0) e raio 5.0"));
    }

    @Test
    public void testDesenharPoint2D() {
        Point2D point2D = new Point2D(1.0, 2.0);
        point2D.draw();

        assertTrue(outContent.toString().contains("Desenhando ponto 2D em (1.0, 2.0)"));
    }

    @Test
    public void testDesenharPoint3D() {
        Point3D point3D = new Point3D(1.0, 2.0, 3.0);
        point3D.draw();

        assertTrue(outContent.toString().contains("Desenhando ponto 3D em (1.0, 2.0, 3.0)"));
    }

    @Test
    public void testApagarFiguras() {
        Circle circle = new Circle(1, new Point2D(1.0, 2.0), 5.0);
        projeto.adicionarShape(circle);

        circle.erase();

        assertTrue(outContent.toString().contains("Apagando centro do Circulo em (1.0, 2.0) e raio 5.0"));
    }
    
    @Test
    public void testApagarPoint2D() {
        Point2D point2D = new Point2D(1.0, 2.0);
        point2D.erase();

        assertTrue(outContent.toString().contains("Apagando ponto 2D em (1.0, 2.0)"));
    }
    
    @Test
    public void testApagarPoint3D() {
        Point3D point3D = new Point3D(1.0, 2.0, 3.0);
        point3D.erase();

        assertTrue(outContent.toString().contains("Apagando ponto 3D em (1.0, 2.0, 3.0)"));
    }
}

