package com.example.paolo.ustbookmarketfinal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.paolo.ustbookmarketfinal.R;

public class SearchPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);

        Button one_button = (Button) findViewById(R.id.button);

        one_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        SearchPage.this);

                // Set Alert Dialog Title
                builder.setTitle("Alert Dialog Tutorial");

                // Set an Icon for this Alert Dialog
                builder.setIcon(R.drawable.ic_launcher);

                // Set Alert Dialog Message
                builder.setMessage(
                        "Seller is Offline")

                        // Neautral button functionality
                        .setNeutralButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int arg0) {
                                        Toast.makeText(
                                                SearchPage.this,
                                                "You clicked on OK",
                                                Toast.LENGTH_SHORT).show();
                                        // Do more stuffs
                                    }
                                });

                // Create the Alert Dialog
                AlertDialog alertdialog = builder.create();

                // Show Alert Dialog
                alertdialog.show();
            }
        });

        Button two_button = (Button) findViewById(R.id.button1);

        two_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        SearchPage.this);

                // Set Alert Dialog Title
                builder.setTitle("Alert Dialog Tutorial");

                // Set an Icon for this Alert Dialog
                builder.setIcon(R.drawable.ic_launcher);

                // Set Alert Dialog Message
                builder.setMessage(
                        "Seller is Offline")

                        // Neautral button functionality
                        .setNeutralButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int arg0) {
                                        Toast.makeText(
                                                SearchPage.this,
                                                "You clicked on OK",
                                                Toast.LENGTH_SHORT).show();
                                        // Do more stuffs
                                    }
                                });

                // Create the Alert Dialog
                AlertDialog alertdialog = builder.create();

                // Show Alert Dialog
                alertdialog.show();
            }
        });

        Button three_button = (Button) findViewById(R.id.button2);

        three_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        SearchPage.this);

                // Set Alert Dialog Title
                builder.setTitle("Alert Dialog Tutorial");

                // Set an Icon for this Alert Dialog
                builder.setIcon(R.drawable.ic_launcher);

                // Set Alert Dialog Message
                builder.setMessage(
                        "Seller is Offline")

                        // Neautral button functionality
                        .setNeutralButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int arg0) {
                                        Toast.makeText(
                                                SearchPage.this,
                                                "You clicked on OK",
                                                Toast.LENGTH_SHORT).show();
                                        // Do more stuffs
                                    }
                                });

                // Create the Alert Dialog
                AlertDialog alertdialog = builder.create();

                // Show Alert Dialog
                alertdialog.show();
            }
        });

        Button four_button = (Button) findViewById(R.id.button3);

        four_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        SearchPage.this);

                // Set Alert Dialog Title
                builder.setTitle("Alert Dialog Tutorial");

                // Set an Icon for this Alert Dialog
                builder.setIcon(R.drawable.ic_launcher);

                // Set Alert Dialog Message
                builder.setMessage(
                        "Seller is Offline")

                        // Neautral button functionality
                        .setNeutralButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int arg0) {
                                        Toast.makeText(
                                                SearchPage.this,
                                                "You clicked on OK",
                                                Toast.LENGTH_SHORT).show();
                                        // Do more stuffs
                                    }
                                });

                // Create the Alert Dialog
                AlertDialog alertdialog = builder.create();

                // Show Alert Dialog
                alertdialog.show();
            }
        });

        Button five_button = (Button) findViewById(R.id.button4);

        five_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        SearchPage.this);

                // Set Alert Dialog Title
                builder.setTitle("Alert Dialog Tutorial");

                // Set an Icon for this Alert Dialog
                builder.setIcon(R.drawable.ic_launcher);

                // Set Alert Dialog Message
                builder.setMessage(
                        "Seller is Offline")

                        // Neautral button functionality
                        .setNeutralButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int arg0) {
                                        Toast.makeText(
                                                SearchPage.this,
                                                "You clicked on OK",
                                                Toast.LENGTH_SHORT).show();
                                        // Do more stuffs
                                    }
                                });

                // Create the Alert Dialog
                AlertDialog alertdialog = builder.create();

                // Show Alert Dialog
                alertdialog.show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
