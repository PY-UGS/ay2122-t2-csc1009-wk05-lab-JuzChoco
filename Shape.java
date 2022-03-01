package Week5_Qns2;

public abstract class Shape {
    
    private double dim1;
    private double dim2;
    private double pi = 3.14;

    public Shape(double dim1, double dim2){
        
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public Shape(double dim1, double dim2, double pi){

        this.dim1 = dim1;
        this.dim2 = dim2;
        this.pi = pi;
    }

    public double getDim1(){

        return dim1;
    }

    public void setDim1(double dim1){

        this.dim1 = dim1;
    }

    public double getDim2(){

        return dim2;
    }

    public void setDim2(double dim2){

        this.dim2 = dim2;
    }

    public double getPI(){
        return this.pi;
    }

    public void setPI(double pi){
        this.pi = pi;
    }

    public abstract double area();
}
