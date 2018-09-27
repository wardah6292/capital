package com.example.warda.capital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.warda.capital.R;

public class MainActivity extends AppCompatActivity {
     int[] IMAGES = {R.drawable.london,R.drawable.islamabad,R.drawable.berlin,R.drawable.washington,R.drawable.paris,R.drawable.rome};

String[] NAMES = {"LONDON","ISLAMABAD","BERLIN","WASHINGTON","PARIS","ROME"};

    String[] DESCRIP = {"ENGLAND","PAKISTAN","GERMANY","USA","FRANCE","ITALY"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.listView);
        CustomAdaptor customAdaptor = new CustomAdaptor();
        listView.setAdapter(customAdaptor);

    }

    class CustomAdaptor extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout,null);


            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            TextView textView_name = (TextView)view.findViewById(R.id.textView_name);
            TextView textView2_des = (TextView)view.findViewById(R.id.textView2_des);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView2_des.setText(DESCRIP[i]);


            return view;
        }
    }

}
