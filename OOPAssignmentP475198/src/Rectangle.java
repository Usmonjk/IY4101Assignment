public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Coordinates coord, double width, double height) {
        super(4, coord);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void scale(int factor, boolean sign) {
        if (sign)
        {
            width *= factor;
            height *= factor;
        } else
        {
            width /= factor;
            height /= factor;
        }
    }

    @Override
    public String display() {
        return "Rectangle at " + position.display() + ", width: " + width + ", height: " + height;
    }
}