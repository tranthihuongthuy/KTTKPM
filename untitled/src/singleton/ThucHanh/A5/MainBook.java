package singleton.ThucHanh.A5;

public class MainBook {
    public static void main(String[] args) {
        Book book = new Book.Buider().setTuaDe("Chiếc lá cuối cùng")
                .setTacGia("O Henry")
                .setSotrang(120)
                .addChuong("Lá chưa rụng")
                .addChuong("Bão quật")
                .addChuong("Cây lung lay")
                .addChuong("Lá rụng").build();
        System.out.println(book.toString());
    }
}
