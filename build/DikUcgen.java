package midterm;
import java.lang.*;
class DikUcgen implements Shape{
    double a;
    double b;
    double c;
    public DikUcgen( double a, double b){
        this.a=a;this.b=b;this.c= Math.sqrt(a*a+b*b);
    }
   //arayuz uygulanir 
   public double alanHesapla(){
    return (this.a*this.b)*1/2;
   } 
   //arayuz uygulanir 
   public double cevreHesapla ()
   {
       return this.a+this.b+this.c;
   }
    public  void  tangentValues(){
        String abolub=String.format("%.3f",this.a/this.b);
        String bbolua=String.format("%.3f",this.a/this.b);
        System.out.println("tangent degerleri a/b= "+abolub+" b/a= "+bbolua);
    }
    public String toString (){
        return "DikUcgen, a= "+this.a+" b= "+this.b+" c= "+this.c;
    }

}
