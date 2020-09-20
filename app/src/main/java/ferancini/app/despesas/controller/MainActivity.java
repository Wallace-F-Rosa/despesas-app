package ferancini.app.despesas.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import ferancini.app.despesas.R;
import ferancini.app.despesas.model.Despesa;
import ferancini.app.despesas.model.Orcamento;
import ferancini.app.despesas.view.DespesaListAdapter;
import ferancini.app.despesas.view.OrcamentoListAdapter;
import ferancini.app.despesas.view.PagerAdapter;

public class MainActivity extends AppCompatActivity {

    //membros de tela principal
    private TabLayout tabMenu;
    private TabItem tabDespesas;
    private TabItem tabOrcamento;
    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tabMenu = findViewById(R.id.tabMenu);
        this.viewPager = findViewById(R.id.viewPager);
        this.pagerAdapter = new PagerAdapter(
                getSupportFragmentManager(),
                tabMenu.getTabCount()
        );
        this.viewPager.setAdapter(pagerAdapter);

        this.tabMenu.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

}