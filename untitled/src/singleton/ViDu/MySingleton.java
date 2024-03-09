package singleton.ViDu;

public class MySingleton {
    //1. Khai báo biến sẽ một singleton
    private static MySingleton instance;
    int count;
    //2. phương thức khởi tạo phải là private hoặc protected
    private MySingleton(){
    }
    public static MySingleton getInstance(){
        if(instance == null)
            instance = new MySingleton();
        return instance;
    }
    public void inCount(){
        System.out.println(++count);
    }
}
