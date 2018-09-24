/**
 * 
 */
package com.dksu99.exp1.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dksu99.exp1.entity.Account;
import com.dksu99.exp1.mapper.AccountMapper;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/v2/accounts")
public class AccoutsController {

	private static final Logger LOG = LoggerFactory.getLogger(AccoutsController.class);
	
//	@ApiOperation(value = "api main")
//	@RequestMapping(value = "", method = RequestMethod.GET)
//	public @ResponseBody String main() {
//		return "hello";
//	}
	
	
	
	@Autowired AccountMapper accountMapper;
	
	@ApiOperation(value = "사용자 등록")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "account", value = "사용자", required = true, dataType = "object", paramType = "body")
	})
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public @ResponseBody int save(@RequestBody(required=true) Account account) {
		LOG.info("variable account = ", account.toString());
		int iRst = accountMapper.save(account); 
		LOG.info("result = ", iRst);
		return iRst; 
	}
	
	@ApiOperation(value = "사용자 조회")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "사용자 아이디", required = true, dataType = "string", paramType = "path", defaultValue = "")
	})
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Account find(@PathVariable(value="id") int id) {
		LOG.info("variable id = ", id);
		Account account = accountMapper.findOne(id);
		if (account == null) {
			throw new RuntimeException("데이타가 없습니다.");
		}
		return account;
	}
	
}
