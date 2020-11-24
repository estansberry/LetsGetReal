public abstract class Number{
  public abstract double getValue();

  public boolean equals(Number other){
    if(getValue() == 0 && other.getValue() == 0){
      return true;
    }if(getValue() == 0 || other.getValue() == 0){
      return false;
    }if(Math.abs((getValue() - other.getValue())/getValue()) <= 0.00001){
      return true;
    }else{
      return false;
  }
}

  public int compareTo(Number other){
   if(equals(other)){
     return(0);
   }else if (getValue() > other.getValue()){
     return(1);
   }else {
     return(-1);
   }
 }

}
