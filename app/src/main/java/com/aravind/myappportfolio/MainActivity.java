package com.aravind.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void sendMessage(View view)
    {
        String text = "";
        switch (view.getId()){
            case R.id.button:
                text="This button will launch my spotify app";
                break;
            case R.id.button2:
                text="This button will launch my bacon reader app";
                break;
            case R.id.button3:
                text="This button will launch my build it app";
                break;
            case R.id.button4:
                text="This button will launch my scores app";
                break;
            case R.id.button5:
                text="This button will launch my library app";
                break;
            case R.id.button6:
                text="This button will launch my capstone project app";
                break;
        }
        Toast toast = Toast.makeText(getApplicationContext(),text, Toast.LENGTH_SHORT);
        toast.show();
    }

}
