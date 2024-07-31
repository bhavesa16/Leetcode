public class reverse_order_of_string {
    public static void main(String[] args) {
        String s="Hello world";
        System.out.println("string before:"+s);
        System.out.println("String after: ");
        reverseWords(s);
    }
    public static void reverseWords(String str){
        String[] words=str.split(" ");
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
    }
}
