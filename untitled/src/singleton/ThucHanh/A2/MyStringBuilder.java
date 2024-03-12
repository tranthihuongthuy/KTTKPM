package singleton.ThucHanh.A2;

public class MyStringBuilder {
    String s = "";
    public MyStringBuilder appendString(String sub){
        s += sub;
        return this;
    }
    public MyStringBuilder addFloat(float f){
        s += f;
        return this;
    }
    public MyStringBuilder addBool(boolean b){
        s += b;
        return this;
    }
    @Override
    public String toString() {
        return s;
    }

}
