package chapter01;

public class ex1 {
    public static void main(String[] args) {
        int name1 = 10;
        int name2 = 20;

        System.out.println(System.identityHashCode(name1));
        System.out.println(System.identityHashCode(name2));
        System.out.println(name1);
        System.out.println(name2);
    }
}
