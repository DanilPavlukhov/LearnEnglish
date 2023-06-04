package com.example.learnenglish.fireBaseController;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Controller {
    private final FirebaseAuth auth;

    public Controller() {
        auth = FirebaseAuth.getInstance();
    }
    public boolean isRegistration(){
        return auth.getCurrentUser() != null;
    }
    public FirebaseUser getUser(){
        return auth.getCurrentUser();
    }
    public void registrationNewUser(String email, String password, OnCompleteListener<AuthResult> listener){
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(listener);
    }
}
