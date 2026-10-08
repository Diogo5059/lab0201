package com.diogo.lab0201;

public class Impressora {
    private final TipoMarcaTinteiro marcaDoTinteiro;
    private double capacidadeTinteiro;
    private int impressoesTinteiro;
    private final int maximoImpressoes;
    private int tinteirosUtilizados;
    private int totalImpressoes;

    public  Impressora (int maximoImpressoes, TipoMarcaTinteiro marcaDoTinteiro){

        this.maximoImpressoes = maximoImpressoes;
        this.marcaDoTinteiro = marcaDoTinteiro;
        this.capacidadeTinteiro = 5.0;
        this.impressoesTinteiro = 0;
        this.tinteirosUtilizados = 1;
        this.totalImpressoes = 0;

    }
    //getters
    public double getCapacidadeTinteiro(){
        return capacidadeTinteiro;
    }
    public int getImpressoesTinteiro(){
        return impressoesTinteiro;
    }
    public int getMaximoImpressoes(){
        return maximoImpressoes;
    }
    public int getTinteirosUtilizados(){
        return tinteirosUtilizados;
    }
    public int getTotalImpressoes(){
        return totalImpressoes;
    }

    public void imprimir(String texto){
        if(impressoesTinteiro < maximoImpressoes){
            this.impressoesTinteiro++;
            this.capacidadeTinteiro = this.capacidadeTinteiro - 0.005;
            this.totalImpressoes++;
            System.out.println(texto);
            System.out.println("Impressão Realizada com sucesso!");
        }
        else{
            System.out.println("Não é possivel imprimir! Troque os tinteiros!");
        }
    }

    public void trocarTinteiro(double capacidadeNovoTinteiro){
        this.impressoesTinteiro = 0;
        this.tinteirosUtilizados++;
        this.capacidadeTinteiro = capacidadeNovoTinteiro;
    }

    public double getMediaImpressoesPorTinteiro(){
        return (double) totalImpressoes / tinteirosUtilizados;
    }

    public int getEstimativaImpressoesDisponiveis(){
        return (int) (capacidadeTinteiro / 0.005);
    }

    public void imprimirPaginaTeste() {
        String informacaoTeste = 
            "=== PÁGINA DE TESTE ===" + "\n" +
            "Marca do Tinteiro: " + marcaDoTinteiro + "\n" +
            "Capacidade Atual do Tinteiro: " + String.format("%.3f", capacidadeTinteiro) + " ml\n" +
            "Impressões com o Tinteiro Atual: " + impressoesTinteiro + "\n" +
            "Máximo de Impressões (Vida Útil): " + maximoImpressoes + "\n" +
            "Tinteiros Utilizados: " + tinteirosUtilizados + "\n" +
            "Total de Impressões Efetuadas: " + totalImpressoes + "\n" +
            "Média de Impressões por Tinteiro: " + getMediaImpressoesPorTinteiro() + "\n" +
            "Estimativa de Impressões Disponíveis: " + getEstimativaImpressoesDisponiveis() + "\n" +
            "=======================";
            
        // Ao chamar este método, a página de teste é impressa, logo os
        // atributos de tinta e contadores são automaticamente descontados/aumentados!
        imprimir(informacaoTeste);
    }


}
