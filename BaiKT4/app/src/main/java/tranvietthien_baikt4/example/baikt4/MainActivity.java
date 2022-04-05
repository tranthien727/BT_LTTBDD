package tranvietthien_baikt4.example.baikt4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<animals> List;
    animalsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv =(ListView) findViewById(R.id.lv);

        List = new ArrayList<>();
        List.add(new animals("Octopus","8 tentacled monster",R.drawable.diacau));
        List.add(new animals("Pig","Delicious in rolls",R.drawable.diacau));
        List.add(new animals("Sheep","Great for jumpers",R.drawable.diacau));
        List.add(new animals("rabbit","Nice in a stew",R.drawable.diacau));
        List.add(new animals("Snake.png","Great for Shoes",R.drawable.diacau));
        List.add(new animals("Spider","...",R.drawable.diacau));

        adapter = new animalsAdapter(this,R.layout.dong_animals,List);
        lv.setAdapter(adapter);
    }
}