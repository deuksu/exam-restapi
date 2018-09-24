/**
 * 
 */
package com.dksu99.exp1.entity;

import org.apache.ibatis.type.Alias;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Administrator
 *
 */
@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString
@Alias("account")
public class Account {
	
	private int id;
	private String name;
	private int age;
	private String job;
	
}
