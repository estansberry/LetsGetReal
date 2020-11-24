public class RealNumber{
  public static void main(String args[]){

  }
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return "" + getValue();
  }

  public boolean equals(RealNumber other){
    if(getValue() == 0 && other.getValue() == 0){
      return true;
    }else if(getValue() == 0 || other.getValue() == 0){
      return false;
    }else if((getValue() - other.getValue())/getValue() <= 0.00001 || (other.getValue() - getValue())/getValue() <= 0.00001){
      return true;
    }
    return false;
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
