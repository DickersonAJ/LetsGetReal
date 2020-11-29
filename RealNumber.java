public class RealNumber extends Number{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public RealNumber add(RealNumber other){
    RealNumber n = new RealNumber(value + other.getValue());
    return n;
  }

  public RealNumber multiply(RealNumber other){
    RealNumber n = new RealNumber(value * other.getValue());
    return n;
  }

  public RealNumber divide(RealNumber other){
    RealNumber n = new RealNumber(value / other.getValue());
    return n;
  }

  public RealNumber subtract(RealNumber other){
    RealNumber n = new RealNumber(value - other.getValue());
    return n;
  }

}
