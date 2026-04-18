public class Main {
    public static void main(String[] args) {

        Coordinates A = new Coordinates(5, 5);

        Rectangle rectangle = new Rectangle(A, 4,6);
        rectangle.translate(4,2);
        System.out.println(rectangle.display());
    }
}
