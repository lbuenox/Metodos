public class MetodoComRetorno {

        // 1. Método que retorna o ano atual
        public static int retornarAnoAtual() {
            return 2025;
        }

        // 2. Método que retorna seu nome completo
        public static String retornarNomeCompleto() {
            return "Larissa Santos Bueno";
        }

        // 3. Método que retorna um número fixo (exemplo: 100)
        public static int retornarNumeroFixo() {
            return 100;
        }

        // 4. Método que retorna um valor booleano fixo (true)
        public static boolean retornarValorBooleano() {
            return true;
        }

        // 5. Método que retorna o valor de PI
        public static double retornarValorPi() {
            return 3.14159;
        }

        // Método principal para testar todos
        public static void main(String[] args) {
            System.out.println("Ano Atual: " + retornarAnoAtual());
            System.out.println("Nome Completo: " + retornarNomeCompleto());
            System.out.println("Número Fixo: " + retornarNumeroFixo());
            System.out.println("Valor Booleano: " + retornarValorBooleano());
            System.out.println("Valor de PI: " + retornarValorPi());
        }
    }

