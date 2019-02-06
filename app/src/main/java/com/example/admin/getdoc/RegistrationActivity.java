package com.example.admin.getdoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity
{
    EditText edt1,edt2,edt3,edt4,edt5,edt6,edt7,edt8;
    TextView txt1;
    RadioButton rd1,rd2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
     {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_registration);
         edt1=(EditText)findViewById(R.id.edt1);
        edt2=(EditText)findViewById(R.id.edt2);
        edt3=(EditText)findViewById(R.id.edt3);
        edt4=(EditText)findViewById(R.id.edt4);
        edt5=(EditText)findViewById(R.id.edt5);
        edt6=(EditText)findViewById(R.id.edt6);
        edt7=(EditText)findViewById(R.id.edt7);
        edt8=(EditText)findViewById(R.id.edt8);
        txt1=(TextView)findViewById(R.id.txt1);
        rd1 =(RadioButton)findViewById(R.id.rd1);
        rd2 =(RadioButton)findViewById(R.id.rd2);
        btn1 =(Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(),"Registration Successfullly",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(i);
            }
        });

     }
}
