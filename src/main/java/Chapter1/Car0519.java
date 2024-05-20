class Note{
    int size;
    String color;
    void setNote(int size , String color){
        this.size = size;
        this.color = color;
    }
}
public class Car0519 {
    public static void main(String[] args){
        Note MusicNote = new Note();
        MusicNote.size = 30;
        MusicNote.color = "노란색";
        MusicNote.setNote(30 , "노란색");
        System.out.println(MusicNote.size);
        System.out.println(MusicNote.color);
    }
}

