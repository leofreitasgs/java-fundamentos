package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio  {
    public static void main(String[] args) {
        String nome = "Leonardo";
        String endereço = "rua X prédio Y";
        int salario  = 5000;
        String data = "05/07/2024";

        System.out.println("Eu " + nome + " morando no endereço " + endereço + " confirmo que recebi o salário de " + salario+ ", na data " +data);

    }
}
