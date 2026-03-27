public abstract class Shape {
    protected Coordinates position;
    protected int sides;

    public Shape(int SidesAmount, Coordinates coordingate){
        this.position = coordingate;
        this.sides = SidesAmount;
    }

    public Coordinates getCoordinates(){
        return position;
    }
    public int getSides(){
        return sides;
    }

    public void translate(int dx, int dy){
        position.translate(dx,dy);
    }

}
