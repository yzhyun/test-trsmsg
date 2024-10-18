package com.cjone.apitest.config.trsmsg;
import com.cjone.apitest.common.common;

public class TR300_C {
        // 필드 선언
        private String i_1  = "3000";   // 브랜드코드
        private String i_2  = "3000";   // 가맹점코드
        private String i_3  = "1";   // 회원식별구분코드
        //private String i_4  = "9990000410964";   // 회원식별구분값 -윤지현
        //private String i_4  = "9990000408528";   // 회원식별구분값 -공성원

        private String i_4  = "7775010000000496";   // 회원식별구분값

        private String i_5  = "B";   // 적립사용수단
        private String i_6  = "";   // 본인인증구분
        private String i_7  = "";   // 비밀번호/본인인증요청번호
        private String i_8  = "10000";   // 총매출금액
        private String i_9  = "0";   // 총할인금액
        private String i_10 = "0";   // 멤버십할인금액
        private String i_11 = common.getDate();   // 결제일자
        private String i_12 = common.getDate();;   // 매출일자
        private String i_13 = "1002";   // 거래사유코드
        private String i_14 = "20241017";     // 원통합승인일자
        private String i_15 = "1019646298";   // 원통합승인번호
        private String i_16 = "BENE20241017011905_yjh";             // 원고유식별번호
        private String i_17 = "dev300";   // 사용자ID
        private String i_18 = "BENE" + common.getDateTime() + "_yjh";   // 참여사고유식별번호
        private String i_19 = "";   // 결제(주문)번호
        private String i_20 = "";   // 비고
        private String i_21 = "1";   // 사용총건수
        private String i_22 = "11";    // 포인트사용유형
        private String i_23 = "2000";   // 사용/사용취소포인트

        private String[][] format =
                {
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
                        {i_11, "8" , "R", " ", "결제일자" },
                        {i_12, "8" , "R", " ", "매출일자" },
                        {i_13, "4" , "R", " ", "거래사유코드" },
                        {i_14, "8" , "R", " ", "원통합승인일자" },
                        {i_15, "10", "R", " ", "원통합승인번호" },
                        {i_16, "50", "R", " ", "원고유식별번호" },
                        {i_17, "20", "R", " ", "사용자ID" },
                        {i_18, "50", "R", " ", "참여사고유식별번호" },
                        {i_19, "30", "R", " ", "결제(주문)번호" },
                        {i_20, "10", "R", " ", "비고" },
                        {i_21, "2" , "L", "0", "사용총건수" },
                        {i_22, "2" , "R", " ", "포인트사용유형" },
                        {i_23, "10", "L", "0", "사용/사용취소포인트" }

                };

        private String[][] recv_format =
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
                        {i_10, "47", "R", " ", "FILLER"},
                        {i_11, "100", "R", " ", "응답메세지"},
                        {i_12, "150", "R", " ", "응답메세지2"},
                        {i_13, "150", "R", " ", "응답메세지3"},
                        {i_14, "8", "R", " ", "통합승인일자"},
                        {i_15, "10", "R", " ", "통합승인번호"},
                        {i_16, "10", "L", " ", "사용/사용취소포인트"},
                        {i_17, "10", "L", " ", "가용포인트"},
                        {i_18, "300", "R", " ", "FILLER"}
                };

        public String getMsg(){
            String msg = "";
            msg = common.setTrnMsg(format);
            return msg;
        }

        public String[][] getRecvFormat(){
                return recv_format;
        }

        public String[][] getForm(){
                String[][] form = format.clone();
                return form;
        }


}


