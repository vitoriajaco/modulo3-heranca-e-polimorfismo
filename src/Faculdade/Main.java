package Faculdade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<FuncionariosUniversidade> list = new ArrayList<>();

       Professores professores;
        professores = new Professores("Julia", "52256455", "8965", "PROF-PE", new Salario(1000), "Doutorado", "Geografia", 20, 3);
        Professores professores2 = new Professores("Pedro", "5625255", "8966", "PROF-BA", new Salario(200), "Mestrado", "Historia", 15, 5 );
        Professores professores3 = new Professores("Maria", "589521", "7878", "PROF-SE", new Salario(500), "Pos", "Matematica", 30, 3 );




        System.out.println(professores.getNome());
        System.out.println(professores.getRemuneracao().getValor());
        professores.aumentarSalario();
        System.out.println(professores.getRemuneracao().getValor());





    }
}
