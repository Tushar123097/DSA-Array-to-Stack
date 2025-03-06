import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={4, 2, 5, 5, 3};
        
        int n = arr.length;//if n is not given find by this
        for (int i = 0; i < n-1; i++)//0 to 4 iteration
         {
            for ( int j = 0; j < n-1; j++)//0<4 1<4 2<4 3<4
            {
                if (arr[j]>arr[j+1])//4>2 4>5 5>5 5>3
                 {
                    int temp = arr[j];//t=4 t=5
                    arr[j] = arr[j+1];//2 3
                    arr[j+1] = temp;//4 5
                }
            }
        }
        System.out.println("The Result is:"+Arrays.toString(arr));
    }
    
}
