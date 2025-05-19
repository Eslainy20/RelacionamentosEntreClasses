package Q4;

import java.util.ArrayList;
import java.util.List;

public class UnidadeAtendimento {
    private String nome;
    private String tipo;
    private List<Medico> medicos;

    public UnidadeAtendimento(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.medicos = new ArrayList<>();
    }

    void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }

    void exibirInfo() {
        System.out.println("Unidade: " + nome + " (" + tipo + ")");
        System.out.println("Médicos:");
        for (Medico m : medicos) {
            m.exibirInfo();
        }
    }

}


