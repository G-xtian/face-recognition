package com.sxl.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultDTO<T> {
    //    封装一个给前端的响应状态码
    private int code;

    //    封装一个返回给前端的响应状态信息
    private String msg;

    //    封装一个返回给前端的数据信息
    private T data;

    //    成功的状态码
    private static final int SUCCESS_CODE = 200;
    //    失败的状态码
    private static final int ERROR_CODE = 503;

    //    成功的状态信息
    private static final String SUCCESS_MSG = "成功";
    //    失败的状态信息
    private static final String ERROR_MSG = "失败";

    public ResultDTO(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    //    封装一个成功的方法（带参数)
    public static<T> ResultDTO<T> success(T data){
        return new ResultDTO<>(SUCCESS_CODE,SUCCESS_MSG,data);
    }
    //    封装一个失败的方法（带参数）
    public static<T> ResultDTO<T> error(T data){
        return new ResultDTO<>(ERROR_CODE,ERROR_MSG,data);
    }

    //    封装一个成功的方法（无参）
    public static<T> ResultDTO<T> success(){
        return new ResultDTO<>(SUCCESS_CODE,SUCCESS_MSG);
    }
    //    封装一个失败的方法（无参）
    public static<T> ResultDTO<T> error(){
        return new ResultDTO<>(ERROR_CODE,ERROR_MSG);
    }

    //    封装一个成功的方法（带参数)
    public static<T> ResultDTO<T> success(String msg, T data){
        return new ResultDTO<>(SUCCESS_CODE,msg,data);
    }
    //    封装一个失败的方法（带参数）
    public static<T> ResultDTO<T> error(String msg, T data){
        return new ResultDTO<>(ERROR_CODE,msg,data);
    }
}
