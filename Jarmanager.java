package com.example.hillaryslavik.jarproject;

import java.util.List;

public class Jarmanager
{
    DatabaseHandler dbh;

    public Jarmanager()
    {

    }
    public long createJar(String name)
    {
        Jar aJar = new Jar(name);
        long id = dbh.createJar(aJar);
        return id;
    }
    public Jar getJar(long id)
    {
        Jar aJar = dbh.getJar(id);
        return aJar;
    }
    public List<Jar> ReadAll()
    {
        List<Jar> jarList = dbh.getAllJars();
        return jarList;
    }
    public void updateById(long id)
    {
        Jar aJar = dbh.getJar(id);
        //String jarStatus_str = aJar.getJarStatus();
        //aJar.setJarStatus(jarStatus_str);
        dbh.updateJar(aJar);
    }

}
