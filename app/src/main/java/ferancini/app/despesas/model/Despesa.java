package ferancini.app.despesas.model;

import java.math.BigDecimal;
/**
 * Classe Despesa.
 * Registra uma despesa.
 * A despesa tem uma descrição descrevendo em que o valor monetário foi gasto,
 * e qual orcamento é relacionado(informando o item do orçamento ao qual a despesa
 * será relacionada).
 * @see Item
 * @see Orcamento
 * */
public class Despesa {
    private String descricao;
    private BigDecimal valor;
    private Item item_orcamento;

    public Despesa(String _descricao, BigDecimal _valor, Item _item_orcamento){
        this.descricao=_descricao;
        this.valor = _valor;
        this.item_orcamento = _item_orcamento;
    }

    public Despesa(String descricao, BigDecimal valor) {
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

    public Item getItem_orcamento() {
        return item_orcamento;
    }

    public void setItem_orcamento(Item item_orcamento) {
        this.item_orcamento = item_orcamento;
    }
}
