
public class Factory implements IFactory {
    @Override
    public IProduct createProduct() {
        return new Product();
    }
}
