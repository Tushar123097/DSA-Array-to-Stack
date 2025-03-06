import java.util.Arrays;

public class RemoveJunk {
    public static void main(String[] args) {
        String s =  "($i=128; $i<258; $i++java";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }
    
}
