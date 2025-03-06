import java.util.*;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "Striver Java   Norafateh    miakhalifa";
        System.out.println("Before replace:"+str);
        str = str.replaceAll("\\s", "");
        System.out.println("After replacement:"+str);
    }
    
}
