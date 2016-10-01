package com.example.farrukhs.s4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int quantity=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void increment (View view){

        quantity=quantity+1;
        display(quantity);

    }
    public void decrement (View view){

        quantity=quantity-1;
        display(quantity);

    }

    public void display(int number){

        TextView value=(TextView)findViewById(R.id.valuetext);
        value.setText(""+number);

    }
    public  void submitoder(View view){
            String x="Free $"+(quantity*5);
        displayMessage(x);
    }
    public void displayprice(int number){

        TextView value=(TextView)findViewById(R.id.prizevalue);
        value.setText(""+number);

    }

   public void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.prizevalue);
        priceTextView.setText(message);
    }



}
