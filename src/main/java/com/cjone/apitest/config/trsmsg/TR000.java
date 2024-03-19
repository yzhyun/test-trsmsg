package com.cjone.apitest.config.trsmsg;
import com.cjone.apitest.common.*;

import java.util.HashMap;

public class TR000 {

    private String i_comm1="803";                   //전문유형
    private String i_comm2="81";                    //업무구분
    private String i_comm3="V100";                  //전문버젼
    private String i_comm4="7000";                  //제휴사코드
    private String i_comm5="20240313";              //거래일자
    private String i_comm6="190726";                //거래시간
    private String i_comm7="";                      //추적번호
    private String i_comm8="ONL";                   //채널유형
    private String i_comm9="00000";                 //응답코드
    private String i_comm10="123451234512345";      //인가번호
    private String i_comm11="";                     //부가정보
    private String i_comm12="";                     //FILLER

    private String[][] format=
            {
                    {i_comm1, "3", "R", " ", "전문유형"},
                    {i_comm2, "2", "R", " ", "업무구분"},
                    {i_comm3, "4", "R", " ", "전문버전"},
                    {i_comm4, "4", "R", " ", "제휴사코드"},
                    {i_comm5, "8", "R", " ", "거래일자"},
                    {i_comm6, "6", "R", " ", "거래시간"},
                    {i_comm7, "18", "R", " ", "추적번호"},
                    {i_comm8, "3", "R", " ", "채널유형"},
                    {i_comm9, "5", "R", " ", "응답코드"},
                    {i_comm10, "15", "R", " ", "인가번호"},
                    {i_comm11, "20", "R", " ", "부가정보"},
                    {i_comm12, "12", "R", " ", "FILLER"}
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
