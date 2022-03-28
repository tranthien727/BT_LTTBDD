package cntt1_61133181.example.a61133181_bai17;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {
    TextView hienthi;
    ArrayList<String> List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hienthi = (TextView) findViewById(R.id.tv);

        List = new ArrayList<>();
        List.add("Intel");
        List.add("SamSung");
        List.add("Nokia");
        List.add("Simen");
        List.add("AMD");
        List.add("KIC");
        List.add("ECD");

        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                List);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                hienthi.setText("position: " + i + "; value = " + adapter.getItem(i));
            }
        });
    }
}