public class Primary {

    public static void main(String[] args){
        String s = "Lubbock";
        System.out.println(s.length());
        System.out.println(s.charAt(5));
        System.out.println(s.substring(1,4));
        System.out.println(s.substring(3));

        System.out.println(s.indexOf("boc"));
        System.out.println(s.indexOf("bac"));
        System.out.println(s.indexOf('b'));
        System.out.println(s.lastIndexOf('b'));
        System.out.println(s.compareTo("Austin"));
        System.out.println("Austin".compareTo(s));
        System.out.println("Hub City".compareTo("Hub"));

    }
}
