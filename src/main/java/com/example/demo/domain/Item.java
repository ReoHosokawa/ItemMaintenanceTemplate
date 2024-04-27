package com.example.demo.domain;


public class Item {
	/**
	 * 商品 ID
	 */
	private Long id;
	
	/**
	 * 商品名
	 */
	private String name;
	
	/**
	 * 価格
	 */
	private int price;
	
	/**
	 * ベンダー
	 */
	private String vendor;

	/**
	 * 商品 ID を取得する
	 * @return 取得した商品 ID
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 商品 ID を設定する
	 * @param id 設定する商品 ID
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 商品名を取得する
	 * @return 取得した商品名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 商品名を設定する
	 * @param name 設定する商品名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 価格を取得する
	 * @return 取得した価格
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * 価格を設定する
	 * @param price 設定する価格
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * ベンダーを取得する
	 * @return 取得したベンダー
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * ベンダーを設定する
	 * @param vendor 設定するベンダー
	 */
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
}
