package com.cjone.apitest.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    //String filePath = "src/main/resources/properties/env.properties";

    public Properties readProperties(String filePath){
        InputStream is = null;
        Properties props = null;
        File file = null;

        try{
            file = new File(filePath);
            if(!file.exists()) {
                System.err.println("File not found : " + file.getAbsoluteFile());
                return null;
            }

            is = new FileInputStream(file);

            props = new Properties();
            props.load(is);
            close(is);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            close(is);
        }
        return props;
    }

    public static void close(InputStream is){
        try{
            if (is != null) {
                is.close();
            }
        }catch (Exception e){

        }finally {
            is = null;
        }
    }
}
