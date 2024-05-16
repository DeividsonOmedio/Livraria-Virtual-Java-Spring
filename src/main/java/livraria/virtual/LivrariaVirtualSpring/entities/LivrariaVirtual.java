package livraria.virtual.LivrariaVirtualSpring.entities;

import java.util.List;

public class LivrariaVirtual {
    private int id;
    private int max_impressos = 100;
    private int max_eletronicos = 100;
    private int max_vendas = 100;
    private int numImpressos;
    private int numEletronicos;
    private int numVendas;

    public int getMax_impressos() {
        return max_impressos;
    }

    public void setMax_impressos(int max_impressos) {
        this.max_impressos = max_impressos;
    }

    public int getMax_eletronicos() {
        return max_eletronicos;
    }

    public void setMax_eletronicos(int max_eletronicos) {
        this.max_eletronicos = max_eletronicos;
    }

    public int getMax_vendas() {
        return max_vendas;
    }

    public void setMax_vendas(int max_vendas) {
        this.max_vendas = max_vendas;
    }

    public int getNumImpressos() {
        return numImpressos;
    }

    public void setNumImpressos(int numImpressos) {
        this.numImpressos = numImpressos;
    }

    public int getNumEletronicos() {
        return numEletronicos;
    }

    public void setNumEletronicos(int numEletronicos) {
        this.numEletronicos = numEletronicos;
    }

    public int getNumVendas() {
        return numVendas;
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
    }
}
