package singleton.ThucHanh.A4;

public class MainVote {
    public static void main(String[] args) {
        User thuy = new User("Thuỷ");
        User hoang = new User("Hoàng");
        User ngoc = new User("Ngọc");
        User uyen = new User("Uyên");
        uyen.vote(Candidate.JOE_BIDEN);
        thuy.vote(Candidate.JOE_BIDEN);
        hoang.vote(Candidate.JOE_BIDEN);
        ngoc.vote(Candidate.DONAL_TRUMP);
        uyen.vote(Candidate.JOE_BIDEN);
        Election.getInstance().kq();
    }
}
