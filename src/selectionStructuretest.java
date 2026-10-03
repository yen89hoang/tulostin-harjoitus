public class selectionStructuretest {
    public static void main(String[] args) {

        int n1 = 20;
        int n2 = 20;

        if (n1 == n2) {
            System.out.println("Numbers are equal.");
        }

        String Os1 = "iOS";
        String Os2 = "Android";
        System.out.println(Os1);
        System.out.println(Os2);

        if (!Os1.equals("Os2")) {
            System.out.println("Strings are not equal.");
        }

        int n4 = 45;
        int n5 = 45;
        int n3 = 45;

        if (n4 == n5 && n4 == n3)
            ;
        {
            System.out.println("Numbers are equals.");
        }

        int deg = 120;
        if (deg > 100) {
            System.out.println("120 is greater than 100.");
        }

    }
}
