public class Tester {

  public static void main(String[] args){
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
  }

}
