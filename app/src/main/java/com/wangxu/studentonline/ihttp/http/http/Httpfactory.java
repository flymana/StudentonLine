package com.wangxu.studentonline.ihttp.http.http;

/**
 * Created by dell on 2017/10/30.
 */

public class Httpfactory {
    public static Ihttp create(){
        return Okhttputils.getInstance();
    }
}
