package com.sxl.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sxl.bean.HttpRequest;
import com.sxl.bean.ResultDTO;
import com.sxl.bean.WxOpenID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//此注解能将下面定义的类被扫描到spring ioc容器中并且标识此类为控制层
@RestController
//通过此注解能让请求访问到具体的controller
@RequestMapping("/user")
public class UserController {

    /*
    * 向微信接口发送get请求，请求个人信息openid等
    * code 前端传过来的个人的code信息，利用code获取wx信息
    **/
    @GetMapping("/hqxx")
    public ResultDTO getWxInfo(String code){
        HttpRequest httpRequest = new HttpRequest();
        //请求微信接口
        String str = httpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session","appid=wx00ffe855b6b3b293&secret=f5b0810af6ddb88c340a37a929737853&js_code="+code+"&grant_type=authorization_code");
        //使用JSONObject将返回的string转换成json对象
        JSONObject jsonObject = JSONObject.parseObject(str);
        //赋值
        WxOpenID wxOpenID = new WxOpenID(jsonObject.getString("session_key"),jsonObject.getString("openid"));
        if (wxOpenID.getOpenid() == null ){
            return ResultDTO.error("获取openid失败");
        } else {
            //返回用户信息
            return ResultDTO.success(wxOpenID);
        }
    }

    @GetMapping("/text")
    public String text(){
//        Request({
//
//        })
        return "dfasdf ";
    }
}
