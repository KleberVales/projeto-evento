package br.com.kleber;

import java.time.LocalDate;

public class Evento {
    private String nome;
    private String organizador;
    private LocalDate data;
    private double precoIngresso;

    public Evento(String nome, String organizador, LocalDate data, double precoIngresso) {
        this.nome = nome;
        this.organizador = organizador;
        this.data = data;
        this.precoIngresso = precoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public String getOrganizador() {
        return organizador;
    }

    public LocalDate getData() {
        return data;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }
}
