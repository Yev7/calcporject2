public class Calculator {
    private double x;
    private double y;


    public Calculator(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public double Add(){
        return this.x + this.y;
    }
    public double Subtract(){
        return this.x -this.y;
    }
    public double Multiply(){
        return this.x*this.y;
    }
    public double Divide(){
        return this.x/this.y;
    }
    public double Square(){
        return this.x*this.x;
    }
    public double SquareRoot(){
        return Math.sqrt(this.x);
    }
    public double Exponent(){
        return Math.pow(this.x,this.y);
    }
}

