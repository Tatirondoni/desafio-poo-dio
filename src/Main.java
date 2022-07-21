import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição curso JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());

/*      System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome ("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Descrição Bootcamp JAVA Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devTatiane = new Dev();
        devTatiane.setNome("Tatiane");
        devTatiane.inscreverBootcamp(bootcamp);
        devTatiane.progredir();
        devTatiane.progredir();
        devTatiane.progredir();
        System.out.println("Conteúdos Inscritos de Tatiane:" + devTatiane.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Tatiane:" + devTatiane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Tatiane:" + devTatiane.getConteudosConcluidos());
        System.out.println("XP:" + devTatiane.calcularTotalXp());

        System.out.println("-------");

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        devGabriel.progredir();
        System.out.println("Conteúdos Inscritos de Gabriel" + devGabriel.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Gabriel" + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Gabriel" + devGabriel.getConteudosConcluidos());
        System.out.println("XP:" + devGabriel.calcularTotalXp());

        System.out.println("-------");


    }
}
