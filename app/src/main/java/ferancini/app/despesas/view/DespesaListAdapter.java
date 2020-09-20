package ferancini.app.despesas.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

import ferancini.app.despesas.R;
import ferancini.app.despesas.model.Despesa;
import ferancini.app.despesas.model.Item;

public class DespesaListAdapter extends RecyclerView.Adapter<DespesaListAdapter.DespesaViewHolder> {
    Context context;
    List<Despesa> dataset;

    public DespesaListAdapter(Context context, List<Despesa> dataset) {
        this.context = context;
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public DespesaListAdapter.DespesaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.despesa_view_item, parent, false);
        return new DespesaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DespesaListAdapter.DespesaViewHolder holder, int position) {
        Despesa d = this.dataset.get(position);
        holder.txtDescricao.setText(d.getNome());
        holder.txtValor.setText(d.getValor().toString());
        Item it = d.getItem_orcamento();
        holder.txtOrcamentoItem.setText(it.getOrcamento().getNome() + "(" + it.getNome() + ")");
    }

    @Override
    public int getItemCount() {
        return this.dataset.size();
    }

    public class DespesaViewHolder extends RecyclerView.ViewHolder{
        public TextView txtDescricao;
        public TextView txtValor;
        public TextView txtOrcamentoItem;
        public DespesaViewHolder(@NonNull View itemView) {
            super(itemView);
            txtDescricao = itemView.findViewById(R.id.txtDescricao);
            txtValor = itemView.findViewById(R.id.txtValor);
            txtOrcamentoItem = itemView.findViewById(R.id.txtOrcamentoItem);
        }
    }
}
