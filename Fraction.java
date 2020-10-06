public class Fraction {
    int numerator, denominator;
    
    Fraction(int num, int denom) {
        numerator = num;
        denominator = denom;
    }
    
    String print() { 
        return Integer.toString(numerator) + '/' + Integer.toString(denominator);
    }
    
    int getNumerator() {
        return numerator;
    }

    int getDenominator() {
        return denominator;
    }
    void add(Fraction frac) {
        //numerator += frac.numerator;
        /* TODO */
    }

    void subtract(Fraction frac) {
        //numerator -= frac.numerator;
        /* TODO */
    }

    void divide(Fraction frac) {
        numerator *= frac.denominator;
        denominator *= frac.numerator;
    }

    void multiply(Fraction frac) {
        numerator *= frac.numerator;
        denominator *= frac.denominator;
    }

    //Begin cruft that could be fixed with generics, but ¯\_(ツ)_/¯
    void add(int addend) {
        addend *= denominator;
        numerator += addend;
    }

    void subtract(int subtrahend){}
    
    void divide(int dividend){}

    void multiply(int multiplicand) {
        numerator *= multiplicand;
    }

}

