package com.cjone.apitest.config.trsmsg;
import org.apache.commons.lang3.StringUtils;

public class TR000 {

    private String i_comm1="931";       //전문유형
    private String i_comm2="93";        //업무구분
    private String i_comm3="V100";      //전문버젼
    private String i_comm4="7000";      //제휴사코드
    private String i_comm5="20240216";  //거래일자
    private String i_comm6="190726";    //거래시간
    private String i_comm7="";          //추적번호
    private String i_comm8="ONL";       //채널유형
    private String i_comm9="00000";     //응답코드
    private String i_comm10="123451234512345";     //인가번호
    private String i_comm11="";         //부가정보
    private String i_comm12="";         //FILLER
    private int [] arrLength = {3, 2, 4, 4, 8, 6, 18, 3, 5, 15, 20, 12};

    private String msg = "";

    public TR000() {
        i_comm1      = StringUtils.rightPad(i_comm1   , arrLength[0], " ");
        i_comm2      = StringUtils.rightPad(i_comm2   , arrLength[1], " ");
        i_comm3      = StringUtils.rightPad(i_comm3   , arrLength[2], " ");
        i_comm4      = StringUtils.rightPad(i_comm4   , arrLength[3], " ");
        i_comm5      = StringUtils.rightPad(i_comm5   , arrLength[4], " ");
        i_comm6      = StringUtils.rightPad(i_comm6   , arrLength[5], " ");
        i_comm7      = StringUtils.rightPad(i_comm7   , arrLength[6], " ");
        i_comm8      = StringUtils.rightPad(i_comm8   , arrLength[7], " ");
        i_comm9      = StringUtils.rightPad(i_comm9   , arrLength[8], " ");
        i_comm10     = StringUtils.rightPad(i_comm10  , arrLength[9], " ");
        i_comm11     = StringUtils.rightPad(i_comm11  , arrLength[10], " ");
        i_comm12     = StringUtils.rightPad(i_comm12  , arrLength[11], " ");

        msg = i_comm1 + i_comm2 + i_comm3 + i_comm4 + i_comm5 + i_comm6 + i_comm7 + i_comm8 + i_comm9 + i_comm10 + i_comm11 + i_comm12;

    }


    public String getMsg(){
        return msg;
    }



}
