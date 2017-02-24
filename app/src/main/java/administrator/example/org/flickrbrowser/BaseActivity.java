package administrator.example.org.flickrbrowser;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by Administrator on 1/28/2016.
 */
public class BaseActivity extends ActionBarActivity {
    private Toolbar mToolbar;

    protected Toolbar activateToolbar(){
        if(mToolbar == null){
            mToolbar = (Toolbar) findViewById(R.id.app_bar);
        }
        else{
            setSupportActionBar (mToolbar);
        }
        return mToolbar;
    }
}
