
    class Rabbit {
        String shape;
        int xPos;
        int yPos;

        Rabbit(){
            this.shape="토끼";
            this.xPos=0;
            this.yPos=0;
        }

        Rabbit(String shape){
            this.shape=shape;
        }

        Rabbit(String shape,int xPos){
            this.shape=shape;
            this.xPos=xPos;
        }

        Rabbit(String shape,int xPos,int yPos){
            this.shape=shape;
            this.xPos=xPos;
            this.yPos=yPos;
        }

        void setPosition(int x, int y) {
            xPos = x;
            yPos = y;
            System.out.println("xPos : " + xPos + "/ yPos : " + yPos);
        }
    }
    public class Code07_06{
        public static void main(String[] args) {
            Rabbit rb1 = new Rabbit();
            Rabbit rb2=new Rabbit("거북이");
            Rabbit rb3=new Rabbit("삼각형",100);
            Rabbit rb4=new Rabbit("원",100,200);

            rb2.xPos=10;
            rb2.setPosition(20,20);

            rb2.xPos = 20;
            rb2.yPos = 20;
            System.out.println("xPos : " + rb2.xPos + "/ yPos : " + rb2.yPos);

            System.out.println(rb2.shape+" "+rb2.xPos+" "+rb2.yPos);
            System.out.println(rb3.shape+" "+rb3.xPos+" "+rb3.yPos);
            System.out.println(rb4.shape+" "+rb4.xPos+" "+rb4.yPos);
        }
    }

