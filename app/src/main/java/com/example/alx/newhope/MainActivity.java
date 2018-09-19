package com.example.alx.newhope;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    TextView user_name ;
    TextView user_password ;
    TextView error_massage;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_name = findViewById(R.id.TV_username);
        user_password = findViewById(R.id.TV_password);
        btn_login = findViewById(R.id.BTN_Login);
        error_massage = findViewById(R.id.TV_error_login);

        error_massage.setVisibility(View.INVISIBLE);

        final Intent dashboard  = new Intent(this , Dashboard.class);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(user_name.getText().toString().equals("admin") && user_password.getText().toString().equals("password"))
                {
                    startActivity(dashboard);
                }
                else
                    error_massage.setVisibility(View.VISIBLE);

            }
        });

    }
}
