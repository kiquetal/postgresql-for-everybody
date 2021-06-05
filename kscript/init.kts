#!/usr/bin/env kscript
//DEPS com.github.jasync-sql:jasync-postgresql:1.1.6

import com.github.jasync.sql.db.Configuration
import com.github.jasync.sql.db.Connection
import com.github.jasync.sql.db.general.ArrayRowData
import com.github.jasync.sql.db.pool.ConnectionPool
import com.github.jasync.sql.db.pool.PoolConfiguration
import com.github.jasync.sql.db.postgresql.pool.PostgreSQLConnectionFactory
import java.util.concurrent.TimeUnit

val host="127.0.0.1";
val port=5432;
val database="people";
val username="pg4e";
val password="paraguay"
Connection connection = PostgreSQLConnectionBuilder.createConnectionPool(
               "jdbc:postgresql://$host:$port/$database?user=$username&password=$password");
