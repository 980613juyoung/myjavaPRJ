class Rabbit5 {
    private String shape;
    public int xPos;
    public int yPos;

    void setPosition(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
}

public class Code07_12 {
    public static void main(String[] args) {
        Rabbit5 r = new Rabbit5();
        r.xPos = 100;
        r.setPosition(100, 200);
    }
}
