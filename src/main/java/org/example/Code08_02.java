class Rabbit11 {
String shape;
int xPos;
int yPos;

    void move(int x, int y) {
    this.xPos = x;
    this.yPos = y;
        }
    }
class HouseRabbit extends Rabbit11 {
    String owner;
    void earFeed() {
        System.out.println("집토끼가 사료를 먹습니다.");
    }

    @Override
    void move(int x, int y) {
        super.move(x, y);
    }
}
class MountainRabbit extends Rabbit {
    String mountain;
    void earWildglass() {
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}
public class Code08_02{
    public static void main(String[] args) {

    }
}