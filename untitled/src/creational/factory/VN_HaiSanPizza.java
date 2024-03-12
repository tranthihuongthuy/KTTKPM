package creational.factory;

public class VN_HaiSanPizza extends Pizza{
    @Override
    void preppare() {
        builder.append("Bột gạo và 4 con mực to");
    }

    @Override
    void bake() {
        builder.append("\n")
                .append("Nướng trên lò than");
    }

    @Override
    void cut() {
        builder.append("\n")
            .append("cắt bằng răng cưa");
    }

    @Override
    void box() {
        builder.append("\n")
            .append("Đóng bằng hộp màu hường");
    }
}
