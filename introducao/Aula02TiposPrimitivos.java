package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //tipos primitivos: int, double, float, char, byte, short, long, boolean
        int idade = 10;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        //String é um reference type, começa com letra maiúscula
        String nome = "Leonardo";

        System.out.println("A idade é " +idade+ " anos.");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println("Meu nome é "+nome);
    }
}
