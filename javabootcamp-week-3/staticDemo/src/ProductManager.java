public class ProductManager {
    public void add(Product product){
        ProductValidator validator=new ProductValidator();
        if (ProductValidator.isValid(product)) {
            System.out.println("Ürün eklendi");
        }else {
            System.out.println("Ekelenemedi");
        }

        //Staticler direkt class ismiyle çağırılır.
        ProductValidator productValidator=new ProductValidator();
        productValidator.other();

    }
}
