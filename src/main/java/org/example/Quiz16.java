class Bigdata1{
    int score;
    String study;
    void exam(int score,String study){
        this.score = score;
        this.study = study;
    }
}
class daehun1 extends Bigdata1{


//   Bigdata1 @java.lang.Override
    void exam(int score, String study) {
        super.exam(score, study);
    }

    void exam1(int score, String study) {
        super.exam(score, study);



    /*void exam(int score, String study){
        super.exam(score,study);*/
        this.score = score + 50;
        }
        }
public class Quiz16 {
    public static void main(String[] args){
        daehun1 daehunkim = new daehun1();
        daehunkim.exam (50,"열공중");
        System.out.println(daehunkim.score + "\n" + daehunkim.study);
    }
}
