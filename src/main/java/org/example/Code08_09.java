interface Rabbit27 {
    abstract void sleep();
}

class HouseRabbit27 implements Rabbit27{
    public void sleep(){
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}

class MountainRabbit27 implements Rabbit27{
    public void sleep(){
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}
public class Code08_09 {
    public static void main(String[] args) {
        HouseRabbit27 hRabbit = new HouseRabbit27();
        MountainRabbit27 mRabbit = new MountainRabbit27();
    }
}
