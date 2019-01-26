package com.wordpress.waleeddaud.z_Conculsion;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wordpress.waleeddaud.R;

public class Contact_us extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        final EditText editText=(EditText)findViewById(R.id.editText_title);
        final EditText editText2=(EditText)findViewById(R.id.editText_subject);
        Button send_button=(Button) findViewById(R.id.send);

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                editText.setHint("الموضوع");
            }
        });


        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                editText2.setHint("عبر عن رأيك");
            }
        });



        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String subject=editText.getText().toString();
                String text=editText2.getText().toString();
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"hyberthread@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,subject);
                intent.putExtra(Intent.EXTRA_TEXT,text);

                try {
                    startActivity(Intent.createChooser(intent," أرسل ب..."));
                } catch (android.content.ActivityNotFoundException Error) {
                    Toast.makeText(Contact_us.this,"لايوجد لديك بريد الكتروني  ",Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    @Override
    public void finish() {
        super.finish();

        overridePendingTransition(R.animator.slide_in_right, R.animator.slide_out_right);
    }


}
