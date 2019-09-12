package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

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

        Switch candleSwitch = findViewById(R.id.switchCandles);
        candleSwitch.setOnCheckedChangeListener(cakecontrollerobj);

        SeekBar seekBarListener = findViewById(R.id.seekbarCandles);
        seekBarListener.setOnSeekBarChangeListener(cakecontrollerobj);

    }
    public void goodbye(View button) {
        Log.i("theInfoTag", "Goodbye");
    }
}
