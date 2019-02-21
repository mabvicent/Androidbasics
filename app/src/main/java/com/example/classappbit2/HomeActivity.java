package com.example.classappbit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    Button press;
    TextView output;
    ImageView myimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home );
        myimage = findViewById( R.id.imageView1 );



        press = findViewById( R.id.button );
        output = findViewById( R.id.textView );

        press.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] numbers = new int[]{
                        3,2,4
                };
                double average = getAverage(numbers);

                output.setText( "Average"+average );

            }
        } );
    }

    private double getAverage(int[] numbers) {
        int sum = 0;
        for(int i=0;i<numbers.length;i++){
            sum = numbers[i];
        }
        double result = (double)sum/numbers.length;
        return result;
    }

}
