public class Triangle extends Shape {
    private Coordinates vertexA;
    private Coordinates vertexB;
    private Coordinates vertexC;

    public Triangle(Coordinates a, Coordinates b, Coordinates c) {
        super(3, a);
        this.vertexA = a;
        this.vertexB = b;
        this.vertexC = c;
    }

    @Override
    public void scale(int factor, boolean sign) {
        int scaleFactor;
        if (sign)
        {
            scaleFactor = factor;
        } else
        {
            scaleFactor = -factor;
        }

        vertexA.scale(scaleFactor, true);
        vertexB.scale(scaleFactor, true);
        vertexC.scale(scaleFactor, true);
    }

    @Override
    public double getArea() {
        double a = vertexA.distance(vertexB);
        double b = vertexB.distance(vertexC);
        double c = vertexC.distance(vertexA);
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        if (area == 0) {
            System.out.println("This is not a valid triangle.");
        }

        return area;
    }

    @Override
    public double getPerimeter() {
        double ab = vertexA.distance(vertexB);
        double bc = vertexB.distance(vertexC);
        double ca = vertexC.distance(vertexA);
        return ab + bc + ca;
    }

    @Override
    public void translate(int dx, int dy) {
        vertexA.translate(dx, dy);
        vertexB.translate(dx, dy);
        vertexC.translate(dx, dy);
    }

    @Override
    public String display() {
        return "Triangle: A=" + vertexA.display() + ", B=" + vertexB.display() + ", C=" + vertexC.display();
    }
}
