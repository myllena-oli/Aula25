package Exercicio2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();


        funcionario1.setNome("Maria");
        funcionario1.setSalario(1000);
        funcionario1.setDataAdmissao(LocalDate.of(2017,6,14));

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("José");
        funcionario2.setSalario(800);
        funcionario2.setDataAdmissao(LocalDate.of(2023,1,22));

        Funcionario funcionario3 = new Funcionario();
        funcionario3.setNome("Ana");
        funcionario3.setSalario(2000);
        funcionario3.setDataAdmissao(LocalDate.of(2022,8,23));

        System.out.println("Os funcinários são: ");

        System.out.println("\nId: "+ funcionario1.getSegundoIdentificador()+"\nNome: "+ funcionario1.getNome() +
                "\nSalário: "+ funcionario1.getSalario()+"\nData de Admissão: "+funcionario1.getDataAdmissao());
        System.out.println("\nId: "+ funcionario2.getSegundoIdentificador()+"\nNome: "+ funcionario2.getNome() +
                "\nSalário: "+ funcionario2.getSalario()+"\nData de Admissão: "+funcionario2.getDataAdmissao());
        System.out.println("\nId: "+ funcionario3.getSegundoIdentificador()+"\nNome: "+ funcionario3.getNome() +
                "\nSalário: "+ funcionario3.getSalario()+"\nData de Admissão: "+funcionario3.getDataAdmissao());




    }
}
