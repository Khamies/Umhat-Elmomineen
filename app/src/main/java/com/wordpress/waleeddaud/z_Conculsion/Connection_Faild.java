package com.wordpress.waleeddaud.z_Conculsion;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.wordpress.waleeddaud.R;

public class Connection_Faild extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Bundle bundle=getIntent().getExtras();
        final int selector=bundle.getInt("selector");
        final String web_1=bundle.getString("khadija");
        /////////////////////////////////////////
        final String web_2=bundle.getString("sawda");
        final String web_3=bundle.getString("Isha");
        final String web_4=bundle.getString("Hafsa");
        final String web_5=bundle.getString("Zainab_1");
        final String web_6=bundle.getString("Umsalama");
        final String web_7=bundle.getString("Zainab_2");
        final String web_8=bundle.getString("Gawiria");
        final String web_9=bundle.getString("Safiia");
        final String web_10=bundle.getString("Rammla");
        final String web_11=bundle.getString("Mimona");
        final String web_12=bundle.getString("Site1");
        final String web_13=bundle.getString("Site2");
        final String web_14=bundle.getString("Site3");


        Display display=((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
        int orientation=display.getRotation();

        if (orientation== Surface.ROTATION_90||orientation==Surface.ROTATION_270)
        {   setContentView(R.layout.connection_faild2);

            switch (selector) {


                case 1:

                    Button button=(Button) findViewById(R.id.Reload);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("khadija", web_1);
                            startActivity(intent);

                        }
                    });

                    break;
                case 2:

                    Button button2=(Button) findViewById(R.id.Reload);
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("sawda", web_2);
                            startActivity(intent);

                        }
                    });

                    break;
                case 3:
                    Button button3=(Button) findViewById(R.id.Reload);
                    button3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Isha", web_3);
                            startActivity(intent);

                        }
                    });

                    break;
                case 4:
                    Button button4=(Button) findViewById(R.id.Reload);
                    button4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Hafsa", web_4);
                            startActivity(intent);

                        }
                    });

                    break;
                case 5:
                    Button button5=(Button) findViewById(R.id.Reload);
                    button5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Zainab_1", web_5);
                            startActivity(intent);

                        }
                    });


                    break;
                case 6:
                    Button button6=(Button) findViewById(R.id.Reload);
                    button6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Umsalama", web_6);
                            startActivity(intent);

                        }
                    });

                    break;
                case 7:
                    Button button7=(Button) findViewById(R.id.Reload);
                    button7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Zainab_2", web_7);
                            startActivity(intent);

                        }
                    });

                    break;
                case 8:
                    Button button8=(Button) findViewById(R.id.Reload);
                    button8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Gawiria", web_8);
                            startActivity(intent);

                        }
                    });

                    break;
                case 9:
                    Button button9=(Button) findViewById(R.id.Reload);
                    button9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Safiia", web_9);
                            startActivity(intent);

                        }
                    });

                    break;
                case 10:
                    Button button10=(Button) findViewById(R.id.Reload);
                    button10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Rammla", web_10);
                            startActivity(intent);

                        }
                    });

                    break;
                case 11:
                    Button button11=(Button) findViewById(R.id.Reload);
                    button11.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Mimona", web_11);
                            startActivity(intent);

                        }
                    });

                    break;
                case 12:
                    Button button12=(Button) findViewById(R.id.Reload);
                    button12.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Site1", web_12);
                            startActivity(intent);

                        }
                    });

                    break;
                case 13:
                    Button button13=(Button) findViewById(R.id.Reload);
                    button13.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Site2", web_13);
                            startActivity(intent);

                        }
                    });

                    break;
                case 14:
                    Button button14=(Button) findViewById(R.id.Reload);
                    button14.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Site3", web_14);
                            startActivity(intent);

                        }
                    });

                    break;
            }


        }


        //////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////
        else { setContentView(R.layout.connection__faild);

            switch (selector) {


                case 1:

                    Button button=(Button) findViewById(R.id.Reload);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("khadija", web_1);
                            startActivity(intent);

                        }
                    });

                    break;
                case 2:

                    Button button2=(Button) findViewById(R.id.Reload);
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("sawda", web_2);
                            startActivity(intent);

                        }
                    });

                    break;
                case 3:
                    Button button3=(Button) findViewById(R.id.Reload);
                    button3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Isha", web_3);
                            startActivity(intent);

                        }
                    });

                    break;
                case 4:
                    Button button4=(Button) findViewById(R.id.Reload);
                    button4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Hafsa", web_4);
                            startActivity(intent);

                        }
                    });

                    break;
                case 5:
                    Button button5=(Button) findViewById(R.id.Reload);
                    button5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Zainab_1", web_5);
                            startActivity(intent);

                        }
                    });


                    break;
                case 6:
                    Button button6=(Button) findViewById(R.id.Reload);
                    button6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Umsalama", web_6);
                            startActivity(intent);

                        }
                    });

                    break;
                case 7:
                    Button button7=(Button) findViewById(R.id.Reload);
                    button7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Zainab_2", web_7);
                            startActivity(intent);

                        }
                    });

                    break;
                case 8:
                    Button button8=(Button) findViewById(R.id.Reload);
                    button8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Gawiria", web_8);
                            startActivity(intent);

                        }
                    });

                    break;
                case 9:
                    Button button9=(Button) findViewById(R.id.Reload);
                    button9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Safiia", web_9);
                            startActivity(intent);

                        }
                    });

                    break;
                case 10:
                    Button button10=(Button) findViewById(R.id.Reload);
                    button10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Rammla", web_10);
                            startActivity(intent);

                        }
                    });

                    break;
                case 11:
                    Button button11=(Button) findViewById(R.id.Reload);
                    button11.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Mimona", web_11);
                            startActivity(intent);

                        }
                    });

                    break;
                case 12:
                    Button button12=(Button) findViewById(R.id.Reload);
                    button12.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Site1", web_12);
                            startActivity(intent);

                        }
                    });

                    break;
                case 13:
                    Button button13=(Button) findViewById(R.id.Reload);
                    button13.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Site2", web_13);
                            startActivity(intent);

                        }
                    });

                    break;
                case 14:
                    Button button14=(Button) findViewById(R.id.Reload);
                    button14.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            finish();
                            Intent intent = new Intent(Connection_Faild.this, Check_Connection.class);
                            intent.putExtra("selector", selector);
                            intent.putExtra("Site3", web_14);
                            startActivity(intent);

                        }
                    });

                    break;
            }


        }


    }




    @Override
    public void finish() {
        super.finish();

        overridePendingTransition(R.animator.slide_in_right, R.animator.slide_out_right);
    }

}
