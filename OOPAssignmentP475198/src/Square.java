public class Square extends Shape{
    private double side;

    public Square(Coordinates coord, double side) {
        super(4, coord);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void scale(int factor, boolean sign) {
        if (sign) {
            side *= factor;
        } else {
            side /= factor;
        }
    }

    @Override
    public String display() {
        String s = "Square at " + position.display() + ", side: " + side;
        if(position.getY()-side<0 || position.getX()-side<0)
        {
            s+="\nYour square is out of positive range";
        }
        return s;
    }
}
