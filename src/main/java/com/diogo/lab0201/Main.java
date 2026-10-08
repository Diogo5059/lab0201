package com.diogo.lab0201;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("--- TESTES DO NÍVEL 2 ---");
        // Criar impressora (100.000 de vida útil, tinteiro HP)
        Impressora minhaImpressora = new Impressora(100000, TipoMarcaTinteiro.HP);
        
        // Simular a impressão de dois documentos com nome completo
        minhaImpressora.imprimir("Documento 1: João Silva");
        minhaImpressora.imprimir("Documento 2: João Silva");
        
        // Verificar conteúdo dos atributos
        System.out.println("-> Verificações Nível 2:");
        System.out.println("Impressões Tinteiro Atual: " + minhaImpressora.getImpressoesTinteiro());
        System.out.println("Capacidade Tinteiro: " + minhaImpressora.getCapacidadeTinteiro() + " ml\n");


        System.out.println("--- TESTES DO NÍVEL 3 ---");
        // Substituir tinteiro (ex: novo tinteiro XL de 10ml)
        minhaImpressora.trocarTinteiro(10.0);
        
        // Imprimir mais 1 documento para testar
        minhaImpressora.imprimir("Documento 3: Fatura de Compras");
        
        System.out.println("-> Verificações Nível 3:");
        System.out.println("Tinteiros Utilizados: " + minhaImpressora.getTinteirosUtilizados());
        System.out.println("Total de Impressões (Geral): " + minhaImpressora.getTotalImpressoes());
        System.out.println("Impressões Tinteiro Atual (novo): " + minhaImpressora.getImpressoesTinteiro());
        System.out.println("Capacidade Atual (novo): " + minhaImpressora.getCapacidadeTinteiro() + " ml\n");


        System.out.println("--- TESTES DO NÍVEL 4 ---");
        System.out.println("-> Verificações Nível 4:");
        System.out.println("Média de impressões por tinteiro: " + minhaImpressora.getMediaImpressoesPorTinteiro());
        System.out.println("Estimativa de impressões disponíveis: " + minhaImpressora.getEstimativaImpressoesDisponiveis() + " páginas\n");


        System.out.println("--- TESTES DO NÍVEL 5 ---");
        // Imprimir a página de teste
        minhaImpressora.imprimirPaginaTeste();
        
        // Verificar se imprimir a página de teste também consumiu tinta e contou como impressão
        System.out.println("\n-> Verificações Pós-Página de Teste:");
        System.out.println("Total de Impressões subiu para: " + minhaImpressora.getTotalImpressoes());
        System.out.println("Estimativa atualizada restam: " + minhaImpressora.getEstimativaImpressoesDisponiveis());
    }
}