package ua.testing;

public class Fraction {
    private int numerator, denominator;


    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    protected void Show() {
        System.out.println(numerator + "\\" + denominator);
    }

    protected Fraction Sum(Fraction first, Fraction second) {

        if(first.denominator == second.denominator) {
            if (first.numerator + second.numerator < first.denominator) {
                Fraction answer = new Fraction(first.numerator + second.numerator, first.denominator);
                return answer;
            } else if ((first.numerator + second.numerator) % first.denominator == 0) {
                FractionalNumber answer = new FractionalNumber(first.numerator + second.numerator / first.denominator, 0, 0);
                return answer;
            } else if ((first.numerator + second.numerator) > first.denominator) {
                int numeratorNumber = (first.numerator + second.numerator) % first.denominator;
                int integersAmount = (first.numerator + second.numerator - numeratorNumber) / first.denominator;
                FractionalNumber answer = new FractionalNumber(integersAmount, numeratorNumber, first.denominator);
                return answer;
            }
        }
        else {
            int lowestCommonMultiple = first.lowestCommonMultiple(first.denominator, second.denominator);
            first.numerator *= lowestCommonMultiple;
            first.denominator *= lowestCommonMultiple;
            second.numerator *= lowestCommonMultiple;
            second.denominator *= lowestCommonMultiple;
            if (first.numerator + second.numerator < first.denominator) {
                Fraction answer = new Fraction(first.numerator + second.numerator, first.denominator);
                return answer;
            } else if ((first.numerator + second.numerator) % first.denominator == 0) {
                FractionalNumber answer = new FractionalNumber(first.numerator + second.numerator / first.denominator, 0, 0);
                return answer;
            } else if ((first.numerator + second.numerator) > first.denominator) {
                int numeratorNumber = (first.numerator + second.numerator) % first.denominator;
                int integersAmount = (first.numerator + second.numerator - numeratorNumber) / first.denominator;
                FractionalNumber answer = new FractionalNumber(integersAmount, numeratorNumber, first.denominator);
                return answer;
            }
        }
        return null;
    }

    public int getNod(int firstDenominator, int secondDenominator) {
        do {
            if (firstDenominator > secondDenominator)
                firstDenominator %= secondDenominator;
            else secondDenominator %= firstDenominator;
        } while (firstDenominator * secondDenominator > 0);
        return firstDenominator + secondDenominator;
    }

    public int lowestCommonMultiple(int number1, int number2) {
        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        int absNumber1 = Math.abs(number1);
        int absNumber2 = Math.abs(number2);
        int absHigherNumber = Math.max(absNumber1, absNumber2);
        int absLowerNumber = Math.min(absNumber1, absNumber2);
        int lowestCommonMultiple = absHigherNumber;
        while (lowestCommonMultiple % absLowerNumber != 0) {
            lowestCommonMultiple += absHigherNumber;
        }
        return lowestCommonMultiple;
    }

}
