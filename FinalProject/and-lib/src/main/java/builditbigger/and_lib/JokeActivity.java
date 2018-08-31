package builditbigger.and_lib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView mJoke = findViewById(R.id.tv_joke);

        Intent intent = getIntent();
        if(intent != null) {
            mJoke.setText(intent.getStringExtra("joke"));
        }
    }
}
