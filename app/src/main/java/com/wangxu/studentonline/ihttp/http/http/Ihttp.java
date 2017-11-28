package com.wangxu.studentonline.ihttp.http.http;

import android.widget.ImageView;

import com.lianxi.oschinademo.modole.callback.INetworkcallback;
import com.wangxu.studentonline.ihttp.http.http.inetworkcallback.INetworkcallback;

import java.util.Map;

/**
 * Created by dell on 2017/10/29.
 */

  interface Ihttp {


    void get(String url, Map<String, String> params, INetworkcallback networkcallback);

    void get(String url, INetworkcallback networkcallback);


    void post(String url, Map<String, String> params, INetworkcallback networkcallback);

  void get(String url, Map<String, String> params, INetworkcallback networkcallback);

  void loadImage(String imgUrl, ImageView imageView);


}
