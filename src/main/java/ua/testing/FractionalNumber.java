package ua.testing;

public class FractionalNumber extends Fraction {

    private int integral, numerator, denominator;
    FractionalNumber(int integral, int numerator, int denominator) {
        super(numerator, denominator);
        this.integral = integral;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public void Show() {
        System.out.println(integral + " and " + numerator + "\\" + denominator );
    }
}
