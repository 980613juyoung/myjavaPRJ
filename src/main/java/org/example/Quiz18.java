package org.example;

class fruit{
    String color;
    int sweet;
    void setfruit(String color , int sweet){
        this.color = color;
        this.sweet = sweet;
    }
}
class apple extends fruit{
    String seed;
    @java.lang.Override
    void setfruit(String color , int sweet){
      super.setfruit(color,sweet);
      this.sweet = sweet + 30;
      this.color = "베리" + color;
    }
}

public class Quiz18 {
    public static void main(String[] args){
        apple greenapple = new apple();
        greenapple.setfruit("green",50);
        System.out.print(greenapple.color + "\n" + greenapple.sweet);
    }
}

