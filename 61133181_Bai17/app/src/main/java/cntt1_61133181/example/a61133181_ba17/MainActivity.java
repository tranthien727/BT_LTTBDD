package cntt1_61133181.example.a61133181_ba17;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView hienthi;
    EditText nhap;
    Button nhan;
    ListView ten;
    ArrayList<String> List;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hienthi = (TextView) findViewById(R.id.tv);
        ten = (ListView) findViewById(R.id.lv);
        nhap = (EditText) findViewById(R.id.edNhap);
        nhan = (Button) findViewById(R.id.btnNhap);

        List = new ArrayList<>();
        List.add("Tèo");
        List.add("Tý");
        List.add("Bin");
        List.add("Bo");

        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                List);
        ten.setAdapter(adapter);

        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item = nhap.getText().toString().trim();
                List.add(item);
                adapter.notifyDataSetChanged();
            }
        });

        ten.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                hienthi.setText("position: " + i + "; value = " + adapter.getItem(i));
            }
        });
    }
}