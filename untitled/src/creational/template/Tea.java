package creational.template;

public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        builder.append("Nhúng túi trà vào ly\n");
    }

    @Override
    void addCondiments() {
        builder.append("Thêm chanh và đường vào ly\n");
    }
    public static void main(String[] args) {
        CaffeineBeverage caphe = new Coffee();
        System.out.println(caphe.prepareRecipe().toString());
        System.out.println(new Tea().prepareRecipe().toString());
    }
}
