public class largestnumber {
    public static void main(String[] args) {
        int arr[]={4,6,9,1,23,41,5,4};
        int res=largest(arr);
        System.out.println("max="+res);
        int arr2[]={-4,-6,-9,-1};
        res=largest(arr2);
        System.out.println("max="+res);
    }

    public  static int largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
