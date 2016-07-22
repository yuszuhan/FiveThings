package com.example.android.fivethings;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void step1(View view)
    {
        Toast.makeText(this, "step1", Toast.LENGTH_SHORT).show();

        CheckBox passport = (CheckBox) findViewById(R.id.passport);
        boolean haspassport = passport.isChecked();

        CheckBox visa = (CheckBox) findViewById(R.id.visa);
        boolean hasvisa = visa.isChecked();

        CheckBox ticket = (CheckBox) findViewById(R.id.ticket);
        boolean hasticket = ticket.isChecked();


        String travelmessage= "MUST bring：";
        travelmessage = travelmessage+ "\nPassort ? " + haspassport;
        travelmessage = travelmessage + "\nA visa ( if need ) ?" + hasvisa;
        travelmessage = travelmessage + "\nPassenger ticket ?" + hasticket;
        travelmessage = travelmessage + "\n首先帶著機票、護照(如果要去大陸得有台胞證或目的國簽證)、隨機托運的行李到機場的航空公司櫃檯辦理登機手續" ;
        travelmessage = travelmessage + "\nImportant!!!" ;
        travelmessage = travelmessage + "\n 1. 出國前請務必查清楚您將前往的國家簽證(VISA)問題，是免簽證、落地簽證，或是需要事先取得簽證" ;
        travelmessage = travelmessage + "\n 2. 您的護照還要注意有效期是6個月以上!" ;
        displayMessage(travelmessage);
    }

    public void step2(View view)
    {
        Toast.makeText(this, "step2", Toast.LENGTH_SHORT).show();
        String travelmessage= "How to do：";
        travelmessage = travelmessage + "\n將回程機票收入隨身背包內，然後拿著登機證、護照循著機場內的指示到達出境處" ;
        displayMessage(travelmessage);
    }

    public void step3(View view)
    {
        Toast.makeText(this, "step3", Toast.LENGTH_SHORT).show();
        String travelmessage= "Then：";
        travelmessage = travelmessage + "\n將登機證與護照交給入口處的航警檢查。然後就可進入出境大廳!" ;
        displayMessage(travelmessage);
    }

    public void step4(View view)
    {
        Toast.makeText(this, "step4", Toast.LENGTH_SHORT).show();
        String travelmessage= "Then：";
        travelmessage = travelmessage + "\n在出境大廳排隊等候出境管理人員查驗登機證、護照，待出境管理人員在登機證、護照上蓋上出境章與通過安檢門就可以出境!" ;
        displayMessage(travelmessage);
    }

    public void step5(View view)
    {
        Toast.makeText(this, "step5", Toast.LENGTH_SHORT).show();
        String travelmessage= "Then：";
        travelmessage = travelmessage + "\n經過行李檢查後，將護照收入隨身背包，然後拿著登機證按照機場內登機門的指示前往就可以找到登機門!" ;
        displayMessage(travelmessage);
    }

    public void contact(View view)
    {
        Toast.makeText(this, "Contact us :) ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent (Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Want to know more ");
        if(intent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(intent);
        }
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.information_text);
        priceTextView.setText(message);
    }



}