public class Coordinates {
    private int x;
    private int y;

    public Coordinates(){
        this.x = 0;
        this.y = 0;
    }
    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public double distance(Coordinates p){
        int disX = this.x - p.getX();
        int disY = this.y - p.getY();
        return  Math.sqrt(disX*disX + disY*disY);
    }

    public void translate(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    public void scale(int factor, boolean sign){
        if(sign == true)
        {
            this.x *= factor;
            this.y *= factor;
        }
        else
        {
            this.x /= factor;
            this.y /= factor;
        }
    }

    public String display(){
        String s = "X = " + getX() + " Y = " + getY();
        return (s);
    }
}
