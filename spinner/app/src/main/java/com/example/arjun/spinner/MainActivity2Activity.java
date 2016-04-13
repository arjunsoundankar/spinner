package com.example.arjun.spinner;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity2Activity extends ActionBarActivity {
    String[] myitem={" 1> Make Your Own Electricity","2> Potato Battery",""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        populatelist();
    }
    void populatelist(){

        //Build Adapter
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.da_item,myitem);
        ListView list=(ListView)findViewById(R.id.listView);
        list.setAdapter(adapter);
        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String cities = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity2Activity.this, cities, Toast.LENGTH_LONG).show();

                        if (position == 0) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(),MakeYourElect.class);
                            startActivityForResult(myIntent, 0);


                        }
                        else if (position == 1) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(),PotatoBattery.class);
                            startActivityForResult(myIntent, 0);


                        }
                    }


                });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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
