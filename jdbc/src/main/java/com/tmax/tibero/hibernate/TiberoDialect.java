package com.tmax.tibero.hibernate;

import org.hibernate.dialect.Oracle9iDialect;

/**
 * 
 * Hibernate, JPA 사용시 TiberoDB접속을 하기 위해 사용
 * 
 * @author rk
 *
 */
public class TiberoDialect extends Oracle9iDialect{
	
	
	@Override
	public String getQuerySequencesString() {
		 return " select sequence_name from all_sequences";
	}
}
