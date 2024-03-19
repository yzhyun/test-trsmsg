package com.cjone.apitest.config.trsmsg;
import org.apache.commons.lang3.StringUtils;

public class TR200 {
    private String colsNm = "브랜드코드|가맹점코드|회원식별구분코드|회원식별구분값|적립사용수단|총매출금액|총할인금액|멤버십할인금액|포인트적립대상금액|결제일자|매출일자|거래사유코드|사후적립여부|멤버십포인트결제여부|멤버십사용포인트|원통합승인일자|원통합승인번호|원참여사고유식별번호|사용자ID|참여사고유식별번호|결제번호|비고|적립총건수|포인트유형|포인트|유효기간구분|유효개월수/기간|가용처리구분|가용화일자";
    private String colsLen = "4|20|1|20|1|10|10|10|10|8|8|4|1|1|10|8|10|50|20|50|30|10|2|2|101|3|1|8";
    private String brndCd="2501";
    private String mchtNo="2501";
    private String selFg="I";
    private String selFgVal = "8880000000014";
    private String fromdd = "20231228";
    private String todd = "20240201";
    private String pageVal="1";
    private String filler ="";

    private String msg = "";
    public TR200(){
        String arrLength[] = colsLen.split("\\|");

        brndCd      = StringUtils.rightPad(brndCd   , Integer.valueOf(arrLength[0]), " ");
        mchtNo      = StringUtils.rightPad(mchtNo   , Integer.valueOf(arrLength[1]), " ");
        selFg       = StringUtils.rightPad(selFg    , Integer.valueOf(arrLength[2]), " ");
        selFgVal    = StringUtils.rightPad(selFgVal , Integer.valueOf(arrLength[3]), " ");
        fromdd      = StringUtils.rightPad(fromdd   , Integer.valueOf(arrLength[4]), " ");
        todd        = StringUtils.rightPad(todd     , Integer.valueOf(arrLength[5]), " ");
        pageVal     = StringUtils.leftPad(pageVal   , Integer.valueOf(arrLength[6]), "0");
        filler      = StringUtils.rightPad(filler   , Integer.valueOf(arrLength[7]), " ");

        msg = brndCd + mchtNo + selFg + selFgVal + fromdd + todd + pageVal + filler;
    }

    public String getMsg(){return msg;}
    public String getColNm() {return colsNm;}
    public String getColLen() {return colsLen;}
}
