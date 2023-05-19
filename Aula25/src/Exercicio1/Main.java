package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Azul azul = new Azul(2, 4);
        System.out.println("Iniciando...");
        System.out.println("A cor da tinta é " + azul.getCor() + " e a tonalidade da tinta é: " + azul.getTonalidade());
        azul.calcularTonalidade();


        System.out.println("\nMudando a cor e a tonalidade: ");
        azul.setCor(5);
        azul.setTonalidade(10);
        System.out.println("A cor da tinta é " + azul.getCor() + " e a tonalidade da tinta é: " + azul.getTonalidade());
        azul.calcularTonalidade();

        System.out.println("\nTornando a cor mais escura: ");
        azul.tornarMaisEscuro();
        System.out.println("A cor da tinta é " + azul.getCor() + " e a tonalidade da tinta é: " + azul.getTonalidade());
        azul.calcularTonalidade();

        System.out.println("\nTornando a tonalidade mais escura: ");
        azul.acessarPrivadoEscurecerTonalidade(11);
        System.out.println("A nova tinta tem a tonalidade: " + azul.getTonalidade());
        azul.calcularTonalidade();

        System.out.println("O nome da cor é "+Azul.Nome);

    }
}