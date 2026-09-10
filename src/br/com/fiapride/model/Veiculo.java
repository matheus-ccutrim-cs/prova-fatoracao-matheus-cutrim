package br.com.fiapride.model;

/**
 * Representa um veículo cadastrado na frota do FiapRide.
 */
public class Veiculo {

    private String proprietario;
    private String placa;
    private double combustivel;

    public Veiculo(String proprietario, String placa, double combustivelInicial) {
        setProprietario(proprietario);
        setPlaca(placa);

        if (combustivelInicial < 0) {
            throw new IllegalArgumentException("O combustível inicial não pode ser negativo.");
        }

        this.combustivel = combustivelInicial;
    }

    public void adicionarCombustivel(double quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade adicionada deve ser maior que zero.");
        }

        combustivel += quantidade;
    }

    public void consumirCombustivel(double quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade consumida deve ser maior que zero.");
        }

        if (quantidade > combustivel) {
            throw new IllegalArgumentException("Não há combustível suficiente para esse consumo.");
        }

        combustivel -= quantidade;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        if (proprietario == null || proprietario.isBlank()) {
            throw new IllegalArgumentException("O proprietário deve ser informado.");
        }

        this.proprietario = proprietario.trim();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("A placa deve ser informada.");
        }

        this.placa = placa.trim().toUpperCase();
    }

    public double getCombustivel() {
        return combustivel;
    }
}
