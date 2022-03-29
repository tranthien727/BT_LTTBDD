package cntt1_61133181.example.a61133181baihat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<BaiHat> List;
    BaiHatAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);

        List = new ArrayList<>();
        List.add(new BaiHat("Bài hát 1","Ca sĩ 1", R.drawable.diacau));
        List.add(new BaiHat("Bài hát 2","Ca sĩ 2", R.drawable.diacau));
        List.add(new BaiHat("Bài hát 3","Ca sĩ 3", R.drawable.diacau));
        List.add(new BaiHat("Bài hát 4","Ca sĩ 4", R.drawable.diacau));

        adapter = new BaiHatAdapter(this,R.layout.dong_baihat,List);
        lv.setAdapter(adapter);

    }
}