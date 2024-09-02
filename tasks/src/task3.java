public class task3 {
    public static void main(String[] args) {
        String faturamentoString = "1034, 2876, 4590, 6210, 7384, 8921, 1500, 3678, 4987, 5709, 6802, 7415, 8501, 9354, 1243, 2045, 3198, 4056, 5601, 6789, 7102, 8324, 9401, 1123, 2590, 3671, 4725, 5890, 6034, 7112,";

        String[] faturamentoArray = faturamentoString.split(",");
        int[] faturamento = new int[faturamentoArray.length];

        for (int i = 0; i < faturamentoArray.length; i++) {
            faturamento[i] = Integer.parseInt(faturamentoArray[i].trim());
        }

        int menorFaturamento = faturamento[0];
        int maiorFaturamento = faturamento[0];
        int somaFaturamento = 0;

        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] < menorFaturamento) {
                menorFaturamento = faturamento[i];
            }
            if (faturamento[i] > maiorFaturamento) {
                maiorFaturamento = faturamento[i];
            }
            somaFaturamento += faturamento[i];
        }

        double mediaFaturamento = (double) somaFaturamento / faturamento.length;

        int diasAcimaDaMedia = 0;

        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento ocorrido em um dia do mês: R$" + menorFaturamento);
        System.out.println("Maior valor de faturamento ocorrido em um dia do mês: R$" + maiorFaturamento);
        System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: "
                + diasAcimaDaMedia);
    }
}
