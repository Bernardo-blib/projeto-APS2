# Projeto Template Method — Java

## 📌 Sobre o projeto

Este projeto foi desenvolvido em Java com o objetivo de demonstrar a aplicação do padrão de projeto comportamental Template Method.

O sistema simula uma máquina automática de bebidas que prepara diferentes opções, como café e chá.

## 🎯 Objetivo

Demonstrar como o padrão Template Method permite definir o esqueleto de um algoritmo em uma classe abstrata, delegando determinadas etapas específicas para serem implementadas pelas subclasses sem alterar a sequência geral do processo.

## 🛠️ Tecnologias utilizadas

- Java
- Eclipse IDE
- Programação Orientada a Objetos (POO)
- Padrão de Projeto Template Method

## 📂 Estrutura do projeto

```text
TemplateMethod/
└── src/
    └── templatemethod/
        ├── Bebida.java
        ├── Cafe.java
        ├── Cappuccino.java
        ├── Cha.java
        └── Main.java
```

## ⚙️ Funcionamento

O sistema possui uma classe abstrata chamada `Bebida`, responsável por definir a sequência fixa de preparação por meio do método `prepararBebida()` (marcado como `final`).

O método executa quatro etapas na seguinte ordem:

1. `ferverAgua()` — Ferver a água (etapa comum definida na classe abstrata).
2. `adicionarIngrediente()` — Adicionar o ingrediente principal (etapa abstrata implementada pelas subclasses).
3. `colocarNaXicara()` — Colocar a bebida na xícara (etapa comum definida na classe abstrata).
4. `adicionarComplemento()` — Adicionar o complemento específico (etapa abstrata implementada pelas subclasses).

As classes `Cafe`, `Cha` e `Cappuccino` herdam de `Bebida` e implementam suas etapas específicas.

### Classes do projeto

- `Bebida.java`: classe abstrata que contém o Template Method (`prepararBebida()`) e define a sequência imutável de preparação, além dos métodos comuns (`ferverAgua()` e `colocarNaXicara()`).
- `Cafe.java`: implementa o preparo do café, adicionando o pó de café e o açúcar como complemento.
- `Cha.java`: implementa o preparo do chá, colocando o chá em infusão e adicionando limão como complemento.
- `Cappuccino.java`: implementa o preparo do cappuccino, preparando expresso com leite e adicionando canela e chocolate em pó como complemento.
- `Main.java`: classe principal que apresenta um menu interativo via console (`Scanner`) para que o usuário escolha a bebida desejada em tempo de execução.

## 💻 Exemplo de execução

```text
=========================================
      MAQUINA DE BEBIDAS AUTOMÁTICA      
=========================================
1 - Café
2 - Chá
3 - Cappuccino
4 - Sair
Escolha uma opcao: 3

=== PREPARANDO CAPPUCCINO ===
Fervendo a água...
Preparando expresso com leite...
Colocando na xicara...
Adicionando canela e chocolate em pó...
Bebida pronta! Sirva-se.
```

## ▶️ Como executar

1. Clone o repositório:

```bash
git clone https://github.com/Bernardo-blib/apsii.git
```

2. Abra o Eclipse IDE.
3. Importe o projeto Java.
4. Localize a classe `Main.java` dentro do pacote `templatemethod`.
5. Clique com o botão direito e selecione *Run As → Java Application*.
6. Interaja com o menu no console digitando o número correspondente à bebida desejada.

## 📚 Conceitos aplicados

- Herança
- Classes abstratas
- Polimorfismo
- Sobrescrita de métodos (`@Override`)
- Encapsulamento e controle de fluxo (`final` e `private`)
- Princípio Aberto/Fechado (OCP - SOLID)
- Reutilização de código
- Padrões de projeto comportamentais

## ✅ Conclusão

O padrão Template Method facilita a reutilização de código, evita duplicações e garante a integridade da ordem de execução de algoritmos que compartilham etapas semelhantes.

Com a estrutura implementada, torna-se simples adicionar novas bebidas ao sistema (como o `Cappuccino`) apenas criando novas subclasses, sem a necessidade de modificar a classe base `Bebida`.
