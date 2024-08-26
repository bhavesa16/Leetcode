public class Print_number_from_1_to_N {
//    without backtracking
    public static void printnumber(int i,int n){
        if (i>n)
            return;
        System.out.println(i);
        printnumber(i+1,n);
    }
//    with backtracking
    public static void printnumberbacktrack(int i,int n){
        if(i<1) {
            return;
        }
        printnumberbacktrack(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n=5;
//        printnumber(1,n);
        printnumberbacktrack(n,n);
    }
}
