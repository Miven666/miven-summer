package com.miven.entity;

import com.miven.entity.valid.Delete;
import com.miven.entity.valid.Insert;
import com.miven.entity.valid.Query;
import com.miven.entity.valid.Update;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.groups.Default;
import java.io.Serializable;

/**
 * 水果
 * @author mingzhi.xie
 * @date 2019/3/20
 */
@Data
public class Fruit implements Serializable {

    private static final long serialVersionUID = 1047204607917402451L;

    private int id;
    @NotBlank(groups ={Query.class, Insert.class, Update.class})
    private String name;
    @Min(value = 1, groups = {Default.class, Delete.class})
    private int number;


}
