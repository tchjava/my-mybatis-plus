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
public class Course extends Model<Course> {

    private static final long serialVersionUID = 1L;

    @TableId("c_id")
    private String cId;
    @TableField("c_name")
    private String cName;
    @TableField("t_id")
    private String tId;


    public String getcId() {
        return cId;
    }

    public Course setcId(String cId) {
        this.cId = cId;
        return this;
    }

    public String getcName() {
        return cName;
    }

    public Course setcName(String cName) {
        this.cName = cName;
        return this;
    }

    public String gettId() {
        return tId;
    }

    public Course settId(String tId) {
        this.tId = tId;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.cId;
    }

    @Override
    public String toString() {
        return "Course{" +
        ", cId=" + cId +
        ", cName=" + cName +
        ", tId=" + tId +
        "}";
    }
}
