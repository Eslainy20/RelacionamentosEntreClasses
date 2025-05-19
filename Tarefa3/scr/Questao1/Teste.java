package Q1;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João");

        Carro carro1 = new Carro("Fiat Uno");
        Carro carro2 = new Carro("Honda Civic");

        p1.usarCarro(carro1);
        p1.usarCarro(carro2);

        p1.mostrarCarrosUsados();
    }

}

