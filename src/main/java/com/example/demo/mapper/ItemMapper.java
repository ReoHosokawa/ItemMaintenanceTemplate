package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Item;

/**
 * 商品用マッパーインターフェース
 */
@Mapper
public interface ItemMapper {
	/**
	 * 商品情報を全件取得する
	 * @return 取得した商品情報一覧
	 */
	List<Item> findAll();

	/**
	 * 指定された商品 ID に紐づく商品情報を 1 件取得する
	 * @param id 取得対象の商品 ID
	 * @return 取得した商品情報
	 */
	Item findOne(Long id);
}
