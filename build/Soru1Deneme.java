package midterm;
import java.io.*;
import java.util.Scanner;
class Soru1Deneme {
    public static void main (String [] args){
        Shape[] shapes =new Shape [5]; 
        for( int k=0 ;k<shapes.length;k++){
            shapes[k]=null;
        } 
        try {
            File dosya = new File("girdi.txt");
            Scanner taratici  = new Scanner(dosya);
            while (taratici.hasNextLine()) {
                String veri =taratici.nextLine(); 
            if(veri.split(" ")[0].trim().toLowerCase().equals("circle")){
                double Radius =Double.parseDouble(veri.split(" ")[1].trim());
                Circle circle = new Circle(Radius);
                for( int k=0 ;k<=shapes.length;k++){
                    if(shapes[k]==null){
                        shapes[k]=circle;
                        break;
                    }

                }
                
            } 
            else if(veri.split(" ")[0].trim().toLowerCase().equals("rectangle")){
                double Height =Double.parseDouble(veri.split(" ")[1].trim());
                double Width =Double.parseDouble(veri.split(" ")[2].trim());
                Rectangle rectangle=new Rectangle(Height,Width);
                for( int k=0 ;k<=shapes.length;k++){
                    if(shapes[k]==null){
                        shapes[k]=rectangle;
                        break;
                    }

                }
                
            }
            else if(veri.split(" ")[0].trim().toLowerCase().equals("dikucgen")){
                double a =Double.parseDouble(veri.split(" ")[1].trim());
                double b =Double.parseDouble(veri.split(" ")[2].trim());
                DikUcgen dikUcgen=new DikUcgen(a,b);
                for( int k=0 ;k<=shapes.length;k++){
                    if(shapes[k]==null){
                        shapes[k]=dikUcgen;
                        break;
                    }

                }
                
            } 
            }
            taratici.close();
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunmadi."); 
        } 
        for(Shape shape : shapes){
            String alan=String.format("%.3f", shape.alanHesapla());
            String cevre=String.format("%.3f", shape.cevreHesapla());
            System.out.println(shape.toString()+" alan= "+alan+" cevre= "+cevre);
            if(shape.getClass().equals(new DikUcgen(-1,-1).getClass())){
                ((DikUcgen)shape).tangentValues(); 
             } 
        }
         
    }
}
