public class Exercicio2 { public static void main(String[] args) {
    Transporte carro = new Carro();
    carro.mover();
}
}

class Transporte {
    public void mover() {
        System.out.println("Transporte se movendo");
    }
}

class Carro extends Transporte {
    @Override
    public void mover() {
        System.out.println("O carro está em movimento");
    }
}
