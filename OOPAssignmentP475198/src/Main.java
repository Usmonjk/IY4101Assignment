public class Main {
    public static void main(String[] args) {

        Coordinates a = new Coordinates(2,2);
        int rd = 1;
        Circle circle = new Circle(a , rd);
        System.out.println(circle.display());

    }
}
