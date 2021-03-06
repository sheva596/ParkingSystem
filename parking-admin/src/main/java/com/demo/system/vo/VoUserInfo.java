package com.demo.system.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Sheva
 * @Date 2021/2/24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VoUserInfo implements Serializable {
    private List<String> roles;
    private String introduction;
    private String avatar;
    private String name;
}
