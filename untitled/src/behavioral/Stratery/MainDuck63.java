package behavioral.Stratery;

public class MainDuck63 {
    public static void main(String[] args) {
        Duck63 d1 = new VitQuay();
        d1.setFlyable(new BayTrenLoThan());
        d1.setQuackable(new SQuack());
        d1.display();
        Duck63 d2 = new VitCuDon();
        d2.setFlyable(new BayCoDon());
        d2.setQuackable(new SQuack());
        d2.display();
    }
}
