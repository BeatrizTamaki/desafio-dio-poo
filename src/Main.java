import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentorias;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Cursos curso = new Cursos();
        curso.setTitulo("Orientação a Objetos em java");
        curso.setDescricao("Aprendendo Orientação a Objetos em java");
        curso.setCargaHoraria(4);

        Mentorias mentoria = new Mentorias();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria em Java voltado para Orientação a Objetos");
        mentoria.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Curso de Java");
        bootcamp.setDescricao("Aprenda a transformar sua carreira com Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setName("Beatriz");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos de " + dev1.getName() + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos concluidos " + dev1.getConteudosConcluidos());

        System.out.println("------------------------------");

        Dev dev2 = new Dev();
        dev2.setName("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos de " + dev2.getName() +dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + dev2.getConteudosConcluidos());
    }
}
