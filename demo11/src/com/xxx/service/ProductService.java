package com.xxx.service;

import com.xxx.dao.ProductDaoImpl;
import com.xxx.entity.Product;




public class ProductService {
	ProductDaoImpl pd=new ProductDaoImpl();
	/*
	 * ��֤��ѯ��Ʒ����<����name>
	 */
	public Product findProductById(String name){
		Product p=pd.findProductByName(name);
		return p;
	}

}
