//DEPS com.github.jasync-sql:jasync-postgresql:1.0.6
import com.github.jasync.sql.db.Configuration
import com.github.jasync.sql.db.postgresql.PostgreSQLConnectionBuilder
import com.github.jasync.sql.db.pool.ConnectionPool
import com.github.jasync.sql.db.pool.PoolConfiguration

private val configuration = Configuration(
    "people",
    "localhost",
    5432,
    "pg4e",
    "paraguay")
private val poolConfiguration = PoolConfiguration(
    maxObjects = 100,
    maxIdle = TimeUnit.MINUTES.toMillis(15),
    maxQueueSize = 10_000,
    validationInterval = TimeUnit.SECONDS.toMillis(30)
)
val connectionPool = PostgreSQLConnectionBuilder.createConnectionPool(poolConfiguration)
