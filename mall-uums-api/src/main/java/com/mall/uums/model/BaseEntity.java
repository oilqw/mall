package com.mall.uums.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@MappedSuperclass
public class BaseEntity implements java.io.Serializable {

	private static final long serialVersionUID = -1929235260476665580L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Version
	private Long version;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", columnDefinition = "timestamp default CURRENT_TIMESTAMP")
	private Date createTime;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME", columnDefinition = "timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Date updateTime;

}
