public class RationalNumber extends RealNumber{
  private int numerator, denominator;
  private double value;

  public RationalNumber(int nume, int deno){
    super(0.0);
    numerator = nume;
    denominator = deno;
    if (denominator == 0){
      denominator = 1;
      numerator = 0;
    }
    reduce();
    value = ((double) numerator / denominator);
  }

  public double getValue(){
    return(value);
  }

  public int getNumerator(){
   return numerator;
 }

 public int getDenominator(){
   return denominator;
 }

 public RationalNumber reciprocal(){
    RationalNumber newnum = new RationalNumber(denominator, numerator);
    return newnum;
  }

  public boolean equals(RationalNumber other){
    reduce();
    other.reduce();
    return(getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator());
 }

 public String toString(){
   if( getNumerator() == 0){
     return("0");
   }else if (getDenominator() == 1){
     return(""+getNumerator());
   }else{
     return ("" + getNumerator() + "/" + getDenominator());
 }
}

 private static int gcd(int a, int b){
   int big = a;
   int little = b;
   int r = a + 1;
   if(a < b){
      big = b;
      little = a;
    }
    if (little == 0){
      return(1);
    }
    while(r != 0){
      r = big % little;
      big = little;
      little = r;
    }
    return big;
  }


  private void reduce(){
    if(gcd(getNumerator(), getDenominator()) != 0){
    numerator = getNumerator()/gcd(getNumerator(), getDenominator());
    denominator = getDenominator()/gcd(getNumerator(), getDenominator());
  }
}

  public RationalNumber multiply(RationalNumber other){
    int newnume = getNumerator() * other.getNumerator();
    int newdeno = getDenominator() * other.getDenominator();
    RationalNumber newnum = new RationalNumber(newnume, newdeno);
    return newnum;
  }

  public RationalNumber divide(RationalNumber other){
    RationalNumber thisval = multiply(other.reciprocal());
    thisval.reduce();
    return(thisval);
  }

  public int lcm(int a, int b){
    int lcm = Math.max(a, b);
    while (true){
      if (lcm % Math.min(a, b) == 0){
        return(lcm);
      }else{
        lcm += Math.max(a, b);
      }
    }
  }

  public RationalNumber add(RationalNumber other){
    int newdeno = lcm(getDenominator(), other.getDenominator());
    int newnume = (getNumerator() * (newdeno / getDenominator())) + (other.getNumerator() * (newdeno / other.getDenominator()));
    RationalNumber newnum = new RationalNumber(newnume, newdeno);
    return newnum;
  }

  public RationalNumber subtract(RationalNumber other){
    int newdeno = lcm(getDenominator(), other.getDenominator());
    int newnume = (getNumerator() * (newdeno / getDenominator())) - (other.getNumerator() * (newdeno / other.getDenominator()));
    RationalNumber newnum = new RationalNumber(newnume, newdeno);
    return newnum;
  }
}
