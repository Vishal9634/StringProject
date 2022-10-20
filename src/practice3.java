public class practice3 {
    public static void main(String[] args) {
        String s="vishal singh";
        int len=s.trim().length();
        //output is 12 middle space not affect
        System.out.println(len);
        System.out.println("String with space");
        String s2=" vishal singh  ";
        System.out.println(s2.length());
        System.out.println("after trim");
        System.out.println(s2.trim().length());
    }
}
