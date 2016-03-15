/*
 * Copyright @ 2016QIANLONG.
 * All right reserved.
 */

package com.mobanker.config.service.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Table(name = "T_SYSTEM_VARIABLE_STATIC")
public class StaticSystemVariable extends SystemVariable {

	private static final long serialVersionUID = 1L;
}
