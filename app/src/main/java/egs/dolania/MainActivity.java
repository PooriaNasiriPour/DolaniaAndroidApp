package egs.dolania;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import egs.dolania.interfaces.state;
import egs.dolania.models.hotel.HotelListAllMain;
import egs.dolania.requests.hotel;
import egs.dolania.views.DrawerArrowDrawable;
public class MainActivity extends AppCompatActivity {
    protected Application app;
    LinearLayout li;
    private static LayoutInflater layoutInflater;

    private ListView nav_list;
    private float offset;
ImageView i1;
    private HotelListAllMain hotelListAllMain;

    ImageView i2;
ImageView i3;
ImageView i4;
ImageView i5;
    private boolean flipped;
    private String[] s1;
    private static DrawerArrowDrawable drawerArrowDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  new hotel().getTest(MainActivity.this,new hotelState());

        li= (LinearLayout) findViewById(R.id.test);
        app= (Application) getApplication();
        //nav_list= (ListView) findViewById(R.id.drawer_content);
        s1 = getResources().getStringArray(R.array.kind1);
     //   myAdapter ma=new myAdapter();
       // nav_list.setAdapter(ma);
        getSupportActionBar().hide();
i1= (ImageView) findViewById(R.id.img1);
i2= (ImageView) findViewById(R.id.img2);
i3= (ImageView) findViewById(R.id.img3);
i4= (ImageView) findViewById(R.id.img4);
i5= (ImageView) findViewById(R.id.img5);
        nav();
        Button btn=(Button)findViewById(R.id.hotelsbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), hotelListActivity.class);
                startActivity(intent);
            }
        });

    }
    public class myAdapter extends BaseAdapter {
        public myAdapter(){
            layoutInflater =
                    (LayoutInflater) getSystemService(
                            Context.LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public int getCount() {
            return s1.length;
        }

        @Override
        public Object getItem(int i) {
            return s1[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = layoutInflater.inflate(R.layout.nav_list_item, null);
            TextView textView= (TextView) view.findViewById(R.id.nav_item);
            textView.setText(s1[i]);
            Typeface face = Typeface.createFromAsset(getAssets(), "sansbold.ttf");
            textView.setTypeface(face);
            return view;        }
    }

    public void nav(){
        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        // drawer.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT,300));
      //  final ImageView imageView = (ImageView) findViewById(R.id.drawer_indicator);
        final Resources resources = getResources();
        drawerArrowDrawable = new DrawerArrowDrawable(resources);
        drawerArrowDrawable.setStrokeColor(resources.getColor(R.color.light_gray));
      //  imageView.setImageDrawable(drawerArrowDrawable);

        drawer.setDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override public void onDrawerSlide(View drawerView, float slideOffset) {
                offset = slideOffset;

                // Sometimes slideOffset ends up so close to but not quite 1 or 0.
                if (slideOffset >= .995) {
                    flipped = true;
                    drawerArrowDrawable.setFlip(flipped);
                } else if (slideOffset <= .005) {
                    flipped = false;
                    drawerArrowDrawable.setFlip(flipped);
                }

                drawerArrowDrawable.setParameter(offset);
            }
        });

    }

}
