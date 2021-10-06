import java.util.Arrays;
public class taxis{
    public static void main(String[] args){
        int arr[] = new int[]{23,55,321,3,632,55,21};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}