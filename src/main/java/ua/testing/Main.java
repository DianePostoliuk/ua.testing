package ua.testing;

public class Main {

    public static void main(String[] args) {
        Fraction first = new Fraction(9,4);
        first.Show();
        FractionalNumber second = new FractionalNumber(1, 2, 4);
        second.Show();
        Fraction third = new Fraction(2,3);

        Fraction answer = first.Sum(first, third);
        answer.Show();


    }
}
