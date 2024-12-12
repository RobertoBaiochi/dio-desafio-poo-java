package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descriação mentoria1 Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição bootcamp java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);


        Dev devRoberto = new Dev();
        devRoberto.setNome("Roberto");
        devRoberto.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos " + devRoberto.getConteudosInscritos());
        devRoberto.progredir();
        devRoberto.progredir();
        devRoberto.progredir();
        System.out.println("-----------------------------");
        System.out.println("Conteudos Inscritos " + devRoberto.getConteudosInscritos());
        System.out.println("Conteudos Finalizados " + devRoberto.getConteudosFinalizados());
        System.out.println("Calcular XP " + devRoberto.calcularTotalXp());

        System.out.println("-----------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-----------------------------");
        System.out.println("Conteudos Inscritos " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Finalizados " + devCamila.getConteudosFinalizados());
        System.out.println("Calcular XP " + devCamila.calcularTotalXp());
    }
}
