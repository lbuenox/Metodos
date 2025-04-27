public class Exercicio4 {
    public static void main(String[] args) {
        Funcionario professor = new Professor();
        professor.trabalhar();
    }
}

class Funcionario {
    public void trabalhar() {
        System.out.println("Funcionário trabalhando");
    }
}

class Professor extends Funcionario {
    @Override
    public void trabalhar() {
        System.out.println("Professor ensinando Java");
    }
}
