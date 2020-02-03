package com.weiziplus.springboot.common.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.weiziplus.springboot.common.base.Column;
import com.weiziplus.springboot.common.base.Id;
import com.weiziplus.springboot.common.base.Table;
import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.List;

/**
 * 系统功能表
 * sys_function
 *
 * @author WeiziPlus
 * @date 2019-07-23 09:46:32
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Table("sys_function")
@Accessors(chain = true)
@Alias("SysFunction")
public class SysFunction implements Serializable {
    /**
     * 系统功能表主键，自增
     */
    @Id("id")
    private Integer id;

    /**
     * 上级id
     */
    @Column("parent_id")
    private Integer parentId;

    /**
     * 功能唯一标识
     */
    @Column("name")
    private String name;

    /**
     * 功能路径
     */
    @Column("path")
    private String path;

    /**
     * 功能标题
     */
    @Column("title")
    private String title;

    /**
     * 当前功能对应的api列表
     */
    @Column("contain_api")
    private String containApi;

    /**
     * 功能类型;0:菜单,1:按钮
     */
    @Column("type")
    private Integer type;

    /**
     * 0：菜单
     */
    public static Integer TYPE_MENU = 0;

    /**
     * 1:按钮
     */
    public static Integer TYPE_BUTTON = 1;

    /**
     * 功能图标
     */
    @Column("icon")
    private String icon;

    /**
     * 功能排序，数字越小越靠前
     */
    @Column("sort")
    private Integer sort;

    /**
     * 功能描述
     */
    @Column("description")
    private String description;

    /**
     * 功能创建时间
     */
    @Column("create_time")
    private String createTime;

    private List<SysFunction> children;

    private static final long serialVersionUID = 1L;
}