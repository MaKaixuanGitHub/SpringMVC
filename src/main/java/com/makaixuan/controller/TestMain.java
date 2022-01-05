package com.makaixuan.controller;





import com.makaixuan.pojo.TetsModel1;
import com.makaixuan.pojo.TetsModel2;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;


public class TestMain {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(TestMain.class));
    private static final DecimalFormat decimalFormat = new DecimalFormat("#,##0");
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

    public static void main(String[] args) throws ParseException {

        /***
         * 日期的月份加减计算
         */
        String dateTime = "2021-03-22";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;

        try {
            date = sdf.parse(dateTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
//        Calendar.DAY_OF_MONTH
        date = calendar.getTime();

        System.out.println("date===== " + sdf.format(date));

        String sNo = "";
        int no= 0;
        for (int i=0; i < 10; i++) {
            no++;
            sNo = String.valueOf(no);
        }
        System.out.println("sNo======" + sNo);
        LOGGER.info("aaa");
        BigDecimal kinGaku = new BigDecimal(1234567890);
        System.out.println("dateYmd====$$" + decimalFormat.format(kinGaku));

        LOGGER.info("bbb");
        String newDate = "20211231";
        Date date1 = simpleDateFormat.parse(newDate);
        System.out.println("date1====" + date1);
        System.out.println("date1====" + simpleDateFormat.format(date1));

        BigDecimal val = new BigDecimal(2);
        Integer intVal = val.intValue();
        System.out.println("intVal===="+intVal);

        TetsModel1 tetsModel1 = new TetsModel1();
        tetsModel1.setCode("001");
        tetsModel1.setName("makax");

        TetsModel2 tetsModel2 = new TetsModel2();
        try {
            BeanUtils.copyProperties(tetsModel2, tetsModel1);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("BeanUtils.copyProperties Error occurred");
        }
        LOGGER.info("tetsModel2===" + tetsModel2);

        String s = "AAAABCCCCC";
        System.out.println("AAAABCCCCC ----> " + s.substring(5, 10) + "-" + s.substring(0, 4) + "-" + s.substring(4, 5));


        System.out.println("TrimToEmpty1====" + chk(" aaa  "));
        System.out.println("TrimToEmpty2====" + chk(""));
        System.out.println("TrimToEmpty3====" + chk(null));

        System.out.println("TrimToEmpty1====" + StringUtils.trimToEmpty(" aaa  "));
        System.out.println("TrimToEmpty2====" + StringUtils.trimToEmpty(""));
        System.out.println("TrimToEmpty3====" + StringUtils.trimToEmpty(null));

    }
    @NotNull
    @Contract(pure = true)
    private static String chk(String rec) {
        String ret = null;
        if (rec == null) {
            ret = "";
        } else {
            ret = rec.trim();
        }

        return ret;
    }
}
