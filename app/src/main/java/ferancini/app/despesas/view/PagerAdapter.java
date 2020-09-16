package ferancini.app.despesas.view;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.google.android.material.tabs.TabLayout;

import ferancini.app.despesas.model.Orcamento;

public class PagerAdapter extends FragmentPagerAdapter {

    private int tabN;
    private OrcamentoFragment orcamentoFrag;
    private DespesaFragment despesaFrag;

    public PagerAdapter(@NonNull FragmentManager fm, int tabN) {
        super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.tabN = tabN;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        //TODO: return fragments
        switch(position){
            case 0 :
                return this.getOrcamentoFrag();
            case 1 :
                return this.getDespesaFrag();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return this.tabN;
    }

    public OrcamentoFragment getOrcamentoFrag() {
        if (this.orcamentoFrag == null)
            this.orcamentoFrag = new OrcamentoFragment();
        return this.orcamentoFrag;
    }

    public DespesaFragment getDespesaFrag() {
        if (this.despesaFrag == null)
            this.despesaFrag = new DespesaFragment();
        return this.despesaFrag;
    }
}
