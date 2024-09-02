public class task4 {
    public static void main(String[] args) {
        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double Outros = 19849.53;

        double somaEstados = SP + RJ + MG + ES + Outros;
        System.out.println("Faturamento total: R$" + somaEstados);

        double porcentagemSP = SP / somaEstados;
        porcentagemSP = porcentagemSP * 100;
        System.out.printf("Percentual de SP: %.1f%%%n", porcentagemSP);

        double porcentagemRJ = RJ / somaEstados;
        porcentagemRJ = porcentagemRJ * 100;
        System.out.printf("Percentual do RJ: %.1f%%%n", porcentagemRJ);

        double porcentagemMG = MG / somaEstados;
        porcentagemMG = porcentagemMG * 100;
        System.out.printf("Percentual do MG: %.1f%%%n", porcentagemMG);

        double porcentagemES = ES / somaEstados;
        porcentagemES = porcentagemES * 100;
        System.out.printf("Percentual do ES: %.1f%%%n", porcentagemES);

        double porcentagemOutros = Outros / somaEstados;
        porcentagemOutros = porcentagemOutros * 100;
        System.out.printf("Percentual dos outros Estados: %.1f%%%n", porcentagemOutros);

    }
}
