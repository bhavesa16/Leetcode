public class Print_number_from_N_to_1 {
    public static void printnum(int i,int n){
        if(i < 1)
            return;
        System.out.println(i);
        printnum(i-1,n);
    }

    public static void printnumbacktrack(int i,int n){
        if(i>n) {
            return;
        }
        printnumbacktrack(i+1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n=5;
//        printnum(5,n);
        printnumbacktrack(1,n);
    }
}
