public class RationalNumber extends Number{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno) {
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    else if (deno < 0) {
      numerator = 0 - nume;
      denominator = 0 - deno;
      reduce();
    }
    else if (nume == 0) {
      numerator = 0;
      denominator = deno;
    }
    else {
      numerator = nume;
      denominator = deno;
      reduce();
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

  public boolean equals(RationalNumber other){
    return (numerator == other.getNumerator() && denominator == other.getDenominator());
  }

  public String toString(){
    if (numerator == 0) {
      return "0";
    }
    if (denominator == 1) {
      return ""+numerator;
    }
    return ""+numerator+"/"+denominator;
  }

  public static int gcd(int a, int b){
    if (a<0) {
      return gcd(-a,b);
    }
    if (a<0) {
      return gcd(a,-b);
    }
    if (a<b) {
      return gcd(b,a);
    }
    int r = a%b;
    if (r == 0) {
      return b;
    }
    return gcd(b,r);
  }

  private void reduce(){
    int gcd = gcd(numerator, denominator);
    numerator = numerator/gcd;
    denominator = denominator/gcd;
  }

  public RationalNumber multiply(RationalNumber other){
    RationalNumber product = new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
    return product;
  }

  public RationalNumber divide(RationalNumber other){
    RationalNumber product = new RationalNumber(numerator * other.getDenominator(), denominator * other.getNumerator());
    return product;
  }

  public RationalNumber add(RationalNumber other){
    int den = denominator * other.getDenominator();
    int num = numerator * den + other.getNumerator() * den;
    RationalNumber sum = new RationalNumber(num, den);
    return sum;
  }

  public RationalNumber subtract(RationalNumber other){
    int den = denominator * other.getDenominator();
    int num = numerator * den - other.getNumerator() * den;
    RationalNumber sum = new RationalNumber(num, den);
    return sum;
  }

}
