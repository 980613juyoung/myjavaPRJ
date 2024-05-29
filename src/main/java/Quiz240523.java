public class Quiz240523 {
    public static void main(String[] args) {
        for (int i = 2, j = 1; j < 10; j++) {                 //i는 단수 j는 곱할 값 j를 증가시키면서 9번 반복하는 포문
            System.out.printf("%2d X%2d = %2d", i, j, i * j);    //i*j값 출력
            if (j == 9) {                                     //곱할 값이 9가 되면
                j = 0;                                      //곱할 값을 0으로 초기화하고
                i++;                                        //단수를 1 더해서 다음 단 진행
                System.out.println();                       //단이 바뀔때마다 줄바꿈
            }
            if (i == 10) {                                    //9단까지 출력을 해야 하기 때문에 단수가 10이 되면
                break;                                      //반복문 종료

            }
        }
    }
}
