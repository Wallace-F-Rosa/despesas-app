package  ferancini.app.despesas.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe de orçamento.
 * Contém um nome indentificando o orçamento, uma descrição
 * Um orçamento é uma associação de vários items.
 * É um dos tipos :
 * - 0: diário, repete todos os dias
 * - 1: semanal, repete a cada 7 dias
 * - 2: mensal, repete a cada mes
 * Contém as despesas associadas com o orçamento
 * Capacidades:
 * - Consegue retornar os items que formam o orçamento
 * - Consegue retornar o valor do orçamento
 * - Retornar o total liquido de acordo com as despesas relacionadas
 * - Retornar os items do orçamento
 * - Adicionar um item ao orçamento
 * - Excluir um item ao orçamento
 * - Adicionar despesa relacionada
 * - Excluir despesa relacionada
 * @see Item
 * */
public class Orcamento {
    private String nome;
    private String descricao;
    private int tipo;
    private List<Item> items;
    private static List<Orcamento> all_orcamentos = new ArrayList<Orcamento>();

    private void default_attributes(){
        this.items = new ArrayList<Item>();
        this.nome = "";
        this.descricao = "";
        this.tipo = 3;
    }

    public Orcamento(){
        this.default_attributes();
        Orcamento.all_orcamentos.add(this);
    }

    public Orcamento(List<Item> items) {
        this.default_attributes();
        this.items = items;
        Orcamento.all_orcamentos.add(this);
    }

    public Orcamento(String nome, String descricao, int tipo, List<Item> items) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.items = items;
        Orcamento.all_orcamentos.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(int i){
        this.items.remove(i);
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public BigDecimal getValor() {
        //TODO: retorna o valor total de acordo com os items do orçamento
        BigDecimal total = new BigDecimal("0.00");
        for(Item i : this.items){
            total.add(i.getValor());
        }
        return total;
    }

    public BigDecimal getValorDespesas(){
        BigDecimal total = new BigDecimal("0.00");
        for(Item i : this.items){
            BigDecimal subtotal = new BigDecimal("0.00");
            for (Despesa d : i.getDespesas()){
                subtotal.add(d.getValor());
            }
            total.add(subtotal);
        }
        return total;
    }

    public BigDecimal getTotal(){
        BigDecimal valor_orcamento = this.getValor();
        BigDecimal valor_depesas =  this.getValorDespesas();
        return valor_orcamento.subtract(valor_depesas);
    }

    static public List<Orcamento> getAllOrcamentos(){
        return Orcamento.all_orcamentos;
    }
}
