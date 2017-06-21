
public class ShortDecoratorClothes extends DecoratorClothes{

    public ShortDecoratorClothes(Clothes clothes) {
        super(clothes);
    }
    public void show(){
        mClothes.show();
        System.out.println("it is short");
    }

}
