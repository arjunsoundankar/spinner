package com.example.arjun.spinner;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MakeYourElect extends ActionBarActivity {
    private final String htmlText = "<body><p><h1>Power a Light with Static Electricity - Use static electricity to light up a fluorescent light bulb.</p></h1><p> " +
            "" +
            "<p><h1><strong>Materials Needed: </h1></strong></p>" +
            "<p><form action=\"\">\n" +
            "  <input type=\"radio\" >&#9658; Plastic comb<br>\n" +
            "   " +
            "  <p><input type=\"radio\" >&#9658; Hair<br>\n" +
            "  " +
            "  <p><input type=\"radio\" >&#9658; Fluorescent light bulb<br>\n" +
            "</form>\n" +
            "\n " +
            "  </p> <img src=\"make-electricity-fifth-slide\"  width=\"20\" height=\"20\"\"> " +
           "<p><strong><h1>What You Do:</h1> </strong></p> "
            +"<p><form action=\"\">\n" +
            "  <input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 1: </font><br>\n" +
            "<p>Tell your child to rub a comb through her hair. The friction between her hair and the comb will cause electrons to \"jump\" from her hair to the comb. </p> "
            +"<input type=\"radio\" ><font size=\"10\" color=\"blue\">&#9658; Step 2: </font><br>\n" +
            "<p>If your child then touches the comb to the end of a fluorescent light bulb, the charged comb will discharge into the light bulb causing the bulb to emit small pulses of light. This action will generate a great deal of excitement especially if conducted in a darkened room. </p> "
            +"</form>\n" +"<p><h1><strong>What Happened?</h1></strong></p>" +"<p>More than likely your child  will want know why this happens. Tell her that static electricity occurs, for example, when she rubs a balloon on her shirt (you might wish to actually try this). The friction between the cloth and the balloon causes negatively charged particles (electrons) to transfer from her shirt to the balloon. The shirt then has an overall positive charge because it has more protons than electrons. The balloon takes on a negative charge because it has extra negative charges (electrons). The balloon will then stick to the shirt or to another surface, such as a wall.\n" +
            "\nStatic electricity has many uses in homes, businesses, and industries. For example, the copying machines found in most offices are electrostatic copiers. They make duplicates of pictures or written documents by attracting negatively charged particles of toner (powdered ink) to positively charged paper.</p>";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_your_elect);
        TextView htmlTextView = (TextView)findViewById(R.id.textView3);
        htmlTextView.setText(Html.fromHtml(htmlText, new ImageGetter(), null));
    }
    private class ImageGetter implements Html.ImageGetter {

        public Drawable getDrawable(String source) {
            int id;
            if (source.equals("make-electricity-fifth-slide")) {
                id = R.drawable.comb;
            }

            else {
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
        getMenuInflater().inflate(R.menu.menu_make_your_elect, menu);
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
