# Projeto de Sistema Bancário Simples

Este é um projeto de sistema bancário simples em Java que permite realizar operações bancárias básicas, como criar contas, depositar, sacar, transferir e listar contas existentes. O sistema é composto por quatro arquivos Java:

1. **AgenciaDoBanco.java**: Este arquivo contém a classe principal `AgenciaDoBanco`, onde a lógica principal do sistema está implementada. Ele permite ao usuário escolher várias operações bancárias por meio de uma interface de linha de comando.

2. **Conta.java**: A classe `Conta` representa uma conta bancária e inclui métodos para depositar, sacar e transferir dinheiro, bem como informações sobre o saldo e o proprietário da conta.

3. **Pessoa.java**: A classe `Pessoa` representa uma pessoa física e inclui informações como nome, CPF, e-mail e data de criação da conta. Ela é usada para criar um cliente associado a uma conta.

4. **Utils.java**: Este arquivo contém uma classe utilitária chamada `Utils` que fornece métodos para formatar datas e valores monetários.

## Como usar o Sistema

Para utilizar o sistema, você pode executar a classe `AgenciaDoBanco` que contém o método `main`. O sistema oferece as seguintes operações:

- Criar conta
- Depositar dinheiro em uma conta
- Sacar dinheiro de uma conta
- Transferir dinheiro entre contas
- Listar todas as contas existentes
- Sair do sistema

O código faz uso de estruturas de controle, como loops e switch statements, para gerenciar as diferentes operações e interagir com o usuário por meio da entrada padrão.

## Requisitos

Este projeto foi desenvolvido em Java e não requer dependências externas além da biblioteca padrão do Java. Certifique-se de ter uma versão do Java instalada em seu sistema.

## Como Executar

Para executar o projeto, siga estas etapas:

1. Compile todos os arquivos Java usando um compilador Java, como o `javac`. Certifique-se de que todos os quatro arquivos estejam no mesmo diretório.

   ```bash
   javac *.java
   ```

2. Execute a classe `AgenciaDoBanco`:

   ```bash
   java application.AgenciaDoBanco
   ```

3. Siga as instruções exibidas no terminal para realizar as operações bancárias desejadas.

Lembre-se de que este é um sistema bancário simples apenas para fins educacionais e pode ser aprimorado com recursos adicionais, como armazenamento de dados em um banco de dados, autenticação mais segura e validações aprimoradas. Este é apenas um ponto de partida para um projeto mais completo.

 ```bash
   Irei compartilhar depois o projeto mais completo com armazenamento de dados em um banco de dados, autenticação mais segura e validações aprimoradas.   ```
