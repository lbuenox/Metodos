public class Exercicio1 {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.emitirSom();
    }
}

class Animal {
    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }
}
