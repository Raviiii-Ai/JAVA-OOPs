package com.gsv.javaFramework;

import java.net.InterfaceAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put(1,"3");
        map.put("1","32");
        map.put(45,78.5);
        map.put(true,"d");
        map.put(56.7,"43");
        map.put(null,null);
        System.out.println(map);

        HashMap<String,Integer>kvmap=new HashMap<String,Integer>();
        kvmap.put("A",45);
        kvmap.put("A",452);
        kvmap.put("A",452);
        kvmap.put("A",45);
        kvmap.put("A",425);
        System.out.println(kvmap);

        System.out.println(kvmap.containsKey("A"));
        System.out.println(kvmap.size());
        System.out.println(kvmap.containsKey(45));

        kvmap.entrySet();

        Set set=map.entrySet();
        System.out.println(set);

        Iterator Iit=set.iterator();
        while(Iit.hasNext())
        {
            Map.Entry me=(Map.Entry)Iit.next();
            System.out.println(me.getKey()+": "+me.getValue());
        }
//        Set<String>set=(Map.Entry)kvmap.entrySet();

    }
}
