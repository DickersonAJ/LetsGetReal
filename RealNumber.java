public class RealNumber {
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

  public boolean equals(RealNumber other){
    if (value == 0 || other.getValue() == 0) {
      return(value == other.getValue());
    }
    return (Math.abs((value - other.getValue())/other.getValue()*100) <= .001);
  }

}
