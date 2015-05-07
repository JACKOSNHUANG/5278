package com.example.user.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    private Button button,button2,button3,button4,button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void Plan(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Plan.class);//切換到別的頁面
        startActivity(intent);

    }
    public void Promise(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Promise.class);//切換到別的頁面
        startActivity(intent);

    }
    public void Record(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Record.class);//切換到別的頁面
        startActivity(intent);

    }
    public void Set(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Set.class);//切換到別的頁面
        startActivity(intent);

    }
    public void Trane(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Trane.class);//切換到別的頁面
        startActivity(intent);

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
