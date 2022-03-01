package Week5_Qns2;

public class Triangle extends Shape {
    
    public Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    public double area(){
        double area = 0.5 * getDim1() * getDim2(); //Formula for area of triangle = 1/2 * Base * Height
        return area;
    }
}
