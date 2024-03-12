package singleton.ThucHanh.A5;

import singleton.ThucHanh.A1.HoaDon;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String tuaDe, tacGia;
    int sotrang;
    List<String> chuongs;



    protected Book(Buider b){
        this.tuaDe = b.tuaDe;
        this.tacGia = b.tacGia;
        this.sotrang = b.sotrang;
        this.chuongs = b.chuongs;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tựa đề: ").append(tuaDe).append("\n")
                .append("Tác giả: ").append(tacGia).append("\n")
                .append("Số trang: ").append(sotrang).append("\n")
                .append("Các chương: \n");
        int i = 1;
        for(String c: chuongs)
            builder.append("\t").append(i++).append(". ").append(c)
                    .append("\n");
        return builder.toString();
    }

    public static class Buider{
        String tuaDe, tacGia;
        int sotrang;
        List<String> chuongs = new ArrayList<>();
        public Buider setTuaDe(String tuaDe){
            this.tuaDe = tuaDe;
            return this;
        }
        public Buider setTacGia(String tacGia){
            this.tacGia = tacGia;
            return this;
        }
        public Buider setSotrang(int sotrang){
            this.sotrang = sotrang;
            return this;
        }
        public Buider addChuong(String chuong){
            chuongs.add(chuong);
            return this;
        }

        public Book build(){ return new Book((this));}
    }

}
