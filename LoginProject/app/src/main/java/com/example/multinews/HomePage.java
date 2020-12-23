package com.example.multinews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {
    ListView listView;
ImageView aajtak,indiaToday,Amarujala,dainik,punjabkeasri,ndtv,dainikbhasker,bloomberg,theindianexpress,parichaytimes,thetelegraph,timesnow,aajsamaj,indiaahead;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
aajsamaj=findViewById(R.id.aajsmajid);
        aajtak=findViewById(R.id.aajtakimage);
indiaToday=findViewById(R.id.indiatoday);
Amarujala=findViewById(R.id.amarujala);
dainik=findViewById(R.id.dainik);
punjabkeasri=findViewById(R.id.punjabkesari);
parichaytimes=findViewById(R.id.parichay);
thetelegraph=findViewById(R.id.telegraph);
ndtv=findViewById(R.id.ndtv);
bloomberg=findViewById(R.id.bloombergimg);
        dainikbhasker=findViewById(R.id.dainikbhasker);
        theindianexpress=findViewById(R.id.theindianexpress);
        timesnow=findViewById(R.id.timesid);
indiaahead=findViewById(R.id.indiaahead);
ImageView rebulic=findViewById(R.id.republictv);
ImageView skynews=findViewById(R.id.skynews);
ImageView wion=findViewById(R.id.wion);
ImageView news24=findViewById(R.id.news24);
ImageView newsnation=findViewById(R.id.newsnation);
ImageView geotv=findViewById(R.id.geo);
ImageView euro=findViewById(R.id.euro);


geotv.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent it=new Intent(HomePage.this,GeoTvCode.class);
        startActivity(it);
    }
});

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(HomePage.this,EuroNewsCode.class);
                startActivity(it);
            }
        });


        newsnation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(HomePage.this,NewsNationCode.class);
                startActivity(it);
            }
        });


        news24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(HomePage.this,News24.class);
                startActivity(it);
            }
        });



        rebulic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(HomePage.this,RepublicBharatCode.class);
                startActivity(it);
            }
        });

        wion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(HomePage.this,WionCode.class);
                startActivity(it);
            }
        });

        skynews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(HomePage.this,SkyNewsCode.class);
                startActivity(it);
            }
        });




        aajsamaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(HomePage.this,AajSmajCode.class);
                startActivity(it);
            }
        });


        indiaahead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(HomePage.this,IndiaAheadCode.class);
                startActivity(it);
            }
        });




        timesnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it=new Intent(HomePage.this,TimesNowCode.class);
                startActivity(it);
            }
        });

        bloomberg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it=new Intent(HomePage.this,BloomBergCode.class);
                startActivity(it);
            }
        });





        thetelegraph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(HomePage.this,TheTelegraphCode.class);
                startActivity(it);
            }
        });










        parichaytimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(HomePage.this, ParichayTimesCode.class);
                startActivity(it);
            }
        });




        theindianexpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(HomePage.this, TheIndianExpress.class);
                startActivity(it);
            }
        });



        dainikbhasker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(HomePage.this, DainikBhaskerCode.class);
                startActivity(it);
            }
        });


        ndtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(HomePage.this, NdtvCode.class);
                startActivity(it);
            }
        });






punjabkeasri.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent it= new Intent(HomePage.this, PunjabKesariCode.class);
        startActivity(it);
    }
});





dainik.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent it= new Intent(HomePage.this, DainikJagran.class);
        startActivity(it);
    }
});









Amarujala.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent it= new Intent(HomePage.this, AmarUjalaCode.class);
        startActivity(it);
    }
});

        indiaToday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(HomePage.this, IndiaToday.class);
                startActivity(it);
            }
        });

        aajtak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(HomePage.this,AajTakCode.class);
                startActivity(it);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        switch(item.getItemId())
        {
            case R.id.setting:
                Intent it=new Intent(HomePage.this, Setting.class);
                startActivity(it);
                Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Intent it1=new Intent(HomePage.this, About.class);
                startActivity(it1);
                Toast.makeText(this, "about", Toast.LENGTH_SHORT).show();
                break;
            case R.id.exit:

                AlertDialog.Builder adb=new AlertDialog.Builder(HomePage.this);
                adb.setTitle("Exit App");
                adb.setMessage("Sure you want to exit");

               adb.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                       finishAffinity();
                       Toast.makeText(HomePage.this, "Application exit succesfully", Toast.LENGTH_SHORT).show();
                   }
               });
               adb.setNegativeButton("No", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {

                       dialogInterface.cancel();
                   }
               });
               adb.show();

                break;
        }
        return true;
    }

}