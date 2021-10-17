package midterm;;
import java.lang.*;
class Circle  implements Shape{
    double radius;
    final double PI=Math.PI;
    public  Circle (double radius){
         this.radius=radius;
    }
   //arayuz uygulanir 
    @Override
   public double alanHesapla(){
    return this.PI*this.radius*this.radius ;
    }
   //arayuz uygulanir 
   public double cevreHesapla ()
    {
        return 2*this.PI*this.radius ;
    }
    @Override
    public String toString (){
        return "Circle, radius="+this.radius;
    }
}
