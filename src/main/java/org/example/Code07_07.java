class Rabbit2 {
    String shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}
public  class Code07_07 {
    public static void main(String[] args) {
        Rabbit2 rabbit1 = new Rabbit2();
        Rabbit2 rabbit2 = new Rabbit2();
        Rabbit2 rabbit3 = new Rabbit2();

        rabbit1.shape = "원";
        rabbit2.shape = "삼각형";
        rabbit3.shape = "토끼";

        System.out.println("rabbit1.shape : " + rabbit1.shape);
        System.out.println("rabbit2.shape : " + rabbit2.shape);
        System.out.println("rabbit1.shape : " + rabbit3.shape);

        rabbit1.setPosition(100, 100);
        rabbit2.setPosition(-100, 100);
        rabbit3.setPosition(0, 100);
    }
}