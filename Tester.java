public class Tester {

  public static void main(String[] args){
    //RealNumber Tester
    System.out.println("RealNumber Tester");
    RealNumber x = new RealNumber(3);
    RealNumber y = new RealNumber(4);
    RealNumber z = new RealNumber(3.000001);
    RealNumber a = new RealNumber(0);
    RealNumber b = new RealNumber(0.00);
    System.out.println(x);
    System.out.println(y);
    System.out.println(x.equals(y));
    System.out.println(y.equals(x));
    System.out.println(x.equals(z));
    System.out.println(x.equals(a));
    System.out.println(a.equals(b));
    System.out.println(x.add(y));
    System.out.println(x.add(z));
    System.out.println(x.multiply(y));
    System.out.println(x.multiply(a));
    System.out.println(x.divide(y));
    System.out.println(x.divide(a));
    System.out.println(a.divide(x));
    System.out.println(x.subtract(y));
    System.out.println(x.subtract(a));
    System.out.println(a.subtract(x));
    //RationalNumber Tester
    System.out.println("RationalNumber Tester");
    RationalNumber cat = new RationalNumber(3, 0);
    RationalNumber dog = new RationalNumber(5, 2);
    RationalNumber monkey = new RationalNumber(9, -2);
    RationalNumber mantisShrimp = new RationalNumber(-9, 2);
    System.out.println(cat);
    System.out.println(dog);
    System.out.println(monkey);
    System.out.println(mantisShrimp);
    System.out.println(cat.getValue());
    System.out.println(dog.getValue());
    System.out.println(mantisShrimp.getNumerator());
    System.out.println(mantisShrimp.getDenominator());
    System.out.println(mantisShrimp.reciprocal());
    System.out.println(mantisShrimp.equals(monkey));
    System.out.println(mantisShrimp.equals(dog));
    System.out.println(RationalNumber.gcd(210, 45));
    System.out.println(RationalNumber.gcd(5, 2));
    System.out.println(RationalNumber.gcd(-18, 27));
    RationalNumber triceratops = new RationalNumber(6, 2);
    System.out.println(triceratops);
    System.out.println(RationalNumber.gcd(triceratops.getNumerator(), triceratops.getDenominator()));
    System.out.println(dog.multiply(monkey));
    System.out.println(dog.divide(monkey));
  }

}
