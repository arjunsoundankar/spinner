package com.example.arjun.spinner;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.view.View.OnClickListener;

import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Spinner;



public class MainActivity extends ActionBarActivity {

    Button button;
    Spinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

//Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.fragment_main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;
        spinner1 = (Spinner) findViewById(R.id.spinner1);

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if(String.valueOf(spinner1.getSelectedItem()).equals("Forth Standard")) {
                    Intent intent = new Intent(context, MainActivity2Activity.class);
                    startActivity(intent);
                }
                else if(String.valueOf(spinner1.getSelectedItem()).equals("Fifth Standard")) {
                    Intent intent = new Intent(context, MainActivity22Activity.class);
                    startActivity(intent);
                }

            }

        });
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
