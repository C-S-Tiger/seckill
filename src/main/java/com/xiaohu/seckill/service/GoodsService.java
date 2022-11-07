package com.xiaohu.seckill.service;

import com.xiaohu.seckill.dao.GoodsDao;
import com.xiaohu.seckill.domain.MiaoshaGoods;
import com.xiaohu.seckill.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 陈晓虎
 * @className GoodsService
 * @description TODO
 * @email 1145302691@qq.com
 * @date 2022/11/7 9:07
 **/
@Service
public class GoodsService {

    @Autowired
    GoodsDao goodsDao;

    public List<GoodsVo> listGoodsVo(){
        return goodsDao.listGoodsVo();
    }

    public GoodsVo getGoodsVoByGoodsId(long goodsId) {
        return goodsDao.getGoodsVoByGoodsId(goodsId);
    }

    public void reduceStock(GoodsVo goods) {
        MiaoshaGoods g = new MiaoshaGoods();
        g.setGoodsId(goods.getId());
        goodsDao.reduceStock(g);
    }

}
