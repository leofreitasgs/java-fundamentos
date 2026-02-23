package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salário for > 5000;
        double salario = 6000;
        //(condicao) ? veradeiro : falso

        String resultado = salario > 5000 ? "Eu vou doar pro devdojo" : "Ainda não tenho condições, mas vou ter";

        System.out.println(resultado);

    }
}
