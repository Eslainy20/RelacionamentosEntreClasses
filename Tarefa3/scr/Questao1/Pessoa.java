package Q1;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Carro> carrosUsados;

    public Pessoa(String nome) {
        this.nome = nome;
        this.carrosUsados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void usarCarro(Carro carro) {
        carrosUsados.add(carro);
        System.out.println(nome + " está usando o carro modelo " + carro.getModelo());
        carro.dirigir();
    }

    void mostrarCarrosUsados() {
        System.out.println(nome + " já usou os seguintes carros:");
        for (Carro c : carrosUsados) {
            System.out.println("- " + c.getModelo());
        }
    }
}
