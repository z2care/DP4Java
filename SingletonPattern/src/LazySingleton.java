
public class LazySingleton {
    
    private static LazySingleton mInstance = null;

    private LazySingleton() {
        System.out.println("init LazySingleton");
    }
    
    public static synchronized LazySingleton getInstance(){
        if(mInstance == null){
            mInstance = new LazySingleton();
        }
        return mInstance;
    }

    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance().toString());
        System.out.println(LazySingleton.getInstance().toString());
    }

}
