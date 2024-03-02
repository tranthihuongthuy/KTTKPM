package behavioral.cc1_tinh;

public class MainCC1 {
    public static void main(String[] args) {
        Context c = new Context();
        float kq1 = c.setTinh(new Cong()).tinh(3,5);
        float kq2 = c.setTinh(new Nhan()).tinh(kq1,7);
        float kq3 = c.setTinh(new Tru()).tinh(kq2,8);
        float kq4 = c.setTinh(new Chia()).tinh(8,4);
        System.out.println(kq1);
        System.out.println(kq2);
        System.out.println(kq3);
        System.out.println(kq4);
    }
}
