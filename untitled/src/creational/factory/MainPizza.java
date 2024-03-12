package creational.factory;

public class MainPizza extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType p) {
        if(p == PizzaType.NAM){
            return new VN_PizzaStore();
        }
        else if(p == PizzaType.HAISAN){
            return new VN_HaiSanPizza();
        } return null;
    }

    public static void main(String[] args) {
        PizzaStore ps = new MainPizza();
        Pizza p = ps.orderPizza(PizzaType.NAM);
        System.out.println(p.toString());
    }
}
