package com.sxl.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WxOpenID {
    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public WxOpenID(String errmsg, String errcode, String rid) {
        this.errmsg = errmsg;
        this.errcode = errcode;
        this.rid = rid;
    }

    public WxOpenID(String session_key, String openid) {
        this.session_key = session_key;
        this.openid = openid;
    }

    private String session_key; //会话密钥
    private String openid;  //用户id
    private String errmsg; //错误信息
    private String errcode; //错误码
    private String rid;  //暂时不知道是什么
}
