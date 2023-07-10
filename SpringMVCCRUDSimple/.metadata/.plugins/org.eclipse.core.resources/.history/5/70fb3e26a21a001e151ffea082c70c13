package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.example.beans.Pro;

public class ProDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Pro p) {
		String sql = "insert into products(name,invoice) values('" + p.getName() + "'," + p.getinvoice() + ")";
		return template.update(sql);
	}

	public int update(Pro p) {
		String sql = "UPDATE products SET name='" + p.getName() + "', invoice=" + p.getinvoice() + " WHERE id="
				+ p.getId();
		return template.update(sql);
	}

	public int delete(int id) {
		String sql = "delete from products where id=" + id + "";
		return template.update(sql);
	}

	public Pro getProductById(int id) {
		String sql = "select * from products where id=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Pro>(Pro.class));
	}

	public List<Pro> getProduct() {
		return template.query("select * from products", new RowMapper<Pro>() {
			public Pro mapRow(ResultSet rs, int row) throws SQLException {
				Pro e = new Pro();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setinvoice(rs.getFloat(3));
				return e;
			}
		});
	}
}