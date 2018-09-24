/**
 * 
 */
package com.dksu99.exp1.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.dksu99.exp1.entity.Account;

/**
 * @author Administrator
 *
 */
@Mapper 
public interface AccountMapper {
	
	public Account findOne(int id);
	public int save(Account account);
	
	@Delete("delete from account where id = #{id}")
	public int delete(@Param("id") int id);
}
