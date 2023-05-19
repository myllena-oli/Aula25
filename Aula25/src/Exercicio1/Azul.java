package Exercicio1;

public class Azul {
    static int cor;
    public static String Nome = "Azul";
    private int tonalidade; // Criação da variável tonalidade

    public Azul(int cor, int tonalidade) { //construtor
        Azul.cor = cor;
        this.tonalidade = tonalidade; // Coloquei tonalidade no construtor
    }

    public int getTonalidade() {
        return tonalidade;
    }

    public int getCor() {
        return cor;
    }

    public void setTonalidade(int tonalidade) {
        this.tonalidade = tonalidade; //implementação do set
    }

    public void setCor(int cor) {
        Azul.cor = cor;
    }

    public void tornarMaisEscuro() {
        cor++;
    }

    void calcularTonalidade() {
        if (tonalidade >= 7) {
            System.out.println("Tonalidade escura");

        } else if (tonalidade <= 3) {
            System.out.println("Tonalidade clara");

        } else {
            System.out.println("Tonalidade média");
        }
    }

    public void acessarPrivadoEscurecerTonalidade(int valor) {
        tornarTonalidadeMaisEscura(valor);
    }

    private void tornarTonalidadeMaisEscura(int valor) {
        tonalidade = valor;
    }
}

