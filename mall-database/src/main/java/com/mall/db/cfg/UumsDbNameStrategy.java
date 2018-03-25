package com.mall.db.cfg;

import org.hibernate.cfg.DefaultNamingStrategy;
import org.springframework.util.StringUtils;

public class UumsDbNameStrategy extends DefaultNamingStrategy{

	 
	private static final long serialVersionUID = -4112847607487300011L;
	public String classToTableName(String className) {
        return "U_" + StringUtils.capitalize(className);
    }
}
