public class MaxSubarraySumPrefixSum{
    public static void maxSubarraySum(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
           int start=i;
           for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                     currSum+=numbers[k];
                }
                if(currSum>maxSum){
                     maxSum=currSum;
                }
           }
        }
        System.out.println("The maximum subarray sum is: "+maxSum);
    }
    public static void main(String args[]){
        int numbers[]={-1,4,-2,3,4,-5};
        maxSubarraySum(numbers);
    }
}
