package com.company;

import java.util.HashMap;

public class TimeZoneDemo
{
    HashMap<String, Integer> mapDemo = new HashMap<>();
    public static void main(String[] args)
    {
        TimeZoneDemo timeZone = new TimeZoneDemo();
        timeZone.demo();
    }

    public void demo()
    {
        mapDemo.put("EST", -5);
        mapDemo.put("CST", -6);
        mapDemo.put("MST", -7);
        mapDemo.put("PST", -8);
        mapDemo.put("GMT", 0);

        System.out.println(getTimeDiff("PST", "EST"));
        System.out.println(getTimeDiff("EST", "PST"));
        System.out.println(getTimeDiff("MST", "EST"));
        System.out.println(getTimeDiff("GMT", "EST"));
        System.out.println(getTimeDiff("PST", "CST"));

    }

    public int getTimeDiff(String firstZone, String secondZone)
    {
        int first = mapDemo.get(firstZone);
        int second = mapDemo.get(secondZone);


        int diff = first - second;
        return diff;
    }

}
