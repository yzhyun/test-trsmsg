package com.cjone.apitest.config.trsmsg;
import com.cjone.apitest.common.common;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.util.HashMap;

public class TR400 {
        // 필드 선언
//        private String i_1  = "3000";   // 브랜드코드
//        private String i_2  = "3000";   // 가맹점코드
//        private String i_3  = "1";   // 회원식별구분코드
//        private String i_4  = "7775010000000496";   // 회원식별구분값
//        private String i_5  = "B";   // 적립사용수단
//        private String i_6  = "";   // 본인인증구분
//        private String i_7  = "";   // 비밀번호/본인인증요청번호
//        private String i_8  = "10000";   // 총매출금액
//        private String i_9  = "0";   // 총할인금액
//        private String i_10 = "0";   // 멤버십할인금액
//        private String i_11 = "10000";      //포인트적립대상금액
//        private String i_12 = common.getDate();   // 결제일자
//        private String i_13 = common.getDate();   // 매출일자
//        private String i_14 = "1001";   // 거래사유코드
//        private String i_15 = "N";     // 사후적립여부
//        private String i_16 = "";       // 원통합승인일자
//        private String i_17 = "";            // 원통합승인번호
//        private String i_18 = "";            // 원참여사고유식별번호
//        private String i_19 = "dev";   // 사용자ID
//        private String i_20 = "BENE" + common.getDate() +"_yjh";   // 참여사고유식별번호
//        private String i_21 = common.getDateTime();   // 결제(주문)번호
//        private String i_22 = "";   // 비고
//        private String i_23 = "1"; 			            // 적립총건수
//        private String i_24 = "10";                     // 포인트유형
//        private String i_25 = "1500";                   // 적립포인트
//        private String i_26 = "1";                      // 유효기간구분
//        private String i_27 = "24";                     // 유효기간
//        private String i_28 = "1";                      // 가용화방법코드
//        private String i_29 = common.getDate();         // 가용화일자
//        private String i_30 = "1"; 			            // 사용총건수
//        private String i_31 = "11"; 			        // 사용포인트유형
//        private String i_32 = "500"; 			        // 사용포인트

        private String i_1  ;   // 브랜드코드
        private String i_2  ;   // 가맹점코드
        private String i_3  ;   // 회원식별구분코드
        private String i_4  ;   // 회원식별구분값
        private String i_5  ;   // 적립사용수단
        private String i_6  ;   // 본인인증구분
        private String i_7  ;   // 비밀번호/본인인증요청번호
        private String i_8  ;   // 총매출금액
        private String i_9  ;   // 총할인금액
        private String i_10 ;   // 멤버십할인금액
        private String i_11 ;   //포인트적립대상금액
        private String i_12 ;   // 결제일자
        private String i_13 ;   // 매출일자
        private String i_14 ;   // 거래사유코드
        private String i_15 ;   // 사후적립여부
        private String i_16 ;   // 원통합승인일자
        private String i_17 ;   // 원통합승인번호
        private String i_18 ;   // 원참여사고유식별번호
        private String i_19 ;   // 사용자ID
        private String i_20 ;   // 참여사고유식별번호
        private String i_21 ;   // 결제(주문)번호
        private String i_22 ;   // 비고
        private String i_23 ;	// 적립총건수
        private String i_24 ;   // 포인트유형
        private String i_25 ;   // 적립포인트
        private String i_26 ;   // 유효기간구분
        private String i_27 ;   // 유효기간
        private String i_28 ;   // 가용화방법코드
        private String i_29 ;   // 가용화일자
        private String i_30 ;	// 사용총건수
        private String i_31 ;	// 사용포인트유형
        private String i_32 ; 	// 사용포인트

        public TR400() {
                this.i_1 = "3000";
                this.i_2 = "3000";
                this.i_3 = "1";
                this.i_4 = "7775010000000496";
                this.i_5 = "B";
                this.i_6 = "";
                this.i_7 = "";
                this.i_8 = "10000";
                this.i_9 = "0";
                this.i_10 = "0";
                this.i_11 = "10000";
                this.i_12 = common.getDate();
                this.i_13 = common.getDate();
                this.i_14 = "1001";
                this.i_15 = "N";
                this.i_16 = "";
                this.i_17 = "";
                this.i_18 = "";
                this.i_19 = "dev";
                this.i_20 = "BENE" + common.getDateTime() + "_yjh";
                this.i_21 = common.getDateTime();
                this.i_22 = "";
                this.i_23 = "1";
                this.i_24 = "10";
                this.i_25 = "1500";
                this.i_26 = "1";
                this.i_27 = "24";
                this.i_28 = "1";
                this.i_29 = common.getDate();
                this.i_30 = "1";
                this.i_31 = "11";
                this.i_32 = "500";
        }

        public TR400(String i_1, String i_2, String i_3, String i_4, String i_5, String i_6, String i_7,
                     String i_8, String i_9, String i_10, String i_11, String i_12, String i_13,
                     String i_14, String i_15, String i_16, String i_17, String i_18, String i_19,
                     String i_20, String i_21, String i_22, String i_23, String i_24, String i_25,
                     String i_26, String i_27, String i_28, String i_29, String i_30, String i_31,
                     String i_32) {
                this.i_1 = i_1;
                this.i_2 = i_2;
                this.i_3 = i_3;
                this.i_4 = i_4;
                this.i_5 = i_5;
                this.i_6 = i_6;
                this.i_7 = i_7;
                this.i_8 = i_8;
                this.i_9 = i_9;
                this.i_10 = i_10;
                this.i_11 = i_11;
                this.i_12 = i_12;
                this.i_13 = i_13;
                this.i_14 = i_14;
                this.i_15 = i_15;
                this.i_16 = i_16;
                this.i_17 = i_17;
                this.i_18 = i_18;
                this.i_19 = i_19;
                this.i_20 = i_20;
                this.i_21 = i_21;
                this.i_22 = i_22;
                this.i_23 = i_23;
                this.i_24 = i_24;
                this.i_25 = i_25;
                this.i_26 = i_26;
                this.i_27 = i_27;
                this.i_28 = i_28;
                this.i_29 = i_29;
                this.i_30 = i_30;
                this.i_31 = i_31;
                this.i_32 = i_32;
        }

        public TR400(HashMap<String, Object> jsonObject) {
                this.i_1 = (String) jsonObject.get("i_1");
                this.i_2 = (String) jsonObject.get("i_2");
                this.i_3 = (String) jsonObject.get("i_3");
                this.i_4 = (String) jsonObject.get("i_4");
                this.i_5 = (String) jsonObject.get("i_5");
                this.i_6 = (String) jsonObject.get("i_6");
                this.i_7 = (String) jsonObject.get("i_7");
                this.i_8 = (String) jsonObject.get("i_8");
                this.i_9 = (String) jsonObject.get("i_9");
                this.i_10 = (String) jsonObject.get("i_10");
                this.i_11 = (String) jsonObject.get("i_11");
                this.i_12 = (String) jsonObject.get("i_12");
                this.i_13 = (String) jsonObject.get("i_13");
                this.i_14 = (String) jsonObject.get("i_14");
                this.i_15 = (String) jsonObject.get("i_15");
                this.i_16 = (String) jsonObject.get("i_16");
                this.i_17 = (String) jsonObject.get("i_17");
                this.i_18 = (String) jsonObject.get("i_18");
                this.i_19 = (String) jsonObject.get("i_19");
                this.i_20 = (String) jsonObject.get("i_20");
                this.i_21 = (String) jsonObject.get("i_21");
                this.i_22 = (String) jsonObject.get("i_22");
                this.i_23 = (String) jsonObject.get("i_23");
                this.i_24 = (String) jsonObject.get("i_24");
                this.i_25 = (String) jsonObject.get("i_25");
                this.i_26 = (String) jsonObject.get("i_26");
                this.i_27 = (String) jsonObject.get("i_27");
                this.i_28 = (String) jsonObject.get("i_28");
                this.i_29 = (String) jsonObject.get("i_29");
                this.i_30 = (String) jsonObject.get("i_30");
                this.i_31 = (String) jsonObject.get("i_31");
                this.i_32 = (String) jsonObject.get("i_32");
        }

        public String[][] getForm() {
                String[][] temp = {
                        {i_1 , "4" , "R", " ", "브랜드코드" },
                        {i_2 , "20", "R", " ", "가맹점코드" },
                        {i_3 , "1" , "R", " ", "회원식별구분코드" },
                        {i_4 , "20", "R", " ", "회원식별구분값" },
                        {i_5 , "1" , "R", " ", "적립사용수단" },
                        {i_6 , "1" , "R", " ", "본인인증구분" },
                        {i_7 , "20", "R", " ", "비밀번호/본인인증요청번호" },
                        {i_8 , "10", "L", "0", "총매출금액" },
                        {i_9 , "10", "L", "0", "총할인금액" },
                        {i_10, "10", "L", "0", "멤버십할인금액" },
                        {i_11, "10", "L", "0", "포인트적립대상금액" },
                        {i_12, "8" , "R", " ", "결제일자" },
                        {i_13, "8" , "R", " ", "매출일자" },
                        {i_14, "4" , "R", " ", "거래사유코드" },
                        {i_15, "1" , "R", " ", "사후적립여부" },
                        {i_16, "8" , "R", " ", "원통합승인일자" },
                        {i_17, "10", "R", " ", "원통합승인번호" },
                        {i_18, "50", "R", " ", "원고유식별번호" },
                        {i_19, "20", "R", " ", "사용자ID" },
                        {i_20, "50", "R", " ", "참여사고유식별번호" },
                        {i_21, "30", "R", " ", "결제(주문)번호" },
                        {i_22, "10", "R", " ", "비고" },
                        {i_23, "2" , "L", "0", "적립총건수" },
                        {i_24, "2" , "R", " ", "포인트유형" },
                        {i_25, "10", "L", "0", "적립포인트" },
                        {i_26, "1" , "R", "0", "유효기간구분" },
                        {i_27, "3" , "L", "0", "유효기간" },
                        {i_28, "1" , "R", "0", "가용처리구분" },
                        {i_29, "8" , "R", "0", "가용화일자" },
                        {i_30, "2" , "L", "0", "사용총건수" },
                        {i_31, "2" , "L", "0", "사용포인트유형" },
                        {i_32, "10", "L", "0", "사용포인트" }
                };
                return temp;
        }

//        private String[][] format =
//                {
//                        {i_1 , "4" , "R", " ", "브랜드코드" },
//                        {i_2 , "20", "R", " ", "가맹점코드" },
//                        {i_3 , "1" , "R", " ", "회원식별구분코드" },
//                        {i_4 , "20", "R", " ", "회원식별구분값" },
//                        {i_5 , "1" , "R", " ", "적립사용수단" },
//                        {i_6 , "1" , "R", " ", "본인인증구분" },
//                        {i_7 , "20", "R", " ", "비밀번호/본인인증요청번호" },
//                        {i_8 , "10", "L", "0", "총매출금액" },
//                        {i_9 , "10", "L", "0", "총할인금액" },
//                        {i_10, "10", "L", "0", "멤버십할인금액" },
//                        {i_11, "10", "L", "0", "포인트적립대상금액" },
//                        {i_12, "8" , "R", " ", "결제일자" },
//                        {i_13, "8" , "R", " ", "매출일자" },
//                        {i_14, "4" , "R", " ", "거래사유코드" },
//                        {i_15, "1" , "R", " ", "사후적립여부" },
//                        {i_16, "8" , "R", " ", "원통합승인일자" },
//                        {i_17, "10", "R", " ", "원통합승인번호" },
//                        {i_18, "50", "R", " ", "원고유식별번호" },
//                        {i_19, "20", "R", " ", "사용자ID" },
//                        {i_20, "50", "R", " ", "참여사고유식별번호" },
//                        {i_21, "30", "R", " ", "결제(주문)번호" },
//                        {i_22, "10", "R", " ", "비고" },
//                        {i_23, "2" , "L", "0", "적립총건수" },
//                        {i_24, "2" , "R", " ", "포인트유형" },
//                        {i_25, "10", "L", "0", "적립포인트" },
//                        {i_26, "1" , "R", "0", "유효기간구분" },
//                        {i_27, "3" , "L", "0", "유효기간" },
//                        {i_28, "1" , "R", "0", "가용처리구분" },
//                        {i_29, "8" , "R", "0", "가용화일자" },
//                        {i_30, "2" , "L", "0", "사용총건수" },
//                        {i_31, "2" , "L", "0", "사용포인트유형" },
//                        {i_32, "10", "L", "0", "사용포인트" }
////                        {"i_1" ,i_1 , "4" , "R", " ", "브랜드코드" },
////                        {"i_2" ,i_2 , "20", "R", " ", "가맹점코드" },
////                        {"i_3" ,i_3 , "1" , "R", " ", "회원식별구분코드" },
////                        {"i_4" ,i_4 , "20", "R", " ", "회원식별구분값" },
////                        {"i_5" ,i_5 , "1" , "R", " ", "적립사용수단" },
////                        {"i_6" ,i_6 , "1" , "R", " ", "본인인증구분" },
////                        {"i_7" ,i_7 , "20", "R", " ", "비밀번호/본인인증요청번호" },
////                        {"i_8" ,i_8 , "10", "L", "0", "총매출금액" },
////                        {"i_9" ,i_9 , "10", "L", "0", "총할인금액" },
////                        {"i_10",i_10, "10", "L", "0", "멤버십할인금액" },
////                        {"i_11",i_11, "10", "L", "0", "포인트적립대상금액" },
////                        {"i_12",i_12, "8" , "R", " ", "결제일자" },
////                        {"i_13",i_13, "8" , "R", " ", "매출일자" },
////                        {"i_14",i_14, "4" , "R", " ", "거래사유코드" },
////                        {"i_15",i_15, "1" , "R", " ", "사후적립여부" },
////                        {"i_16",i_16, "8" , "R", " ", "원통합승인일자" },
////                        {"i_17",i_17, "10", "R", " ", "원통합승인번호" },
////                        {"i_18",i_18, "50", "R", " ", "원고유식별번호" },
////                        {"i_19",i_19, "20", "R", " ", "사용자ID" },
////                        {"i_20",i_20, "50", "R", " ", "참여사고유식별번호" },
////                        {"i_21",i_21, "30", "R", " ", "결제(주문)번호" },
////                        {"i_22",i_22, "10", "R", " ", "비고" },
////                        {"i_23",i_23, "2" , "L", "0", "적립총건수" },
////                        {"i_24",i_24, "2" , "R", " ", "포인트유형" },
////                        {"i_25",i_25, "10", "L", "0", "적립포인트" },
////                        {"i_26",i_26, "1" , "R", "0", "유효기간구분" },
////                        {"i_27",i_27, "3" , "L", "0", "유효기간" },
////                        {"i_28",i_28, "1" , "R", "0", "가용처리구분" },
////                        {"i_29",i_29, "8" , "R", "0", "가용화일자" },
////                        {"i_30",i_30, "2" , "L", "0", "사용총건수" },
////                        {"i_31",i_31, "2" , "L", "0", "사용포인트유형" },
////                        {"i_32",i_32, "10", "L", "0", "사용포인트" }
//                };
//        private String[][] bodyForm = {
//                {"i_1" ,i_1 , "4" , "R", " ", "브랜드코드" },
//                {"i_2" ,i_2 , "20", "R", " ", "가맹점코드" },
//                {"i_3" ,i_3 , "1" , "R", " ", "회원식별구분코드" },
//                {"i_4" ,i_4 , "20", "R", " ", "회원식별구분값" },
//                {"i_5" ,i_5 , "1" , "R", " ", "적립사용수단" },
//                {"i_6" ,i_6 , "1" , "R", " ", "본인인증구분" },
//                {"i_7" ,i_7 , "20", "R", " ", "비밀번호/본인인증요청번호" },
//                {"i_8" ,i_8 , "10", "L", "0", "총매출금액" },
//                {"i_9" ,i_9 , "10", "L", "0", "총할인금액" },
//                {"i_10",i_10, "10", "L", "0", "멤버십할인금액" },
//                {"i_11",i_11, "10", "L", "0", "포인트적립대상금액" },
//                {"i_12",i_12, "8" , "R", " ", "결제일자" },
//                {"i_13",i_13, "8" , "R", " ", "매출일자" },
//                {"i_14",i_14, "4" , "R", " ", "거래사유코드" },
//                {"i_15",i_15, "1" , "R", " ", "사후적립여부" },
//                {"i_16",i_16, "8" , "R", " ", "원통합승인일자" },
//                {"i_17",i_17, "10", "R", " ", "원통합승인번호" },
//                {"i_18",i_18, "50", "R", " ", "원고유식별번호" },
//                {"i_19",i_19, "20", "R", " ", "사용자ID" },
//                {"i_20",i_20, "50", "R", " ", "참여사고유식별번호" },
//                {"i_21",i_21, "30", "R", " ", "결제(주문)번호" },
//                {"i_22",i_22, "10", "R", " ", "비고" },
//                {"i_23",i_23, "2" , "L", "0", "적립총건수" },
//                {"i_24",i_24, "2" , "R", " ", "포인트유형" },
//                {"i_25",i_25, "10", "L", "0", "적립포인트" },
//                {"i_26",i_26, "1" , "R", "0", "유효기간구분" },
//                {"i_27",i_27, "3" , "L", "0", "유효기간" },
//                {"i_28",i_28, "1" , "R", "0", "가용처리구분" },
//                {"i_29",i_29, "8" , "R", "0", "가용화일자" },
//                {"i_30",i_30, "2" , "L", "0", "사용총건수" },
//                {"i_31",i_31, "2" , "L", "0", "사용포인트유형" },
//                {"i_32",i_32, "10", "L", "0", "사용포인트" }
//                };

        public String[][] recv_format =
                {
                        {"3", "R", " ", "전문유형"},
                        {"2", "R", " ", "업무구분"},
                        {"4", "R", " ", "전문버전"},
                        {"4", "R", " ", "제휴사코드"},
                        {"8", "R", " ", "거래일자"},
                        {"6", "R", " ", "거래시간"},
                        {"18", "R", " ", "추적번호"},
                        {"3", "R", " ", "채널유형"},
                        {"5", "R", " ", "응답코드"},
                        {"47", "R", " ", "FILLER"},
                        {"100", "R", " ", "응답메세지"},
                        {"150", "R", " ", "응답메세지2"},
                        {"150", "R", " ", "응답메세지3"},
                        {"8", "R", " ", "통합승인일자"},
                        {"10", "R", " ", "통합승인번호"},
                        {"10", "L", " ", "적립/적립취소포인트"},
                        {"10", "L", " ", "사용/사용취소포인트"},
                        {"10", "L", " ", "가용포인트"},
                        {"10", "L", " ", "정산제외포인트"},
                        {"300", "R", " ", "FILLER"}
                };

        public String getMsg(){
                String msg="";
                String[][] form = getForm();
                System.out.println(form);
                msg = common.setTrnMsg(form);
            return msg;
        }

        public String[][] getRecvFormat(){
            return recv_format;
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
}


