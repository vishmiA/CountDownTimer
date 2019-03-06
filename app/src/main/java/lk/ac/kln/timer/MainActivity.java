package lk.ac.kln.timer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {
    private int counter=99;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countDown();
    }
    private void countDown(){
        final Textview2 textView2= findViewById(R.id.textView2);
        final Handler handler = new Handler();

        handler.post(new Runnable()){
            @Override
            public void run() {
                textView2.setText(Integer.toString(counter));
                counter--;
                handler.postDelayed(r:this, delayMillis: 1000);

            }
        });
    }
}
