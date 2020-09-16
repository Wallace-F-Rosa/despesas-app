package ferancini.app.despesas.view;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.google.android.material.tabs.TabLayout;

public class PagerAdapter extends FragmentPagerAdapter {

    private int tabN;

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
                return new OrcamentoFragment();
            case 1 :
                return new DespesaFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return this.tabN;
    }
}
