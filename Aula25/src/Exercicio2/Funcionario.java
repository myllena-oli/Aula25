package Exercicio2;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private LocalDate dataAdmissao;
    private double salario;
    private static int identificador = 1;
    private int segundoIdentificador;


    public Funcionario(){
        this.segundoIdentificador = identificador++;
    }

    public int getSegundoIdentificador() {
        return segundoIdentificador;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        if(dataAdmissao.isAfter(LocalDate.now())){
            System.out.println("Essa data ainda não chegou! Forneça uma data anterior a hoje.");
        }
        this.dataAdmissao = dataAdmissao;
    }

    public void setSalario(double salario) {
        this.salario = salario;

        if (salario < 700.00) {
            System.out.println("Valor inválido. O salário mínimo é 700 reais. ");
        } else {
            this.salario = salario;
        }
    }
}
