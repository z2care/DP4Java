
public class HungrySingleton {
    private static HungrySingleton mInstance = new HungrySingleton();

    private HungrySingleton() {
        System.out.println("init HungrySingleton");
    }
    
    public static HungrySingleton getInstance(){
        return mInstance;
    }

    public static void main(String[] args) {
        System.out.println(HungrySingleton.getInstance().toString());
        System.out.println(HungrySingleton.getInstance().toString());
    }

}
