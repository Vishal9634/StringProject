public class StringbufferConstructor {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("");
        //capacity of empty string buffer object is 16
        System.out.println(sb.capacity());
        sb.append("1234567891234567");
        System.out.println("after adding 16 character in String buffer");
        System.out.println(sb.capacity());
        System.out.println("adding 17 character ");
        sb.append("a");
        //use formula capacity=(current capacity+1)*2
        System.out.println(sb.capacity());

        System.out.println("create 100 character capacity of string buffer ");
        StringBuffer sb2=new StringBuffer(100);
        System.out.println(sb2.capacity());

        StringBuffer sb3=new StringBuffer("Hello");
        sb3.delete(1,3);
        System.out.println(sb3);

        StringBuffer sb4 = new StringBuffer("Hello ");
        sb4.insert(1, "Java");
        // Now original string is changed
        System.out.println(sb4);
    }
}
