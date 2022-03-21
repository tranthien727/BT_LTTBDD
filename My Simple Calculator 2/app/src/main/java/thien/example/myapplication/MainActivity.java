package thien.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edSoA, edSoB;
    TextView tvKetQua;
    Button btnCong, btnTru, btnNhan, btnChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timWidget();
    }
    void timWidget(){
        edSoA=(EditText)findViewById(R.id.edSoA);
        edSoB=(EditText)findViewById(R.id.edSoB);
        tvKetQua=(TextView) findViewById(R.id.tvKetQua);
        btnCong=(Button) findViewById(R.id.btncong);
        btnTru=(Button) findViewById(R.id.btntru);
        btnNhan=(Button) findViewById(R.id.btnNhan);
        btnChia=(Button) findViewById(R.id.btnChia);
    }
    public void XuLyCong(View view){

        //lay du lieu
        String sA= edSoA.getText().toString();
        String sB= edSoB.getText().toString();

        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);

        //tinh tong
        int tong;
        tong=a+b;


        //xuat ket qua
        tvKetQua.setText("tong la: " + tong);
    }
    public void XuLyTru(View view){
        //lay du lieu
        String sA= edSoA.getText().toString();
        String sB= edSoB.getText().toString();

        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);

        //tinh tong
        int tong;
        tong=a-b;

        //xuat ket qua
        tvKetQua.setText("hieu la: " + tong);
    }
    public void XuLyNhan(View view){
        //lay du lieu
        String sA= edSoA.getText().toString();
        String sB= edSoB.getText().toString();

        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);

        //tinh tong
        int tong;
        tong=a*b;

        //xuat ket qua
        tvKetQua.setText("tich la: " + tong);
    }
    public void XuLyChia(View view){
        //lay du lieu
        String sA= edSoA.getText().toString();
        String sB= edSoB.getText().toString();

        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);

        //tinh tong
        int tong;
        tong=a/b;

        //xuat ket qua
        tvKetQua.setText("thuong la: " + tong);
}}