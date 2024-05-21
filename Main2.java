public class Main2 {
    public static void main(String[] args){
        Product2 musteri1 = new Product2(); // Burada constructor çalıştı.
        musteri1.id=1;
        musteri1.name="Laptop";
        musteri1.price=10000;
        musteri1.stockAmount=10;
        musteri1.description="Asus Laptop";

        Product2 musteri2 = new Product2(); // Burada constructor çalıştı.
        musteri2.name="Masaüstü";
        musteri2.description="Asus Masaüstü";
        musteri2.price=7000;
        musteri2.stockAmount=5;
        musteri2.id=2;
        
        ProductManager2 musteriManager1 = new ProductManager2(); // Soru = extends etseydik constructor gelir miydi?
        musteriManager1.Add(musteri1);

        ProductManager2 musteriManager2 = new ProductManager2();
        musteriManager2.Add(musteri1);

        musteriManager2.Add2(musteri1);

        musteriNumarasi(musteri2,"Tebrikler");
        musteriNumarasiVeIsmi(musteri2, musteri1,"Deneme");

        Main2Soru deneme = new Main2Soru(); 
        deneme.constructorDeneme();
        
    }
    public static void musteriNumarasi(Product2 musteri2, String yazi){ // Burada fonksiyon içinde class'ın elemanı ve farklı parametre almayı gördük.
        System.out.println("Ürün fonksiyon içinde eklendi: "+musteri2.id+" "+ yazi);}
    public static void musteriNumarasiVeIsmi(Product2 musteri2, Product2 musteri1 ,String yazi){// class'ın hangi elemanını almak istiyorsak ona göre tanımlama yaparız.
        System.out.println(musteri2.name+" "+yazi+" "+musteri1.name);
    }
    
}
