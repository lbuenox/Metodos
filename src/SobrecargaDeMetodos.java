public class SobrecargaDeMetodos {
        // Método para somar dois inteiros
        public static int somar(int a, int b) {
            return a + b;
        }

        // Método para somar três inteiros
        public static int somar(int a, int b, int c) {
            return a + b + c;
        }

        // Método para somar dois números double
        public static double somar(double a, double b) {
            return a + b;
        }

        // Método para somar quatro inteiros
        public static int somar(int a, int b, int c, int d) {
            return a + b + c + d;
        }

        // Método para somar todos os elementos de um array de inteiros
        public static int somar(int[] numeros) {
            int soma = 0;
            for (int num : numeros) {  // Para cada número no array
                soma += num;            // Acumula a soma
            }
            return soma;
        }

        // Método principal para testar todas as sobrecargas
        public static void main(String[] args) {
            // Testa a soma de 2 inteiros
            System.out.println("Soma de 2 inteiros: " + somar(3, 7));

            // Testa a soma de 3 inteiros
            System.out.println("Soma de 3 inteiros: " + somar(1, 2, 3));

            // Testa a soma de 2 doubles
            System.out.println("Soma de 2 doubles: " + somar(2.5, 3.5));

            // Testa a soma de 4 inteiros
            System.out.println("Soma de 4 inteiros: " + somar(1, 2, 3, 4));

            // Testa a soma de todos os elementos de um vetor de inteiros
            int[] vetor = {1, 2, 3, 4, 5};
            System.out.println("Soma de vetor: " + somar(vetor));
        }
    }

