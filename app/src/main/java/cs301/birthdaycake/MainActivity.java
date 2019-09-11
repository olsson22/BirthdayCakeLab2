package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.activity_main);
        CakeView cakeviewobj = findViewById(R.id.cakeview);
        CakeController cakecontrollerobj = new CakeController(cakeviewobj);

        Button buttonblowout = findViewById(R.id.buttonBlow);
        buttonblowout.setOnClickListener(cakecontrollerobj);

    }
    public void goodbye(View button) {
        Log.i("theInfoTag", "Goodbye");
    }
}
