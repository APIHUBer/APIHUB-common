package com.example.apihubcommon.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * relationship of User calls interface
 * @TableName user_interface_info
 */
@TableName(value ="user_interface_info")
@Data
public class UserInterfaceInfo implements Serializable {
    /**
     * primary key
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * user id
     */
    private Long userId;

    /**
     * interface Info id
     */
    private Long interfaceInfoId;

    /**
     * Total number of invoke
     */
    private Integer totalNum;

    /**
     * Remain number of invoke
     */
    private Integer leftNum;

    /**
     * 0-normal，1-disable
     */
    private Integer status;

    /**
     * create time
     */
    private Date createTime;

    /**
     * update time
     */
    private Date updateTime;

    /**
     * isDelete(0-not deleted, 1-deleted)
     */
    @TableLogic
    private Byte isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}