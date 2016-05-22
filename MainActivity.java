package com.example.hillaryslavik.jarproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity
{


    ListView listView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Jarmanager jm = new Jarmanager();
        List<Jar> jars = new ArrayList<Jar>();

        // Jar 1
        Jar jar1 = new Jar();
        jar1.name = "Jar 1";
        jar1.opendate = "January 2017";
        jar1.color = "blue";
        jar1.jarStatus = "closed";
        jars.add(jar1);

        // Jar 2
        Jar jar2 = new Jar();
        jar2.name = "Jar 2";
        jar2.opendate = "January 2017";
        jar2.color = "blue";
        jar2.jarStatus = "opened";
        jars.add(jar2);

        //Jar 3
        Jar jar3 = new Jar();
        jar3.name = "Jar 3";
        jar3.opendate = "January 2017";
        jar3.color = "blue";
        jar3.jarStatus = "readyToOpen";
        jars.add(jar3);

        // Jar 4
        Jar jar4 = new Jar();
        jar4.name = "Jar 4";
        jar4.opendate = "January 2017";
        jar4.color = "blue";
        jar4.jarStatus = "opened";
        jars.add(jar4);

        // Jar 5
        Jar jar5 = new Jar();
        jar5.name = "Jar 5";
        jar5.opendate = "January 2017";
        jar5.color = "blue";
        jar5.jarStatus = "closed";
        jars.add(jar5);

        // Jar 6
        Jar jar6 = new Jar();
        jar6.name = "Jar 6";
        jar6.opendate = "January 2017";
        jar6.color = "blue";
        jar6.jarStatus = "closed";
        jars.add(jar6);

        // Jar 7
        Jar jar7 = new Jar();
        jar7.name = "Jar 7";
        jar7.opendate = "January 2017";
        jar7.color = "blue";
        jar7.jarStatus = "closed";
        jars.add(jar7);

        // Jar 8
        Jar jar8 = new Jar();
        jar8.name = "Jar 8";
        jar8.opendate = "January 2017";
        jar8.color = "blue";
        jar8.jarStatus = "opened";
        jars.add(jar8);

        // Jar 9
        Jar jar9 = new Jar();
        jar9.name = "Jar 9";
        jar9.opendate = "January 2017";
        jar9.color = "blue";
        jar9.jarStatus = "";
        jars.add(jar9);

        // Jar 10
        Jar jar10 = new Jar();
        jar10.name = "Jar 10";
        jar10.opendate = "January 2017";
        jar10.color = "blue";
        jar10.jarStatus = "";
        jars.add(jar10);

        // Jar 11
        Jar jar11 = new Jar();
        jar11.name = "Jar 11";
        jar11.opendate = "January 2017";
        jar11.color = "blue";
        jar11.jarStatus = "";
        jars.add(jar11);

        // Jar 12
        Jar jar12 = new Jar();
        jars.add(jar12);


        int drawJar1;
        int drawJar2;
        int drawJar3;
        int drawJar4;
        int drawJar5;
        int drawJar6;
        int drawJar7;
        int drawJar8;
        int drawJar9;
        int drawJar10;
        int drawJar11;
        int drawJar12;



        //System.out.println(jars);

        //Jarmanager jarmanager = new Jarmanager();

        //long id = jarmanager.getJar();

        listView1 = (ListView) findViewById(R.id.listView);

        if(jar1.jarStatus == "opened")
        {
            drawJar1 = R.drawable.jaropened;
        }
        else if(jar1.jarStatus == "closed")
        {
            drawJar1 = R.drawable.jarlocked;
        }
        else if(jar1.jarStatus == "readyToOpen")
        {
            drawJar1 = R.drawable.jar;
        } else
        {
            drawJar1 = R.drawable.jarnull;
        }


        if(jar2.jarStatus == "opened")
        {
            drawJar2 = R.drawable.jaropened;
        }
        else if(jar2.jarStatus == "closed")
        {
            drawJar2 = R.drawable.jarlocked;
        }
        else if(jar2.jarStatus == "readyToOpen")
        {
            drawJar2 = R.drawable.jar;
        } else
        {
            drawJar2 = R.drawable.jarnull;
        }

        if(jar3.jarStatus == "opened")
        {
            drawJar3 = R.drawable.jaropened;
        }
        else if(jar3.jarStatus == "closed")
        {
            drawJar3 = R.drawable.jarlocked;
        }
        else if(jar3.jarStatus == "readyToOpen")
        {
            drawJar3 = R.drawable.jar;
        } else
        {
            drawJar3 = R.drawable.jarnull;
        }

        if(jar4.jarStatus == "opened")
        {
            drawJar4 = R.drawable.jaropened;
        }
        else if(jar4.jarStatus == "closed")
        {
            drawJar4 = R.drawable.jarlocked;
        }
        else if(jar4.jarStatus == "readyToOpen")
        {
            drawJar4 = R.drawable.jar;
        } else
        {
            drawJar4 = R.drawable.jarnull;
        }

        if(jar5.jarStatus == "opened")
        {
            drawJar5 = R.drawable.jaropened;
        }
        else if(jar5.jarStatus == "closed")
        {
            drawJar5 = R.drawable.jarlocked;
        }
        else if(jar5.jarStatus == "readyToOpen")
        {
            drawJar5 = R.drawable.jar;
        } else
        {
            drawJar5 = R.drawable.jarnull;
        }

        if(jar6.jarStatus == "opened")
        {
            drawJar6 = R.drawable.jaropened;
        }
        else if(jar6.jarStatus == "closed")
        {
            drawJar6 = R.drawable.jarlocked;
        }
        else if(jar6.jarStatus == "readyToOpen")
        {
            drawJar6 = R.drawable.jar;
        } else
        {
            drawJar6 = R.drawable.jarnull;
        }

        if(jar7.jarStatus == "opened")
        {
            drawJar7 = R.drawable.jaropened;
        }
        else if(jar7.jarStatus == "closed")
        {
            drawJar7 = R.drawable.jarlocked;
        }
        else if(jar7.jarStatus == "readyToOpen")
        {
            drawJar7 = R.drawable.jar;
        } else
        {
            drawJar7 = R.drawable.jarnull;
        }

        if(jar8.jarStatus == "opened")
        {
            drawJar8 = R.drawable.jaropened;
        }
        else if(jar8.jarStatus == "closed")
        {
            drawJar8 = R.drawable.jarlocked;
        }
        else if(jar8.jarStatus == "readyToOpen")
        {
            drawJar8 = R.drawable.jar;
        } else
        {
            drawJar8 = R.drawable.jarnull;
        }

        if(jar9.jarStatus == "opened")
        {
            drawJar9 = R.drawable.jaropened;
        }
        else if(jar9.jarStatus == "closed")
        {
            drawJar9 = R.drawable.jarlocked;
        }
        else if(jar9.jarStatus == "readyToOpen")
        {
            drawJar9 = R.drawable.jar;
        } else
        {
            drawJar9 = R.drawable.jarnull;
        }

        if(jar10.jarStatus == "opened")
        {
            drawJar10 = R.drawable.jaropened;
        }
        else if(jar10.jarStatus == "closed")
        {
            drawJar10 = R.drawable.jarlocked;
        }
        else if(jar10.jarStatus == "readyToOpen")
        {
            drawJar10 = R.drawable.jar;
        } else
        {
            drawJar10 = R.drawable.jarnull;
        }

        if(jar11.jarStatus == "opened")
        {
            drawJar11 = R.drawable.jaropened;
        }
        else if(jar11.jarStatus == "closed")
        {
            drawJar11 = R.drawable.jarlocked;
        }
        else if(jar11.jarStatus == "readyToOpen")
        {
            drawJar11 = R.drawable.jar;
        } else
        {
            drawJar11 = R.drawable.jarnull;
        }

        drawJar12 = R.drawable.newjar;


        Shelf shelf_data[] = new Shelf[]
                {
                        new Shelf(R.drawable.shelf, drawJar1, drawJar2, drawJar3),
                        new Shelf(R.drawable.shelf, drawJar4, drawJar5, drawJar6),
                        new Shelf(R.drawable.shelf, drawJar7, drawJar8, drawJar9),
                        new Shelf(R.drawable.shelf, drawJar10, drawJar11, drawJar12),

                };

        ShelfAdapter adapter = new ShelfAdapter(this,
                R.layout.shelf_image, shelf_data);


        listView1.setAdapter(adapter);



    }
    public void openJar( View v)
    {
        Toast.makeText(getBaseContext(), "openingJar", Toast.LENGTH_SHORT).show();


    }





}

