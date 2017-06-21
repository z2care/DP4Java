
public class RedDecoratorClothes extends DecoratorClothes{

    public RedDecoratorClothes(Clothes clothes) {
        super(clothes);
    }
    public void show(){
        mClothes.show();
        System.out.println("it is red");
    }

}
