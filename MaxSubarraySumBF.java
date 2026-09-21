public class MaxSubarraySumBF{
    public static int maxSubarraySum(int numbers[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    sum+=numbers[k];
                }
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        System.out.println("The maximum subarray sum is: "+maxSubarraySum(numbers));
    }
}