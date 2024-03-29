package com.mobanker.config.manager.manager.impl;

import com.mobanker.config.api.dto.PageInfo;
import com.mobanker.config.api.dto.Pagenation;
import com.mobanker.config.api.entity.SystemServerIpDownLog;
import com.mobanker.config.api.manager.SystemServerIpDownLogManager;
import com.mobanker.config.service.service.SystemServerIpDownLogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by fancongchun on 2016/1/22.
 */
@Service
@Transactional(readOnly = true)
public class SystemServerIpDownLogManagerImpl implements SystemServerIpDownLogManager {
    @Resource
    private SystemServerIpDownLogService systemServerIpDownLogService;

    @Override
    public PageInfo<SystemServerIpDownLog> getSystemServerIpDownLogByCondition(SystemServerIpDownLog systemServerIpDownLog, Pagenation pagenation) {
        return systemServerIpDownLogService.getSystemServerIpDownLogByCondition(systemServerIpDownLog,pagenation);
    }
}
