class Rabbit13 {
    String shape;
    int xPos;
    int yPos;
    static int count =0;

    Rabbit13() {
        count++;
    }
}
public class Code08_01 {
    public static void main(String[] args) {
        System.out.println("객체 생성 전의 총 토끼 수 ==>" + Rabbit13.count);

        Rabbit13 rabbit = new Rabbit13();
        System.out.println("토끼 객체1 생성 후의 총 토끼 수 ==>" + Rabbit13.count);

        Rabbit13 rabbit5 = new Rabbit13();
        System.out.println("토끼 객체2 생성 후의 총 토끼 수 ==>" + Rabbit13.count);
    }
}
