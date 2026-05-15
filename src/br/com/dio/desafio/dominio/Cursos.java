package br.com.dio.desafio.dominio;

public class Cursos extends Conteudo{

    private double cargaHoraria;

    @Override
    public double calcularXP() {return XP_padrao * cargaHoraria;}

    public Cursos(){

    }

    public double getCargaHoraria() {return cargaHoraria;}

    public void setCargaHoraria(double cargaHoraria) {this.cargaHoraria = cargaHoraria;}

    @Override
    public String toString() {
        return "Cursos{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
