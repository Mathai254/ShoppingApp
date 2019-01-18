package com.example.shoppingapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ItemsActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.applei7, R.drawable.iphonex, R.drawable.iphones, R.drawable.blackrubber,
            R.drawable.blacksport, R.drawable.lofas, R.drawable.whiterubbers, R.drawable.checkedshirt,
            R.drawable.kitengeshirt, R.drawable.tshirt, R.drawable.shirt, R.drawable.classicbrown,
            R.drawable.goldwatch, R.drawable.gshockblack, R.drawable.silverwatch, R.drawable.lgtv,
            R.drawable.viziotv, R.drawable.sonytv};
    String[] TITLES = {"iPhone 7", "iPhoneX", "iPhoneS", "Black Rubber", "Black Sport", "Loafers",
            "White Rubbers", "Checked Shirt", "Kitenge Shirt", "T-Shirt", "Shirt", "Classic Brown Watch",
            "Gold Watch", "GShock Watch", "Silver Watch", "LG TV", "Vizio TV", "Sony TV"};
    String[] DESCRIPTIONS = {"Description:\n Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod" +
            "tempor incididunt ut labore et dolore magna aliqua. ", "Description:\n Ut enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo" +
            "consequat.", "Description:\n Duis aute irure dolor in reprehenderit in voluptate velit esse" +
            "cillum dolore eu fugiat nulla pariatur.", "Description:\n Excepteur sint occaecat cupidatat non" +
            "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Description:\n Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod" +
            "tempor incididunt ut labore et dolore magna aliqua.", "Description:\n Ut enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo" +
            "consequat.", "Description:\n Duis aute irure dolor in reprehenderit in voluptate velit esse" +
            "cillum dolore eu fugiat nulla pariatur.", "Description:\n Excepteur sint occaecat cupidatat non" +
            "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Description:\n Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod" +
            "tempor incididunt ut labore et dolore magna aliqua.", "Description:\n Ut enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo" +
            "consequat.", "Description:\n Duis aute irure dolor in reprehenderit in voluptate velit esse" +
            "cillum dolore eu fugiat nulla pariatur. ", "Excepteur sint occaecat cupidatat non" +
            "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Description:\n Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod" +
            "tempor incididunt ut labore et dolore magna aliqua. ", "Description:\nUt enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo" +
            "consequat. ", "Description:\nDuis aute irure dolor in reprehenderit in voluptate velit esse" +
            "cillum dolore eu fugiat nulla pariatur.", "Description:\n Excepteur sint occaecat cupidatat non" +
            "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Description:\n Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod" +
            "tempor incididunt ut labore et dolore magna aliqua.", "Description:\n Ut enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo" +
            "consequat."};
    String[] PRICES = {"Ksh 30000", "Ksh 35000", "Ksh 40000", "Ksh 4000", "Ksh 5000", "Ksh 6000", "Ksh 3000",
    "Ksh 2000", "Ksh 5000", "Ksh 4500", "Ksh 3500", "Ksh 5000", "Ksh 7000", "Ksh 4000", "Ksh 8000",
            "Ksh 150000", "Ksh 120000", "Ksh 70000"};
    String[] RATINGS = {"RATING: 7/10", "RATING: 8/10", "RATING: 9/10", "RATING: 7/10", "RATING: 8/10", "RATING: 9/10", "RATING: 7/10", "RATING: 8/10", "RATING: 9/10", "RATING: 7/10", "RATING: 8/10", "RATING: 9/10",
            "RATING: 7/10", "RATING: 8/10", "RATING: 9/10", "RATING: 7/10", "RATING: 8/10", "RATING: 9/10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        ListView listView = (ListView) findViewById(R.id.listView);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), position+" ", Toast.LENGTH_LONG).show();

                //Add items to shopping cart

            }
        });
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return TITLES[i];
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.custom_layout,null);

            ImageView imageView = (ImageView)view.findViewById(R.id.contentImage);
            TextView tvTitle = (TextView) view.findViewById(R.id.title);
            TextView tvDescription = (TextView) view.findViewById(R.id.description);
            TextView tvPrice = (TextView) view.findViewById(R.id.price);
            TextView tvRating = (TextView) view.findViewById(R.id.rating);


            imageView.setImageResource(IMAGES[i]);
            tvTitle.setText(TITLES[i]);
            tvDescription.setText(DESCRIPTIONS[i]);
            tvPrice.setText(PRICES[i]);
            tvRating.setText(RATINGS[i]);

            return view;
        }
    }
}
