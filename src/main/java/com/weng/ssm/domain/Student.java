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
public class Student extends Model<Student> {

    private static final long serialVersionUID = 1L;

    @TableId("s_id")
    private String sId;
    @TableField("s_name")
    private String sName;
    @TableField("s_birth")
    private String sBirth;
    @TableField("s_sex")
    private String sSex;


    public String getsId() {
        return sId;
    }

    public Student setsId(String sId) {
        this.sId = sId;
        return this;
    }

    public String getsName() {
        return sName;
    }

    public Student setsName(String sName) {
        this.sName = sName;
        return this;
    }

    public String getsBirth() {
        return sBirth;
    }

    public Student setsBirth(String sBirth) {
        this.sBirth = sBirth;
        return this;
    }

    public String getsSex() {
        return sSex;
    }

    public Student setsSex(String sSex) {
        this.sSex = sSex;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.sId;
    }

    @Override
    public String toString() {
        return "Student{" +
        ", sId=" + sId +
        ", sName=" + sName +
        ", sBirth=" + sBirth +
        ", sSex=" + sSex +
        "}";
    }
}
