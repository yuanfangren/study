package com.ren.study.mybatis.typeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;
import org.apache.log4j.Logger;

import com.ren.study.mybatis.Enum.SexEnum;

public class SexEnumTypeHandler implements TypeHandler<SexEnum>{
	
	Logger logger = Logger.getLogger(SexEnumTypeHandler.class);
	
	@Override
	public SexEnum getResult(ResultSet rs, String columnName) throws SQLException {
		logger.info("======333");
		int id = rs.getInt(columnName);
		return SexEnum.getSexById(id);
	}

	@Override
	public SexEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
		logger.info("======222");
		int id =rs.getInt(columnIndex);
		return SexEnum.getSexById(id);
	}

	@Override
	public SexEnum getResult(CallableStatement cs, int ColumnIndex) throws SQLException {
		logger.info("======111");
		int id= cs.getInt(ColumnIndex);
		return SexEnum.getSexById(id);
	}

	@Override
	public void setParameter(PreparedStatement ps, int i, SexEnum parameter, JdbcType jdbcType) throws SQLException {
		logger.info("======");
		ps.setInt(i, parameter.getId());
	}

}
