package ferancini.app.despesas.model;

import java.math.BigDecimal;
import java.util.List;

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
    private String nome;
    private BigDecimal valor;
    private Item item_orcamento;
    private static List<Despesa> all_despesas;

    public Despesa(String _descricao, BigDecimal _valor, Item _item_orcamento){
        this.nome =_descricao;
        this.valor = _valor;
        this.item_orcamento = _item_orcamento;
        Despesa.all_despesas.add(this);
    }

    public Despesa(String nome, BigDecimal valor) {
        this.nome = nome;
        this.valor = valor;
        Despesa.all_despesas.add(this);
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

    public Item getItem_orcamento() {
        return item_orcamento;
    }

    public void setItem_orcamento(Item item_orcamento) {
        this.item_orcamento = item_orcamento;
    }

    public static List<Despesa> getAllDespesas(){
        return Despesa.all_despesas;
    }

}
