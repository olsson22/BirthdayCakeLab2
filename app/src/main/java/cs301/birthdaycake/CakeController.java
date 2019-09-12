package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener{

    private CakeView cakeview;

    private CakeModel cakemodel;

    public CakeController(CakeView cakeview){
        this.cakeview = cakeview;
        this.cakemodel = cakeview.getCakeModel();
    }
    @Override
    public void onClick(View v) {
        cakemodel.islit = false;
        cakeview.invalidate();
        Log.d("cakeview.OnClick", "This has been clicked!");
    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(!isChecked){
            cakemodel.hasCandles = false;
            cakeview.invalidate();
        }
        if(isChecked){
            cakemodel.hasCandles = true;
            cakeview.invalidate();
        }

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        cakemodel.nbrcandles = progress;
        cakeview.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
