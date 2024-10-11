package com.cjone.apitest.config.trsmsg;
import com.cjone.apitest.common.*;

import java.lang.reflect.Field;
import java.util.HashMap;

public class TR000 {

    private String i_1="999";                   //전문유형
    private String i_2="31";                    //업무구분
    private String i_3="V100";                  //전문버젼
    private String i_4="7030";                  //제휴사코드
    private String i_5=common.getDate();        //거래일자
    private String i_6=common.getTime();        //거래시간
    private String i_7=common.getDateTime();    //추적번호
    private String i_8="OFF";                   //채널유형
    private String i_9="00000";                 //응답코드
    private String i_10="123451234512345";      //인가번호
    private String i_11="";                     //부가정보
    private String i_12="";                     //FILLER
    
    private String[][] format = {
            {i_1, "3", "R", " ", "전문유형"},
            {i_2, "2", "R", " ", "업무구분"},
            {i_3, "4", "R", " ", "전문버전"},
            {i_4, "4", "R", " ", "제휴사코드"},
            {i_5, "8", "R", " ", "거래일자"},
            {i_6, "6", "R", " ", "거래시간"},
            {i_7, "18", "R", " ", "추적번호"},
            {i_8, "3", "R", " ", "채널유형"},
            {i_9, "5", "R", " ", "응답코드"},
            {i_10, "15", "R", " ", "인가번호"},
            {i_11, "20", "R", " ", "부가정보"},
            {i_12, "12", "R", " ", "FILLER"}
    };
    
    private void reForm() {
        String[][] temp = {
                {i_1, "3", "R", " ", "전문유형"},
                {i_2, "2", "R", " ", "업무구분"},
                {i_3, "4", "R", " ", "전문버전"},
                {i_4, "4", "R", " ", "제휴사코드"},
                {i_5, "8", "R", " ", "거래일자"},
                {i_6, "6", "R", " ", "거래시간"},
                {i_7, "18", "R", " ", "추적번호"},
                {i_8, "3", "R", " ", "채널유형"},
                {i_9, "5", "R", " ", "응답코드"},
                {i_10, "15", "R", " ", "인가번호"},
                {i_11, "20", "R", " ", "부가정보"},
                {i_12, "12", "R", " ", "FILLER"}
        };
        format = temp;
    }    
    
    public String getMsg(){       
        String msg="";
        msg = common.setTrnMsg(format);
        return msg;
    }

    public HashMap<String, Object> getForm(){
        HashMap<String, Object> form = new HashMap<>();       
        form = common.getForm(format);
        return form;
    }

    // setMsg 메서드 구현
    public void setMsg(String fieldName, String value) {
        try {
            System.out.println(fieldName);
            // fieldName에 해당하는 필드 찾기'
            Field field = this.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);  // private 필드에 접근 가능하도록 설정
            field.set(this, value);     // 해당 필드에 값 설정
            reForm(); //변경된 값으로 포맷 새로 형성
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
