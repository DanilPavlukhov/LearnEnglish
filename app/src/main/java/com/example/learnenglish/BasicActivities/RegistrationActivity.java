package com.example.learnenglish.BasicActivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.learnenglish.R;
import com.example.learnenglish.fireBaseController.Controller;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

public class RegistrationActivity extends AppCompatActivity {
    EditText newEditUser,newEditEmail,newEditPassword;
    Button regist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Controller controller = new Controller();
        if(controller.isRegistration()){
            startActivity(new Intent(RegistrationActivity.this, MainActivity.class));
        }

        setContentView(R.layout.activity_regestrarion);
        newEditUser = findViewById(R.id.newUserEdit);
        newEditEmail = findViewById(R.id.newEmailEdit);
        newEditPassword = findViewById(R.id.newPasswordEdit);
        regist = findViewById(R.id.registButton);



        regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = newEditUser.getText().toString();
                String email = newEditEmail.getText().toString();
                String password = newEditPassword.getText().toString();
                controller.registrationNewUser(email, password, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(RegistrationActivity.this
                                    ,controller.getUser().getEmail(),Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(RegistrationActivity.this,MainActivity.class));
                        }
                        else Toast.makeText(RegistrationActivity.this,task.getException().
                                getMessage(),Toast.LENGTH_SHORT).show();

                    }
                });


            }
        });
    }
}