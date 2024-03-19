package com.cjone.apitest.common;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;

public class common {
    public static String setTrnMsg(String[][] format){
        String msg = "";
        for (String[] row:format) {
            if (row[2] == "R") {
                msg += StringUtils.rightPad(row[0], Integer.parseInt(row[1]), row[3]);
            }
            else {
                msg += StringUtils.leftPad(row[0], Integer.parseInt(row[1]), row[3]);
            }
        }
        return msg;
    }

    public static HashMap<String, Object> getForm(String[][] format){
        HashMap<String, Object> map = new HashMap<String, Object>();
        String colNames = "";
        String testData    = "";
        String colSize  = "";
        for (String[] row:format) {
            colNames += row[4]+ "^";
            testData += row[0] + "^";
            colSize += row[1] + "^";
        }
        map.put("colNames", colNames);
        map.put("colSize", colSize);
        map.put("testData", testData);

        return map;
    }
}
