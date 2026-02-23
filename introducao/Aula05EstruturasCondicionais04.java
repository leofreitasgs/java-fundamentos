package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 70000;
        if (salario <=34712) {
            System.out.println("Voce pagará " + salario * 0.097);
        } else if (salario <= 68507) {
            System.out.println("Voce pagará " + salario * 0.3735);
        } else  {
            System.out.println("Voce pagará " + salario * 0.495);
        }
    }
}
