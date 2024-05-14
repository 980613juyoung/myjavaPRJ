class Rabbit3 {
    String shape;
    int xPos;
    int yPos;

    Rabbit3(String shape) {
        this.shape = shape;
    }

    void  setPosition(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
//    Rabbit3(String shape) {
//            this.shape = shape;
//        }
//    }
    }
}

public class Code07_10 {
    public static void main(String[] args) {
        String rabbitColor = "파란색";

        Rabbit3 rabbit2 = new Rabbit3(rabbitColor);
        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.",rabbit2.shape);
    }
}
