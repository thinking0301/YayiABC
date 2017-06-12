package com.yayiabc.api.user;
/**
 *Created by yehu on 2017/6/9
 */
public interface UserManageApi {
	/**
	 * @api {get} http://localhost:8080/Yayi/userManage/list  获取用户详情
	 * @apiName list
	 * @apiGroup userManage
	 * @apiVersion 0.1.0
	 * @apiDescription 获取用户列表
	 * @apiParam {String} token 身份验证
     *
     * @apiSuccessExample Success-Response:
     *  HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * data(List):{
     *    {
     *      userId:"e58acb73-e33c-4798-ad14-5a827714c4a1",
     *      phone: "13826545963",
     *      pwd  :null,
     *      identity: 2,
     *      trueName:"zhangsan",
     *      idCard: null,
     *      sex : 2,
     *      userPic: image/system05.jpg;
     *      birthday :"2017-05-23",
     *      qq  :   "245722369",
     *      address :"天津市滨海新区临港工业区临港生态饭店",
     *      money   :12365
     *      isBand  : 1,
     *      bindUserNum :30,
     *      bindUserList (List):{
     *      	userId:"e58acb73-e33c-4798-ad14-5a827714c4a1",
     *      	phone: "13826545963",
     *      	pwd  :null,
     *      	identity: 2,
     *      	trueName:"zhangsan",
     *      	idCard: null,
     *      	sex : 2,
     *      	userPic: image/system05.jpg;
     *      	birthday :"2017-05-23",
     *      	qq  :   "245722369",
     *      	address :"天津市滨海新区临港工业区临港生态饭店",
     *      	money   :12365
     *      	isBand  : 1,
     *     		bindUserNum :30,
     *     		bindUserList:null,
     *          certification:null,
     *          created :null,
     *          updated :null
     *      }
     *      certification :{
     *      	certification_id     3,
   	*		    type                 2,
   	*		    company_name         "泰富重装集团",
   	*		    part                 "上海市松江区",
   	*		    doctor_pic           image/system10.jpg,
   	*		    work_address         "湖北省武汉市武昌区余家头",
   	*		    state                2,
   	*		    fail_reason          null,
   	*		    created              "2017-05-26",
   	*		    updated              "2017-05-26",
     *      	
     *      }
     *      created :null,
     *      updated :null,
     * }
     * token:"SK1d7a4fe3-c2cd-417f-8f6f-bf7412592996",
     * numberPerPage:0,
     * currentPage:0,
     * totalNumber:0,
     * totalPage:0
     *  }
     *
     *  @apiErrorExample {json} Error-Response:
     *  HTTP/1.1 200 OK
     * {
     * callStatus:"FAILED",
     * errorCode:"Error",
     * data:null,
     * token:null,
     * numberPerPage:0,
     * currentPage:0,
     * totalNumber:0,
     * totalPage:0
     *  }
     *
     */
	
	 /**
     * @api {post} http://localhost:8080/yayiabc/api/user/changePwd 修改密码
     * @apiName changePwd
     * @apiGroup user
     * @apiVersion 0.1.0
     * @apiDescription 修改密码
     *
     * @apiParam {String} oldPwd 原始密码（必须）
     * @apiParam {String} newPwd 新密码（必须）
     * @apiParam {String} token 身份凭证（必须）
     *
     * @apiSuccessExample Success-Response:
     *  HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * data:null,
     * token:"SK1d7a4fe3-c2cd-417f-8f6f-bf7412592996",
     * numberPerPage:0,
     * currentPage:0,
     * totalNumber:0,
     * totalPage:0,
     * num :null,
     * msg :null,
     *  }
     *
     *  @apiErrorExample {json} Error-Response:
     *  HTTP/1.1 200 OK
     * {
     * callStatus:"FAILED",
     * errorCode:"Error",
     * data:null,
     * token:null,
     * numberPerPage:0,
     * currentPage:0,
     * totalNumber:0,
     * totalPage:0,
     * num :null,
     * msg :null,
     *  }
     *
     */

   
	
	/**
     * @api {post} http://localhost:8080/yayiabc/api/user/update 编辑用户信息
     * @apiName update
     * @apiGroup user
     * @apiVersion 0.1.0
     * @apiDescription 编辑用户信息
     *
     * @apiParam {String} userId 用户ID（必须）
     * @apiParam {String} phoneNumber 手机号码（必须，11位手机号码，可作为登录名）
     * @apiParam {String} password 密码（必须）
     * @apiParam {int} identity 用户身份（必须，1管理员，2销售，3牙医，4机构）
     * @apiParam {String} fullName 姓名（非必须）
     * @apiParam {String} userPic 用户头像（非必须）
     * @apiParam {date} bornDate 生日（非必须）
     * @apiParam {int} isBind 是否绑定客户（非必须）
     * @apiParam {int} bindUserNum 绑定客户数（非必须）
     * @apiParam {String} bindUserI 绑定的销售员ID（非必须）
     * @apiParam {String} token 身份凭证（必须）
     *
     * @apiSuccessExample Success-Response:
     *  HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * data:null,
     * token:"SK1d7a4fe3-c2cd-417f-8f6f-bf7412592996",
     * numberPerPage:0,
     * currentPage:0,
     * totalNumber:0,
     * totalPage:0,
     * num :null,
     * msg :null,
     *  }
     *
     *  @apiErrorExample {json} Error-Response:
     *  HTTP/1.1 200 OK
     * {
     * callStatus:"FAILED",
     * errorCode:"Error",
     * data:null,
     * token:null,
     * numberPerPage:0,
     * currentPage:0,
     * totalNumber:0,
     * totalPage:0,
     * num :null,
     * msg :null,
     *  }
     *
     */
	 
}
