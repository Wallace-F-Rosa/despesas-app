package ferancini.app.despesas.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import ferancini.app.despesas.R;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabMenu;
    private TabItem tabDespesas;
    private TabItem tabOrcamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tabMenu = findViewById(R.id.tabMenu);
        this.tabDespesas = findViewById(R.id.tabDespesas);
        this.tabOrcamento = findViewById(R.id.tabOrcamento);
        ViewPager viewPager = findViewById(R.id.viewPager);

    }
}