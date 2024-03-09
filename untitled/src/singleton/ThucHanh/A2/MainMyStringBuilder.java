package singleton.ThucHanh.A2;

public class MainMyStringBuilder {
    public static void main(String[] args) {
        MyStringBuilder stringBuilder = new MyStringBuilder();
        stringBuilder.appendString("LAM BAI XONG ROI NGHI").appendString("\n")
                .appendString("Nghi thoi").addFloat(7.5F).appendString("diem la duoc roi");
        System.out.println(stringBuilder.toString());
    }
}
