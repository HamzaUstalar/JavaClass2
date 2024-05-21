public class Main {
    public static void main(String[] args){
        Product product = new Product();
        product.name="Laptop";
        product.id="1282";
        product.price=2000;
        product.stockAmount=20;

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        
    }
}
