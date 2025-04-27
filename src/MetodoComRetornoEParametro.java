public class MetodoComRetornoEParametro {

    // 1. Método que recebe dois números e retorna a multiplicação
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // 2. Método que recebe um nome e retorna uma mensagem de boas-vindas personalizada
    public String boasVindas(String nome) {
        return "Bem-vindo(a), " + nome + "!";
    }

    // 3. Método que recebe um número e retorna seu dobro
    public int dobro(int numero) {
        return numero * 2;
    }

    // 4. Método que recebe duas strings e retorna as duas concatenadas
    public String concatenar(String str1, String str2) {
        return str1 + str2;
    }

    // 5. Método que recebe uma idade e retorna true se for maior ou igual a 18
    public boolean maiorDeIdade(int idade) {
        return idade >= 18;
    }

    // Método principal para testar todos os métodos
    public static void main(String[] args) {
        MetodoComRetornoEParametro metodo = new MetodoComRetornoEParametro();

        // Teste 1: multiplicar
        int resultadoMultiplicacao = metodo.multiplicar(6, 7);
        System.out.println("Multiplicação de 6 e 7: " + resultadoMultiplicacao); // 42

        // Teste 2: boasVindas
        String mensagem = metodo.boasVindas("Lari");
        System.out.println(mensagem); // Bem-vindo(a), João!

        // Teste 3: dobro
        int resultadoDobro = metodo.dobro(8);
        System.out.println("Dobro de 8: " + resultadoDobro); // 16

        // Teste 4: concatenar
        String fraseConcatenada = metodo.concatenar("Hello, ", "World!");
        System.out.println("Concatenação: " + fraseConcatenada); // Hello, World!

        // Teste 5: maiorDeIdade
        boolean ehMaior = metodo.maiorDeIdade(20);
        System.out.println("É maior de idade (20 anos)? " + ehMaior); // true
    }
}