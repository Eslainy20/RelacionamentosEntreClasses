package Q2;

import java.util.ArrayList;
import java.util.List;

public class Curso{
    private String nome;
    private int cargaHoraria;
    private String nivel;
    private String descricao;
    private List<Instrutor> instrutores;

    public Curso(String nome, int cargaHoraria, String nivel, String descricao) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.descricao = descricao;
        this.instrutores = new ArrayList<>();
    }

    void adicionarInstrutor(Instrutor instrutor) {
        instrutores.add(instrutor);
    }

    void exibirDetalhes() {
        System.out.println("Curso: " + nome);
        System.out.println("Carga horária: " + cargaHoraria + " horas");
        System.out.println("Nível: " + nivel);
        System.out.println("Descrição: " + descricao);
        System.out.println("Instrutores do curso:");
        for (Instrutor i : instrutores) {
            i.exibirDados();
            System.out.println("-----------------------");
        }
    }
}



