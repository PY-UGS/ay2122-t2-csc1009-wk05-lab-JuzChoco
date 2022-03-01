package Week5_Qns2;

public class Ellipse extends Shape{

    public Ellipse(double dim1, double dim2, double PI){
        super(dim1, dim2, PI);
    }

    public double area(){
        double area = getPI() * getDim1() * getDim2(); //Need to use getPI() as we are calculating the area of an ellipse
        return area;
    }
}