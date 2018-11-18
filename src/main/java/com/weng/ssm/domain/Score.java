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
public class Score extends Model<Score> {

    private static final long serialVersionUID = 1L;

    @TableId("s_id")
    private String sId;
    @TableField("c_id")
    private String cId;
    @TableField("s_score")
    private Integer sScore;


    public String getsId() {
        return sId;
    }

    public Score setsId(String sId) {
        this.sId = sId;
        return this;
    }

    public String getcId() {
        return cId;
    }

    public Score setcId(String cId) {
        this.cId = cId;
        return this;
    }

    public Integer getsScore() {
        return sScore;
    }

    public Score setsScore(Integer sScore) {
        this.sScore = sScore;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.sId;
    }

    @Override
    public String toString() {
        return "Score{" +
        ", sId=" + sId +
        ", cId=" + cId +
        ", sScore=" + sScore +
        "}";
    }
}
