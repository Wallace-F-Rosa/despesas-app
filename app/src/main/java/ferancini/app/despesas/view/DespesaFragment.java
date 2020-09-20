package ferancini.app.despesas.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ferancini.app.despesas.R;
import ferancini.app.despesas.model.Orcamento;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DespesaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DespesaFragment extends Fragment {
    //membros de OrcamentoFragment e DespesaFragment
    private RecyclerView recyclerV; //pode ser o componente do OrcamentoFragment ou do DespesaFragment
    private LinearLayoutManager ltmg; // gerenciador de layout

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DespesaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DespesaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DespesaFragment newInstance(String param1, String param2) {
        DespesaFragment fragment = new DespesaFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_despesa, container, false);
        recyclerV= v.findViewById(R.id.despesas_list);
        recyclerV.setLayoutManager(new LinearLayoutManager(v.getContext()));
        OrcamentoListAdapter adapterOrc = new OrcamentoListAdapter(v.getContext(), Orcamento.getAllOrcamentos());
        recyclerV.setAdapter(adapterOrc);
        return v;
    }
}