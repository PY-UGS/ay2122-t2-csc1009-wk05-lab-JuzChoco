package Week5_Qns2;

public class Main {
    
    public static void main(String[] args){

        Shape r = new Rectangle(9, 5);
        Shape t = new Triangle(10, 8);
        Shape c = new Circle(5,5, 3.14);
        Shape e = new Ellipse(7,7, 3.14);
        Shape s = new Square(6, 6);

        System.out.println("Area is " + r.area());
        System.out.println("Area is " + t.area());
        System.out.println("Area is " + c.area());
        System.out.println("Area is " + e.area());
        System.out.println("Area is " + s.area());
    }
}
