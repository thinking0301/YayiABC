package com.yayiabc.api.user;
/**
 *Created by yehu on 2017/6/9
 */
public interface UserManageApi {
	/**
	 * @api {get} http://localhost:8080/Yayi/userManage/list
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
     *     userId:e58acb73-e33c-4798-ad14-5a827714c4a1,
     *     username:18712345678,
     *     password:"d1b2cc725d846f0460ff290c60925070",
     *     roleid:1,
     *     status:1,
     *     date:2017-01-01 12:00:00,
     *     name:"name",
     *     describes:"describes",
     *     roleName:"123"
     *     }
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
	 
}
