public class PoolStrings {
    public static void main(String[] args) {
        String s_1 = "EPAM"; // pool
        String s_2 = "EPAM"; // pool
        String s_3 = s_1; // pool
        String s_4 = new String("EPAM"); // heap
        String s_5 = new String("epam"); // heap
        isEqualsObjects(s_1, s_2); // true true
        isEqualsObjects(s_1, s_3); // true true
        isEqualsObjects(s_1, s_4); // true false
        isEqualsObjects(s_1, s_5); // false false
        isEqualsIgnoreCaseObjects(s_1, s_5); // true true
    }

    private static void isEqualsObjects(String a, String b) {
        boolean eq = a.equals(b);
        boolean sign = a == b;
        System.out.println("String " + a + " equals " + "String " + b + "\t" + eq);
        System.out.println("String " + a + " == " + "String " + b + "\t" + sign);
        System.out.println(System.lineSeparator());
    }

    private static void isEqualsIgnoreCaseObjects(String a, String b) {
        boolean eq = a.equalsIgnoreCase(b);
        boolean sign = a == b;
        System.out.println("String " + a + " equals ignore case" + "String " + b + "\t" + eq);
        System.out.println("String " + a + " == " + "String " + b + "\t" + sign);
        System.out.println(System.lineSeparator());
    }
}