package Q2;

public class Teste {
    public static void main(String[] args) {
        Instrutor instrutor1 = new Instrutor("Ana", "Mestre em Computação", "ana@email.com", 10);
        Instrutor instrutor2 = new Instrutor("Carlos", "Doutor em IA", "carlos@email.com", 15);

        Curso curso1 = new Curso("Java Básico", 40, "Iniciante", "Curso introdutório de Java.");

        curso1.adicionarInstrutor(instrutor1);
        curso1.adicionarInstrutor(instrutor2);

        curso1.exibirDetalhes();

    }

}
