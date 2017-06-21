
public class ConcreteClothes implements Clothes{

    @Override
    public void show() {
        System.out.println("concrete clothes");        
    }
    
    public static void main(String[] args) {
        Clothes clothes = new DecoratorClothes(new RedDecoratorClothes(new ShortDecoratorClothes(new ConcreteClothes())));
        clothes.show();
    }

}
