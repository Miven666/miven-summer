package com.miven.logging;

/**
 * 模块
 * @author mingzhi.xie
 * @date 2019/10/12
 * @since 1.0
 */
public interface Module {

    enum SpringModule {
        /**
         * 控制层
         */
        Controller,
        /**
         *业务层
         */
        Service,
        /**
         * 仓储层
         */
        Repository
    }
}
