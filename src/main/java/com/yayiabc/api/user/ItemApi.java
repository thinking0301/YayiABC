package com.yayiabc.api.user;

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
	 *   itemId:1, 
	 *   itemPica:image/system01.jpg (商品第一张图片的地址),
	 *   itemName:"牙具座",
	 *   password:"d1b2cc725d846f0460ff290c60925070", 
	 *   roleid:1,
	 *   status:1, 
	 *   date:2017-01-01 12:00:00, 
	 *   name:"name",
	 *   describes:"describes", 
	 *   roleName:"123" 
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
