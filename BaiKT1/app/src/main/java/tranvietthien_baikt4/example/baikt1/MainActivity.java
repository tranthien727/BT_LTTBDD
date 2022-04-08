package tranvietthien_baikt4.example.baikt1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtName,edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void DangNhap(View v){
        edtName = (EditText) findViewById(R.id.edtName);
        edtPass = (EditText) findViewById(R.id.edtPass);

        if(edtName.getText().toString().equals("maicuongtho") && edtPass.getText().toString().equals("Cntt60ntu!"))
        {
            Toast.makeText(this, "User and Password is correct", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "User and Password is wrong", Toast.LENGTH_SHORT).show();
        }
    }
}