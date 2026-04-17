public class Main {
    public static void main(String[] args) {

        Coordinates A = new Coordinates(2, 3);

        Square square = new Square(A ,1);

        System.out.println(square.getPerimeter());
    }
}
