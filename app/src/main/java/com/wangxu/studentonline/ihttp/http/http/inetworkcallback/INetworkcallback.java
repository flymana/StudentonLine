package com.wangxu.studentonline.ihttp.http.http.inetworkcallback;

/**
 * Created by dell on 2017/10/29.
 */

public interface INetworkcallback {


    void onsuccess(String Xmldata);


    void onError(String code, String Errormsg);


}
