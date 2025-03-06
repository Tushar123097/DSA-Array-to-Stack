import java.util.Arrays;
import java.util.Collections;


public class Sorting {
    public static void main(String[] args) {
        
    
    Integer arr[] = {10, 60, 50, 55, 33, 66};//Captal I and remaning are in small Integer
    //int arr[] = {10, 60, 50, 55, 33, 66};
   System.out.println("Before sorting"+Arrays.toString(arr));
  // Arrays.sort(arr);
  Arrays.sort(arr,Collections.reverseOrder());//Reverse ke liye likhte hai oR Decending order ke liye likht hai
   System.out.println("After sorting:"+Arrays.toString(arr));
    }
}

