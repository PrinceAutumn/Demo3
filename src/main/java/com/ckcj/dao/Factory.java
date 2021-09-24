package com.ckcj.dao;

public class Factory {

    public Object getInstanceObject(String className) {
        Object obj = null;
        try {
            Class classze = null;
            try {
                Class Classze = Class.forName(className);
                obj = classze.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}



