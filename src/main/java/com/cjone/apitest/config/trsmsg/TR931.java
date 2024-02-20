package com.cjone.apitest.config.trsmsg;
import org.apache.commons.lang3.StringUtils;

public class TR931 {
    private String colsNm = "브랜드코드|가맹점코드|조회구분|조회구분값|조회시작일자|조회종료일자|요청페이지|Filler";
    private String colsLen = "4|20|1|50|8|8|3|806";
    private String brndCd="2501";
    private String mchtNo="2501";
    private String selFg="I";
    private String selFgVal = "8880000000014";
    private String fromdd = "20231228";
    private String todd = "20240201";
    private String pageVal="1";
    private String filler ="";

    private String msg = "";
    public TR931(){
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
