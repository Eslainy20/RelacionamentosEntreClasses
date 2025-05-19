package Q4;

public class Teste {
    public static void main(String[] args) {
        Medico m1 = new Medico("Dra. Maria", "12345-PA");
        Medico m2 = new Medico("Dr. Fernando", "67890-PA");

        Paciente p1 = new Paciente("Jose Silva", "111.222.333-44");

        Consulta consulta1 = new Consulta("19/05/2025", m1, p1);

        UnidadeAtendimento upa = new UnidadeAtendimento("UPA Cidade Nova ", "UPA");
        upa.adicionarMedico(m1);
        upa.adicionarMedico(m2);

        Hospital hospital = new Hospital("Hospital Central", "Rua da Saúde, 123");
        hospital.adicionarUnidade(upa);

        hospital.exibirInfo();
        System.out.println("Detalhes da consulta:");
        consulta1.exibirInfo();

        }
    }

