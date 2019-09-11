package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener{

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


}
