//package Week5Lab;

public class TestCircleRectangle {
    
    public static void main(String[] args){

        Circle circle = new Circle(1);

        System.out.println("The color is " + circle.toString());
        System.out.println("The radius is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());   
        
        Rectangle rect = new Rectangle(2, 4);

        System.out.println("\nA rectangle " + rect.toString());
        System.out.println("\nThe area is " + rect.getArea());
        System.out.println("\nThe perimeter is" + rect.getPerimeter());
    }   
}
