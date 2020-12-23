package com.example.multinews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
EditText emailText,passwordText;
ImageView buttonlogin,buttonforgetpassword,buttonsignup,buttonloginbackto,skip;
TextView text1,text2,text3,text4;
FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailText=findViewById(R.id.emailtext);
        passwordText=findViewById(R.id.Passwordtext);


        buttonlogin=findViewById(R.id.buttonlogin);
        buttonforgetpassword=findViewById(R.id.buttonforgetpassword);
        buttonsignup=findViewById(R.id.buttonsignup);

        buttonloginbackto=findViewById(R.id.buttonloginbackto);

        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        text3=findViewById(R.id.text3);
        text4=findViewById(R.id.text4);

        skip=findViewById(R.id.idskip);



        firebaseAuth=FirebaseAuth.getInstance();


skip.setOnClickListener(new View.OnClickListener() {  //switch ho gya acount sign up wale par
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,HomePage.class);
                startActivity(intent);
            }
        });



        buttonlogin.setOnClickListener(new View.OnClickListener() {   // hum home page par pahunch gye
           @Override
           public void onClick(View view) {
               String email=emailText.getText().toString(),pasword =passwordText.getText().toString();
               firebaseAuth=FirebaseAuth.getInstance();
               if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
               {
                   Toast.makeText(MainActivity.this, "enter valid email", Toast.LENGTH_SHORT).show();
                   return;
               }
             if(pasword.isEmpty())
             {
                 Toast.makeText(MainActivity.this, "please enter password", Toast.LENGTH_SHORT).show();
                 return;
             }
             if(pasword.length()<6)
             {
                 Toast.makeText(MainActivity.this, "please enter valid password", Toast.LENGTH_SHORT).show();
                 return;
             }
             firebaseAuth.signInWithEmailAndPassword(email,pasword).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                 @Override
                 public void onComplete(@NonNull Task<AuthResult> task) {
                     if(!task.isSuccessful())
                     {
                         Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                     }
                     else
                     {
                         Intent it=new Intent(MainActivity.this,HomePage.class);
                         startActivity(it);
                     }

                 }
             });


           }
       });



       buttonsignup.setOnClickListener(new View.OnClickListener() {  //switch ho gya acount sign up wale par
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(MainActivity.this,SignUpActivity.class);
               startActivity(intent);
           }
       });





    }

}