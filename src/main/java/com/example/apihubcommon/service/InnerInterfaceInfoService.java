package com.example.apihubcommon.service;

import com.example.apihubcommon.model.entity.InterfaceInfo;

public interface InnerInterfaceInfoService{

	/**
	 * @param path
	 * @param method
	 * @return
	 */
	InterfaceInfo getInterfaceInfo(String path, String method);

}
