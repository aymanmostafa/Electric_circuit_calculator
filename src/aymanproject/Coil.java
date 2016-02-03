/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aymanproject;

/**
 *
 * @author Ayman
 */
public class Coil {
    double l;
    double freq;
    public Coil()
    {
        l=0;
        freq=0;
    }
    public Coil(double l)
    {
        this.l=l;
        freq=0;
    }
     public Coil(double l,double freq)
    {
        this.l=l;
        this.freq=freq;
    }
     public double getL()
     {
         return l;
     }
     public double getfreq()
     {
         return freq;
     }
     public void setL(double l)
     {
         this.l=l;
     }
      public void setfreq(double freq)
     {
         this.freq=freq;
     }
      public Coil series(Coil x)
      {
          double z=l+x.getL();
         Coil f=new Coil(z);
         return f;
      }
      public Coil parallel(Coil x)
      {
          double z=(l*x.getL())/(l+x.getL());
         Coil f=new Coil(z);
         return f;
      }
      public double reactance()
      {
          return 2*Math.PI*freq*l;
      }
      public boolean equals(Coil x)
      {
          return l==x.getL() && freq==x.getfreq();
      }
      public String toString()
      {
          return "L="+l+" frequency="+freq+" Reactance="+reactance();
      }
}