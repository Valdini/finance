package valdini.thefireapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private SeekBar seekBar1;
    private SeekBar seekBar2;
    private TextView textView2;
    private SeekBar seekBar3;
    private SeekBar seekBar4;
    private SeekBar seekBar5;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;

    private EditText input1;
    private EditText input2;
    private EditText input3;
    private EditText input4;
    private SeekBar input5;
    private SeekBar input6;
    private SeekBar input7;
    private SeekBar input8;
    private SeekBar input9;

    private TextView tv_result1;
    private TextView tv_result2;

    private Float aFloat1;
    private String string1;
    private Float aFloat2;
    private String string2;
    private Float aFloat3;
    private String string3;
    private Float aFloat4;
    private String string4;
    private Float aFloat5;
    private String string5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.incomegrowthvalue);
        seekBar1 = (SeekBar) findViewById(R.id.SeekBarIncome);
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                aFloat1 = (float) (progress *0.1);
                string1 = Float.toString(aFloat1);
                string1 = string1 + " %";
                textView1.setText(string1);
                ///textView1.setText("" + progress + "%");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        textView2 = (TextView) findViewById(R.id.incometaxvalue);
        seekBar2 = (SeekBar) findViewById(R.id.seekBarIncomeTax);
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                aFloat2 = (float) (progress *0.1);
                string2 = Float.toString(aFloat2);
                string2 = string2 + " %";
                textView2.setText(string2);
                ///textView2.setText("" + progress + "%");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        textView3 = (TextView) findViewById(R.id.wealthtaxvalue);
        seekBar3 = (SeekBar) findViewById(R.id.seekBarWealthTax);
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                aFloat3 = (float) (progress *0.1);
                string3 = Float.toString(aFloat3);
                string3 = string3 + " %";
                textView3.setText(string3);
                ///textView3.setText("" + progress + "%");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        textView4 = (TextView) findViewById(R.id.inflationvalue);
        seekBar4 = (SeekBar) findViewById(R.id.seekBarInflation);
        seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                aFloat4 = (float) (progress *0.1);
                string4 = Float.toString(aFloat4);
                string4 = string4 + " %";
                textView4.setText(string4);
                ///textView4.setText("" + progress + "%");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        textView5 = (TextView) findViewById(R.id.returnvalue);
        seekBar5 = (SeekBar) findViewById(R.id.seekBarReturn);
        seekBar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                aFloat5 = (float) (progress *0.1);
                string5 = Float.toString(aFloat5);
                string5 = string5 + " %";
                textView5.setText(string5);
                ///textView5.setText("" + progress + "%");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        input1 = (EditText) findViewById(R.id.age);
        input2 = (EditText) findViewById(R.id.wealth);
        input3 = (EditText) findViewById(R.id.netincome);
        input4 = (EditText) findViewById(R.id.targetincome);
        input5 = (SeekBar) findViewById(R.id.SeekBarIncome);
        input6 = (SeekBar) findViewById(R.id.seekBarIncomeTax);
        input7 = (SeekBar) findViewById(R.id.seekBarWealthTax);
        input8 = (SeekBar) findViewById(R.id.seekBarInflation);
        input9 = (SeekBar) findViewById(R.id.seekBarReturn);

        Button bt_calculate = (Button) findViewById(R.id.bt_calculate);
        tv_result1 = (TextView) findViewById(R.id.wealthresult);
        tv_result2 = (TextView) findViewById(R.id.ageresult);

        bt_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeCalculations();
            }
        });

    }

    private void makeCalculations() {
        if (input1.getText().toString().isEmpty() ||
                input2.getText().toString().isEmpty() ||
                input3.getText().toString().isEmpty() ||
                input4.getText().toString().isEmpty()) {
            ///tv_result1 = "";
            ///tv_result2 = "";
            return;
        }
        // I'm assuming you're getting numbers.
        double n1 = Double.valueOf(input1.getText().toString());
        double n2 = Double.valueOf(input2.getText().toString());
        double n3 = Double.valueOf(input3.getText().toString());
        double n4 = Double.valueOf(input4.getText().toString());
        double n5 = Double.valueOf(input5.getProgress());
        double n6 = Double.valueOf(input6.getProgress());
        double n7 = Double.valueOf(input7.getProgress());
        double n8 = Double.valueOf(input8.getProgress());
        double n9 = Double.valueOf(input9.getProgress());


        // Do your calculation here.
        // I'm assuming you have inserted the result on a variable called 'result'. Like: double result

        double result1 = n4 / (((n9/1000*(1-n6/1000))-n8/1000)*(1-n7/1000));
        double result2 = n1 + (Math.log((result1-n2)/n3)/Math.log(1+n5/1000+n9/1000-n8/1000-n7/1000));

        int result1a = (int) result1;
        int result2a = (int) result2;

        tv_result1.setText(result1a + " .-");
        tv_result2.setText(result2a + " Years");
    }
}
