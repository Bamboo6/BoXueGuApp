package cn.edu.lt.android.boxueguapp.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by lt on 2018/1/2.
 */

public class AnalysisUtils {

    /**
     * 从SharedPreferences中读取登录用户名
     * @param context
     * @return
     */
    public static String readLoginUserName(Context context){
        SharedPreferences sp=context.getSharedPreferences("loginInfo", Context.MODE_PRIVATE);
        String userName=sp.getString("loginUserName", "");
        return userName;
    }
}
