
public class DecoratorClothes implements Clothes{
    Clothes mClothes;
    public DecoratorClothes(Clothes _mClothes) {
        mClothes = _mClothes;
    }
    public void show(){
        mClothes.show();
    }
}
