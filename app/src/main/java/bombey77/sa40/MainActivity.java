package bombey77.sa40;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String LOG_CAT = "myLog";

        LayoutInflater layoutInflater = getLayoutInflater();

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linLayout);
        View view = layoutInflater.inflate(R.layout.text, linearLayout, true);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relLayout);
        View view1 = layoutInflater.inflate(R.layout.text, relativeLayout, true);
        ViewGroup.LayoutParams layoutParams1 = view1.getLayoutParams();




    }
}
