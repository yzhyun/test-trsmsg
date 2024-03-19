package com.cjone.apitest.config.trsmsg;
import com.cjone.apitest.common.common;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;

public class TR931 {
    private String i_1= "1000";
    private String i_2= "0000";
    private String i_3= "I";
    private String i_4= "8880000000014";
    private String i_5= "20231228";
    private String i_6= "20240201";
    private String i_7="1";
    private String i_8="";

    private String[][] format=
            {
                {i_1 , "4" , "R", " ", "브랜드코드"	 },
                {i_2 , "20", "R", " ", "가맹점코드"    },
                {i_3 , "1" , "R", " ", "조회구분"      },
                {i_4 , "50", "R", " ", "조회구분값"    } ,
                {i_5 , "8" , "R", " ", "조회시작일자"   },
                {i_6 , "8", "R", " ", "조회종료일자"   },
                {i_7 , "3", "L", "0", "요청페이지"     },
                {i_8 , "806", "R", " ", "Filler"       }
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
