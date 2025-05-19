package Q4;

public class Consulta {
    private String data;
    private Medico medico;
    private Paciente paciente;

    public Consulta(String data, Medico medico, Paciente paciente) {
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
    }

    void exibirInfo() {
        System.out.println("Consulta em: " + data);
        medico.exibirInfo();
        paciente.exibirInfo();
    }

}
