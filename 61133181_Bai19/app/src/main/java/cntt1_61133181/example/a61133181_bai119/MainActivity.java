package cntt1_61133181.example.a61133181_bai119;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView thanhpho;
    TextView hienthi;
    ArrayList<icon> List;
    iconAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thanhpho = (ListView) findViewById(R.id.lv);
        hienthi = (TextView) findViewById(R.id.tvhienthi) ;

        List = new ArrayList<>();
        List.add(new icon("Hà Nội",R.drawable.diacau));
        List.add(new icon("Huế", R.drawable.ngoisao));
        List.add(new icon("Spa",R.drawable.ngoisao));
        List.add(new icon("Côn Sơn",R.drawable.diacau));
        List.add(new icon("Vũng Tàu",R.drawable.diacau));
        List.add(new icon("Đà Nẵng",R.drawable.diacau));

        adapter = new iconAdapter(this,R.layout.icon,List);
        thanhpho.setAdapter(adapter);

        thanhpho.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                hienthi.setText("value:" + adapter.getItem(i));
            }
        });
    }
}