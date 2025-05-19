package Q3;

public class Computador {
    private String marca;
    private String modelo;
    private String processador;
    private int memoriaRam;
    private PlacaMae placaMae;

    public Computador(String marca, String modelo, String processador, int memoriaRam, String fabricantePM, String chipset, int numSlots, String tipoMemoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRam = memoriaRam;


        }

    public void setPlacaMae(PlacaMae placa) {
        this.placaMae = placa;
    }

    void exibirComputador() {
        System.out.println("Computador:");
        System.out.println("- Marca: " + marca);
        System.out.println("- Modelo: " + modelo);
        System.out.println("- Processador: " + processador);
        System.out.println("- Memória RAM: " + memoriaRam + "GB");
        placaMae.exibirDados();
        }

        void atualizarPlacaMae(String fabricante, String chipset, int numSlots, String tipoMemoria) {
            placaMae.atualizarDados(fabricante, chipset, numSlots, tipoMemoria);
        }
    }


