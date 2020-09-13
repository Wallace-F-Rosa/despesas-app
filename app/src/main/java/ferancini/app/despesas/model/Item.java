package com.example.despesas.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * Classe Item.
 * Um item de orçamento contém uma descrição explicando
 * o que esse item representa e um valor monetário a ser
 * incluido no orçamento e as despesas relacionadas com esse item.
 * @see Orcamento
 * */
public class Item {
    private String descricao;
    private BigDecimal valor;
    private List<Despesa> despesas;

    public Item(String descricao, BigDecimal valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
}
