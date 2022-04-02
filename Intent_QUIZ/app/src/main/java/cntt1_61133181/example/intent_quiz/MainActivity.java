package cntt1_61133181.example.intent_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ChuyenManHinhLogin(View v){
        Intent iLogin = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(iLogin);
    }
}