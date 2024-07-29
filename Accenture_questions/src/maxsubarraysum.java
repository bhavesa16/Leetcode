public class maxsubarraysum {
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = max_subarr_sum(array);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
    public static int max_subarr_sum(int arr[]){
        int sum=0;
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
