abstract class Rabbit20 {
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
    abstract void sleep();
        }
class HouseRabbit20 extends Rabbit20{

    void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}

class MounrainRabbit20 extends Rabbit20{
   @java.lang.Override
    void sleep(){
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}
public class Code08_07{
    public static void main(String[] args) {
        HouseRabbit20 hRabbit = new HouseRabbit20();
        MounrainRabbit20 mRabbit = new MounrainRabbit20();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}