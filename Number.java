public abstract class Number{
  public abstract double getValue();

  public int compareTo(Number other){
    if (this.getValue() == other.getValue()) {
      return 0;
    }
    if (this.getValue() > other.getValue()) {
      return 1;
    }
    if (this.getValue() < other.getValue()) {
      return -1;
    }
    return 0;
  }

  public boolean equals(RealNumber other){
    if (this.getValue() == 0 || other.getValue() == 0) {
      return(this.getValue() == other.getValue());
    }
    return (Math.abs((this.getValue() - other.getValue())/other.getValue()*100) <= .001);
  }

}
