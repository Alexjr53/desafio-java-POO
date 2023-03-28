import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("descrição Bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlex = new Dev();
        devAlex.setNome("Alex");
        devAlex.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos de Alex: " + devAlex.getConteudoInscritos());
        devAlex.progredir();
        devAlex.progredir();
        System.out.println("conteudos inscritos de Alex: " + devAlex.getConteudoInscritos());
        System.out.println("conteudos concluidos de Alex: " + devAlex.getConteudosConcluidos());
        System.out.println("XP: " + devAlex.calcularTotalXp());

        System.out.println("-----------");

        Dev devJoao = new Dev();
        devJoao.setNome("joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos de Joao: " + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("conteudos inscritos de Joao: " + devJoao.getConteudoInscritos());
        System.out.println("conteudos concluidos de Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
    
}