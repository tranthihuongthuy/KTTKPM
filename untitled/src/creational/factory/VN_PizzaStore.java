package creational.factory;

public class VN_PizzaStore extends Pizza{
    @Override
    void preppare() {
        builder.append("Chuẩn bị nguyên liệu nấm");
    }

    @Override
    void bake() {
        builder.append("\n").append("Nướng trong lò 15 phút");
    }

    @Override
    void cut() {
        builder.append("\n").append("Cắt bánh\n");
    }

    @Override
    void box() {
        builder.append("Bỏ vào hộp");
    }
}
