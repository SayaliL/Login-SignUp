package com.example.ppb1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class SignUpActivity extends AppCompatActivity {

    Spinner spCountry;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        spCountry = findViewById(R.id.spCountry);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        final ArrayList<String> s1 = new ArrayList<>();
        s1.add("Afghanistan");
        s1.add("Albania");
        s1.add("Algeria");
        s1.add("Andorra");
        s1.add("Angola");
        s1.add("Antigua and Barbuda");
        s1.add("Argentina");
        s1.add("Armenia");
        s1.add("Australia");
        s1.add("Austria");
        s1.add("Azerbaijan");
        s1.add("Bahamas");
        s1.add("Bahrain");
        s1.add("Bangladesh");
        s1.add("Barbados");
        s1.add("Belarus");
        s1.add("Begium");
        s1.add("Belize");
        s1.add("Benin");
        s1.add("Bhutan");
        s1.add("Bolivia");
        s1.add("Bosnia and Herzegovina");
        s1.add("Botswana");
        s1.add("Brazil");
        s1.add("Brunei");
        s1.add("Bulgaria");
        s1.add("Burkina Faso");
        s1.add("Burundi");
        s1.add("Cabo Verde");
        s1.add("Cambodia");
        s1.add("Cameroon");
        s1.add("Canada");
        s1.add("Central African Republic(CAR)");
        s1.add("Chad");
        s1.add("Chile");
        s1.add("China");
        s1.add("Colombia");
        s1.add("Comoros");
        s1.add("Democratic Republic of the Congo");
        s1.add("Republic of Congo");
        s1.add("Costa Rica");
        s1.add("Cote d'Ivoire");
        s1.add("Croatia");
        s1.add("Cuba");
        s1.add("Cyprus");
        s1.add("Czech Republic");
        s1.add("Denmark");
        s1.add("Djibouti");
        s1.add("Dominica");
        s1.add("Dominican republic");
        s1.add("Ecuador");
        s1.add("Egypt");
        s1.add("El Salvador");
        s1.add("Equatorial Guinea");
        s1.add("Eritrea");
        s1.add("Estonia");
        s1.add("Ethiopia");
        s1.add("Fiji");
        s1.add("Finland");
        s1.add("France");
        s1.add("Gabon");
        s1.add("Gambia");
        s1.add("Georgia");
        s1.add("Germany");
        s1.add("Ghana");
        s1.add("Greece");
        s1.add("Grenada");
        s1.add("Guatemala");
        s1.add("Guinea");
        s1.add("Guinea-Bissau");
        s1.add("Guyana");
        s1.add("Haiti");
        s1.add("Honduras");
        s1.add("Hungary");
        s1.add("Iceland");
        s1.add("India");
        s1.add("Indonesia");
        s1.add("Iran");
        s1.add("Ireland");
        s1.add("Israel");
        s1.add("Italy");
        s1.add("Jamaica");
        s1.add("Japan");
        s1.add("Jordan");
        s1.add("Kazakhstan");
        s1.add("Kenya");
        s1.add("Kiribati");
        s1.add("Kosovo");
        s1.add("Kuwait");
        s1.add("Kyrgyzstan");
        s1.add("Laos");
        s1.add("Lativa");
        s1.add("Lebanon");
        s1.add("Lesotho");

        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item, s1);

        spCountry.setAdapter(arrayAdapter1);

    }
}