package debug;



public class Debug {

    private String s;

    public Debug(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void debugPrint() {
        System.out.println(s);
    }
}