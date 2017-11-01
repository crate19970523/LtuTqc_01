package com.example.suzumiya.ltutqc_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userMony, userYear,userDeposit;
    TextView ans;
    int mony,year,deposit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void enterOnClick(View view) {
        findView();
        get();
        int a=(mony*(year+1)^deposit);
        ans.setText(a);
    }

    public void get()
    {
        mony= Integer.parseInt(userMony.getText().toString());
        year= Integer.parseInt(userYear.getText().toString());
        deposit= Integer.parseInt(userDeposit.getText().toString());
    }

    public void findView()
    {
        userMony=findViewById(R.id.userMony);
        userYear=findViewById(R.id.userYear);
        userDeposit=findViewById(R.id.userDeposit);
        ans=findViewById(R.id.ans);
    }
}
