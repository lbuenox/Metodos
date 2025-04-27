public class MetodoComParametro {

        // 1. Recebe uma mensagem e imprime na tela
        public static void imprimirMensagem(String mensagem) {
            System.out.println(mensagem);
        }

        // 2. Recebe dois números e imprime a soma
        public static void somarNumeros(int num1, int num2) {
            int soma = num1 + num2;
            System.out.println("Soma: " + soma);
        }

        // 3. Recebe nome e idade e imprime-os
        public static void imprimirNomeEIdade(String nome, int idade) {
            System.out.println("Nome: " + nome + ", Idade: " + idade);
        }

        // 4. Recebe um número e diz se é positivo ou negativo
        public static void verificarNumero(int numero) {
            if (numero >= 0) {
                System.out.println("O número é positivo.");
            } else {
                System.out.println("O número é negativo.");
            }
        }

        // 5. Recebe um nome e imprime uma saudação personalizada
        public static void saudacaoPersonalizada(String nome) {
            System.out.println("Olá, " + nome + "! Seja bem-vindo(a)!");
        }

        // Método principal
        public static void main(String[] args) {
            imprimirMensagem("Esta é uma mensagem personalizada.");
            somarNumeros(10, 20);
            imprimirNomeEIdade("Larissa", 16);
            verificarNumero(-5);
            saudacaoPersonalizada("Larissa");
        }
    }

