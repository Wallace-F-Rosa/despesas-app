package ferancini.app.despesas.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ferancini.app.despesas.R;
import ferancini.app.despesas.model.Despesa;
import ferancini.app.despesas.model.Orcamento;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrcamentoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrcamentoFragment extends Fragment {
    private RecyclerView recyclerV; //pode ser o componente do OrcamentoFragment ou do DespesaFragment
    private LinearLayoutManager ltmg; // gerenciador de layout
    private OrcamentoListAdapter adapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public OrcamentoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OrcamentoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OrcamentoFragment newInstance(String param1, String param2) {
        OrcamentoFragment fragment = new OrcamentoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onResume() {
        adapter.notifyDataSetChanged();
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_orcamento, container, false);
        recyclerV= v.findViewById(R.id.orcamento_list);

        if(ltmg == null)
            ltmg = new LinearLayoutManager(getActivity());

        recyclerV.setLayoutManager(ltmg);
        if(adapter == null)
            adapter = new OrcamentoListAdapter(Orcamento.getAllOrcamentos());

        recyclerV.setAdapter(adapter);
        return v;
    }
}