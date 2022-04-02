package cntt1_61133181.example.intent_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        name = (TextView) findViewById(R.id.tvUserName);
        Intent iQuiz = getIntent();
        String username = iQuiz.getExtras().getString("UN");
        name.setText(username);
    }
}