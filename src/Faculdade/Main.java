package Faculdade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<FuncionariosUniversidade> list = new ArrayList<>();

       Professores professores;
        professores = new Professores("Julia", "52256455", "8965", "PROF-PE", 1000.00, "Doutorado", "Geografia", 20, 3) {
            @Override
            public Salario aumentarSalario() {

                return null;
            }
        };

        System.out.println(professores.getNome());
        System.out.println(professores.getSalario());
        professores.aumentarSalario();
        System.out.println(professores.getSalario());


    }
}
