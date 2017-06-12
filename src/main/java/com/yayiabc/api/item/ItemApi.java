package com.yayiabc.api.item;

public interface ItemApi {
	/**
	 * 
	 * @api {get} http://localhost:8080/yayiabc/api/item/search
	 * @apiName search
	 * @apiGroup item
	 * @apiVersion 0.1.0
	 * @apiDescription 查询商品
	 * @apiParam {String} itemBrandName 商品品牌
	 * @apiParam {String} firstClassify 商品一级分类
	 * @apiParam {String} secondClassify 商品二级分类
	 * @apiParam {String} thirdClassify 商品三级分类
	 * @apiParam {Integer} isQbBuy  是否支持乾币抵扣
	 * 
	 * 
	 * 
	 * 
	 * @apiSuccessExample Success-Response: 
	 * HTTP/1.1 200 OK 
	 * {
	 *   callStatus:"SUCCEED", 
	 *   errorCode:"No_Error",
	 *   data(List):{ 
	 *             itemId :         "201706050001"  (商品编号),
	*              itemName         "牙具座"          (商品名称)        ,
	*              itemBrand:{
	*              
	*   
	*   
	*   			}        
	*   item_stock_id        varchar(20),
	*   refund_id            varchar(20),
	*   item_price           int(10),
	*   sales                int(10),
	*   state                int(2),
	*   one_classify         varchar(20),
	*   two_classify         varchar(20),
	*   three_classify       varchar(20),
	*   itemPida            int(10),
	*   itemPidb            int(10),
	*   itemPidc            int(10),
	*   created              "20170821",
	*   updated              "20170821",
	 *   } 
	 *   token:"SK1d7a4fe3-c2cd-417f-8f6f-bf7412592996",
	 *   numberPerPage:0, 
	 *   currentPage:0, 
	 *   totalNumber:0,
	 *   totalPage:0 
	 * }
	 * 
	 * @apiErrorExample {json} Error-Response: 
	 * HTTP/1.1 200 OK 
	 * {
	 *  callStatus:"FAILED", 
	 *  errorCode:"Error", 
	 *  data:null,
	 *  token:null, 
	 *  numberPerPage:0, 
	 *  currentPage:0,
	 *  totalNumber:0, 
	 *  totalPage:0 
	 * }
	 * 
	 */


}
