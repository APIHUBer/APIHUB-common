package com.example.apihubcommon.service;

import com.example.apihubcommon.model.entity.UserInterfaceInfo;


/**
* @author jayingyoung
* @description 针对表【user_interface_info(relationship of User calls interface)】的数据库操作Service
* @createDate 2023-03-10 11:32:42
*/
public interface InnerUserInterfaceInfoService {

	/**
	 * interface invoke count
	 * @param interfaceInfoId
	 * @param userId
	 * @return
	 */
	boolean invokeCount(long interfaceInfoId, long userId);
}
