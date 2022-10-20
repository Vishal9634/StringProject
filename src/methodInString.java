public class methodInString {
    public static void main(String[] args) {
        System.out.println("chatAt() return the character at the specific ");
        String s="vishal";
        System.out.println(s);
        System.out.println(s.charAt(2));
        System.out.println(s.indexOf('h'));//give index of the character present in string

        System.out.println("concat()method adding string to end of the string");
        String s2="string1";
        System.out.println(s2.concat("string2"));
        String s3="hello"+"how are you"; //same as above

        System.out.println("equals() method compare two object value in String ");
        String s4=new String("String4");
        String s5=new String("String4");
        System.out.println(s4.equals(s5));

        System.out.println("toUpperCase() method in string");
        String s6="vishal";
        System.out.println(s6);
        System.out.println(s6.toUpperCase());
        System.out.println("toLowerCase() method in string");
        String s7="VISHAL";
        System.out.println(s7);
        System.out.println(s7.toLowerCase());
        //complete all other method
        System.out.println("equalsIgnoreCase() ignore the upper case and lower case ");
        String s8="Vishal";
        System.out.println(s8);
        System.out.println(s8.equalsIgnoreCase("visHal"));
        System.out.println("isEmpty() is used to check either a string is empty or not ");
        String s9="";
        System.out.println(s9.isEmpty());
        System.out.println("length() method of a string to tall the length of a string");
        String s10="vishal";
        System.out.println(s10.length());
        char []ch={'v','i','s','h','a'};
        System.out.println("length variable is used for arrays but length() method is used for string objects");
        System.out.println(ch.length);
        System.out.println("replace() method is used to replace character with another character");
        String s11="ababab";
        System.out.println(s11);
        System.out.println(s11.replace('a','b'));
        System.out.println("substring() method is used to print string from given index to end of the string");
        String s12="how are you";
        System.out.println(s12);
        System.out.println(s12.substring(3));
        System.out.println(s12.substring(2,6));//only print 2 index to 5 6 index not consider
        System.out.println("trim method in String is used to remove space from a string");
        String s13="  vishal   ";
        String s14=s13.trim();
        System.out.println("trim() method remove space from string from beginning and from end not at the middle of string");
        System.out.println(s14.equals("vishal"));


    }
}
