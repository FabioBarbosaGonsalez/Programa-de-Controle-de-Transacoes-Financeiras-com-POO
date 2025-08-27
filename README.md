# Aplicativo Controle de Transações Financeiras - POO

Este projeto é um sistema bancário simples desenvolvido em **Java** com o objetivo de praticar os conceitos de **Programação Orientada a Objetos**.

## ✅ Objetivo do Projeto
O sistema permite:
- Criar contas bancárias (Corrente e Poupança)
- Realizar depósitos e saques
- Transferir valores via PIX
- Aplicar investimentos com rendimento
- Acompanhar histórico de transações

Além disso, foram aplicados conceitos fundamentais de POO:
- **Herança**: Conta Corrente e Conta Poupança herdam da classe Conta
- **Polimorfismo**: Método de investimento funciona de forma diferente em cada tipo de conta
- **Encapsulamento**: Atributos privados e métodos para manipulação
- **Reuso de código**: Métodos genéricos na classe base

---

## ✅ Tecnologias Utilizadas
- **Linguagem:** Java
- **IDE:** VS Code

---

## ✅ Como Executar
1. Certifique-se de ter o **Java JDK** instalado e configurado no PATH.
2. Abra o terminal na pasta do projeto.
3. Compile o código: javac src/ContaBanco.java
4. Execute o programa: java -cp src ContaBanco
*OBS: Não esqueça de retirar "//" das ultimas linhas de código que deseje executar

---

## ✅ Exemplo de Uso
Ao rodar o programa, ele cria duas contas (Fabio e Gabriel), realiza depósitos, saques, transferências e aplica investimento, mostrando o saldo a cada processo realizado e o histórico no final.
