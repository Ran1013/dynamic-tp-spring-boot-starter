package com.ran.middleware.threadpool.sdk.domain;

import com.ran.middleware.threadpool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @author Ran1013
 * @description 动态线程池服务
 * @create 2024-05-12 16:04
 */
public interface IDynamicThreadPoolService {

    List<ThreadPoolConfigEntity> queryThreadPoolList();

    ThreadPoolConfigEntity queryThreadPoolConfigByName(String threadPoolName);

    void updateThreadPoolConfig(ThreadPoolConfigEntity threadPoolConfigEntity);

}
