package com.example.elekshop;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private TextView textView;
    List<String> quotes = null;
    String ressult="";

List<Integer> words = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        textView = findViewById(R.id.textView22);
//        textView.setMovementMethod(new ScrollingMovementMethod());


        //this.listView = (ListView) findViewById(R.id.listView);
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();

        quotes = databaseAccess.getQuotes();
        databaseAccess.close();
        //memoryRam = PositionOfPartCompInRowFunc("8GB");
        //windows = PositionOfPartCompInRowFunc("i5-8300H");

      //  List<Integer> common =  findCommonElement(memoryRam,windows);


        Button btnSave = (Button)findViewById(R.id.button);

        btnSave.setOnClickListener(new View.OnClickListener() {

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {
                CheckBox proc3 = (CheckBox)findViewById(R.id.core3);
                CheckBox proc5 = (CheckBox)findViewById(R.id.core5);
                CheckBox proc7 = (CheckBox)findViewById(R.id.core79);

                CheckBox mem4 = (CheckBox)findViewById(R.id.gb4);
                CheckBox mem8 = (CheckBox)findViewById(R.id.gb8);
                CheckBox mem16 = (CheckBox)findViewById(R.id.gb16);

                CheckBox hdd = (CheckBox)findViewById(R.id.hdd);
                CheckBox ssd = (CheckBox)findViewById(R.id.sdd);

                CheckBox integr = (CheckBox)findViewById(R.id.integrow);
                CheckBox nvidia = (CheckBox)findViewById(R.id.nvidia);
                CheckBox amd = (CheckBox)findViewById(R.id.amdradeon);

                CheckBox windows = (CheckBox)findViewById(R.id.windows10);
                CheckBox macintosh = (CheckBox)findViewById(R.id.macintosh);

                CheckBox mniej3000 = (CheckBox)findViewById(R.id.mniej3000);
                CheckBox wiecej3000 = (CheckBox)findViewById(R.id.wiecej3000alemn);
                CheckBox wiecej6000 = (CheckBox)findViewById(R.id.wiecej6000);

                CheckBox mysz = (CheckBox)findViewById(R.id.mysz);
                CheckBox drukarki = (CheckBox)findViewById(R.id.drukarki);
                CheckBox flash = (CheckBox)findViewById(R.id.flash);

                String processors;

                String ramMemory;

                String dysk;

                String videoCard;

                String price;


                StringBuilder compsByProc = new StringBuilder();

                if(proc3.isChecked())
                {
                    processors= PositionOfPartCompInRowFunc("i3");
                    String [] iu = processors.split(",");

                    Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                    textView.setText(compsByProc);

                }
                if(proc5.isChecked())
                {
                     processors= PositionOfPartCompInRowFunc("i5-8300H");
                     String [] iu = processors.split(",");

                     Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                    //textView.setText(compsByProc);
                    ressult =compsByProc.toString();

                }

                if(proc7.isChecked())
                {
                    processors= PositionOfPartCompInRowFunc("i7-8750H");

                    String [] iu = processors.split(",");

                    Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                   // textView.setText(compsByProc);
                    ressult =compsByProc.toString();

                }

                if(mem4.isChecked())
                {
                    ramMemory= PositionOfPartCompInRowFunc("4GB");
                    String [] iu = ramMemory.split(",");

                    Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                    //textView.setText(compsByProc);
                    ressult =compsByProc.toString();

                }

                if(mem8.isChecked())
                {
                    ramMemory = PositionOfPartCompInRowFunc("8GB");

                    String [] iu = ramMemory.split(",");

                    Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                    //textView.setText(compsByProc);
                    ressult =compsByProc.toString();

                }
                if(mem16.isChecked())
                {
                    ramMemory = PositionOfPartCompInRowFunc("16GB");

                    String [] iu = ramMemory.split(",");

                    Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                   // textView.setText(compsByProc);
                    ressult =compsByProc.toString();

                }
                if(hdd.isChecked())
                {
                    dysk = PositionOfPartCompInRowFunc("HDD");

                    String [] iu = dysk.split(",");

                    Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                    //textView.setText(compsByProc);
                    ressult =compsByProc.toString();

                }
                if(ssd.isChecked())
                {
                    dysk = PositionOfPartCompInRowFunc("SSD");

                    String [] iu = dysk.split(",");

                    Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                    //textView.setText(compsByProc);
                    ressult =compsByProc.toString();

                }
                if(integr.isChecked())
                {
                    videoCard = PositionOfPartCompInRowFunc("Zintegrowana");

                    String [] iu = videoCard.split(",");

                    Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                    //textView.setText(compsByProc);
                    ressult =compsByProc.toString();

                }
                if(nvidia.isChecked())
                {
                    videoCard = PositionOfPartCompInRowFunc("GTX1050");

                    String [] iu = videoCard.split(",");

                    Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                   // textView.setText(compsByProc);
                    ressult =compsByProc.toString();

                }
                if(amd.isChecked())
                {
                    videoCard= PositionOfPartCompInRowFunc("RX560X");

                    String [] iu = videoCard.split(",");

                    Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                    //textView.setText(compsByProc);
                    ressult =compsByProc.toString();

                }
                if(mniej3000.isChecked())
                {
                    price = PositionOfPartCompInRowFunc("3000");

                    String [] iu = price.split(",");

                    Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                   // textView.setText(compsByProc);
                    ressult =compsByProc.toString();

                }
                if(wiecej3000.isChecked())
                {
                    price = PositionOfPartCompInRowFunc("5000");

                    String [] iu = price.split(",");

                    Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                   // textView.setText(compsByProc);
                    ressult =compsByProc.toString();

                }
                if(wiecej6000.isChecked())
                {
                    price = PositionOfPartCompInRowFunc("6000");

                    String [] iu = price.split(",");

                    Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                    //textView.setText(compsByProc);
                    ressult =compsByProc.toString();

                }
                if(mysz.isChecked())
                {
                    price = PositionOfPartCompInRowFunc("mysz");

                    String [] iu = price.split(",");

                    Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                    // textView.setText(compsByProc);
                    ressult =compsByProc.toString();

                }
                if(drukarki.isChecked())
                {
                    price = PositionOfPartCompInRowFunc("Drukarka");

                    String [] iu = price.split(",");

                    Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                    // textView.setText(compsByProc);
                    ressult =compsByProc.toString();

                }
                if(flash.isChecked())
                {
                    price = PositionOfPartCompInRowFunc("Pamięć");

                    String [] iu = price.split(",");

                    Integer[] ii = processLine(iu);

                    for(int i=0;i<ii.length;i++){
                        compsByProc.append(quotes.get(ii[i])).append("\n");
                    }
                    //textView.setText(compsByProc);
                    ressult =compsByProc.toString();

                }
            }

        });



        //textView.setText(Arrays.toString(memoryRam)+" "+Arrays.toString(windows));


//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, quotes);
//        this.listView.setAdapter(adapter);
    }
    private Integer[] processLine(String[] strings) {
        Integer[] intarray=new Integer[strings.length];
        int i=0;
        for(String str:strings){
            intarray[i]=Integer.parseInt(str.trim()); // No more Exception in this line
            i++;
        }
        return intarray;
    }
    public String PositionOfPartCompInRowFunc(String compPart) {
        StringBuilder wordd= new StringBuilder();
        for (int l = 0; l < quotes.size(); l++) {
            String eachWord[] = quotes.get(l).split("/");
            for (int i = 0; i < eachWord.length; i++) {
                if (compPart.contains(eachWord[i])) {
                    wordd.append(l).append(",");
                }
            }
        }
        return wordd.toString();
    }




    public List<Integer> findCommonElement(int[] a, int[] b) {

        List<Integer> commonElements = new ArrayList<Integer>();

        for(int i = 0; i < a.length ;i++) {
            for(int j = 0; j< b.length ; j++) {
                if(a[i] == b[j]) {
                    //Check if the list already contains the common element
                    if(!commonElements.contains(a[i])) {
                        //add the common element into the list
                        commonElements.add(a[i]);
                    }
                }
            }
        }
        return commonElements;
    }

    public void ShowResult(View view) {

        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("result",ressult);
        startActivity(intent);
    }

    public void Peryferja(View view) {

    }

//    private String EachComp(int i) {
//
//        String stringEachComp;
//
//
//        return stringEachComp;
//    }
}