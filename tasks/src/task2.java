public class task2 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sequência de Fibonacci com " + n + " termos:");

        int a = 0, b = 1;

        System.out.print(a);

        if (n > 1) {
            System.out.print(", " + b);
        }

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        System.out.println();
        int x = 55;

        if (x == 0 || x == 1 || x == 2 || x == 3 || x == 5 || x == 8 || x == 13 || x == 21 || x == 34 || x == 55
                || x == 89 || x == 144) {
            System.out.println("O Número " + x + " Faz parte da sequência de Fibonacci com " + n + " termos");
        } else {
            System.out.println("O Número " + x + " Não faz parte da sequência de Fibonacci com " + n + " termos");
        }

    }
}
