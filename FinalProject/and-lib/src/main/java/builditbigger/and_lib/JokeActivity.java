package builditbigger.and_lib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import builditbigger.lib.Joker;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
    }

    public void tellJoke(View view) {
        Joker myJoker = new Joker();
        Toast.makeText(this, myJoker.getJoke(), Toast.LENGTH_SHORT).show();
    }
}
