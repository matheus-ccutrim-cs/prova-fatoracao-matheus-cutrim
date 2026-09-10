package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Carlos", "ABC-1234", 10);

        testarAbastecimentoValido(veiculo);
        testarConsumoValido(veiculo);
        testarConsumoAcimaDoDisponivel(veiculo);
        testarAbastecimentoNegativo(veiculo);
        testarCombustivelInicialNegativo();

        exibirDados(veiculo);
    }

    private static void testarAbastecimentoValido(Veiculo veiculo) {
        veiculo.adicionarCombustivel(50);
        System.out.println("Abastecimento válido realizado: 50 litros.");
    }

    private static void testarConsumoValido(Veiculo veiculo) {
        veiculo.consumirCombustivel(20);
        System.out.println("Consumo válido realizado: 20 litros.");
    }

    private static void testarConsumoAcimaDoDisponivel(Veiculo veiculo) {
        try {
            veiculo.consumirCombustivel(100);
        } catch (IllegalArgumentException exception) {
            System.out.println("Teste inválido bloqueado: " + exception.getMessage());
        }
    }

    private static void testarAbastecimentoNegativo(Veiculo veiculo) {
        try {
            veiculo.adicionarCombustivel(-10);
        } catch (IllegalArgumentException exception) {
            System.out.println("Teste inválido bloqueado: " + exception.getMessage());
        }
    }

    private static void testarCombustivelInicialNegativo() {
        try {
            new Veiculo("Ana", "XYZ-9876", -10);
        } catch (IllegalArgumentException exception) {
            System.out.println("Cadastro inválido bloqueado: " + exception.getMessage());
        }
    }

    private static void exibirDados(Veiculo veiculo) {
        System.out.printf(
                "Dono: %s | Placa: %s | Combustível: %.1f litros%n",
                veiculo.getProprietario(),
                veiculo.getPlaca(),
                veiculo.getCombustivel()
        );
    }
}
