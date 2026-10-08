Lab 02.01 - Projeto Impressora 🖨️

Este repositório contém o projeto lab0201, uma aplicação simples desenvolvida em Java. O projeto foca-se na modelação orientada a objetos (POO), representando o funcionamento e as propriedades de uma Impressora e dos seus componentes.

🛠️ Tecnologias Utilizadas

Linguagem: Java

Gestor de Dependências e Build: Maven

📂 Estrutura do Código

A lógica principal do projeto está localizada no package com.diogo.lab0201 e é composta pelas seguintes classes:

Main.java: O ponto de entrada da aplicação, onde os objetos são instanciados e a lógica é testada.

Impressora.java: Classe que modela o comportamento, estado e características de uma impressora.

TipoMarcaTinteiro.java: Enumeração/Classe responsável por definir as marcas ou tipos de tinteiros compatíveis ou em uso.

🚀 Como Executar o Projeto

Como o projeto utiliza o Maven (pom.xml), a compilação e execução tornam-se bastante simples. Certifica-te de que tens o Java Development Kit (JDK) e o Maven instalados na tua máquina.

1. Clonar o repositório

git clone https://github.com/diogo5059/lab0201.git
cd lab0201


2. Compilar o projeto
Para limpar builds anteriores e compilar as classes, executa:

mvn clean compile


3. Executar a aplicação
Podes correr a classe Main diretamente através do Maven com o seguinte comando:

mvn exec:java -Dexec.mainClass="com.diogo.lab0201.Main"


✒️ Autor

Diogo Amaral