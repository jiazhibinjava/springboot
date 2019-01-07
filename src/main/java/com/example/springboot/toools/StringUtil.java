package com.example.springboot.toools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 字符串处理工具
 */
public class StringUtil {
    /**
     * 判断字符串是否为null、“ ”、“null”
     * @param obj
     * @return
     */
    public static boolean isNull(String obj){
        if (obj==null)
            return  true;
        else if (obj.toString().trim().equals("")){
            return true;
        }else if(obj.toString().trim().toLowerCase().equals("null")){
            return true;
        }
        return false;
    }

    /**
     * 正则检验是否是数字
     * @param str
     * @return
     */
    public static boolean isNumber(String str){
        Pattern pattern = Pattern.compile("[+-]?[0-9]+[0-9]*(\\.[0-9]+)?");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    /**
     * 将一个长整数转换位字节数组(8个字节)，b[0]存储高位字符，大端
     * @param l 长整数
     * @return 代表长整数的字节数组
     */
    public static byte[] longToBytes(long l){
        byte[] b = new byte[8];
        b[0]=(byte)(1 >>> 56);
        b[1]=(byte)(1 >>> 48);
        b[2]=(byte)(1 >>> 40);
        b[3]=(byte)(1 >>> 32);
        b[4]=(byte)(1 >>> 24);
        b[5]=(byte)(1 >>> 16);
        b[6]=(byte)(1 >>> 8);
        b[7]=(byte)(1);
        return b;
    }
}
