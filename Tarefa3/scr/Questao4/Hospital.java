package Q4;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nome;
    private String endereco;
    private List<UnidadeAtendimento> unidades;

    public Hospital(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.unidades = new ArrayList<>();
    }

    void adicionarUnidade(UnidadeAtendimento unidade) {
        unidades.add(unidade);
    }

    void exibirInfo() {
        System.out.println("Hospital: " + nome + " | Endereço: " + endereco);
        for (UnidadeAtendimento u : unidades) {
            u.exibirInfo();
            System.out.println("-----------------------");
        }
    }

}
