public class Exercicio5 {
    public static void main(String[] args) {
        Esporte futebol = new Futebol();
        futebol.jogar();

        Esporte basquete = new Basquete();
        basquete.jogar();
    }
}

class Esporte {
    public void jogar() {
        System.out.println("Praticando esporte");
    }
}

class Futebol extends Esporte {
    @Override
    public void jogar() {
        System.out.println("Jogando futebol");
    }
}

class Basquete extends Esporte {
    @Override
    public void jogar() {
        System.out.println("Jogando basquete");
    }
}
