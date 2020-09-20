package ferancini.app.despesas.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe Item.
 * Um item de orçamento contém uma descrição explicando
 * o que esse item representa e um valor monetário a ser
 * incluido no orçamento e as despesas relacionadas com esse item.
 * @see Orcamento
 * */
public class Item {
    private String nome;
    private BigDecimal valor;
    private List<Despesa> despesas;
    private Orcamento orcamento;

    public Item(Orcamento orcamento){
        this.nome="";
        this.valor = new BigDecimal("0.0");
        this.despesas = new ArrayList<Despesa>();
        this.orcamento = orcamento;
    }

    public Item(Orcamento orcamento, List<Despesa> despesas){
        this.nome="";
        this.valor = new BigDecimal("0.0");
        this.despesas = despesas;
        this.orcamento = orcamento;
    }

    public Item(String nome, BigDecimal valor, Orcamento orcamento, List<Despesa> despesas) {
        this.nome = nome;
        this.valor = valor;
        this.despesas = new ArrayList<Despesa>();
        this.orcamento = orcamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }
}

