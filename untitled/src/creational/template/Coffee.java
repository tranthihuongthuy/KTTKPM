package creational.template;

public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        builder.append("Pha cà phê xay sẵn\n");
    }

    @Override
    void addCondiments() {
        builder.append("Cho sữa\n");
    }
}
