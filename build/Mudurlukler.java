package midterm;
import java.util.ArrayList;
class Mudurlukler extends FirmaBilesen{
    ArrayList <FirmaBilesen> arrayList=new ArrayList<>();
    String mudurlukadi=null;
    public Mudurlukler (String mudurlukadi){
        this.mudurlukadi=mudurlukadi;
    } 
    @Override
    public int maliyet(){
         int toplam=0;
         for (int i=0;i<arrayList.size();i++){
            toplam+=arrayList.get(i).maliyet();
         }
        return toplam;
    }
    public void ekle (FirmaBilesen fb){
        arrayList.add(fb);
    }
}
