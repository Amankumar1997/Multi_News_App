package com.example.multinews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {
ImageView buttonsignup1,login;
    EditText confirmpasswordsignuptext,passwordsignuptext,emailsignuptext,namesignuptext;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

                super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        login=findViewById(R.id.buttonloginbackto);
        buttonsignup1=findViewById(R.id.buttonsignup1);
        namesignuptext=findViewById(R.id.namesignuptext);
        confirmpasswordsignuptext=findViewById(R.id.confirmpasswordsignuptext);
        passwordsignuptext=findViewById(R.id.passwordsignuptext);
        emailsignuptext=findViewById(R.id.emailsignuptext);

        firebaseAuth=FirebaseAuth.getInstance();


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });





        buttonsignup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=emailsignuptext.getText().toString();
                String password=passwordsignuptext.getText().toString();
                String password1=confirmpasswordsignuptext.getText().toString();
                String name=namesignuptext.getText().toString();


                if(name.matches(""))
                {
                    Toast.makeText(SignUpActivity.this, "enter name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(name.matches("[a-zA-Z]+"))
                {
                    Toast.makeText(SignUpActivity.this, "enter valid name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(email.matches(""))
                {
                    Toast.makeText(SignUpActivity.this, "enter email", Toast.LENGTH_SHORT).show();
                }
                if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
                {
                    Toast.makeText(SignUpActivity.this, "enter valid email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(password.isEmpty())
                {
                    Toast.makeText(SignUpActivity.this, "fill the pasword", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(password.length()<6)
                {
                    Toast.makeText(SignUpActivity.this, "maximam lenght ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(password1.isEmpty())
                {
                    Toast.makeText(SignUpActivity.this, "please enter confirm password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!password1.equals(password))
                {
                    Toast.makeText(SignUpActivity.this, "please enter same password", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(!password.matches(password1))
                {
                    Toast.makeText(SignUpActivity.this, " enter same pasword", Toast.LENGTH_SHORT).show();
                    return;
                }


                firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {


                        if(!task.isSuccessful())
                        {
                            Toast.makeText(SignUpActivity.this, "", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            startActivity(new Intent(SignUpActivity.this,MainActivity.class));
                        }

                    }
                });















                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);

            }

        });


//        firebaseAuth.createUserWithEmailAndPassword().addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//
//
//                           if(!task.isSuccessful())
//                           {
//                               Toast.makeText(SignUpActivity.this, "", Toast.LENGTH_SHORT).show();
//                           }
//                           else
//                           {
//                               startActivity(new Intent(SignUpActivity.this,MainActivity.class));
//                           }
//
//                    }
//                });
            }




//        buttonsignup1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name=namesignuptext.getText().toString(),email=emailsignuptext.getText().toString(),password=passwordsignuptext.getText().toString(),password2=confirmpasswordsignuptext.getText().toString();
//                if(name.isEmpty() && email.isEmpty() && password.isEmpty() && password2.isEmpty())
//                {
//                    Toast.makeText(SignUpActivity.this, "please fill all requirement", Toast.LENGTH_SHORT).show();
//                }
//                else {
//                    Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
//                    startActivity(intent);
//                }
//            }
//        });


    }
