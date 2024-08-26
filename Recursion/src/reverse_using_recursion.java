public class reverse_using_recursion {
    public static void reverse(int l,int r,int arr[]){
        if (l >= r)
            return;
//        swap a[l],a[r]
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        reverse(l+1,r-1,arr);
    }
//single pointer approach
    public static void reversearr(int i,int[] arr){
        int n=arr.length;
        if(i >= (n/2))
            return;
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        reversearr(i+1,arr);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int l=0;
        int r= arr.length-1;
//        reverse(l,r,arr);
        reversearr(0,arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
