package Week5_Qns2;

public class Square extends Shape {
    
    public Square(double dim1, double dim2){
        super(dim1, dim2);
    }

    public double area(){
        double area = getDim1() * getDim2(); 
        return area;
    }
}
