package com.wordpress.waleeddaud.z_Conculsion;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import com.wordpress.waleeddaud.R;


public class Check_Connection extends ActionBarActivity {
        public  static  int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check__connection);

        Bundle bundle = getIntent().getExtras();
        final int number = bundle.getInt("selector");
        final String site1 = bundle.getString("khadija");
        final String site2 = bundle.getString("sawda");
        final String site3 = bundle.getString("Isha");
        final String site4 = bundle.getString("Hafsa");
        final String site5 = bundle.getString("Zainab_1");
        final String site6 = bundle.getString("Umsalama");
        final String site7 = bundle.getString("Zainab_2");
        final String site8 = bundle.getString("Gawiria");
        final String site9 = bundle.getString("Safiia");
        final String site10 = bundle.getString("Rammla");
        final String site11 = bundle.getString("Mimona");
        final String site12 = bundle.getString("Site1");
        final String site13 = bundle.getString("Site2");
        final String site14 = bundle.getString("Site3");


        ConnectivityManager check = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo[] networkInfo = check.getAllNetworkInfo();

        for (int i = 0; i < networkInfo.length; i++) {
            if (networkInfo[i].getState() == NetworkInfo.State.CONNECTED) {
                count++;
            }
        }

        if (count > 0) {
            count = 0;
            switch (number) {
                case 1:
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent = new Intent(Check_Connection.this, Nablsi_website.class);
                            intent.putExtra("selector", number);
                            intent.putExtra("khadija", site1);
                            startActivity(intent);
                        }
                    }, 2000);
                    break;
                case 2:
                    Handler handler2 = new Handler();
                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent = new Intent(Check_Connection.this, Nablsi_website.class);
                            intent.putExtra("selector", number);
                            intent.putExtra("sawda", site2);
                            startActivity(intent);
                        }
                    }, 2000);
                    break;
                case 3:
                    Handler handler3 = new Handler();
                    handler3.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent = new Intent(Check_Connection.this, Nablsi_website.class);
                            intent.putExtra("selector", number);
                            intent.putExtra("Isha", site3);
                            startActivity(intent);
                        }
                    }, 2000);
                    break;
                case 4:
                    Handler handler4 = new Handler();
                    handler4.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent = new Intent(Check_Connection.this, Nablsi_website.class);
                            intent.putExtra("selector", number);
                            intent.putExtra("Hafsa", site4);
                            startActivity(intent);
                        }
                    }, 2000);
                    break;
                case 5:
                    Handler handler5 = new Handler();
                    handler5.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent = new Intent(Check_Connection.this, Nablsi_website.class);
                            intent.putExtra("selector", number);
                            intent.putExtra("Zainab_1", site5);
                            startActivity(intent);
                        }
                    }, 2000);
                    break;
                case 6:
                    Handler handler6 = new Handler();
                    handler6.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent = new Intent(Check_Connection.this, Nablsi_website.class);
                            intent.putExtra("selector", number);
                            intent.putExtra("Umsalama", site6);
                            startActivity(intent);
                        }
                    }, 2000);
                    break;
                case 7:
                    Handler handler7 = new Handler();
                    handler7.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent = new Intent(Check_Connection.this, Nablsi_website.class);
                            intent.putExtra("selector", number);
                            intent.putExtra("Zainab_2", site7);
                            startActivity(intent);
                        }
                    }, 2000);
                    break;
                case 8:
                    Handler handler8 = new Handler();
                    handler8.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent = new Intent(Check_Connection.this, Nablsi_website.class);
                            intent.putExtra("selector", number);
                            intent.putExtra("Gawiria", site8);
                            startActivity(intent);
                        }
                    }, 2000);
                    break;
                case 9:
                    Handler handler9 = new Handler();
                    handler9.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent = new Intent(Check_Connection.this, Nablsi_website.class);
                            intent.putExtra("selector", number);
                            intent.putExtra("Safiia", site9);
                            startActivity(intent);
                        }
                    }, 2000);
                    break;
                case 10:
                    Handler handler10 = new Handler();
                    handler10.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent = new Intent(Check_Connection.this, Nablsi_website.class);
                            intent.putExtra("selector", number);
                            intent.putExtra("Rammla", site10);
                            startActivity(intent);
                        }
                    }, 2000);
                    break;
                case 11:
                    Handler handler11 = new Handler();
                    handler11.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent = new Intent(Check_Connection.this, Nablsi_website.class);
                            intent.putExtra("selector", number);
                            intent.putExtra("Mimona", site11);
                            startActivity(intent);
                        }
                    }, 2000);
                    break;
                case 12:
                    Handler handler12 = new Handler();
                    handler12.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent = new Intent(Check_Connection.this, Nablsi_website.class);
                            intent.putExtra("selector", number);
                            intent.putExtra("Site1", site12);
                            startActivity(intent);
                        }
                    }, 2000);
                    break;
                case 13:
                    Handler handler13 = new Handler();
                    handler13.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent = new Intent(Check_Connection.this, Nablsi_website.class);
                            intent.putExtra("selector", number);
                            intent.putExtra("Site2", site13);
                            startActivity(intent);
                        }
                    }, 2000);
                    break;
                case 14:
                    Handler handler14 = new Handler();
                    handler14.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent = new Intent(Check_Connection.this, Nablsi_website.class);
                            intent.putExtra("selector", number);
                            intent.putExtra("Site3", site14);
                            startActivity(intent);
                        }
                    }, 2000);
                    break;
            }


        } else {
            switch (number) {
                case 1:

                    Handler handler=new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            finish();
                            Intent intent = new Intent(Check_Connection.this, Connection_Faild.class);
                            intent.putExtra("selector", number);
                            intent.putExtra("khadija", site1);
                            startActivity(intent);

                        }
                    }, 2000);


                    break;
                case 2:


                    Handler handler2=new Handler();
                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent2 = new Intent(Check_Connection.this, Connection_Faild.class);
                            intent2.putExtra("selector", number);
                            intent2.putExtra("sawda", site2);
                            startActivity(intent2);

                        }
                    }, 2000);



                    break;
                case 3:

                    Handler handler3=new Handler();
                    handler3.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            finish();
                            Intent intent3 = new Intent(Check_Connection.this, Connection_Faild.class);
                            intent3.putExtra("selector", number);
                            intent3.putExtra("Isha", site3);
                            startActivity(intent3);


                        }
                    }, 2000);

                    break;
                case 4:


                    Handler handler4=new Handler();
                    handler4.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            finish();
                            Intent intent4 = new Intent(Check_Connection.this, Connection_Faild.class);
                            intent4.putExtra("selector", number);
                            intent4.putExtra("Hafsa", site4);
                            startActivity(intent4);


                        }
                    }, 2000);


                    break;
                case 5:

                    Handler handler5=new Handler();
                    handler5.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent5 = new Intent(Check_Connection.this, Connection_Faild.class);
                            intent5.putExtra("selector", number);
                            intent5.putExtra("Zainab_1", site5);
                            startActivity(intent5);


                        }
                    }, 2000);


                    break;
                case 6:

                    Handler handler6=new Handler();
                    handler6.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent6 = new Intent(Check_Connection.this, Connection_Faild.class);
                            intent6.putExtra("selector", number);
                            intent6.putExtra("Umsalama", site6);
                            startActivity(intent6);


                        }
                    }, 2000);



                    break;
                case 7:

                    Handler handler7=new Handler();
                    handler7.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent7 = new Intent(Check_Connection.this, Connection_Faild.class);
                            intent7.putExtra("selector", number);
                            intent7.putExtra("Zainab_2", site7);
                            startActivity(intent7);
                        }
                    }, 2000);



                    break;
                case 8:

                    Handler handler8=new Handler();
                    handler8.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            Intent intent8 = new Intent(Check_Connection.this, Connection_Faild.class);
                            intent8.putExtra("selector", number);
                            intent8.putExtra("Gawiria", site8);
                            startActivity(intent8);
                        }
                    }, 2000);



                    break;
                case 9:

                    Handler handler9=new Handler();
                    handler9.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            finish();
                            Intent intent9 = new Intent(Check_Connection.this, Connection_Faild.class);
                            intent9.putExtra("selector", number);
                            intent9.putExtra("Safiia", site9);
                            startActivity(intent9);
                        }
                    }, 2000);


                    break;
                case 10:

                    Handler handler10=new Handler();
                    handler10.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            finish();
                            Intent intent10 = new Intent(Check_Connection.this, Connection_Faild.class);
                            intent10.putExtra("selector", number);
                            intent10.putExtra("Rammla", site10);
                            startActivity(intent10);
                        }
                    }, 2000);


                    break;
                case 11:

                    Handler handler11=new Handler();
                    handler11.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            finish();
                            Intent intent11 = new Intent(Check_Connection.this, Connection_Faild.class);
                            intent11.putExtra("selector", number);
                            intent11.putExtra("Mimona", site11);
                            startActivity(intent11);
                        }
                    }, 2000);



                    break;
                case 12:

                    Handler handler12=new Handler();
                    handler12.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            finish();
                            Intent intent12 = new Intent(Check_Connection.this, Connection_Faild.class);
                            intent12.putExtra("selector", number);
                            intent12.putExtra("Site1", site12);
                            startActivity(intent12);
                        }
                    }, 2000);



                    break;
                case 13:

                    Handler handler13=new Handler();
                    handler13.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            finish();
                            Intent intent13 = new Intent(Check_Connection.this, Connection_Faild.class);
                            intent13.putExtra("selector", number);
                            intent13.putExtra("Site2", site13);
                            startActivity(intent13);
                        }
                    }, 2000);



                    break;
                case 14:

                    Handler handler14=new Handler();
                    handler14.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            finish();
                            Intent intent14 = new Intent(Check_Connection.this, Connection_Faild.class);
                            intent14.putExtra("selector", number);
                            intent14.putExtra("Site3", site14);
                            startActivity(intent14);

                        }
                    }, 2000);


                    break;
            }


        }

    }}