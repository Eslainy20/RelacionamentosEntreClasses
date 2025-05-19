package Q3;

public class Teste {
    public static void main(String[] args) {
        Computador pc = new Computador("Dell","Inspiron 15","Intel i7",16,"ASUS","Z590",4,"DDR4");
        PlacaMae pm = new PlacaMae("ASUS", "Z790", 4, "DDR5");
        pc.setPlacaMae(pm);


        pc.exibirComputador();

        System.out.println("\nAtualizando Placa-Mãe...\n");

        pc.atualizarPlacaMae("Gigabyte", "B550", 2, "DDR4");

        pc.exibirComputador();
        }
    }

