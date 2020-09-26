package ferancini.app.despesas.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

import ferancini.app.despesas.R;
import ferancini.app.despesas.model.Item;
import ferancini.app.despesas.model.Orcamento;

public class AddOrcamentoActivity extends AppCompatActivity {
    private EditText edtNome;
    private EditText edtDescricao;
    private Spinner spnTipo;
    Dictionary tipos = new Hashtable();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_orcamento);

        this.edtNome = (EditText) findViewById(R.id.edtNome);
        this.edtDescricao = (EditText) findViewById(R.id.edtDescricao);

        this.spnTipo = (Spinner) findViewById(R.id.spnTipo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
            this,
            R.array.periodo_array,
            android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnTipo.setAdapter(adapter);

        //inicializando dicionário de tipos de orçamento
        tipos.put("Diário",0);
        tipos.put("Semanal",1);
        tipos.put("Mensal",2);
    }

    public void clickConfirmar(View v){


        String nome = this.edtNome.getText().toString();
        String descricao = this.edtDescricao.getText().toString();
        int tipo = (int) this.tipos.get(this.spnTipo.getSelectedItem().toString());

        //System.out.println(tipo);
        Orcamento orc = new Orcamento(nome,descricao,tipo,new ArrayList<Item>());
        System.out.println(Orcamento.getAllOrcamentos());
    }

}