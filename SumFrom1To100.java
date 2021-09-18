public class SumFrom1To100 {
    
    public static void main(String[] args) {
        
        System.out.println(sum(100));
    }
    
    public static int sum (int i) {

        if(i==1){
            return 1;
        }

        int tsum = i + sum(i-1);

        return tsum;
    }
    
}