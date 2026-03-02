import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        consultaMoeda consulta = new consultaMoeda();
        int opcao = 0;

        String menu = """
                ***************************************************
                Seja bem-vindo(a) ao Conversor de Moeda!
                
                1) Dólar [USD] =>> Real [BRL]
                2) Real [BRL] =>> Dólar [USD]
                3) Dólar [USD] =>> Peso Argentino [ARS]
                4) Peso Argentino [ARS] =>> Dólar [USD]
                5) Dólar [USD] =>> Peso Colombiano [COP]
                6) Peso Colombiano [COP] =>> Dólar [USD]
                7) Sair
                Escolha uma opção válida:
                ***************************************************
                """;

        while (opcao != 7) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 7) break;

            System.out.println("Digite o valor que deseja converter:");
            double valor = leitura.nextDouble();

            String origem = "", destino = "";

            switch (opcao) {
                case 1 -> { origem = "USD"; destino = "BRL"; }
                case 2 -> { origem = "BRL"; destino = "USD"; }
                case 3 -> { origem = "USD"; destino = "ARS"; }
                case 4 -> { origem = "ARS"; destino = "USD"; }
                case 5 -> { origem = "USD"; destino = "COP"; }
                case 6 -> { origem = "COP"; destino = "USD"; }
                default -> System.out.println("Opção inválida!");
            }

            if (!origem.isEmpty()) {
                double taxa = consulta.buscarTaxa(origem, destino);
                double resultado = valor * taxa;
                System.out.printf("Valor %.2f [%s] corresponde ao valor final de =>>> %.2f [%s]%n",
                        valor, origem, resultado, destino);
            }
        }
        System.out.println("Programa encerrado.");
    }
}