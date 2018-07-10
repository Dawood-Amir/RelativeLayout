package com.example.dawoo.relativelayout;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.ClassNotFoundException;
import java.util.concurrent.Callable;

public class MainActivity extends AppCompatActivity {
    //didn't have internet so i didnt knw how to make an array in this IDd

private  Button[] btn = new Button[24];
private String str;
private int parsed;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn[0] =(Button)findViewById(R.id.b);
        btn[1] =(Button)findViewById(R.id.b2);
        btn[2] =(Button)findViewById(R.id.b3);
        btn[3] =(Button)findViewById(R.id.b4);
        btn[4] =(Button)findViewById(R.id.b5);
        btn[5] =(Button)findViewById(R.id.b6);
        btn[6] =(Button)findViewById(R.id.b7);
        btn[7] =(Button)findViewById(R.id.b8);
        btn[8] =(Button)findViewById(R.id.b9);
        btn[9] =(Button)findViewById(R.id.b10);
        btn[10] =(Button)findViewById(R.id.b11);
        btn[11] =(Button)findViewById(R.id.b12);
        btn[12] =(Button)findViewById(R.id.b13);
        btn[13] =(Button)findViewById(R.id.b14);
        btn[14] =(Button)findViewById(R.id.b15);
        btn[15] =(Button)findViewById(R.id.b16);
        btn[16] =(Button)findViewById(R.id.b17);
        btn[17] =(Button)findViewById(R.id.b18);
        btn[18] =(Button)findViewById(R.id.b19);
        btn[19] =(Button)findViewById(R.id.b20);


        textView=(TextView)findViewById(R.id.text);
    }

    public void process (View view){

        textView.setText("+/-");
    }
    public void process2(View view) {
        textView.setText("0");
    }

    public void process3(View view) {
        textView.setText(".");

    }


    public void process5(View view) {
        textView.setText("1");
    }

    public void process6(View view) {
        textView.setText("2");
    }

    public void process11(View view) {
        textView.setText("6");
    }

    public void process10(View view) {
        textView.setText("5");
    }

    public void process9(View view) {


        textView.setText(str=textView.getText()+"4");
    }

    public void process8(View view) {


    }

    public void process7(View view) {
        textView.setText("3");
    }

    public void process13(View view) {
        textView.setText("7");
    }

    public void process14(View view) {
        textView.setText("8");
    }

    public void process15(View view) {
        textView.setText("9");
    }

    public void process16(View view) {
        textView.setText("X");
    }

    public void process17(View view) {
        textView.setText(textView.getText()+"");
    }

    public void process18(View view) {
        textView.setText("()");
    }

    public void process19(View view) {
        textView.setText("%");
    }

    public void process12(View view) {
        textView.setText("-");
    }

    public void process20(View view) {
        textView.setText("/");
    }

    public void equals(View view) {
        textView.setText("");
    }
}
