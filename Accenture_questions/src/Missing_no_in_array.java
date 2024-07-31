public class Missing_no_in_array {
    public static void main(String[] args) {
        int arr[]={0,3,1};
        System.out.println("missing number is:");
        System.out.println(find_missing(arr));
    }
    public static int find_missing(int a[]){
        int sum=0;
        int n=a.length;
        int total=n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum =sum + a[i];
        }
        return total-sum;
    }
}
