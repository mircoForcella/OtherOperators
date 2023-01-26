public class otherOperators {
    public static void main(String[] args) {
        int a = 15;
        a += 5;
        a -= 4;
        int b = a;
        b++;

        System.out.println(b%2 == 1);
        System.out.println((b * ++b)%3 == 0);
   }
}


