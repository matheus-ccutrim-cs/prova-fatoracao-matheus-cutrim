# FiapRide - Missão Refatoração

**Repositório:** `prova-fatoracao-matheus-cutrim`

**Aluno:** Matheus Cutrim

Checkpoint da disciplina de Programação Orientada a Objetos. O projeto refatora o módulo de cadastro de veículos do FiapRide usando os conteúdos das aulas 1 a 3: classes, métodos, Clean Code e encapsulamento.

## Melhorias realizadas

- Classe renomeada de `veiculos` para `Veiculo`.
- Atributos renomeados com termos claros e declarados como `private`.
- Construtor criado para garantir que o objeto já nasça em um estado válido.
- Getters e setters aplicados de forma controlada.
- Métodos renomeados para `adicionarCombustivel` e `consumirCombustivel`.
- Validações impedem valores negativos, dados vazios e consumo maior que o combustível disponível.
- Classe de teste demonstra entradas válidas e inválidas.

## Estrutura

```text
.
├── diagrama-veiculo-refatorado.png
└── src
    └── br/com/fiapride
        ├── main/SistemaPrincipal.java
        └── model/Veiculo.java
```

## Como executar

Com o Java instalado, abra o terminal na raiz do projeto e execute:

```bash
javac -d bin src/br/com/fiapride/model/Veiculo.java src/br/com/fiapride/main/SistemaPrincipal.java
java -cp bin br.com.fiapride.main.SistemaPrincipal
```

## Diagrama de classes

O arquivo `diagrama-veiculo-refatorado.png`, na raiz do projeto, representa a classe após a refatoração.
