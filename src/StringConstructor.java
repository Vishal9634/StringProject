public class StringConstructor {
    public static void main(String[] args) {
        System.out.println("Empty constructor");
        String s=new String();
        System.out.println(s);
        System.out.println("letral constructor");
        String s1=new String("vishal singh");
        System.out.println(s1);

        System.out.println("Convert String buffer to String literal");
        StringBuffer sb=new StringBuffer("String buffer");
        String s2=new String(sb);
        System.out.println(s2);

        System.out.println("char array convert into String ");
        char []ch={'j','a','v','a'};
        String s3=new String(ch);
        System.out.println(s3);

        System.out.println("Convert byte array into String literal");
        //range of byte array is -128 to 127
        byte []bA={97,98,99,100};
        String s4= new String(bA);
        System.out.println("97 in String a,98=b,99=c,100=d");;
        System.out.println(s4);

    }
}
