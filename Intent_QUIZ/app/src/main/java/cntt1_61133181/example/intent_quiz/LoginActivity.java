package cntt1_61133181.example.intent_quiz;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText Name,Pass,Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Name = (EditText) findViewById(R.id.edtUserName);
    }
    public void ChuyenManHinhHome(View v){
        String username = Name.getText().toString();
        Intent iQuiz = new Intent(this,HomeActivity.class);
        iQuiz.putExtra("UN",username);
        startActivity(iQuiz);
    }


}