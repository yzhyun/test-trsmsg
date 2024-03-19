package com.cjone.apitest.config.trsmsg;
import com.cjone.apitest.common.common;

import java.util.HashMap;

public class TR200 {
    private String i_1  = "1000"; 			        // 브랜드코드
    private String i_2  = "0000"; 			        // 가맹점코드
    private String i_3  = "2"; 			            // 고객식별구분코드
    private String i_4  = "9990000410964"; 			// 고객식별구분값
    private String i_5  = "1"; 			            // 카드매체구분 / 적립수단구분 PM109
    private String i_6  = "10000"; 			        // 총매출금액
    private String i_7  = "0"; 			            // 총할인금액
    private String i_8  = "0"; 			            // 멤버십할인금액
    private String i_9  = "10000"; 			        // 포인트적립대상금액
    private String i_10 = "20240313"; 			    // 결제일자
    private String i_11 = "20240313"; 			    // 매출일자
    private String i_12 = "1001"; 			        // 거래사유코드
    private String i_13 = "N"; 			            // 사후적립여부
    private String i_14 = "N"; 			            // 멤버십포인트결제여부
    private String i_15 = "0"; 			            // 멤버십사용포인트
    private String i_16 = ""; 			            // 원거래승인일자
    private String i_17 = ""; 			            // 원거래승인번호
    private String i_18 = ""; 			            // 원참여사고유식별번호
    private String i_19 = ""; 			            // 사용자ID
    private String i_20 = "TEST123412"; 			// 참여사고유식별번호
    private String i_21 = "202403191234";           // 참여사 결제(주문)번호
    private String i_22 = ""; 			            // 비고
    private String i_23 = "1"; 			            // 적립총건수
    private String i_24 = "10";                     // 적립유형코드
    private String i_25 = "1800";                   // 적립포인트
    private String i_26 = "1";                      // 유효기간구분
    private String i_27 = "24";                     // 유효기간
    private String i_28 = "1";                      // 가용화방법코드
    private String i_29 = "20240313";               // 가용화일자

    private String[][] format=
            {
                    {i_1 , "4" , "R", " ", "브랜드코드"	     },
                    {i_2 , "20", "R", " ", "가맹점코드"      },
                    {i_3 , "1" , "R", " ", "회원식별구분코드"  },
                    {i_4 , "20", "R", " ", "회원식별구분값"   } ,
                    {i_5 , "1" , "R", " ", "적립사용수단"     },
                    {i_6 , "10", "L", "0", "총매출금액"      },
                    {i_7 , "10", "L", "0", "총할인금액"      },
                    {i_8 , "10", "L", "0", "멤버십할인금액"   } ,
                    {i_9 , "10", "L", "0", "포인트적립대상금액"  },
                    {i_10, "8" , "R", " ", "결제일자"       },
                    {i_11, "8" , "R", " ", "매출일자"       },
                    {i_12, "4" , "R", " ", "거래사유코드"     },
                    {i_13, "1" , "R", " ", "사후적립여부"     },
                    {i_14, "1" , "R", " ", "멤버십포인트 결제부"},
                    {i_15, "10", "L", "0", "멤버십사용포인트"  },
                    {i_16, "8" , "R", " ", "원통합승인일자"   } ,
                    {i_17, "10", "R", " ", "원통합승인번호"   } ,
                    {i_18, "50", "R", " ", "원참여사고유식별번" },
                    {i_19, "20", "R", " ", "사용자ID"      },
                    {i_20, "50", "R", " ", "참여사고유식별번호" },
                    {i_21, "30", "R", " ", "결제(주문)번호"   },
                    {i_22, "10", "R", " ", "비고"          },
                    {i_23, "2" , "L", "0", "적립총건수"      },
                    {i_24, "2" , "R", " ", "포인트유형"      },
                    {i_25, "10", "L", "0", "포인트"        },
                    {i_26, "1" , "R", " ", "유효기간구분"     },
                    {i_27, "3" , "L", "0", "유효개월수/기간"  } ,
                    {i_28, "1" , "R", " ", "가용처리구분"     },
                    {i_29, "8" , "R", " ", "가용화일자"      }
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
