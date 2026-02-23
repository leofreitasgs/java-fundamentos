package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //Condição valorParcela >= 1000;
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int valorParcela = 1; valorParcela <= valorCarro; valorParcela++) {
            double parcela = valorCarro / valorParcela;
            if (parcela < 1000) {
                break;

            }
            System.out.println("Parcela " + valorParcela + " R$ " + parcela);
        }
    }
}
