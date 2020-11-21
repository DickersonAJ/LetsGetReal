public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno) {
    super(0.0);
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    else if (deno == 0) {
      numerator = 0 - nume;
      denominator = 0 - deno;
    }
    else {
      numerator = nume;
      denominator = deno;
    }
  }

  public double getValue(){
    return numerator*1.0/denominator*1.0;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    RationalNumber r = new RationalNumber(denominator, numerator);
    return r;
  }

}
