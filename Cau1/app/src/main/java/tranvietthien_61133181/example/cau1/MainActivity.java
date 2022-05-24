package tranvietthien_61133181.example.cau1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText a,b,h;
    TextView hienThi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (EditText) findViewById(R.id.edCanha);
        b = (EditText) findViewById(R.id.edCanhb);
        h = (EditText) findViewById(R.id.edChieucao);
        hienThi = (TextView) findViewById(R.id.tvHienthi);

    }
    public void TinhChuVi(View v){
        String Sa = a.getText().toString();
        String Sb = b.getText().toString();

        int a = Integer.parseInt(Sa);
        int b = Integer.parseInt(Sb);

        int chuvi;
        chuvi = (a+b)*2;

        hienThi.setText("Chu vi hinh binh hanh: "+chuvi);
    }
    public void TinhDienTich(View v){
        String Sa = a.getText().toString();
        String Sh = h.getText().toString();

        int a = Integer.parseInt(Sa);
        int h = Integer.parseInt(Sh);

        int dientich;
        dientich = a*h;

        hienThi.setText("Dien tich hinh binh hanh: "+dientich);
    }
}