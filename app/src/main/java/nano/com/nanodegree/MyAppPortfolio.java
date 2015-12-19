package nano.com.nanodegree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyAppPortfolio extends AppCompatActivity {
    Button scores,libr,caps,streamr,buildit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
        streamr=(Button)findViewById(R.id.spot);
        scores=(Button)findViewById(R.id.score);
        libr=(Button)findViewById(R.id.libr);
        buildit=(Button)findViewById(R.id.builditla);
        caps=(Button)findViewById(R.id.my);
        streamr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToastMsg("This Button will launch my Spotify Streamer app");
            }
        });
        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToastMsg("This Button will launch my Super Duo app");
            }
        });
        libr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToastMsg("This Button will launch my Super Duo app");
            }
        });
        buildit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToastMsg("This Button will launch my Build It Bigger app");
            }
        });
        caps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToastMsg("This Button will launch my Capstone app");
            }
        });

    }

    private void displayToastMsg(String s) {
        toastMsg(s);


    }
    public void toastMsg(String msg) {

        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();

    }
}
