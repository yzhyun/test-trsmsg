package com.cjone.apitest.common;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.time.*;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
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

    public static ArrayList<String[]> getRecvMsg(String[][] format, String sMsg) {
        ArrayList<String[]> arrResData = new ArrayList<>();
        byte[] byteArray;

        try {
            byteArray = sMsg.getBytes("Windows-949");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        int currentIndex = 0; // 현재 메시지에서 파싱할 시작 위치
        int cnt = 1;

        for (String[] field : format) {
            int fieldLength;
            try {
                fieldLength = Integer.parseInt(field[0]); // 필드의 길이
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid field length: " + field[0]);
            }

            // 메시지에서 잘라낼 범위가 유효한지 확인

            if (currentIndex + fieldLength > byteArray.length) {
                break;
            }

            // 바이트 배열에서 해당 필드만큼 잘라내기
            byte[] fieldByteArray = Arrays.copyOfRange(byteArray, currentIndex, currentIndex + fieldLength);
            String fieldValue = null; // 바이트 배열을 문자열로 변환

            try {
                fieldValue = new String(fieldByteArray, "Windows-949");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }

            String[] arr = {"o_" + cnt, field[3], fieldValue.trim()};
            arrResData.add(arr);
            currentIndex += fieldLength; // 다음 필드로 이동

            System.out.println(field[3] + ":" + fieldValue);

            cnt += 1;
        }
        return arrResData;
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

    public static String getDateTime(){
        // 현재 시각을 LocalDateTime 객체로 가져오기
        LocalDateTime now = LocalDateTime.now();

        // 포맷터 생성: "년월일시분초" 형식
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

        // 포맷터를 사용하여 현재 시각을 문자열로 변환
        String formattedDateTime = now.format(formatter);

        return formattedDateTime;
    }

    public static String getDate(){
        // 현재 시각을 LocalDateTime 객체로 가져오기
        LocalDateTime now = LocalDateTime.now();

        // 포맷터 생성: "년월일시분초" 형식
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        // 포맷터를 사용하여 현재 시각을 문자열로 변환
        String formattedDate = now.format(formatter);

        return formattedDate;
    }

    public static String getTime(){
        // 현재 시각을 LocalDateTime 객체로 가져오기
        LocalDateTime now = LocalDateTime.now();

        // 포맷터 생성: "년월일시분초" 형식
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");

        // 포맷터를 사용하여 현재 시각을 문자열로 변환
        String formattedTime = now.format(formatter);

        return formattedTime;
    }
}
