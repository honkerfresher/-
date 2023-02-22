package com.web.sut.pro.common;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

public class CrossDomainCommitValidate {
	
	@SuppressWarnings({ "rawtypes", "null" })
	public static boolean validate(HttpServletRequest request) {
		String Referer = "";
		boolean referer_sign = true; // true 站内提交，验证�?�?//false 站外提交，验证失�?
		Enumeration headerValues = request.getHeaders("Referer");
		while (headerValues.hasMoreElements())
			Referer = (String) headerValues.nextElement();
		// 判断是否存在请求页面
		if (Referer == null || Referer.length() < 1)
			referer_sign = false;
		else {
			// 判断请求页面和getRequestURI是否相同
			String servername_str = request.getServerName();
			if (servername_str != null || servername_str.length() > 0) {
				int index = 0;
				if (StringUtils.indexOf(Referer, "https://") == 0) {
					index = 8;
				} else if (StringUtils.indexOf(Referer, "http://") == 0) {
					index = 7;
				}
				if (Referer.length() - index < servername_str.length()) // 长度不够
					referer_sign = false;
				else { // 比较字符串（主机名称）是否相�?
					String referer_str = Referer.substring(index, index + servername_str.length());
					if (!servername_str.equalsIgnoreCase(referer_str))
						referer_sign = false;
				}
			} else
				referer_sign = false;
		}
		return referer_sign;
	}
	
}
