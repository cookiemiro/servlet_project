package com.ssg.todo.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;

public enum ConnectionUtil {

    INSTANCE;

    private HikariDataSource ds;

    ConnectionUtil() {
        HikariConfig config = new HikariConfig();

        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/ssgdatabase?serverTimezone=UTC");
        config.setUsername("webuser");
        config.setPassword("ssg1234!@");
        config.addDataSourceProperty("cachePrepStmts","true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2042");
        config.getMaximumPoolSize();

        ds = new HikariDataSource(config);
    }

    public Connection getConnection() throws Exception {
        return ds.getConnection();
    }
}
