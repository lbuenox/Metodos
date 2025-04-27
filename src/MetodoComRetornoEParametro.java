public class MetodoComRetornoEParametro {
        // 1. Recebe dois números e retorna a soma
        public static int somar(int a, int b) {
            return a + b;
        }

        // 2. Recebe um número e retorna se é par (true) ou ímpar (false)
        public static boolean ehPar(int numero) {
            return numero % 2 == 0;
        }

        // 3. Recebe um nome e retorna uma saudação
        public static String criarSaudacao(String nome) {
            return "Olá, " + nome + "!";
        }

        // 4. Recebe dois números e retorna o maior
        public static int retornarMaior(int a, int b) {
            return (a > b) ? a : b;
        }

        // 5. Recebe um número e retorna seu fatorial
        public static int calcularFatorial(int numero) {
            int fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }

        // Método principal
        public static void main(String[] args) {
            System.out.println("Soma: " + somar(5, 7));
            System.out.println("É par? " + ehPar(4));
            System.out.println(criarSaudacao("Lari"));
            System.out.println("Maior número: " + retornarMaior(10, 20));
            System.out.println("Fatorial de 5: " + calcularFatorial(5));
        }
    }

