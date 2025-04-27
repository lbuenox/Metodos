public class MetodosSimples {
    //1. exiba "Ola, Mundo!"
    public static void exibirOlaMundo() {
        System.out.println("Ola, Mundo!");
    }
    // 2. Imprime seu nome completo
    public static void imprimirNomeCompleto() {
        System.out.println("Larissa Santos Bueno");
    }

    // 3. Exibe o nome da sua escola
    public static void exibirNomeEscola() {
        System.out.println("Etec Uirapuru");
    }

    // 4. Imprime os números de 1 a 10
    public static void imprimirNumeros1a10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // 5. Exibe "Eu adoro programar em Java!"
    public static void exibirMensagemProgramacao() {
        System.out.println("Eu adoro programar em Java!");
    }

    // Método principal para chamar todos
    public static void main(String[] args) {
        exibirOlaMundo();
        imprimirNomeCompleto();
        exibirNomeEscola();
        imprimirNumeros1a10();
        exibirMensagemProgramacao();
    }
}

