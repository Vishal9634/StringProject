public class imutable {

    public static void main(String[] args) {
        /*case1.........................................................................
        //here two object is created one store in heap area second in String pool area
        String s=new String("String created in heap area and string constant pool");
        System.out.println(s);

        String s2="string created in string pool area";
        System.out.println(s2);
       String s3=s2.concat(" :concat");
        System.out.println(s3);

         case1 end................................................................*/
        //case2.......................................................................
        String s1=new String("You cannot change me");
        String s2=new String("you cannot change me");

        System.out.println("two different object thats why output false");
        System.out.println(s1==s2);

        String s3="you cannot change me";
        System.out.println(s1==s3);
        String s4="you cannot change me";

        System.out.println("s3 and s4 both are pointing to same object:");
        System.out.println(s3==s4);

        String s5="you cannot "+"change me";

        System.out.println("s4 and s5 both pointing to same object");
        System.out.println(s4==s5);

        String s6="you cannot ";
        String s7=s6+"change me";
        System.out.println("s4 and s7 pointing to different object flase answer ");
        System.out.println(s4==s7);
        final String s8="you cannot ";
        String s9=s8+"change me";

        System.out.println("s4 and s9 both pointing to same object");
        System.out.println(s4==s9);



    }
}
