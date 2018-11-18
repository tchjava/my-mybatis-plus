package com.weng.ssm.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author weng
 * @since 2018-11-18
 */
public class Teacher extends Model<Teacher> {

    private static final long serialVersionUID = 1L;

    @TableId("t_id")
    private String tId;
    @TableField("t_name")
    private String tName;


    public String gettId() {
        return tId;
    }

    public Teacher settId(String tId) {
        this.tId = tId;
        return this;
    }

    public String gettName() {
        return tName;
    }

    public Teacher settName(String tName) {
        this.tName = tName;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.tId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
        ", tId=" + tId +
        ", tName=" + tName +
        "}";
    }
}
