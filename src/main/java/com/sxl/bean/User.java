package com.sxl.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String fid;
    private String openid;
    private Integer place;
    private String name;
    private String phone;
    private String number;
    private String face;
}
