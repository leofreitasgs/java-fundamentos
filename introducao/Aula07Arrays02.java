package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double inicializam em 0
        // char '\u0000' inicializa em ' ': espaço em branco
        // boolean inicializa em false
        // String ou qualquer outro tipo reference: inicializa em null

        String[] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "Leonardo";
        nomes[2] = "Carlos";


        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }
    }
}
