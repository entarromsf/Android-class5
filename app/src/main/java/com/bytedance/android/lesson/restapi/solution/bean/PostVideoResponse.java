package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {

    // TODO-C2 (3) Implement your PostVideoResponse Bean here according to the response json
    // url: (POST) http://test.androidcamp.bytedance.com/mini_douyin/invoke/video?student_id={student_id}&user_name={user_name}
    // body
    // + cover_image，file
    // + video, file
    // response
    // {
    //    "result": {},
    //    "url": "https://lf1-hscdn-tos.pstatp
    //    .com/obj/developer-baas/baas/tt7217xbo2wz3cem41/a8efa55c5c22de69_1560563154288.mp4",
    //    "success": true
    //}
    @SerializedName("result") private Object result;
    @SerializedName("url") private String url;
    @SerializedName("success") private String success;

    public Object getResult() {
        return result;
    }

    public String getUrl() {
        return url;
    }

    public String getSuccess() {
        return success;
    }
}
