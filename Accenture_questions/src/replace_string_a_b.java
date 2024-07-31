public class replace_string_a_b {
    public static void main(String[] args) {
        String s= "abaabbcc";
        System.out.println("string before= "+s);
        String res=replace(s);
        System.out.println("String after= "+res);
    }
    public static String replace(String str){
        char[] s=str.toCharArray();

        for(int i=0;i<s.length;i++){
            if(s[i] == 'a'){
                s[i] = 'b';
            } else if (s[i] == 'b') {
                s[i] = 'a';
            }
        }
        return new String(s);
    }
}
