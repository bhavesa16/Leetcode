public class findtarget {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        System.out.println(find(a,6));
        System.out.println(find(a,10));
    }
    public static boolean find(int arr[],int target){
        int left=0;
        int right=arr.length;
        while (left < right){
            int mid=left +(right-left)/2;
            if(arr[mid]==target){
                return true;
            }
            else if (arr[mid] < target){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return false;
    }
}
