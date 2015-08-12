package com.example.shuhei.tapnumber;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    //問題となる数字がhaいる配列。
    int[] hairetu;
    //実に表示させる問題 no文字列
    String mondai;
    //4けたうち今何桁目を解答しているかを覚えておく変数。
    int seikai;

    //問題を表示させるTextView
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //関連付け
        textView = (TextView)findViewById(R.id.textView);

        start();
    }

    public void start()
    {
        hairetu = new int[4];
        Random rand = new Random();
        hairetu[0] = rand.nextInt(4) + 1;
        hairetu[1] = rand.nextInt(4) + 1;
        hairetu[2] = rand.nextInt(4) + 1;
        hairetu[3] = rand.nextInt(4) + 1;

        mondai = Integer.toString(hairetu[0])
                + Integer.toString(hairetu[1])
                + Integer.toString(hairetu[2])
                + Integer.toString(hairetu[3]);
        textView.setText(mondai);
        seikai = 0;
    }

    public void number1(View v) {
        if(hairetu[seikai] == 1) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;
            if(seikai == 4) { start();
            }
        }
        else
        {
            Toast.makeText(this, "数字が違うよ!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void number2(View v) {
        if(hairetu[seikai] == 2) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;
            if(seikai == 4) { start();
            }
        }
        else
        {
            Toast.makeText(this, "数字が違うよ!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void number3(View v) {
        if(hairetu[seikai] == 3) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;
            if(seikai == 4) { start();
            }
        }
        else
        {
            Toast.makeText(this, "数字が違うよ!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void number4(View v) {
        if(hairetu[seikai] == 4) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;
            if(seikai == 4) { start();
            }
        }
        else
        {
            Toast.makeText(this, "数字が違うよ!!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
