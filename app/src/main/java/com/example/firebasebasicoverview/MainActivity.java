package com.example.firebasebasicoverview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("Users");

        //sent data by object
        UserData userData = new UserData("Karim","29");
        databaseReference.setValue(userData);

//        //sent data by hashmap
//        HashMap<String,String> hashMap = new HashMap<>();
//        hashMap.put("Team","Brazil");
//        hashMap.put("Club","Barcelona");
//        databaseReference.setValue(hashMap);

    }
}
