package br.com.kleber;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        // Criando um evento
        Evento evento = new Evento(
            "Java Conference",
            "Kleber",
            LocalDate.of(2025, 9, 15),
            150.00
        );

        // Usando StringBuilder
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Evento: ").append(evento.getNome())
                .append("\nOrganizador: ").append(evento.getOrganizador())
                .append("\nData: ").append(evento.getData())
                .append("\nPreço: R$").append(evento.getPrecoIngresso());

        System.out.println(mensagem);

        // Estrutura de decisão + API Date and Time
        LocalDate hoje = LocalDate.now();
        if (evento.getData().isBefore(hoje)) {
            System.out.println("⚠️ O evento já aconteceu!");
        } else if (evento.getData().isEqual(hoje)) {
            System.out.println("✅ O evento é hoje!");
        } else {
            long diasRestantes = ChronoUnit.DAYS.between(hoje, evento.getData());
            System.out.println("⏳ Faltam " + diasRestantes + " dias para o evento.");
        }

        // Usando Math API para calcular desconto de 10%
        double precoComDesconto = Math.round(evento.getPrecoIngresso() * 0.9 * 100.0) / 100.0;
        System.out.println("Preço com desconto: R$" + precoComDesconto);
    }
}
