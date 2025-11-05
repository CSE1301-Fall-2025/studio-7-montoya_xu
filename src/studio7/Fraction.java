public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int num, int denom){
        numerator = num;
        denominator = denom;
    }

    public Fraction addFrac(Fraction f2){
        Fraction sum = new Fraction (this.numerator, this.denominator);
        if(this.denominator == f2.denominator){
            sum.numerator += f2.numerator;
        }
        else {
            sum.numerator *= f2.denominator;
            sum.denominator *= f2.denominator;
            sum.numerator += (f2.denominator * sum.denominator);
        }
        }
    }

    public int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}

    public Fraction simplify(){
        Fraction simple = new Fraction(this.numerator/gcd(this.numerator,this.denominator), this.denominator/gcd(this.numerator,this.denominator));
        return simple;
    }

}
