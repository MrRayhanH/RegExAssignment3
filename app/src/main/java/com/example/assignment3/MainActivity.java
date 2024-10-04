package com.example.assignment3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name , birthDate, gender, maritalStatus, nationality, address, phone, email;

        name = findViewById(R.id.et_name);
        birthDate = findViewById(R.id.et_dateofBirth);
        gender = findViewById(R.id.et_gender);
        maritalStatus = findViewById(R.id.et_Marital_Status);
        nationality = findViewById(R.id.et_Nationality);
        address = findViewById(R.id.et_Address);
        phone = findViewById(R.id.et_Phone_Number);
        email = findViewById(R.id.et_Email_Address);

        Button submit = findViewById(R.id.btn_Submit);

        submit.setOnClickListener(v -> {
            //Toast.makeText(MainActivity.this, " Submit button click", Toast.LENGTH_SHORT).show();
            String Name, BirthDate, Gender, MaritalStatus, Nationality, Address, Phone, Email;

            Name = name.getText().toString().trim();
            BirthDate = birthDate.getText().toString().trim();
            Gender = gender.getText().toString().trim();
            MaritalStatus = maritalStatus.getText().toString().trim();
            Nationality = nationality.getText().toString().trim();
            Address = address.getText().toString().trim();
            Phone = phone.getText().toString().trim();
            Email = email.getText().toString().trim();

            if(!Name.matches("[a-zA-Z0-9]{6,20}"))
            {
                Toast.makeText(MainActivity.this, "Username Must be 6 - 20 cherecter", Toast.LENGTH_SHORT).show();
            }
            else if(!BirthDate.matches("[0-9]{4}[./-]{1}[0-9]{1,2}[./-]{1}[0-9]{1,2}"))
            {
                Toast.makeText(MainActivity.this, "Birth Insert currect way", Toast.LENGTH_SHORT).show();
            }

            else if(!Gender.matches("[(male|female|Male|Female)]{4,6}"))
            {
                Toast.makeText(MainActivity.this, "male or female", Toast.LENGTH_SHORT).show();
            }

            else if(!MaritalStatus.matches("[(Marit|Unmarit|marit|unmarit)]{5,7}"))
            {
                Toast.makeText(MainActivity.this, "Marit or Unmarit", Toast.LENGTH_SHORT).show();
            }
            else if(!Nationality.matches("[a-zA-Z]{11}"))
            {
                Toast.makeText(MainActivity.this, "only Bangladeshi", Toast.LENGTH_SHORT).show();
            }
            else if(Address.isEmpty())
            {
                Toast.makeText(MainActivity.this, "Enter address", Toast.LENGTH_SHORT).show();
            }
            else if(!Phone.matches("[0][1]+[0-9]{9}"))
            {
                Toast.makeText(MainActivity.this, "Phone number is incorrect", Toast.LENGTH_SHORT).show();
            }
            else if(!Email.matches("[a-zA-Z0-9_\\-\\.]+[@][a-z]+[\\.][a-z.]{2,}"))
            {
                Toast.makeText(MainActivity.this, "Email is incorrect", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(MainActivity.this, "Your bio data insert successfuly", Toast.LENGTH_SHORT).show();
            }
        });

    }
}