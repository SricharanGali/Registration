package com.ts.placement.registration;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    RadioGroup rg1;
    RadioButton rb;
    EditText e1;
    EditText e2;
    CheckBox c1,c2,c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    public void name(View view)
    {
        Intent intent = new Intent(this,MainActivity2.class);
        e1 = (EditText) findViewById(R.id.editText);
        String msg = e1.getText().toString();
        intent.putExtra(" ",msg);
        startActivity(intent);
    }

    public void password(View view)
    {
        Intent intent = new Intent(this,MainActivity2.class);
        e1 = (EditText) findViewById(R.id.editText);
        String msg = e1.getText().toString();
        intent.putExtra(" ",msg);
        startActivity(intent);
    }

    public void radioButton(View view)
    {
        rg1= (RadioGroup)findViewById(R.id.rg);
        int id = rg1.getCheckedRadioButtonId();
        rb = (RadioButton)findViewById(id);
        String msg = rb.getText().toString();
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
    public void selectCourse()
    {
        c1 = (CheckBox)findViewById(R.id.checkBox);
        c2 = (CheckBox)findViewById(R.id.checkBox2);
        c3 = (CheckBox)findViewById(R.id.checkBox3);
        c4 = (CheckBox)findViewById(R.id.checkBox4);

        StringBuilder sb =
    }
}
