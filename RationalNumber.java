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
    return numerator/denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

}
