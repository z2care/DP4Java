
public class Client {

    public static void main(String[] args) {
        IFactory factory = new Factory();
        
        IProduct1 product1 = factory.createProduct1();
        product1.description();
        
        IProduct2 product2 = factory.createProduct2();
        product2.description();
    }

}
