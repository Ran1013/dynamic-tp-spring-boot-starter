package com.ran.middleware.threadpool.sdk.registry;

import com.ran.middleware.threadpool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @author Ran1013
 * @description 注册中心接口
 * @create 2024-05-12 16:21
 */
public interface IRegistry {

    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);

}
