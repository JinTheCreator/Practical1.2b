package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private int mCount = 0;
private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }





    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_massage,Toast.LENGTH_SHORT);

        toast.show();
    }


    public void countUp(View view){
        ++mCount;
       if (mShowCount != null)
           mShowCount.setText(Integer.toString(mCount));
    if(mCount>0)
    {
        findViewById(R.id.button_zero).setBackgroundColor(Color.RED);
    }
        if(mCount % 2 == 0)
            view.setBackgroundColor(Color.BLUE);
        else
            view.setBackgroundColor(Color.GREEN);

    }
    public void zero(View view){
        if(mCount !=0)
        {
            view.setBackgroundColor(Color.GRAY);
        }
        mCount = 0;
        mShowCount.setText(Integer.toString(0));

    }
}