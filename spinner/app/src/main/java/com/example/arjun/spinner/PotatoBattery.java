package com.example.arjun.spinner;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class PotatoBattery extends ActionBarActivity {
    private final String htmlText = "<body><p><h1>How to Make a Potato Battery.</p></h1><p> " +
            "" +
            "<p><h1><strong>Materials Needed: </h1></strong></p>" +
            "<p><form action=\"\">\n" +
            "  <input type=\"radio\" >&#9658; Two Potatoes<br>\n" +
            "   " +
            "  <p><input type=\"radio\" >&#9658;Two short pieces of heavy copper wire<br>\n" +
            "  " +
            "  <p><input type=\"radio\" >&#9658; Two common galvanized nails<br>\n" +
            "  <p><input type=\"radio\" >&#9658; Three alligator clip/wire units (alligator clips connected to each other with wire)<br>\n"+
            "  <p><input type=\"radio\" >&#9658; One simple low-voltage LED clock that functions from a 1- to 2-volt button-type battery<br>\n" +
            "</form>\n" +
            "\n " +
            "  </p> <img src=\"potato1\"  width=\"20\" height=\"20\"\"> " +
            "<p><strong><h1>What You Do:</h1> </strong></p> "
            +"<p><form action=\"\">\n" +
            "  <input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 1: </font><br>\n" +
            "<p>Remove the battery from the battery compartment of the clock. </p> "
            +"<input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 2: </font><br>\n" +
            "<p>  Make a note of which way around the positive (+) and a negative (-) points of the battery went.</p> "+
            "<input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 3: </font><br>\n" +
            "<p> Number the potatoes as one and two.</p> "+
            "<input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 4: </font><br>\n" +
            "<p> Insert one nail in each potato. </p> "+
            "<input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 5: </font><br>\n" +
            "<p> Insert one short piece of the copper wire into each potato as far away from the nail as possible.</p> "+
            "<input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 6: </font><br>\n" +
            "<p> Use one alligator clip to connect the copper wire in potato number one to the positive (+) terminal in the clock's battery compartment.</p> "+
            "<input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 7: </font><br>\n" +
            "<p>  Use one alligator clip to connect the nail in potato number two to the negative (-) terminal in the clock's battery compartment.\n</p> "
            +"<input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 8: </font><br>\n" +
            "<p> Use the third alligator clip to connect the nail in potato one to the copper wire in potato two and set the clock!</p> "
            +"</form>\n" +"<p><h1><strong>How the Potato Clock works:</h1></strong></p>" +"<p>A potato battery is an electrochemical battery, otherwise known as an electrochemical cell. An electrochemical cell is a cell in which chemical energy is converted to electric energy by a spontaneous electron transfer. In the case of the potato, the zinc in the nail reacts with the copper wire. The potato acts as a sort of buffer between the zinc ions and the copper ions. The zinc and copper ions would still react if they touched within the potato but they would only generate heat. Since the potato keeps them apart, the electron transfer has to take place over the copper wires of the circuit, which channels the energy into the clock. Presto! You have potato power.</p>"
            +"  <img src=\"potato\"  width=\"20\" height=\"20\"\"> ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potato_battery);
        TextView htmlTextView = (TextView)findViewById(R.id.textView3);
        htmlTextView.setText(Html.fromHtml(htmlText, new ImageGetter(), null));
    }
    private class ImageGetter implements Html.ImageGetter {

        public Drawable getDrawable(String source) {
            int id;
            if (source.equals("potato1")) {
                id = R.drawable.potato1;
            }

             else if (source.equals("potato")){
                id = R.drawable.potato;
            }
            else{
                return null;
            }


            Drawable d = getResources().getDrawable(id);
            d.setBounds(0,0,d.getIntrinsicWidth(),d.getIntrinsicHeight());
            return d;
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_potato_battery, menu);
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
