package singleton.ThucHanh.A4;

public class User {
    String id;

    public User(String id) {
        this.id = id;
    }
    public void vote(Candidate candidate){
        Election.getInstance().vote(candidate,this.id);
    }
}
