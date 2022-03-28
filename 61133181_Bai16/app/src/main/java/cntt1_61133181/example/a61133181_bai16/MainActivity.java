package cntt1_61133181.example.a61133181_bai16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView hienthi;
    ListView ten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hienthi = (TextView) findViewById(R.id.tv);
        ten = (ListView) findViewById(R.id.lv);

        Resources res = getResources();
        String[] List = res.getStringArray(R.array.List);

        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                List);
        ten.setAdapter(adapter);

        ten.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                hienthi.setText("position: " + i + "; value = " + adapter.getItem(i));
            }
        });
    }
}

