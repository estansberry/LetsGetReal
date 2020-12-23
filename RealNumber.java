public class RealNumber extends Number{
  public static void main(String args[]){

  }
  private double value;

  public RealNumber(double v){
    super();
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return "" + getValue();
  }


  public RealNumber add(RealNumber other){
    RealNumber newval = new RealNumber(getValue() + other.getValue());
     return (newval);
  }

  public RealNumber multiply(RealNumber other){
    RealNumber newval = new RealNumber(getValue() * other.getValue());
      return(newval);
  }

  public RealNumber divide(RealNumber other){
    RealNumber newval = new RealNumber(getValue() / other.getValue());
      return(newval);
  }

  public RealNumber subtract(RealNumber other){
    RealNumber newval = new RealNumber(getValue() - other.getValue());
    return (newval);
  }
}
