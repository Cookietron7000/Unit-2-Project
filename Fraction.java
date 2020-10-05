

public class Fraction{
    int numerator, denominator;
    String fraction;
    Fraction(int num, int denom) {
        numerator = num;
        denominator = denom;
        fraction = Integer.toString(num) + '/' + Integer.toString(denom);
    }
    
    String print(){ return fraction; }
    
    void add(Fraction frac){
        
    }
    //Begin cruft that could be fixed with generics, but ¯\_(ツ)_/¯
    void add(int addend){}
    void add(double addend){}
    void subtract(Fraction subtrahend){}
    void subtract(int subtrahend){}
    void subtract(double subtrahend){}
}

