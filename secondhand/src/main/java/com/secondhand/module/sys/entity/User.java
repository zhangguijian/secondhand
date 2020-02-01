package com.secondhand.module.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Erica
 * @since 2020-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户表id
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 加密的盐
     */
    private String salt;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 是否禁用; 0-未禁用;1-禁用
     */
    private Integer status;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 部门id
     */
    private Integer deptId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 编辑时间
     */
    private LocalDateTime editTime;

    /**
     * 人员类型;0-超级管理员;1-普通用户
     */
    private Integer userType;

    /**
     * 真实姓名
     */
    private String actualName;

    /**
     * 头像
     */
    private String headerPicture;


}
