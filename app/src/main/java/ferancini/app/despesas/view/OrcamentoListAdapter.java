package ferancini.app.despesas.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import ferancini.app.despesas.R;
import ferancini.app.despesas.model.Orcamento;

public class OrcamentoListAdapter extends RecyclerView.Adapter<OrcamentoListAdapter.OrcamentoViewHolder>{
    private List<Orcamento> dataset;

    public OrcamentoListAdapter(){
        this.dataset = new ArrayList<Orcamento>();
    }

    public OrcamentoListAdapter(List<Orcamento> dataset){
        this.dataset = dataset;
    }

    public void setDataset(List<Orcamento> dataset) {
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public OrcamentoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.orcamento_view_item, parent, false);
        return new OrcamentoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrcamentoViewHolder holder, int position) {
        Orcamento orc = this.dataset.get(position);
        holder.txtNome.setText(orc.getNome());
        holder.txtItens.setText("Nº de itens : "+ orc.getItems().size());
        holder.txtTotal.setText(""+orc.getTotal().toString());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class OrcamentoViewHolder extends RecyclerView.ViewHolder{
        public TextView txtNome;
        public TextView txtItens;
        public TextView txtTotal;
        public OrcamentoViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtNome = itemView.findViewById(R.id.txtNome);
            this.txtItens = itemView.findViewById(R.id.txtItens);
            this.txtTotal = itemView.findViewById(R.id.txtTotal);
        }
    }
}
