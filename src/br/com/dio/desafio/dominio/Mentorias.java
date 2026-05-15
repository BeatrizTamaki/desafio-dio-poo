package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorias extends Conteudo{

    private LocalDate date;

    @Override
    public double calcularXP() {return XP_padrao + 20d;}

    public Mentorias(){

    }

    public LocalDate getDate() {return date;}

    public void setDate(LocalDate date) {this.date = date;}

    @Override
    public String toString() {
        return "Mentorias{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", date=" + date +
                '}';
    }
}
