package midterm;
class Rectangle  implements Shape{
    double width;
    double height;
    public Rectangle (double height, double width){
             this.height=height;
             this.width=width;    
    } 
    //arayuz uygulanir 
    @Override
    public double alanHesapla(){
        return this.width*this.height;
    }
    //arayuz uygulanir 
    @Override
    public double cevreHesapla ()
    {
        return 2*(this.width+this.height);
    }
    @Override
    public String toString (){
        return  "Rectangle, height= "+this.height+" width= "+this.width;
    }
}
