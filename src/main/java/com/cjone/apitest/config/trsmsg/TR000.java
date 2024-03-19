package com.cjone.apitest.config.trsmsg;
import com.cjone.apitest.common.*;

import java.util.HashMap;

public class TR000 {

    private String i_1="200";                   //전문유형
    private String i_2="21";                    //업무구분
    private String i_3="V100";                  //전문버젼
    private String i_4="7010";                  //제휴사코드
    private String i_5="20240313";              //거래일자
    private String i_6="190726";                //거래시간
    private String i_7="";                      //추적번호
    private String i_8="ONL";                   //채널유형
    private String i_9="00000";                 //응답코드
    private String i_10="123451234512345";      //인가번호
    private String i_11="";                     //부가정보
    private String i_12="";                     //FILLER

    private String[][] format=
            {
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
}
