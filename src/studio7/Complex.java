public class Complex {

    private double real;
    private double imaginary;

    public Complex(double a, double b){
        real = a;
        imaginary = b;
    }

    public String toString(){
        return real + "+ " + imaginary + "i";
    }

    public Complex sumC(Complex c2){
        Complex sum = new Complex(this.real+c2.real,this.imaginary+c2.imaginary);
        return sum;
    }

    public Complex productC(Complex c2){
        Complex product = new Complex(( this.real*c2.real - this.imaginary*c2.imaginary), ( this.real*c2.imaginary + this.imaginary*c2.real ));
        return product;
    }

}
