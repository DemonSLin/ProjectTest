package com.yy.miaosha.vo;
import com.yy.miaosha.domain.OrderInfo;

/**
 *
 */
public class OrderDetailVo {
	private GoodsVO goods;
	private OrderInfo order;
	public GoodsVO getGoods() {
		return goods;
	}
	public void setGoods(GoodsVO goods) {
		this.goods = goods;
	}
	public OrderInfo getOrder() {
		return order;
	}
	public void setOrder(OrderInfo order) {
		this.order = order;
	}
}
