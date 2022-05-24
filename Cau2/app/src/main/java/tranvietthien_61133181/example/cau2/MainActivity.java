package tranvietthien_61133181.example.cau2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> List = new ArrayList<>();
        List.add("trang_giang");
        List.add("que_huong");
        List.add("duong_ve_que_me");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,List);
        ListView lv = (ListView) findViewById(R.id.lvBaitho);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String tenBaiTho = List.get(i);
                Intent intent = new Intent(MainActivity.this,MainActivity_BaiTho.class);
                intent.putExtra("BT",tenBaiTho);
                startActivity(intent);
            }
        });
    }
}