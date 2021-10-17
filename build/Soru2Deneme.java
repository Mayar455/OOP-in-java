package midterm;
class Soru2Deneme {
        public static void  main (String [] args ){
        // Mudurlukte calisanlar
        Calisan Ali=new Calisan("Ali", 5000);
        Calisan Veli=new Calisan("Veli", 6000);
        Calisan Ayse=new Calisan("Ayse", 4000);
        Calisan Can=new Calisan("Can", 3000);
        Calisan Selim=new Calisan("Selim", 2000);
        Calisan Murat=new Calisan("Murat", 1500);
        Calisan Zeynep=new Calisan("Zeynep", 2500);
        Calisan Emre=new Calisan("Emre", 3000);
        Calisan Ahmet=new Calisan("Ahmet", 4000);
        Calisan Bahar=new Calisan("Bahar", 2500);
        Calisan Sedat=new Calisan("Sedat", 1500);
        Calisan Vedat=new Calisan("Vedat", 2500); 

        //mudurluk
        Mudurlukler genel=new Mudurlukler("Genel Müdürlük");
        Mudurlukler egebolge=new Mudurlukler("Ege Bölge Müdürlüğü");
        Mudurlukler izmiril=new Mudurlukler("İzmir il müdürlüğü");
        Mudurlukler akdeniz=new Mudurlukler("Akdeniz Bölge Müdürlüğü ");
        Mudurlukler antalyail=new Mudurlukler("Antalya il müdürlüğü");

        //eklerken....
        genel.ekle(Ali);
        genel.ekle(Veli);  
        egebolge.ekle(Ayse);
        egebolge.ekle(Can);  
        egebolge.ekle(Selim);
        egebolge.ekle(Murat);
        egebolge.ekle(Zeynep); 
        akdeniz.ekle(Emre);
        akdeniz.ekle(Ahmet); 
        akdeniz.ekle(Bahar);
        akdeniz.ekle(Sedat);
        akdeniz.ekle(Vedat);
        genel.ekle(egebolge);
        genel.ekle(akdeniz);
        System.out.println("Ege bölge müdürlüğü maliyeti: "+egebolge.maliyet());
        System.out.println("Akdeniz bölge müdürlüğü maliyeti: "+akdeniz.maliyet()); 
        System.out.println("Genel müdürlük maliyeti: "+genel.maliyet());

    }
}
