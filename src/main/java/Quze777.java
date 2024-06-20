import java.util.ArrayList;
import java.util.List;

public class Quze777 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("박주영");
        list.add("정선진");
        list.add("김소연");

        list.size();
        System.out.println("저장된 데이터 수 : " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}
