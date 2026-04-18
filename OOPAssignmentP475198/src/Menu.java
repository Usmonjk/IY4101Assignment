import java.util.Scanner;

public class Menu {
    private ShapeList shapeList;
    private Scanner input;

    public Menu() {
        shapeList = new ShapeList();
        input = new Scanner(System.in);
    }

    public void addShape() {
        System.out.println("Choose shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");

        int type = input.nextInt();

        System.out.print("Enter position (x y) with space: ");
        int x = input.nextInt();
        int y = input.nextInt();

        Coordinates coord = new Coordinates(x, y);

        if (type == 1) {
            System.out.print("Radius: ");
            double r = input.nextDouble();
            if(x-r<0 || y-r<0)
            {
                System.out.println("Your shape is out of positive range but it will be added to the list");
            }
            shapeList.addShape(new Circle(coord, r));
        }
        else if (type == 2) {
            System.out.print("Width: ");
            double w = input.nextDouble();
            System.out.print("Height: ");
            double h = input.nextDouble();
            if(y-h<0 || y-w<0)
            {
                System.out.println("Your shape is out of positive range but it will be added to the list");
            }
            if(h!=w)
            {
                shapeList.addShape(new Rectangle(coord, w, h));
            }
            else if(h==w)
            {
                System.out.println("Your shape is not rectangle! It is square so it will be added as a square");
                shapeList.addShape(new Square(coord, w));
            }
        }
        else if (type == 3) {
            System.out.print("Side: ");
            double s = input.nextDouble();
            if(x-s<0 || y-s<0)
            {
                System.out.println("Your shape is out of positive range but it will be added to the list");
            }

            shapeList.addShape(new Square(coord, s));
        }
        else if (type == 4) {
            System.out.println("Enter second vertice (x y): ");
            Coordinates b = new Coordinates(input.nextInt(), input.nextInt());

            System.out.println("Enter third vertice (x y): ");
            Coordinates c = new Coordinates(input.nextInt(), input.nextInt());

            Triangle MyTriangle = new Triangle(coord, b, c);
            if(MyTriangle.getArea() == 0)
            {
                System.out.println("Unfortunatelly your triangle is stight line, it is not a triangle");
            }
            else
            {
                shapeList.addShape(MyTriangle);
            }
        }
        else {
            System.out.println("Invalid shape type");
        }
    }

    public void removeShape() {
        System.out.print("Enter ID (Starts from 1): ");
        int index = input.nextInt();
        shapeList.removeShape(index-1);
    }

    public void getArea() {
        System.out.print("Enter ID (Starts from 1): ");
        int index = input.nextInt();
        System.out.println("Area: " + shapeList.area(index-1));
    }

    public void getPerimeter() {
        System.out.print("Enter ID (Starts form 1): ");
        int index = input.nextInt();
        System.out.println("Perimeter: " + shapeList.perimeter(index-1));
    }

    public void translateShapes() {
        System.out.print("dx: ");
        int dx = input.nextInt();
        System.out.print("dy: ");
        int dy = input.nextInt();
        shapeList.translateShapes(dx, dy);
    }

    public void scaleShapes() {
        System.out.print("Factor: ");
        int factor = input.nextInt();
        System.out.print("Sign true = *, false = / (Enter true or false): ");
        boolean sign = input.nextBoolean();
        shapeList.scale(factor, sign);
    }

    public void run() {
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n**** MENU ****");
            System.out.println("1. Add Shape");
            System.out.println("2. Remove Shape");
            System.out.println("3. Display Shapes");
            System.out.println("4. Get Area");
            System.out.println("5. Get Perimeter");
            System.out.println("6. Translate all Shapes");
            System.out.println("7. Scale all Shapes");
            System.out.println("0. Exit (Your data will not be saved)");
            System.out.print("Choice: ");

            choice = input.nextInt();

            if (choice == 1)
            {
                addShape();
            }
            else if (choice == 2)
            {
                removeShape();
            }
            else if (choice == 3)
            {
                System.out.println(shapeList.display());
            }
            else if (choice == 4)
            {
                getArea();
            }
            else if (choice == 5)
            {
                getPerimeter();
            }
            else if (choice == 6)
            {
                translateShapes();
            }
            else if (choice == 7)
            {
                scaleShapes();
            }
            else if (choice == 0)
            {
                System.out.println("Exiting...");
            }
            else {
                System.out.println("Invalid choice");
            }
        }
    }

}