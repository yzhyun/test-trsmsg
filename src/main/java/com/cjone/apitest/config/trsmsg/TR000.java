package com.cjone.apitest.config.trsmsg;
import com.cjone.apitest.common.*;

import java.lang.reflect.Field;
import java.util.HashMap;

public class TR000 {

    private String c_1;		//전문유형
    private String c_2;	    //업무구분
    private String c_3;	    //전문버젼
    private String c_4;	    //제휴사코드
    private String c_5;	    //거래일자
    private String c_6;	    //거래시간
    private String c_7;	    //추적번호
    private String c_8;	    //채널유형
    private String c_9;	    //응답코드
    private String c_10;    //인가번호
    private String c_11;    //부가정보
    private String c_12;    //FILLER

    public TR000() {
        this.c_1 = "999";
        this.c_2 = "31";
        this.c_3 = "V100";
        this.c_4 = "7030";
        this.c_5 = common.getDate();
        this.c_6 = common.getTime();
        this.c_7 = common.getDateTime();
        this.c_8 = "OFF";
        this.c_9 = "00000";
        this.c_10 = "123451234512345";
        this.c_11 = "";
        this.c_12 = "";
    }

    public TR000(String telGrmTypCd, String telGrmWorkFg, String CoopCd) {
        this.c_1 = telGrmTypCd;
        this.c_2 = telGrmWorkFg;
        this.c_3 = "V100";
        this.c_4 = CoopCd;
        this.c_5 = common.getDate();
        this.c_6 = common.getTime();
        this.c_7 = common.getDateTime();
        this.c_8 = "OFF";
        this.c_9 = "00000";
        this.c_10 = "";
        this.c_11 = "";
        this.c_12 = "";
    }

    public TR000(HashMap<String, Object> jsonObject) {
        this.c_1 = (String) jsonObject.get("c_1");
        this.c_2 = (String) jsonObject.get("c_2");
        this.c_3 = (String) jsonObject.get("c_3");
        this.c_4 = (String) jsonObject.get("c_4");
        this.c_5 = (String) jsonObject.get("c_5");
        this.c_6 = (String) jsonObject.get("c_6");
        this.c_7 = (String) jsonObject.get("c_7");
        this.c_8 = (String) jsonObject.get("c_8");
        this.c_9 = (String) jsonObject.get("c_9");
        this.c_10 = (String) jsonObject.get("c_10");
        this.c_11 = (String) jsonObject.get("c_11");
        this.c_12 = (String) jsonObject.get("c_12");
    }

    public String[][] getForm() {
        String[][] temp = {
                {c_1, "3", "R", " ", "전문유형"},
                {c_2, "2", "R", " ", "업무구분"},
                {c_3, "4", "R", " ", "전문버전"},
                {c_4, "4", "R", " ", "제휴사코드"},
                {c_5, "8", "R", " ", "거래일자"},
                {c_6, "6", "R", " ", "거래시간"},
                {c_7, "18", "R", " ", "추적번호"},
                {c_8, "3", "R", " ", "채널유형"},
                {c_9, "5", "R", " ", "응답코드"},
                {c_10, "15", "R", " ", "인가번호"},
                {c_11, "20", "R", " ", "부가정보"},
                {c_12, "12", "R", " ", "FILLER"}
        };
        return temp;
    }

    public String getMsg(){
        String msg="";
        String[][] form = getForm();
        msg = common.setTrnMsg(form);
        return msg;
    }

    // setMsg 메서드 구현
    public void setMsg(String fieldName, String value) {
        try {
            System.out.println(fieldName);
            // fieldName에 해당하는 필드 찾기'
            Field field = this.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);  // private 필드에 접근 가능하도록 설정
            field.set(this, value);     // 해당 필드에 값 설정
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

//    public HashMap<String, Object> getForm(){
//        HashMap<String, Object> rtnForm = new HashMap<>();
//        String[][] form = reForm();
//        rtnForm = common.getForm(form);
//        return rtnForm;
//    }


}
