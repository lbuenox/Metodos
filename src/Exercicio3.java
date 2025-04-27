public class Exercicio3 {
    public static void main(String[] args) {
        Forma circulo = new Circulo();
        circulo.desenhar();

        Forma quadrado = new Quadrado();
        quadrado.desenhar();
    }
}

class Forma {
    public void desenhar() {
        System.out.println("Desenhando uma forma");
    }
}

class Circulo extends Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo");
    }
}

class Quadrado extends Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um quadrado");
    }
}
