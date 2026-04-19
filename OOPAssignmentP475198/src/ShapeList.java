import javax.xml.transform.Source;
import java.util.ArrayList;

public class ShapeList {
    private ArrayList<Shape> listOfShapes;

    public ShapeList() {
        listOfShapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        listOfShapes.add(s);
    }

    public void translateShapes(int dx, int dy) {
        for (Shape shape : listOfShapes)
        {
            shape.translate(dx, dy);
        }
        System.out.println("Shapes translated!");
    }

    public Shape getShape(int pos) {
        if (pos >= 0 && pos < listOfShapes.size())
        {
            return listOfShapes.get(pos);
        } else
        {
            System.out.println("Invalid position");
            return null;
        }
    }

    public Shape removeShape(int pos) {
        if (pos >= 0 && pos < listOfShapes.size())
        {
            System.out.println("Shape removed!");
            return listOfShapes.remove(pos);
        } else
        {
            System.out.println("Invalid position");
            return null;
        }
    }

    public double area(int pos) {
        if (pos >= 0 && pos < listOfShapes.size())
        {
            return listOfShapes.get(pos).getArea();
        } else
        {
            System.out.println("Invalid position");
            return 0;
        }
    }

    public double perimeter(int pos) {
        if (pos >= 0 && pos < listOfShapes.size())
        {
            return listOfShapes.get(pos).getPerimeter();
        } else
        {
            System.out.println("Invalid position");
            return 0;
        }
    }

    public void scale(int factor, boolean sign) {
        for (Shape shape : listOfShapes)
        {
            shape.scale(factor, sign);
        }
        System.out.println("Shapes are scaled");
    }

    public String display() {
        StringBuilder result = new StringBuilder("Index starts with 1:\n");
        for (Shape shape : listOfShapes)
        {
            result.append(shape.display()).append("\n");
        }
        return result.toString();
    }
}