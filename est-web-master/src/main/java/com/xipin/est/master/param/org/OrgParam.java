package com.xipin.est.master.param.org;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.BeanUtils;

import com.xipin.est.db.bean.OrgBean;
import com.xipin.est.db.po.OrgPo;
import com.xipin.est.utils.msg.eum.ParamConstants;
import com.xipin.est.utils.param.BeanParam;
import com.xipin.est.utils.param.PageParam;

/**
 * 请写出类的用途 
 * @author tan.yf
 * @date  2016-05-16 10:44:30
 * @version 1.0.0
 * @copyright (C) 2015 XiPinTech Information Technology Co.,Ltd 
 * All Rights Reserved. 
 * 
 * The software for the XiPinTech technology development, without the 
 * company's written consent, and any other individuals and 
 * organizations shall not be used, Copying, Modify or distribute 
 * the software.
 * 
 */
public class OrgParam extends PageParam<OrgPo> implements BeanParam<OrgBean>{
	/**
     * 
     */
	@NotNull(message=ParamConstants.ORG_ID_CANNOT_NULL, groups={Update.class})
    private Long id;

    /**
     * 父机构ID
     */
    @NotNull(message=ParamConstants.ORG_PARENTID_CANNOT_NULL, groups={Insert.class})
    private Long parentId;

    /**
     * 机构名称
     */
    @NotEmpty(message=ParamConstants.ORG_NAME_CANNOT_NULL, groups={Insert.class})
    private String name;

    /**
     * 机构代码
     */
    @NotEmpty(message=ParamConstants.ORG_NO_CANNOT_NULL, groups={Insert.class})
    private String no;

    /**
     * 机构类型,[邮局：0， 客户：1]
     */
    @NotNull(message=ParamConstants.ORG_TYPE_CANNOT_EMPTY, groups={Insert.class})
    private Byte type;
    
    /**
     * 级别，0-组织架构，1-客户/邮局，2-机构，3-部门
     */
    @NotNull(message=ParamConstants.ORG_LEVEL_CANNOT_NULL, groups={Insert.class})
    private Byte level;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 添加人
     */
    private Long creater;

    /**
     * 添加人用户名
     */
    private String createrName;

    /**
     * 是否转运线
     */
    private Integer isTransport;

    /**
     * 地址
     */
    private String address;

    /**
     * 联系电话
     */
    private String phoneNum;

    /**
     * 
     */
    private Date createDate;

    /**
     * 
     */
    private Date updateDate;
    
    /**
     * 
     */
    private String ename;

	public Byte getLevel() {
		return level;
	}

	public void setLevel(Byte level) {
		this.level = level;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}


	public Long getCreater() {
		return creater;
	}

	public void setCreater(Long creater) {
		this.creater = creater;
	}

	public String getCreaterName() {
		return createrName;
	}

	public void setCreaterName(String createrName) {
		this.createrName = createrName;
	}

	public String getAddress() {
		return address;
	}
	

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsTransport() {
		return isTransport;
	}

	public void setIsTransport(Integer isTransport) {
		this.isTransport = isTransport;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public OrgBean initBean() {
		OrgBean orgBean = new OrgBean();
		BeanUtils.copyProperties(this, orgBean);
		return orgBean;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
}
