package Q4;

public class Medico {
        private String nome;
        private String crm;

        public Medico(String nome, String crm) {
            this.nome = nome;
            this.crm = crm;
        }

        public String getNome() {
            return nome;
        }

        public String getCrm() {
            return crm;
        }

    void exibirInfo() {
        System.out.println("Médico: " + nome + " | CRM: " + crm);
    }

}


