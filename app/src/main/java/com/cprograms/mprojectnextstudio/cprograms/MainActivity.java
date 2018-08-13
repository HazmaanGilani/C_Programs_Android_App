package com.cprograms.mprojectnextstudio.cprograms;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class MainActivity extends AppCompatActivity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(4);

        expListView = (ExpandableListView) findViewById(R.id.expandableListView);

        // preparing list data
        prepareListData();

        //listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
        listAdapter=new com.cprograms.mprojectnextstudio.cprograms.ExpandableListAdapter(this,listDataHeader,listDataChild);

        expListView.setAdapter(listAdapter);


        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                return false;
            }
        });


        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {

            }
        });

        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {


            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                Intent intent=new Intent(MainActivity.this,Detail.class);
                intent.putExtra("title_KEY", listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition));
                intent.putExtra("child_key",childPosition);
                intent.putExtra("group_Key",groupPosition);
                startActivity(intent);
                return false;
            }
        });
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Basic");
        listDataHeader.add("Number");
        listDataHeader.add("Conversions");
        listDataHeader.add("Pattern");
        listDataHeader.add("Strings");
        listDataHeader.add("Arrays");
        listDataHeader.add("Files");
        listDataHeader.add("Sorting");
        listDataHeader.add("Searching");
        listDataHeader.add("DataStructure");


        // Adding child data
        List<String> Basic = new ArrayList<String>();
        Basic.add("HelloWorld");
        Basic.add("Add Two Numbers");
        Basic.add("Reverse Number");
        Basic.add("Swap Numbers");
        Basic.add("Even or Odd");
        Basic.add("Area and Circumfrence of a Circle");
        Basic.add("Area of Triangle");
        Basic.add("PrintTable");
        Basic.add("Calculator");



        List<String> Number = new ArrayList<String>();

        Number.add("ArmStrong Number");
        Number.add("Factorial of a Number");
        Number.add("Fibbonacci Series");
        Number.add("Check Number is Prime");
        Number.add("Print Prime Numbers");
        Number.add("LCM and GCD of Number");
        Number.add("Palindrome");
        Number.add("Perfect Number");
        Number.add("Strong Number");
        Number.add("Power of a Number");
        Number.add("LeapYear");




        List<String> Conversions = new ArrayList<String>();
        Conversions.add("Binary to Decimal");
        Conversions.add("Decimal to Hexadecimal");
        Conversions.add("Decimal to Octal");
        Conversions.add("Distance Converter");
        Conversions.add("Temperature Converter");
        Conversions.add("Time Converter");





        List<String> Pattern = new ArrayList<String>();
        Pattern.add("Number pattern");
        Pattern.add("Floyd Triangle Pattern");
        Pattern.add("Alphabetical Pattern1");
        Pattern.add("Alphabetical Pattern2");
        Pattern.add("Star Triangle Pattern");
        Pattern.add("Star Pattern2");






        List<String> Strings = new ArrayList<String>();
        Strings.add("String Concatenation");
        Strings.add("String Length using library function");
        Strings.add("String Length without using String library function");
        Strings.add("ASCII value");
        Strings.add("Check uppercase or lowercase");
        Strings.add("Convert upperCase into LowerCase");





        List<String> Arrays = new ArrayList<String>();
        Arrays.add("EvenOdd nos in an Array");
        Arrays.add("Max no in an Array");
        Arrays.add("Reverse an Array");
        Arrays.add("Swap two Arrays");
        Arrays.add("Matrix Multiplication");
        Arrays.add("Matrix Subtraction");
        Arrays.add("Sum of Diagonal of Matrix");



        List<String> Files = new ArrayList<String>();
        Files.add("Write Data To File");
        Files.add("Read From File");
        Files.add("Merge Two Files");



        List<String> Sorting = new ArrayList<String>();
        Sorting.add("Bubble Sort");
        Sorting.add("Insertion Sort");
        Sorting.add("Selection Sort");
        Sorting.add("Merge Sort");
        Sorting.add("Quick Sort");
        Sorting.add("Radix Sort");

        List<String> Searching = new ArrayList<String>();
        Searching.add("Linear Search");
        Searching.add("Binary Search");
        Searching.add("Interpolation Search");


        List<String> DataStructure=new ArrayList<>();
        DataStructure.add("Stack using Array");
        DataStructure.add("Stack using LinkedList");
        DataStructure.add("Tower of Hanoi");
        DataStructure.add("Infix to Postfix");
        DataStructure.add("Evaluation of Postfix Expression");
        DataStructure.add("Queue using Array");
        DataStructure.add("Queue using LinkedList");
        DataStructure.add("Priority Queue");
        DataStructure.add("Circular Queue");
        DataStructure.add("Single Linked List");
        DataStructure.add("Reverse LinkedList");
        DataStructure.add("Doubly Linked List");
        DataStructure.add("Circular LinkedList");




        listDataChild.put(listDataHeader.get(0), Basic); // Header, Child data
        listDataChild.put(listDataHeader.get(1), Number);
        listDataChild.put(listDataHeader.get(2), Conversions);
        listDataChild.put(listDataHeader.get(3), Pattern);
        listDataChild.put(listDataHeader.get(4), Strings);
        listDataChild.put(listDataHeader.get(5), Arrays);
        listDataChild.put(listDataHeader.get(6), Files);
        listDataChild.put(listDataHeader.get(7), Sorting);
        listDataChild.put(listDataHeader.get(8), Searching);
        listDataChild.put(listDataHeader.get(9), DataStructure);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Exit")
                .setMessage("Are you sure you want to Exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_share) {
            Intent shareintent=new Intent();
            shareintent.setAction(Intent.ACTION_SEND);
            shareintent.putExtra(Intent.EXTRA_TEXT, "Check out this app:https://play.google.com/store/apps/details?id=com.cprograms.mprojectnextstudio.cprograms");
            shareintent.setType("text/plain");
            startActivity(shareintent);
            return true;
        }
        if(id==R.id.action_feedback){
            Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);

            String[] recipients = new String[]{"", "",};

            emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, recipients);

            emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "C Lab Programs v1.0:Feedback:");

            emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "");

            emailIntent.setType("message/rfc822");

            startActivity(Intent.createChooser(emailIntent, "Send mail..."));

            finish();


        }
        if (id==R.id.action_rate){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=com.cprograms.mprojectnextstudio.cprograms"));
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

   }