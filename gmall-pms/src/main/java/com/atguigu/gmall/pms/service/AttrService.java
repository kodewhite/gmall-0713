package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author zzp
 * @email zzp@atguigu.com
 * @date 2021-02-08 10:27:30
 */
public interface AttrService extends IService<AttrEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

