package midterm;
class Calisan extends FirmaBilesen {
   int maas;
   String adSoyadi=null;
   public Calisan (String adSoyadi, int maas){
       this.maas=maas;
       this.adSoyadi=adSoyadi;
   }
//maliyet metodu implementasyonu
   @Override
   public   int maliyet(){
       return this.maas;
   }
}
