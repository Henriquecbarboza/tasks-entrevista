public class task1 {
    public static void main(String[] args) {

        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        for (K = 0; K < INDICE; K++) {
            K = K + 1;
            SOMA = SOMA + K;
            System.out.println(SOMA);
        }
        System.out.println("SOMA: " + SOMA);
    }

}
