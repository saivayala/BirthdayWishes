package com.example.sai8s.birthdaywishes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private Button button;
   private  EditText edt;
   String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btncreate);
        edt=findViewById(R.id.etname);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGreeting();
            }
        });
    }


   public void openGreeting(){
       Intent intent= new Intent(this,Greeting.class);
       name=edt.getText().toString();
       intent.putExtra("value",name);
       startActivity(intent);
       finish();//it is not mandatory it will finish the first activity after calling second activity
   }
}
