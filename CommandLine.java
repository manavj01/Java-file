import java.util.Arrays;

public class CommandLine {
    
    public static void main(String[] args) {
      
         int[] arr = new int[args.length];
         
         for(int i=0;i<arr.length;i++) {
             arr[i] = Integer.parseInt(args[i]);
         }

         Arrays.sort(arr);

         for(int i=0;i<arr.length;i++) {

            System.out.print(arr[i] + " ");
         }
    }

    
}