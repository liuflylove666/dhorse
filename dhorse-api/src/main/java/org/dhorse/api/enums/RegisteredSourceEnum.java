package org.dhorse.api.enums;

/**
 *  用户注册来源
 * @author Dahai
 *  2021-12-4 20:20:25
 */
public enum RegisteredSourceEnum {

	DHORSE(1, "Dhorse"), LDAP(2, "Ldap"), SSO(3, "Sso");

	private Integer code;

	private String value;

	private RegisteredSourceEnum(Integer code, String value) {
		this.code = code;
		this.value = value;
	}

	public static RegisteredSourceEnum getByCode(Integer code) {
		if(code == null) {
			return null;
		}
		for(RegisteredSourceEnum item : RegisteredSourceEnum.values()) {
			if(item.getCode().equals(code)) {
				return item;
			}
		}
		return null;
	}
	
	public Integer getCode() {
		return code;
	}

	public String getValue() {
		return value;
	}
}
