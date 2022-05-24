package tranvietthien_61133181.example.cau2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity_BaiTho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bai_tho);
        Intent intent = getIntent();
        String BaiTho = intent.getStringExtra("BT");
        InputStream inputStream = getResources().openRawResource(R.raw.que_huong);
        EditText Baitho = (EditText) findViewById(R.id.edBaiTho);
        Baitho.setText(readData(inputStream));
    }
    String readData(InputStream inp) {
        String dongVanBan;
        InputStreamReader inpRdr = new InputStreamReader(inp);
        BufferedReader buffRde = new BufferedReader(inpRdr);
        StringBuilder boTaoChuoi = new StringBuilder();
        try {
            while((dongVanBan=buffRde.readLine())!=null){
                boTaoChuoi.append(dongVanBan);
                boTaoChuoi.append("\n");
            }
            inp.close();
        } catch (IOException ex){
            Log.e("ERROR",ex.getMessage());
        }
        return boTaoChuoi.toString();
    }
    public void QuayVe(View v){
        Intent quayve = new Intent(MainActivity_BaiTho.this,MainActivity.class);
        startActivity(quayve);
    }
}